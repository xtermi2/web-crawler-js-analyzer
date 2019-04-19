package com.github.xtermi2.webcrawlerjsanalyzer;

import com.github.xtermi2.webcrawlerjsanalyzer.internal.GoogleSearcher;
import com.github.xtermi2.webcrawlerjsanalyzer.internal.GoogleSearcherMock;
import com.github.xtermi2.webcrawlerjsanalyzer.internal.HTMLParser;
import com.github.xtermi2.webcrawlerjsanalyzer.internal.HTTPResourceFetcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Andreas Keefer
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    private final GoogleSearcher googleSearcher;
    private final HTMLParser htmlParser;
    private final HTTPResourceFetcher httpResourceFetcher;

    public Main(GoogleSearcher googleSearcher,
                HTMLParser htmlParser,
                HTTPResourceFetcher httpResourceFetcher) {

        this.googleSearcher = googleSearcher;
        this.htmlParser = htmlParser;
        this.httpResourceFetcher = httpResourceFetcher;
    }

    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();
        Main main = new Main(new GoogleSearcherMock(GoogleSearcherMock.JQUERY_RES),
                new HTMLParser(),
                new HTTPResourceFetcher(httpClient));
        int maxTopResults = 5;


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter some search term or 'q' to exit: ");
            String searchTerm = scanner.nextLine();

            if ("q".equals(searchTerm)) {
                System.out.println("Exit!");
                break;
            }

            List<Map.Entry<String, Long>> top5JsScripts = main.execute(searchTerm, maxTopResults);
            System.out.println(String.format("Top %s js scripts", maxTopResults));
            top5JsScripts.forEach(System.out::println);
            System.out.println("-----------\n");
        }
        scanner.close();
    }

    public List<Map.Entry<String, Long>> execute(String searchTerm, int maxTopResults) {
        try {
            String googleSearchRes = googleSearcher.search(searchTerm);
            List<URI> searchResultURIs = htmlParser.extractGoogleSearchResultURIs(googleSearchRes);
            return searchResultURIs.parallelStream() // load the data in parallel. A more performing / resource-saving solution is to use ReactiveStreams (RXJava/Reactor) and a non blocking HTTP Client, but would be a bit overkill in this tool with just 1 user ;)
                    .map(httpResourceFetcher::get)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .flatMap(htmlParser::extractJsLibs)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .peek(groupedBeforeLimit -> logger.info("res before top5 limit" + groupedBeforeLimit))
                    .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                    .limit(maxTopResults)
                    .collect(Collectors.toList());
        } catch (IOException | InterruptedException e) {
            logger.warn("failed to execute searchTerm", e);
            return Collections.emptyList();
        }
    }
}
