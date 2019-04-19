package com.github.xtermi2.webcrawlerjsanalyzer;

import com.github.xtermi2.webcrawlerjsanalyzer.internal.GoogleSearcherMock;
import com.github.xtermi2.webcrawlerjsanalyzer.internal.HTMLParser;
import com.github.xtermi2.webcrawlerjsanalyzer.internal.HTTPResourceFetcher;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Andreas Keefer
 */
class MainIT {

    @Test
    void smokeTest() {
        HttpClient httpClient = HttpClient.newHttpClient();

        int maxTopResults = 5;
        Main main = new Main(new GoogleSearcherMock(GoogleSearcherMock.JQUERY_RES),
                new HTMLParser(),
                new HTTPResourceFetcher(httpClient));

        List<Map.Entry<String, Long>> res = main.execute("jquery", maxTopResults);

        System.out.println("Top " + maxTopResults);
        res.forEach(System.out::println);

        assertThat(res)
                .as("maxTopResults")
                .hasSize(maxTopResults);
        assertThat(res.get(0).getValue())
                .as("first entry has higher count than last entry")
                .isGreaterThan(res.get(4).getValue());
    }

}