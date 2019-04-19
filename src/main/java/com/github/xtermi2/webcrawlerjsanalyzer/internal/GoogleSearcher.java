package com.github.xtermi2.webcrawlerjsanalyzer.internal;

import java.io.IOException;

/**
 * @author Andreas Keefer
 */
public interface GoogleSearcher {

    /**
     * @param searchTerm The term to search in google
     * @return HTML RAW result
     */
    String search(String searchTerm) throws IOException, InterruptedException;
}
