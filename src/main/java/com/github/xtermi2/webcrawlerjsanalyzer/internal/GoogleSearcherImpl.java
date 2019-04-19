package com.github.xtermi2.webcrawlerjsanalyzer.internal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author Andreas Keefer
 */
public class GoogleSearcherImpl implements GoogleSearcher {

    private final HttpClient httpClient;

    public GoogleSearcherImpl(HttpClient httpClient) {

        this.httpClient = httpClient;
    }

    @Override
    public String search(String searchTerm) throws IOException, InterruptedException {

        // TODO (ak) does not work, i need a API key to query google (https://stackoverflow.com/questions/43034363/get-request-to-google-search)
        //      so I skip this part and use a Mock
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.co.in?q=" + searchTerm)) // TODO (ak) not encoded/parsed, make safe
                .GET()
                .build();

        HttpResponse<String> res = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return res.body();
    }
}
