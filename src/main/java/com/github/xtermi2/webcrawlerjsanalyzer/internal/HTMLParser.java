package com.github.xtermi2.webcrawlerjsanalyzer.internal;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Andreas Keefer
 */
public class HTMLParser {

    private static final Logger logger = LoggerFactory.getLogger(HTMLParser.class);

    /**
     * @param htmlSearchResult google search results as HTML
     * @return List ob search results
     */
    public List<URI> extractGoogleSearchResultURIs(String htmlSearchResult) {
        if (null == htmlSearchResult) {
            return Collections.emptyList();
        }

        // TODO (ak) this is just a quick and dirty solution, replace with better regex or some HTML parser or xpath
        String[] linkURIStarts = htmlSearchResult
                .replaceAll("\n", "")
                .replaceAll(" ", "")
                .split("<divclass=\"r\"><ahref=\"");

        return Arrays.stream(linkURIStarts)
                .skip(1) // skip first, it's before the matches
                .map(linkStart -> StringUtils.substringBefore(linkStart, "\""))
                .map(URI::create).collect(Collectors.toList());
    }

    /**
     * parse all JS libs from provided HTML
     *
     * @param html HTML to search in
     * @return Stream of all found JS scripts
     */
    public Stream<String> extractJsLibs(String html) {
        if (null == html) {
            return Stream.empty();
        }

        String[] scriptStarts = html
                .replaceAll("\n", "")
                .replaceAll(" ", "")
                .split("<scriptsrc=\"");

        return Arrays.stream(scriptStarts)
                .skip(1) // skip first, it's before the matches
                .map(linkStart -> StringUtils.substringBefore(linkStart, "\""))
                .map(String::toLowerCase)
                .peek(s -> logger.info("script: " + s))
                .filter(script -> script.endsWith(".js"));
        // TODO (ak) deduplication algorithms:
        //      - remove host and path from url: https://code.jquery.com/jquery-1.11.3.js -> jquery-1.11.3.js
        //      - remove version / variant: jquery-1.11.3.js -> jquery.js OR foo.min.js -> foo.js
    }
}
