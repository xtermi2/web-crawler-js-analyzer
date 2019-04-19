package com.github.xtermi2.webcrawlerjsanalyzer.internal;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpClient;

/**
 * @author Andreas Keefer
 */
class GoogleSearcherIT {

    GoogleSearcher underTest = new GoogleSearcherImpl(HttpClient.newHttpClient());

    @Test
    void search_deosReturnHTML() throws IOException, InterruptedException {
        String searchRes = underTest.search("foo");

        System.out.println(searchRes);
    }

}