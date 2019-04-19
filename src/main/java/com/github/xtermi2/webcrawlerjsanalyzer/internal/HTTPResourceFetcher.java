package com.github.xtermi2.webcrawlerjsanalyzer.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

/**
 * Just a smal wrapper around HTTPClient for easier mocking/testing
 *
 * @author Andreas Keefer
 */
public class HTTPResourceFetcher {

    private static final Logger logger = LoggerFactory.getLogger(HTTPResourceFetcher.class);

    private final HttpClient httpClient;

    public HTTPResourceFetcher(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    /**
     * sends a get request to the given URI
     *
     * @param uri URI to the resource to fetch
     * @return raw body of the resource
     */
    public Optional<String> get(URI uri) {
        var request = HttpRequest.newBuilder()
                .uri(Objects.requireNonNull(uri))
                .GET()
                .build();

        try {
            var res = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return Optional.ofNullable(res.body());
        } catch (IOException | InterruptedException e) {
            logger.warn("can't fetch resource from uri " + uri + "; skipping!", e);
            return Optional.empty();
        }
    }
}
