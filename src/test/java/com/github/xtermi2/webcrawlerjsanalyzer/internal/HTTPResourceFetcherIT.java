package com.github.xtermi2.webcrawlerjsanalyzer.internal;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Andreas Keefer
 */
class HTTPResourceFetcherIT {

    private HTTPResourceFetcher underTest = new HTTPResourceFetcher(HttpClient.newHttpClient());

    @Test
    void get_returnsHTML() throws IOException, InterruptedException {
        Optional<String> res = underTest.get(URI.create("http://www.foo.com/"));

        assertThat(res).isNotEmpty();
        assertThat(res.get())
                .startsWith("<!DOCTYPE html>");
    }

}