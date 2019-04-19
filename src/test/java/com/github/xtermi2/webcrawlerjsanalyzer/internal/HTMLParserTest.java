package com.github.xtermi2.webcrawlerjsanalyzer.internal;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Andreas Keefer
 */
class HTMLParserTest {

    private GoogleSearcher googleSearcherMock = new GoogleSearcherMock(GoogleSearcherMock.FOO_RES);
    private HTMLParser underTest = new HTMLParser();

    @Nested
    class extractGoogleSearchResultURIs {
        @Test
        void parseDemoMockData_returnsValidURIs() throws IOException, InterruptedException {
            String fooSearchRes = googleSearcherMock.search("foo");

            List<URI> uris = underTest.extractGoogleSearchResultURIs(fooSearchRes);

            assertThat(uris)
                    .containsExactly(
                            URI.create("https://de.wikipedia.org/wiki/Foo"),
                            URI.create("https://de.wikipedia.org/wiki/Foo"),
                            URI.create("https://de.wikipedia.org/wiki/Metasyntaktische_Variable"),
                            URI.create("https://www.pcwelt.de/ratgeber/Was-sind-FOO-und-BAR-1212400.html"),
                            URI.create("https://searchmicroservices.techtarget.com/definition/foo-in-software-programming"),
                            URI.create("https://www.urbandictionary.com/define.php?term=foo"),
                            URI.create("https://en.wiktionary.org/wiki/foo"),
                            URI.create("https://foofighters.com/"),
                            URI.create("https://de-de.facebook.com/foofighters/")
                    );
        }

        @Test
        void nullInputReturnsEmptyList() {
            assertThat(underTest.extractGoogleSearchResultURIs(null))
                    .isEmpty();
        }
    }

    @Nested
    class extractJsLibs {
        // TODO (ak) impl unittests
    }
}