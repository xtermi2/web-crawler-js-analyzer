package com.github.xtermi2.webcrawlerjsanalyzer.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Mock which returns a search result for searchTerm 'foo'.
 *
 * @author Andreas Keefer
 */
public class GoogleSearcherMock implements GoogleSearcher {

    private static final Logger logger = LoggerFactory.getLogger(GoogleSearcherMock.class);

    public static final String FOO_RES = "<div class=\"med\" id=\"res\" role=\"main\">\n" +
            "<div id=\"topstuff\"></div>\n" +
            "<div id=\"search\">\n" +
            "<div data-ved=\"0ahUKEwjNur_y2trhAhVRLVAKHSfICRgQGggq\"><!--a--><h1 class=\"bNg8Rb\">\n" +
            "Suchergebnisse</h1>\n" +
            "<div data-async-context=\"query:foo\" id=\"ires\">\n" +
            "<div eid=\"uvy4XM31CtHawAKnkKfAAQ\" id=\"rso\">\n" +
            "<div class=\"bkWMgd\">\n" +
            "<div class=\"g mnr-c g-blk\" lang=\"de-DE\" data-hveid=\"CA4QAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQjDYoAHoECA4QAA\">\n" +
            "<div class=\"kp-blk c2xzTb Wnoohf OJXvsb\">\n" +
            "<div class=\"xpdopen\">\n" +
            "<div class=\"ifM9O\"><h2 class=\"bNg8Rb\">Hervorgehobenes\n" +
            "Snippet aus dem Web</h2>\n" +
            "<div>\n" +
            "<div></div>\n" +
            "</div>\n" +
            "<div>\n" +
            "<div class=\"mod\" data-md=\"61\" lang=\"de-DE\"\n" +
            "style=\"clear:none\"><!--m-->\n" +
            "<div class=\"LGOjhe\" aria-level=\"3\"\n" +
            "role=\"heading\" data-hveid=\"CA4QAQ\"><span\n" +
            "class=\"ILfuVd\">(4334) <b>Foo</b>, ein nach Lillian <b>Foo</b> (∗ 1972) benannter Asteroid. <b>Foo</b>-Fighter, eine Leuchterscheinung im Zweiten Weltkrieg. <b>Foo</b> Fighters, eine US-amerikanische Rockband. Metasyntaktische Variable, eine Variable in Computer-Programmcodes, die zur Benennung von beliebigen Entitäten in Beispielen dient, siehe auch Foobar.</span>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CA4QAw\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMAF6BAgOEAM\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://de.wikipedia.org/wiki/Foo\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de.wikipedia.org/wiki/Foo&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjABegQIDhAE\">\n" +
            "<h3 class=\"LC20lb\">Foo –\n" +
            "Wikipedia</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite\n" +
            "class=\"iUh30\">https://de.wikipedia.org/wiki/Foo</cite>\n" +
            "</div>\n" +
            "</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div style=\"clear:both\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"xaqJzf xfxx5d kno-ftr\">\n" +
            "<div class=\"HKxe9e kno-fb\">\n" +
            "<div data-async-context=\"async_id:duf3-1-0;authority:0;card_id:;entry_point:0;feature_id:;ftoe:0;header:0;open:0;suggestions:;suggestions_subtypes:;suggestions_types:;surface:0;title:;type:1\">\n" +
            "<div jscontroller=\"xz7cCd\" style=\"display:none\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"></div>\n" +
            "<div id=\"duf3-1-0\" data-jiis=\"up\"\n" +
            "data-async-type=\"duffy3\"\n" +
            "data-async-context-required=\"type,open,feature_id,async_id,entry_point,authority,card_id,ftoe,title,header,suggestions,surface,suggestions_types,suggestions_subtypes\"\n" +
            "class=\"y yp\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ-0F6BAgOEAU\"></div>\n" +
            "<span><span class=\"RTZ84b z1asCe Msi2Rc\"\n" +
            "data-async-trigger=\"duf3-1-0\" role=\"link\"\n" +
            "tabindex=\"-1\" jsaction=\"async.u\"\n" +
            "style=\"height:14px;line-height:14px;width:14px\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQtw96BAgOEAY\"><svg\n" +
            "focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M20 2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-7 9h-2V5h2v6zm0 4h-2v-2h2v2z\"></path></svg></span><a\n" +
            "class=\"XEKxtf\" href=\"#\"\n" +
            "data-async-trigger=\"duf3-1-0\" jsaction=\"async.u\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQtw96BAgOEAc\">Feedback geben</a></span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div>\n" +
            "<div class=\"ooYDfe\"><a\n" +
            "href=\"/url?url=https://support.google.com/webmasters/answer/6229325?hl%3Dde-DE&amp;rct=j&amp;q=&amp;esrc=s&amp;usg=AOvVaw06fUzZ6ZO3cKC_OcaO9Nry&amp;hl=de&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQrpwBegQIDhAI\"\n" +
            "tabindex=\"-1\"><span class=\"GGw8Tb z1asCe JrWGoc\"\n" +
            "style=\"height:16px;line-height:16px;width:16px\"><svg\n" +
            "focusable=\"false\" xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm1 17h-2v-2h2v2zm2.07-7.75l-.9.92C13.45 12.9 13 13.5 13 15h-2v-.5c0-1.1.45-2.1 1.17-2.83l1.24-1.26c.37-.36.59-.86.59-1.41 0-1.1-.9-2-2-2s-2 .9-2 2H8c0-2.21 1.79-4 4-4s4 1.79 4 4c0 .88-.36 1.68-.93 2.25z\"></path></svg></span></a><span\n" +
            "class=\"ypKeQe\"><a\n" +
            "href=\"/url?url=https://support.google.com/webmasters/answer/6229325?hl%3Dde-DE&amp;rct=j&amp;q=&amp;esrc=s&amp;usg=AOvVaw06fUzZ6ZO3cKC_OcaO9Nry&amp;hl=de&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQrpwBegQIDhAJ\">Informationen zu diesem Ergebnis</a></span>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"bkWMgd\"><h2 class=\"bNg8Rb\">Webergebnisse</h2>\n" +
            "<div class=\"srg\">\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAEQAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMAJ6BAgBEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://de.wikipedia.org/wiki/Foo\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de.wikipedia.org/wiki/Foo&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjACegQIARAB\">\n" +
            "<h3 class=\"LC20lb\">Foo – Wikipedia</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://de.wikipedia.org/wiki/Foo</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b2\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7B0wAnoECAEQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQqR8wAnoECAEQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:QO5L5c39BjgJ:https://de.wikipedia.org/wiki/Foo+&amp;cd=3&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:QO5L5c39BjgJ:https://de.wikipedia.org/wiki/Foo%2B%26cd%3D3%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQIDACegQIARAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://de.wikipedia.org/wiki/Foo+foo&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQHzACegQIARAF\">Ähnliche Seiten</a></li></ol></div></div></span>\n" +
            "</div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><em>Foo</em> steht für: (4334) <em>Foo</em>, ein nach Lillian <em>Foo</em> (∗ 1972) benannter Asteroid; <em>Foo</em>-<wbr>Fighter, eine Leuchterscheinung im Zweiten Weltkrieg; <em>Foo</em> Fighters, eine&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_1\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ2Z0BMAJ6BAgBEAY\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAQQAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMAN6BAgEEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://de.wikipedia.org/wiki/Metasyntaktische_Variable\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de.wikipedia.org/wiki/Metasyntaktische_Variable&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjADegQIBBAB\">\n" +
            "<h3 class=\"LC20lb\">Metasyntaktische Variable –\n" +
            "Wikipedia</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://de.wikipedia.org/wiki/Metasyntaktische_Variable</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b3\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7B0wA3oECAQQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQqR8wA3oECAQQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:QnmVVRNrbZkJ:https://de.wikipedia.org/wiki/Metasyntaktische_Variable+&amp;cd=4&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:QnmVVRNrbZkJ:https://de.wikipedia.org/wiki/Metasyntaktische_Variable%2B%26cd%3D4%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQIDADegQIBBAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://de.wikipedia.org/wiki/Metasyntaktische_Variable+foo&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQHzADegQIBBAF\">Ähnliche Seiten</a></li></ol></div></div></span>\n" +
            "</div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\">Eine metasyntaktische Variable ist eine Variable in Computer-Programmcodes, die ... Vor allem <em>foo</em> tritt als exemplarisches Objekt in vielen Beispielprogrammen auf. Außerdem gibt es auch „metasyntaktische Werte“, die Zahl 42 als die Antwort<wbr>&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_4\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ2Z0BMAN6BAgEEAY\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAcQAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMAR6BAgHEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://www.pcwelt.de/ratgeber/Was-sind-FOO-und-BAR-1212400.html\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.pcwelt.de/ratgeber/Was-sind-FOO-und-BAR-1212400.html&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjAEegQIBxAB\">\n" +
            "<h3 class=\"LC20lb\">Was sind FOO und BAR? -\n" +
            "PC-WELT</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30 bc\">https://www.pcwelt.de\n" +
            "&rsaquo; Computer &amp; Technik</cite></div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b4\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7B0wBHoECAcQBA\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQqR8wBHoECAcQBQ\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:ZfnefGWn6KQJ:https://www.pcwelt.de/ratgeber/Was-sind-FOO-und-BAR-1212400.html+&amp;cd=5&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:ZfnefGWn6KQJ:https://www.pcwelt.de/ratgeber/Was-sind-FOO-und-BAR-1212400.html%2B%26cd%3D5%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQIDAEegQIBxAG\">Im&nbsp;Cache</a></li></ol></div></div></span>\n" +
            "</div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\">Sie konnten aber bisher nicht herausfinden, welche Bedeutung sich dahinter verbirgt. Engländer sagen, dass &quot;<em>Foo</em>&quot; keine sprachliche Bedeutung habe.</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_7\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ2Z0BMAR6BAgHEAc\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAUQAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMAV6BAgFEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://searchmicroservices.techtarget.com/definition/foo-in-software-programming\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://searchmicroservices.techtarget.com/definition/foo-in-software-programming&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjAFegQIBRAB\">\n" +
            "<h3 class=\"LC20lb\">What is foo (in software\n" +
            "programming)? - Definition from WhatIs.com</h3>\n" +
            "<br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://searchmicroservices.techtarget.com/.../foo-in-software-pro...</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b5\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7B0wBXoECAUQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQqR8wBXoECAUQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:QV-iLS1AJA0J:https://searchmicroservices.techtarget.com/definition/foo-in-software-programming+&amp;cd=6&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:QV-iLS1AJA0J:https://searchmicroservices.techtarget.com/definition/foo-in-software-programming%2B%26cd%3D6%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQIDAFegQIBRAE\">Im&nbsp;Cache</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://searchmicroservices.techtarget.com/definition/foo-in-software-programming&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://searchmicroservices.techtarget.com/definition/foo-in-software-programming%26prev%3Dsearch&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7gEwBXoECAUQBg\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><span\n" +
            "class=\"f\">29.07.2016 - </span>This definition explains the meaning of <em>foo</em> and how programmers use the variable (sometimes referred to as a metasyntactic variable) to&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_5\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ2Z0BMAV6BAgFEAg\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAYQAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMAZ6BAgGEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://www.urbandictionary.com/define.php?term=foo\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.urbandictionary.com/define.php%3Fterm%3Dfoo&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjAGegQIBhAB\">\n" +
            "<h3 class=\"LC20lb\">Urban Dictionary: foo</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://www.urbandictionary.com/define.php?term=foo</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b6\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7B0wBnoECAYQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQqR8wBnoECAYQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:AQ3JCtolt3QJ:https://www.urbandictionary.com/define.php%3Fterm%3Dfoo+&amp;cd=7&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:AQ3JCtolt3QJ:https://www.urbandictionary.com/define.php%253Fterm%253Dfoo%2B%26cd%3D7%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQIDAGegQIBhAE\">Im&nbsp;Cache</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://www.urbandictionary.com/define.php%3Fterm%3Dfoo&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://www.urbandictionary.com/define.php%253Fterm%253Dfoo%26prev%3Dsearch&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7gEwBnoECAYQBg\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\">The terms foobar, <em>foo</em>, bar, and baz are sometimes used as placeholder names (<wbr>also referred to as metasyntactic variables) in computer programming or&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_6\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ2Z0BMAZ6BAgGEAc\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAIQAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMAd6BAgCEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://en.wiktionary.org/wiki/foo\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://en.wiktionary.org/wiki/foo&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjAHegQIAhAB\">\n" +
            "<h3 class=\"LC20lb\">foo - Wiktionary</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://en.wiktionary.org/wiki/foo</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b7\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7B0wB3oECAIQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQqR8wB3oECAIQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:VAY_n0yBzK0J:https://en.wiktionary.org/wiki/foo+&amp;cd=8&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:VAY_n0yBzK0J:https://en.wiktionary.org/wiki/foo%2B%26cd%3D8%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQIDAHegQIAhAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://en.wiktionary.org/wiki/foo+foo&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQHzAHegQIAhAF\">Ähnliche Seiten</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://en.wiktionary.org/wiki/foo&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://en.wiktionary.org/wiki/foo%26prev%3Dsearch&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7gEwB3oECAIQBw\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\">From Chinese 福 (fú, “fortunate; prosperity, good luck”), via its use as 福星 (<wbr>Fúxīng, “Jupiter”) in Chinese statues of the Three Lucky Stars, picked up from c.</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"bkWMgd\">\n" +
            "<div>\n" +
            "<g-section-with-header data-hveid=\"CAoQAA\">\n" +
            "<div class=\"e2BEnf U7izfe\"><h3 aria-level=\"2\" role=\"heading\">\n" +
            "Videos</h3></div>\n" +
            "<div data-hveid=\"CAoQAQ\">\n" +
            "<g-scrolling-carousel class=\"COEoid\" jscontroller=\"XjCeUc\"\n" +
            "id=\"_uvy4XM31CtHawAKnkKfAAQ8\"\n" +
            "jsdata=\"JcTXNb;;ByKkHo\" jsshadow=\"\"\n" +
            "jsaction=\"sc_em:EDKYjb;sc_rfir:aJ8u7;sc_dm:nnsrCf;ct_ia:HFYvKc;ct_ic:yUtVib;keydown:uYT2Vb;rcuQ6b:npT2md\">\n" +
            "<div jsname=\"haAclf\" class=\"mR2gOd\"\n" +
            "jsaction=\"fp_s:OR1BUb\" data-hveid=\"CAoQAg\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQzmR6BAgKEAI\">\n" +
            "<div jsname=\"s2gQvd\" class=\"EDblX DAVP1\" jsslot=\"\">\n" +
            "<div class=\"BFJZOc\">\n" +
            "<div class=\"P94G9b\" jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"true\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAAwCHoECAoQAw\">\n" +
            "<g-inner-card class=\"cv2VAd\">\n" +
            "<div class=\"y8AWGd llvJ5e\"><a\n" +
            "href=\"https://www.youtube.com/watch?v=ifwc5xgI3QM\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQwqsBMAh6BAgKEAQ\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.youtube.com/watch%3Fv%3Difwc5xgI3QM&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQwqsBMAh6BAgKEAQ\">\n" +
            "<div>\n" +
            "<div class=\"MAMEle\"\n" +
            "style=\"height:115px\">\n" +
            "<div class=\"Rd246b\"\n" +
            "style=\"height:115px;width:205px\">\n" +
            "<g-img><img\n" +
            "id=\"dimg_13\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"115\"\n" +
            "width=\"205\"\n" +
            "alt=\"\">\n" +
            "</g-img>\n" +
            "</div>\n" +
            "<div class=\"OIL2le\">\n" +
            "<span class=\"qB1pae\"></span>\n" +
            "</div>\n" +
            "<div class=\"k8B8Pc\">\n" +
            "6:22\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"wCIBKb\">\n" +
            "<div class=\"mB12kf JRhSae ZyAH8d nDgy9d\"\n" +
            "aria-level=\"3\"\n" +
            "role=\"heading\"\n" +
            "style=\"height:6.875em;-webkit-line-clamp:5\">\n" +
            "Foo Fighters - Run\n" +
            "(Official Music Video)\n" +
            "</div>\n" +
            "</div>\n" +
            "</a>\n" +
            "<div class=\"MjS0Lc llvJ5e ivLVOc\">\n" +
            "<div class=\"zECGdd RgAZAc\"\n" +
            "style=\"max-height:1.5399999618530273em;min-height:1.5399999618530273em;font-size:13px;padding:2px 0;line-height:1.5399999618530273em\">\n" +
            "foofightersVEVO\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"MjS0Lc nHGuld\">\n" +
            "<div class=\"zECGdd\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">\n" +
            "<span class=\"cJzOGc\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">YouTube</span>\n" +
            "- 01.06.2017\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-inner-card>\n" +
            "</div>\n" +
            "<div class=\"P94G9b\" jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"true\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAEwCXoECAoQBg\">\n" +
            "<g-inner-card class=\"cv2VAd\">\n" +
            "<div class=\"y8AWGd llvJ5e\"><a\n" +
            "href=\"https://www.youtube.com/watch?v=zBArTIXhUcg\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQwqsBMAl6BAgKEAc\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.youtube.com/watch%3Fv%3DzBArTIXhUcg&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQwqsBMAl6BAgKEAc\">\n" +
            "<div>\n" +
            "<div class=\"MAMEle\"\n" +
            "style=\"height:115px\">\n" +
            "<div class=\"Rd246b\"\n" +
            "style=\"height:115px;width:205px\">\n" +
            "<g-img><img\n" +
            "id=\"dimg_22\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"115\"\n" +
            "width=\"205\"\n" +
            "alt=\"\">\n" +
            "</g-img>\n" +
            "</div>\n" +
            "<div class=\"OIL2le\">\n" +
            "<span class=\"qB1pae\"></span>\n" +
            "</div>\n" +
            "<div class=\"k8B8Pc\">\n" +
            "1:33\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"wCIBKb\">\n" +
            "<div class=\"mB12kf JRhSae ZyAH8d nDgy9d\"\n" +
            "aria-level=\"3\"\n" +
            "role=\"heading\"\n" +
            "style=\"height:6.875em;-webkit-line-clamp:5\">\n" +
            "Foo Fighters Trailer\n" +
            "</div>\n" +
            "</div>\n" +
            "</a>\n" +
            "<div class=\"MjS0Lc llvJ5e ivLVOc\">\n" +
            "<div class=\"zECGdd RgAZAc\"\n" +
            "style=\"max-height:1.5399999618530273em;min-height:1.5399999618530273em;font-size:13px;padding:2px 0;line-height:1.5399999618530273em\">\n" +
            "Foo Fighters\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"MjS0Lc nHGuld\">\n" +
            "<div class=\"zECGdd\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">\n" +
            "<span class=\"cJzOGc\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">YouTube</span>\n" +
            "- 12.03.2011\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-inner-card>\n" +
            "</div>\n" +
            "<div class=\"P94G9b\" jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"true\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAIwCnoECAoQCQ\">\n" +
            "<g-inner-card class=\"cv2VAd\">\n" +
            "<div class=\"y8AWGd llvJ5e\"><a\n" +
            "href=\"https://www.youtube.com/watch?v=SBjQ9tuuTJQ\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQwqsBMAp6BAgKEAo\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.youtube.com/watch%3Fv%3DSBjQ9tuuTJQ&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQwqsBMAp6BAgKEAo\">\n" +
            "<div>\n" +
            "<div class=\"MAMEle\"\n" +
            "style=\"height:115px\">\n" +
            "<div class=\"Rd246b\"\n" +
            "style=\"height:115px;width:205px\">\n" +
            "<g-img><img\n" +
            "id=\"dimg_24\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"115\"\n" +
            "width=\"205\"\n" +
            "alt=\"\">\n" +
            "</g-img>\n" +
            "</div>\n" +
            "<div class=\"OIL2le\">\n" +
            "<span class=\"qB1pae\"></span>\n" +
            "</div>\n" +
            "<div class=\"k8B8Pc\">\n" +
            "4:31\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"wCIBKb\">\n" +
            "<div class=\"mB12kf JRhSae ZyAH8d nDgy9d\"\n" +
            "aria-level=\"3\"\n" +
            "role=\"heading\"\n" +
            "style=\"height:6.875em;-webkit-line-clamp:5\">\n" +
            "Foo Fighters - The\n" +
            "Pretender (Official\n" +
            "Music Video)\n" +
            "</div>\n" +
            "</div>\n" +
            "</a>\n" +
            "<div class=\"MjS0Lc llvJ5e ivLVOc\">\n" +
            "<div class=\"zECGdd RgAZAc\"\n" +
            "style=\"max-height:1.5399999618530273em;min-height:1.5399999618530273em;font-size:13px;padding:2px 0;line-height:1.5399999618530273em\">\n" +
            "foofightersVEVO\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"MjS0Lc nHGuld\">\n" +
            "<div class=\"zECGdd\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">\n" +
            "<span class=\"cJzOGc\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">YouTube</span>\n" +
            "- 03.10.2009\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-inner-card>\n" +
            "</div>\n" +
            "<div class=\"P94G9b\" id=\"uid_4\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAMwC3oECAoQDA\"></div>\n" +
            "<div class=\"P94G9b\" id=\"uid_7\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAQwDHoECAoQDw\"></div>\n" +
            "<div class=\"P94G9b\" id=\"uid_9\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAUwDXoECAoQEg\"></div>\n" +
            "<div class=\"P94G9b\" id=\"uid_11\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAYwDnoECAoQFQ\"></div>\n" +
            "<div class=\"P94G9b\" id=\"uid_13\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAcwD3oECAoQGA\"></div>\n" +
            "<div class=\"P94G9b\" id=\"uid_15\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAgwEHoECAoQGw\"></div>\n" +
            "<div class=\"P94G9b\" id=\"uid_17\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQr6oBKAkwEXoECAoQHg\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<g-left-button jsname=\"sIJmDf\"\n" +
            "class=\"nb-disabled Lu0opc BlOseb nb-fades eSq3C\"\n" +
            "style=\"top:0px;left:-14px\"\n" +
            "jsaction=\"zq6Zjc\" aria-label=\"Zurück\"\n" +
            "role=\"button\" tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ55kCegQIChAh\">\n" +
            "<g-fab class=\"CNf3nf LhCR5d\"\n" +
            "style=\"background-color:#fff;color:#757575\">\n" +
            "<span class=\"PUDfGe z1asCe N5KMwd\"><svg\n" +
            "focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12z\"></path></svg></span>\n" +
            "</g-fab>\n" +
            "</g-left-button>\n" +
            "<g-right-button jsname=\"IHFM4\"\n" +
            "style=\"top:0px;right:-14px\"\n" +
            "jsaction=\"auwzmf\"\n" +
            "class=\"Lu0opc k2Oeod nb-fades eSq3C\"\n" +
            "aria-label=\"Weiter\" role=\"button\"\n" +
            "tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ5pkCegQIChAi\">\n" +
            "<g-fab class=\"CNf3nf LhCR5d\"\n" +
            "style=\"background-color:#fff;color:#757575\">\n" +
            "<span class=\"PUDfGe z1asCe kKuqUd\"><svg\n" +
            "focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z\"></path></svg></span>\n" +
            "</g-fab>\n" +
            "</g-right-button>\n" +
            "<script nonce=\"zPNXyyKakRfRcZBTXEX/nw==\">(function () {\n" +
            "google.sc = google.sc || {};\n" +
            "google.sc.init = function (b, e, n, f, p, q, r) {\n" +
            "if ((b = document.getElementById(b)) && (0 != b.offsetWidth || 0 != b.offsetHeight)) {\n" +
            "var h = b.querySelector(\"div\"),\n" +
            "k = h.querySelector(\"div\"), c = 0,\n" +
            "g = h.scrollWidth - h.offsetWidth;\n" +
            "if (0 < e) {\n" +
            "var l = k.children;\n" +
            "c = l[e].offsetLeft - l[0].offsetLeft;\n" +
            "if (f) {\n" +
            "for (var m = c = 0; m < e; ++m) c += l[m].offsetWidth;\n" +
            "c = Math.min(g, c)\n" +
            "}\n" +
            "}\n" +
            "c += n;\n" +
            "e = Math.min(f ? g - c : c, g);\n" +
            "h.scrollLeft = f && (p || r) ? c : f && q ? -c : e;\n" +
            "var a = b.getElementsByTagName(\"g-left-button\")[0],\n" +
            "d = b.getElementsByTagName(\"g-right-button\")[0];\n" +
            "a && d && (a.className =\n" +
            "a.className.replace(/\\bnb-fades\\b/g, \"\"), d.className = d.className.replace(/\\bnb-fades\\b/g, \"\"), 0 == e ? a.className = \"nb-disabled \" + a.className : a.className = a.className.replace(\"nb-disabled\", \"\"), e == g ? d.className = \"nb-disabled \" + d.className : d.className = d.className.replace(\"nb-disabled\", \"\"), 0 < a.className.indexOf(\"joint-bar-beside\") && 0 == e && e == g && (k.style.paddingLeft = \"0px\", k.style.paddingRight = \"0px\", a.style.display = \"none\", d.style.display = \"none\", b.style.paddingLeft = f ? \"0px\" : \"48px\", b.style.paddingRight = f ? \"48px\" : \"0px\", b.style.textAlign = f ? \"left\" : \"right\", document.getElementById(\"fade_forward\").style.display = \"none\", document.getElementById(\"fade_reverse\").style.display = \"none\"), setTimeout(function () {\n" +
            "a.className += \" nb-fades\";\n" +
            "d.className += \" nb-fades\"\n" +
            "}, 50))\n" +
            "}\n" +
            "};\n" +
            "}).call(this);\n" +
            "(function () {\n" +
            "var id = '_uvy4XM31CtHawAKnkKfAAQ8';\n" +
            "var index = 0;\n" +
            "var offset = 0;\n" +
            "var is_rtl = false;\n" +
            "var is_ie8_or_above = false;\n" +
            "var is_gecko = false;\n" +
            "var is_edge = false;\n" +
            "google.sc.init(id, index, offset, is_rtl, is_ie8_or_above, is_gecko, is_edge);\n" +
            "})();</script>\n" +
            "</g-scrolling-carousel>\n" +
            "</div>\n" +
            "<script nonce=\"zPNXyyKakRfRcZBTXEX/nw==\">(function () {\n" +
            "var a = document.querySelector(\"#taw\"),\n" +
            "b = document.querySelector(\"#topstuff\");\n" +
            "if (a && !a.clientHeight && b && !b.clientHeight) for (var c = document.querySelector(\"#rso\").children, d = 0; d < c.length; ++d) if (0 < c[d].clientHeight) {\n" +
            "var e = c[d].querySelector(\"div g-section-with-header\");\n" +
            "e && (e.style.marginTop = 0);\n" +
            "break\n" +
            "}\n" +
            ";\n" +
            "}).call(this);</script>\n" +
            "</g-section-with-header>\n" +
            "</div>\n" +
            "</div>\n" +
            "<span id=\"fld\"></span>\n" +
            "<div class=\"bkWMgd\"><h2 class=\"bNg8Rb\">Webergebnisse</h2>\n" +
            "<div class=\"srg\">\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAAQAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMBJ6BAgAEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a href=\"https://foofighters.com/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://foofighters.com/&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjASegQIABAB\">\n" +
            "<h3 class=\"LC20lb\">Foo Fighters</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://foofighters.com/</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b18\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7B0wEnoECAAQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQqR8wEnoECAAQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:TpJjGU8aCLUJ:https://foofighters.com/+&amp;cd=19&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:TpJjGU8aCLUJ:https://foofighters.com/%2B%26cd%3D19%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQIDASegQIABAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://foofighters.com/+foo&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQHzASegQIABAF\">Ähnliche Seiten</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://foofighters.com/&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://foofighters.com/%26prev%3Dsearch&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7gEwEnoECAAQBw\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\">Check the dates for the <em>Foo</em> Fighters Concrete and Gold Tour 2018.</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_2\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ2Z0BMBJ6BAgAEAg\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAMQAA\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFSgAMBN6BAgDEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://de-de.facebook.com/foofighters/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de-de.facebook.com/foofighters/&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQFjATegQIAxAB\">\n" +
            "<h3 class=\"LC20lb\">Foo Fighters - Startseite |\n" +
            "Facebook</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30 bc\">https://de-de.facebook.com\n" +
            "&rsaquo; ... &rsaquo; Person des öffentlichen\n" +
            "Lebens &rsaquo; Musiker/in/Band</cite></div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b19\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7B0wE3oECAMQBA\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQqR8wE3oECAMQBQ\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:PZu6VAg6CeIJ:https://de-de.facebook.com/foofighters/+&amp;cd=20&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:PZu6VAg6CeIJ:https://de-de.facebook.com/foofighters/%2B%26cd%3D20%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQIDATegQIAxAG\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://de-de.facebook.com/foofighters/+foo&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQHzATegQIAxAH\">Ähnliche Seiten</a></li></ol></div></div></span>\n" +
            "</div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><em>Foo</em> Fighters. Gefällt 11.778.590 Mal. Get Sonic Highways: iTunes - http://smarturl<wbr>.it/FFSH Direct / Vinyl - http://bit.ly/sonic-highways Amazon -...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_3\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ2Z0BMBN6BAgDEAg\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"bkWMgd\">\n" +
            "<div class=\"g\" id=\"imagebox_bigimages\" data-hveid=\"CAgQAA\">\n" +
            "<g-section-with-header>\n" +
            "<div class=\"e2BEnf U7izfe\"><h3 aria-level=\"2\" role=\"heading\"><a\n" +
            "class=\"iu-card-header\"\n" +
            "href=\"/search?q=foo&amp;tbm=isch&amp;source=hp&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQsAR6BAgIEAE\">Bilder\n" +
            "zu foo</a></h3></div>\n" +
            "<div class=\"rg_r\" style=\"margin-top:3px\" id=\"iur\">\n" +
            "<div class=\"AX4s9b kno-ibrg\">\n" +
            "<div jscontroller=\"IkchZc\" jsaction=\"ivg_o:RySO6d\">\n" +
            "<div class=\"img-brk\" data-h=\"-1\" data-nr=\"1\"\n" +
            "style=\"overflow:hidden\">\n" +
            "<div class=\"birrg\" style=\"margin-right:-4px\">\n" +
            "<!--m-->\n" +
            "<div class=\"vsqVBf rg_el ivg-i\"\n" +
            "style=\"width:82px;height:90px\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9AEoADAUegQICBAD\">\n" +
            "<a jsaction=\"fire.ivg_o\" class=\"bia\"\n" +
            "href=\"/search?q=foo&amp;tbm=isch&amp;source=iu&amp;ictx=1&amp;fir=nv9uf2Urcc_lZM%253A%252Ci28vYnnt6jA20M%252C_&amp;vet=1&amp;usg=AI4_-kS9M7FH8kalulk1Ykuk9hV0G87jiA&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwFHoECAgQBA#imgrc=nv9uf2Urcc_lZM:\"\n" +
            "id=\"nv9uf2Urcc_lZM:\" role=\"link\"\n" +
            "tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwFHoECAgQBA\">\n" +
            "<g-img style=\"background:rgb(233,236,233)\">\n" +
            "<img id=\"dimg_9\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"112\"\n" +
            "style=\"margin-top:-11px\"\n" +
            "title=\"https://hurricane.de/de/bands/foo-fighters/\"\n" +
            "width=\"82\"\n" +
            "alt=\"Bildergebnis für foo\">\n" +
            "</g-img>\n" +
            "</a></div><!--n--><!--m-->\n" +
            "<div class=\"vsqVBf rg_el ivg-i\"\n" +
            "style=\"width:131px;height:90px\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9AEoATAVegQICBAF\">\n" +
            "<a jsaction=\"fire.ivg_o\" class=\"bia\"\n" +
            "href=\"/search?q=foo&amp;tbm=isch&amp;source=iu&amp;ictx=1&amp;fir=CcTYO-0-vNSBFM%253A%252CdC2TWSDuOXH_6M%252C_&amp;vet=1&amp;usg=AI4_-kR9tVChw-3UJOGcj-xovWwlhhLvbQ&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwFXoECAgQBg#imgrc=CcTYO-0-vNSBFM:\"\n" +
            "id=\"CcTYO-0-vNSBFM:\" role=\"link\"\n" +
            "tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwFXoECAgQBg\">\n" +
            "<g-img style=\"background:rgb(248,242,242)\">\n" +
            "<img id=\"dimg_11\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"98\"\n" +
            "style=\"margin-top:-7px\"\n" +
            "title=\"https://www.laut.de/Foo-Fighters\"\n" +
            "width=\"131\"\n" +
            "alt=\"Bildergebnis für foo\">\n" +
            "</g-img>\n" +
            "</a></div><!--n--><!--m-->\n" +
            "<div class=\"vsqVBf rg_el ivg-i\"\n" +
            "style=\"width:115px;height:90px\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9AEoAjAWegQICBAH\">\n" +
            "<a jsaction=\"fire.ivg_o\" class=\"bia\"\n" +
            "href=\"/search?q=foo&amp;tbm=isch&amp;source=iu&amp;ictx=1&amp;fir=3usMukY-D2eaCM%253A%252CsyAX6UvN9MUawM%252C_&amp;vet=1&amp;usg=AI4_-kQhNvecg3QuUAHqpcwzBs7xP5KV3w&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwFnoECAgQCA#imgrc=3usMukY-D2eaCM:\"\n" +
            "id=\"3usMukY-D2eaCM:\" role=\"link\"\n" +
            "tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwFnoECAgQCA\">\n" +
            "<g-img style=\"background:rgb(10,16,16)\">\n" +
            "<img id=\"dimg_15\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"112\"\n" +
            "style=\"margin-top:-13px\"\n" +
            "title=\"https://www.welt.de/kultur/pop/article168636151/Paul-McCartney-ist-jetzt-der-siebte-Foo-Fighter.html\"\n" +
            "width=\"115\"\n" +
            "alt=\"Bildergebnis für foo\">\n" +
            "</g-img>\n" +
            "</a></div><!--n--><!--m-->\n" +
            "<div class=\"vsqVBf rg_el ivg-i\"\n" +
            "style=\"width:124px;height:90px\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9AEoAzAXegQICBAJ\">\n" +
            "<a jsaction=\"fire.ivg_o\" class=\"bia\"\n" +
            "href=\"/search?q=foo&amp;tbm=isch&amp;source=iu&amp;ictx=1&amp;fir=HlnyIxvglZljAM%253A%252CxkcFqNVGoC-3hM%252C_&amp;vet=1&amp;usg=AI4_-kS185rIVhHyylB7whUFCvb9i_lQ4w&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwF3oECAgQCg#imgrc=HlnyIxvglZljAM:\"\n" +
            "id=\"HlnyIxvglZljAM:\" role=\"link\"\n" +
            "tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwF3oECAgQCg\">\n" +
            "<g-img style=\"background:rgb(8,8,8)\">\n" +
            "<img id=\"dimg_18\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"90\"\n" +
            "style=\"margin-left:-2px;margin-right:-10px\"\n" +
            "title=\"https://de.wikipedia.org/wiki/Foo_Fighters/Auszeichnungen_f%C3%BCr_Musikverk%C3%A4ufe\"\n" +
            "width=\"136\"\n" +
            "alt=\"Bildergebnis für foo\">\n" +
            "</g-img>\n" +
            "</a></div><!--n--><!--m-->\n" +
            "<div class=\"vsqVBf rg_el ivg-i\"\n" +
            "style=\"width:132px;height:90px\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9AEoBDAYegQICBAL\">\n" +
            "<a jsaction=\"fire.ivg_o\" class=\"bia\"\n" +
            "href=\"/search?q=foo&amp;tbm=isch&amp;source=iu&amp;ictx=1&amp;fir=T_CXrefuCMA2cM%253A%252CZFvBgktwObjWEM%252C_&amp;vet=1&amp;usg=AI4_-kRYriix97PNTlSCV1VHpuDsgUFO7w&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwGHoECAgQDA#imgrc=T_CXrefuCMA2cM:\"\n" +
            "id=\"T_CXrefuCMA2cM:\" role=\"link\"\n" +
            "tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ9QEwGHoECAgQDA\">\n" +
            "<g-img style=\"background:rgb(88,82,75)\">\n" +
            "<img id=\"dimg_20\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"90\"\n" +
            "style=\"margin-left:-1px;margin-right:-4px\"\n" +
            "title=\"https://classicrock.net/foo-fighters-metallica-cover-mit-jungem-fan/\"\n" +
            "width=\"137\"\n" +
            "alt=\"Bildergebnis für foo\">\n" +
            "</g-img>\n" +
            "</a></div><!--n--></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"DUU6i\">\n" +
            "<g-more-link class=\"iOcSOd mIKy0c\"><a class=\"Q2MMlc\"\n" +
            "href=\"/search?q=foo&amp;tbm=isch&amp;source=hp&amp;sa=X&amp;ved=2ahUKEwjNur_y2trhAhVRLVAKHSfICRgQ7Al6BAgIEA0\"><span\n" +
            "class=\"EZRelc z1asCe lYxQe\"><svg focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M12 4l-1.41 1.41L16.17 11H4v2h12.17l-5.58 5.59L12 20l8-8z\"></path></svg></span><span\n" +
            "class=\"wUrVib\">Weitere Bilder zu foo</span></a>\n" +
            "</g-more-link>\n" +
            "<span jscontroller=\"WVLMce\"><input style=\"display:none\"\n" +
            "class=\"iri\"\n" +
            "value=\"Melden\"\n" +
            "type=\"button\"><span\n" +
            "class=\"iri\"\n" +
            "style=\"display:none\">Gemeldet</span><span\n" +
            "class=\"mM8lEe bl\"><span class=\"gl\" id=\"irl_r\"><a\n" +
            "href=\"#\" class=\"a-no-hover-decoration\" id=\"irl_r_a\"\n" +
            "jsaction=\"rcuQ6b\">Unangemessene Bilder melden</a></span><span\n" +
            "id=\"irl_t\" style=\"display:none\">Wir danken dir für dein Feedback.</span><span\n" +
            "class=\"gl\" id=\"irl_m\" style=\"display:none\">&nbsp;<a\n" +
            "href=\"#\" id=\"irl_m_a\" jsaction=\"rcuQ6b\">Weiteres Bild melden</a></span><span\n" +
            "id=\"irl_p\" style=\"display:none\">Melde das anstößige Bild.</span><span\n" +
            "class=\"gl\" id=\"irl_c\" style=\"display:none\">&nbsp;<a\n" +
            "href=\"#\" id=\"irl_c_a\" jsaction=\"IbE0S\">Abbrechen</a></span><span\n" +
            "class=\"gl\" id=\"irl_d\" style=\"display:none\"><a\n" +
            "href=\"#\" id=\"irl_d_a\"\n" +
            "jsaction=\"iib5kc\">Fertig</a></span></span></span>\n" +
            "</div>\n" +
            "<script nonce=\"zPNXyyKakRfRcZBTXEX/nw==\">(function () {\n" +
            "var a = document.querySelector(\"#taw\"),\n" +
            "b = document.querySelector(\"#topstuff\");\n" +
            "if (a && !a.clientHeight && b && !b.clientHeight) for (var c = document.querySelector(\"#rso\").children, d = 0; d < c.length; ++d) if (0 < c[d].clientHeight) {\n" +
            "var e = c[d].querySelector(\"div g-section-with-header\");\n" +
            "e && (e.style.marginTop = 0);\n" +
            "break\n" +
            "}\n" +
            ";\n" +
            "}).call(this);</script>\n" +
            "</g-section-with-header>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div><!--z--></div>\n" +
            "</div>\n" +
            "</div>";

    public static final String JQUERY_RES = "<div class=\"med\" id=\"res\" role=\"main\">\n" +
            "<div id=\"topstuff\"></div>\n" +
            "<div id=\"search\">\n" +
            "<div data-ved=\"0ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQGggq\"><!--a--><h1 class=\"bNg8Rb\">\n" +
            "Suchergebnisse</h1>\n" +
            "<div data-async-context=\"query:jquery\" id=\"ires\">\n" +
            "<div eid=\"hBi5XMOhNIHFwAL6lpKgBg\" id=\"rso\">\n" +
            "<div class=\"bkWMgd\"><h2 class=\"bNg8Rb\">Webergebnisse</h2>\n" +
            "<div class=\"srg\">\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<link href=\"https://jquery.com/\" rel=\"prerender\">\n" +
            "<div data-hveid=\"CAMQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMAB6BAgDEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a href=\"https://jquery.com/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://jquery.com/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjAAegQIAxAB\">\n" +
            "<h3 class=\"LC20lb\">jQuery</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://jquery.com/</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b0\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wAHoECAMQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wAHoECAMQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:ievezQQ9aCIJ:https://jquery.com/+&amp;cd=1&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:ievezQQ9aCIJ:https://jquery.com/%2B%26cd%3D1%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDAAegQIAxAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://jquery.com/+jquery&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQHzAAegQIAxAF\">Ähnliche Seiten</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://jquery.com/&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://jquery.com/%26prev%3Dsearch&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7gEwAHoECAMQBw\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><em>jQuery</em>: The Write Less, Do More, JavaScript Library.</span>\n" +
            "<div class=\"osl\">\u200E<a class=\"fl\"\n" +
            "href=\"https://jquery.com/download/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://jquery.com/download/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ0gIoADAAegQIAxAJ\">Download</a>\n" +
            "·&nbsp;\u200E<a class=\"fl\"\n" +
            "href=\"https://api.jquery.com/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://api.jquery.com/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ0gIoATAAegQIAxAK\">jQuery\n" +
            "API Documentation</a> ·&nbsp;\u200E<a\n" +
            "class=\"fl\"\n" +
            "href=\"https://code.jquery.com/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://code.jquery.com/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ0gIoAjAAegQIAxAL\">jQuery\n" +
            "CDN</a> ·&nbsp;\u200E<a class=\"fl\"\n" +
            "href=\"https://plugins.jquery.com/tag/jquery/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://plugins.jquery.com/tag/jquery/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ0gIoAzAAegQIAxAM\">Jquery</a>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_4\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ2Z0BMAB6BAgDEA0\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAgQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMAF6BAgIEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://de.wikipedia.org/wiki/JQuery\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de.wikipedia.org/wiki/JQuery&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjABegQICBAB\">\n" +
            "<h3 class=\"LC20lb\">jQuery – Wikipedia</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://de.wikipedia.org/wiki/JQuery</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b1\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wAXoECAgQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wAXoECAgQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:kuvUJrVdI94J:https://de.wikipedia.org/wiki/JQuery+&amp;cd=2&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:kuvUJrVdI94J:https://de.wikipedia.org/wiki/JQuery%2B%26cd%3D2%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDABegQICBAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://de.wikipedia.org/wiki/JQuery+jquery&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQHzABegQICBAF\">Ähnliche Seiten</a></li></ol></div></div></span>\n" +
            "</div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><em>jQuery</em> (auch <em>jQuery</em> Core) ist eine freie JavaScript-Bibliothek, die Funktionen zur DOM-Navigation und -Manipulation zur Verfügung stellt. <em>jQuery</em> ist die&nbsp;...</span>\n" +
            "<div class=\"osl\">\u200E<a class=\"fl\"\n" +
            "href=\"https://de.wikipedia.org/wiki/JQuery#Geschichte\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de.wikipedia.org/wiki/JQuery%23Geschichte&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ0gIoADABegQICBAH\">Geschichte</a>\n" +
            "·&nbsp;\u200E<a class=\"fl\"\n" +
            "href=\"https://de.wikipedia.org/wiki/JQuery#Parallele_Versionsstr%C3%A4nge\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de.wikipedia.org/wiki/JQuery%23Parallele_Versionsstr%25C3%25A4nge&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ0gIoATABegQICBAI\">Parallele\n" +
            "Versionsstränge</a> ·&nbsp;\u200E<a\n" +
            "class=\"fl\"\n" +
            "href=\"https://de.wikipedia.org/wiki/JQuery#Funktionen\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de.wikipedia.org/wiki/JQuery%23Funktionen&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ0gIoAjABegQICBAJ\">Funktionen</a>\n" +
            "·&nbsp;\u200E<a class=\"fl\"\n" +
            "href=\"https://de.wikipedia.org/wiki/JQuery#Benutzung\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://de.wikipedia.org/wiki/JQuery%23Benutzung&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ0gIoAzABegQICBAK\">Benutzung</a>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_8\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ2Z0BMAF6BAgIEAs\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAYQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMAJ6BAgGEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://www.w3schools.com/jquery/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.w3schools.com/jquery/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjACegQIBhAB\">\n" +
            "<h3 class=\"LC20lb\">jQuery Tutorial - W3Schools</h3>\n" +
            "<br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://www.w3schools.com/jquery/</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b2\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wAnoECAYQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wAnoECAYQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:0uqv3sB9SbMJ:https://www.w3schools.com/jquery/+&amp;cd=3&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:0uqv3sB9SbMJ:https://www.w3schools.com/jquery/%2B%26cd%3D3%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDACegQIBhAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://www.w3schools.com/jquery/+jquery&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQHzACegQIBhAF\">Ähnliche Seiten</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://www.w3schools.com/jquery/&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://www.w3schools.com/jquery/%26prev%3Dsearch&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7gEwAnoECAYQBw\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><em>jQuery</em> Examples. Learn by examples! At W3Schools you will find a lot of <em>jQuery</em> examples to edit and test yourself. See All <em>jQuery</em> Examples&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_6\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ2Z0BMAJ6BAgGEAg\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"bkWMgd\">\n" +
            "<div class=\"g kno-kp mnr-c g-blk\" data-hveid=\"CA4QAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQuU4oAXoECA4QAA\">\n" +
            "<div class=\"kp-blk cUnQKe Wnoohf OJXvsb\">\n" +
            "<div class=\"xpdopen\">\n" +
            "<div class=\"ifM9O\">\n" +
            "<div>\n" +
            "<div></div>\n" +
            "</div>\n" +
            "<h2 class=\"JolIg\">Nutzer fragen auch</h2>\n" +
            "<div jscontroller=\"xj7LNb\"\n" +
            "jsaction=\"ac_fc:A6ecOd;ac_bc:NlNJyb;ac_be:o7YQ2\"\n" +
            "data-cs=\"CgZqcXVlcnkSHFdhcyBiZWRldXRldCBkYXMgYmVpIGpRdWVyeT8SFVdhcyBpc3QgZWluIERPTSBIVE1MPxIZV2FzIGlzdCBlaW4gQWpheCBSZXF1ZXN0PyIGu23aQd5cMARIAFAAWQAAAAAAAAAAYQAAAAAAAAAAeAA\"\n" +
            "data-mqac=\"0\" id=\"_hBi5XMOhNIHFwAL6lpKgBg12\"\n" +
            "data-jiis=\"up\" data-async-type=\"rq\"\n" +
            "data-async-context-required=\"q,state\" class=\"y yi\"\n" +
            "data-async-rclass=\"search\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqrkBKAB6BAgOEAE\">\n" +
            "<g-loading-icon jsname=\"aZ2wEe\" class=\"uKh9yc\"\n" +
            "style=\"display:none;height:24px;width:24px\">\n" +
            "<img height=\"24\"\n" +
            "src=\"//www.gstatic.com/ui/v1/activityindicator/loading_24.gif\"\n" +
            "width=\"24\" alt=\"Wird geladen...\"\n" +
            "role=\"progressbar\"></g-loading-icon>\n" +
            "<div decode-data-ved=\"1\"\n" +
            "eid=\"hBi5XMOhNIHFwAL6lpKgBg\"\n" +
            "class=\"related-question-pair\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQq7kBKAB6BAgOEAI\">\n" +
            "<g-accordion-expander\n" +
            "jsaction=\"ac_ar:r.P4m57vfE35M;b_cs:r.aqbz5jur3d0\"\n" +
            "data-rtid=\"iRF6LtLTb0iM\"\n" +
            "jsl=\"$t t-WcOtvxbnSJ4;$x 0;\"\n" +
            "class=\"r-iRF6LtLTb0iM\">\n" +
            "<div class=\"mWyH1d kno-atc iRF6LtLTb0iM-AXS0viZgQlI\"\n" +
            "aria-controls=\"_hBi5XMOhNIHFwAL6lpKgBg13\"\n" +
            "aria-expanded=\"false\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg14\"\n" +
            "role=\"tab\"\n" +
            "jsaction=\"r.gEerGdY_Tt4;fastbutton:r.gEerGdY_Tt4\"\n" +
            "data-rtid=\"iRF6LtLTb0iM\" jsl=\"$x 1;\">\n" +
            "<span class=\"vp45yf z1asCe bjaP2b\"\n" +
            "style=\"right:16px\"><svg\n" +
            "focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z\"></path></svg></span>\n" +
            "<div style=\"padding-right:40px\"\n" +
            "jsname=\"xXq91c\"\n" +
            "class=\"match-mod-horizontal-padding cbphWd\"\n" +
            "data-kt=\"KjCS19O20rbXkd4BhOb15-STrqYOoMzim-Ptl9j5AZrl6djF8MaWowHLpdGP_f_N5Uo\"\n" +
            "tabindex=\"0\" data-hveid=\"CA4QAw\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQuk4oAHoECA4QAw\">\n" +
            "Was bedeutet das bei jQuery?\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"gy6Qzb kno-ahide iRF6LtLTb0iM-nyqMOEtQrq0\"\n" +
            "aria-hidden=\"true\"\n" +
            "aria-labelledby=\"_hBi5XMOhNIHFwAL6lpKgBg14\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg13\"\n" +
            "role=\"tabpanel\"\n" +
            "jsaction=\"r.gEerGdY_Tt4;fastbutton:r.gEerGdY_Tt4\"\n" +
            "data-rtid=\"iRF6LtLTb0iM\" jsl=\"$x 2;\">\n" +
            "<div>\n" +
            "<div jsname=\"oQYOj\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg17\"\n" +
            "data-hveid=\"CA4QBA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQu04oAXoECA4QBA\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-accordion-expander>\n" +
            "</div>\n" +
            "<div decode-data-ved=\"1\"\n" +
            "eid=\"hBi5XMOhNIHFwAL6lpKgBg\"\n" +
            "class=\"related-question-pair\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQq7kBKAF6BAgOEAo\">\n" +
            "<g-accordion-expander\n" +
            "jsaction=\"ac_ar:r.P4m57vfE35M;b_cs:r.aqbz5jur3d0\"\n" +
            "data-rtid=\"ipSAAEcjOggk\"\n" +
            "jsl=\"$t t-WcOtvxbnSJ4;$x 0;\"\n" +
            "class=\"r-ipSAAEcjOggk\">\n" +
            "<div class=\"mWyH1d kno-atc ipSAAEcjOggk-AXS0viZgQlI\"\n" +
            "aria-controls=\"_hBi5XMOhNIHFwAL6lpKgBg35\"\n" +
            "aria-expanded=\"false\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg36\"\n" +
            "role=\"tab\"\n" +
            "jsaction=\"r.gEerGdY_Tt4;fastbutton:r.gEerGdY_Tt4\"\n" +
            "data-rtid=\"ipSAAEcjOggk\" jsl=\"$x 1;\">\n" +
            "<span class=\"vp45yf z1asCe bjaP2b\"\n" +
            "style=\"right:16px\"><svg\n" +
            "focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z\"></path></svg></span>\n" +
            "<div style=\"padding-right:40px\"\n" +
            "jsname=\"xXq91c\"\n" +
            "class=\"match-mod-horizontal-padding cbphWd\"\n" +
            "data-kt=\"KjCL4ruv9dCZs-cBmrW_lLXHwMkV_9uGuNrmndPkAYTl843_vOetVI_ByIjHru-snwE\"\n" +
            "tabindex=\"0\" data-hveid=\"CA4QCw\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQuk4oAHoECA4QCw\">\n" +
            "Was ist ein DOM HTML?\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"gy6Qzb kno-ahide ipSAAEcjOggk-nyqMOEtQrq0\"\n" +
            "aria-hidden=\"true\"\n" +
            "aria-labelledby=\"_hBi5XMOhNIHFwAL6lpKgBg36\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg35\"\n" +
            "role=\"tabpanel\"\n" +
            "jsaction=\"r.gEerGdY_Tt4;fastbutton:r.gEerGdY_Tt4\"\n" +
            "data-rtid=\"ipSAAEcjOggk\" jsl=\"$x 2;\">\n" +
            "<div>\n" +
            "<div jsname=\"oQYOj\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg39\"\n" +
            "data-hveid=\"CA4QDA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQu04oAXoECA4QDA\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-accordion-expander>\n" +
            "</div>\n" +
            "<div decode-data-ved=\"1\"\n" +
            "eid=\"hBi5XMOhNIHFwAL6lpKgBg\"\n" +
            "class=\"related-question-pair\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQq7kBKAJ6BAgOEBM\">\n" +
            "<g-accordion-expander\n" +
            "jsaction=\"ac_ar:r.P4m57vfE35M;b_cs:r.aqbz5jur3d0\"\n" +
            "data-rtid=\"iSyBjP73EUCU\"\n" +
            "jsl=\"$t t-WcOtvxbnSJ4;$x 0;\"\n" +
            "class=\"r-iSyBjP73EUCU\">\n" +
            "<div class=\"mWyH1d kno-atc iSyBjP73EUCU-AXS0viZgQlI\"\n" +
            "aria-controls=\"_hBi5XMOhNIHFwAL6lpKgBg41\"\n" +
            "aria-expanded=\"false\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg42\"\n" +
            "role=\"tab\"\n" +
            "jsaction=\"r.gEerGdY_Tt4;fastbutton:r.gEerGdY_Tt4\"\n" +
            "data-rtid=\"iSyBjP73EUCU\" jsl=\"$x 1;\">\n" +
            "<span class=\"vp45yf z1asCe bjaP2b\"\n" +
            "style=\"right:16px\"><svg\n" +
            "focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z\"></path></svg></span>\n" +
            "<div style=\"padding-right:40px\"\n" +
            "jsname=\"xXq91c\"\n" +
            "class=\"match-mod-horizontal-padding cbphWd\"\n" +
            "data-kt=\"Ki_cjda4u-WlyDy-wrKykMDo9EWUuKubqbGL088BoYad8Ya76JxH1tHig83gxOjNAQ\"\n" +
            "tabindex=\"0\" data-hveid=\"CA4QFA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQuk4oAHoECA4QFA\">\n" +
            "Was ist ein Ajax Request?\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"gy6Qzb kno-ahide iSyBjP73EUCU-nyqMOEtQrq0\"\n" +
            "aria-hidden=\"true\"\n" +
            "aria-labelledby=\"_hBi5XMOhNIHFwAL6lpKgBg42\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg41\"\n" +
            "role=\"tabpanel\"\n" +
            "jsaction=\"r.gEerGdY_Tt4;fastbutton:r.gEerGdY_Tt4\"\n" +
            "data-rtid=\"iSyBjP73EUCU\" jsl=\"$x 2;\">\n" +
            "<div>\n" +
            "<div jsname=\"oQYOj\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg43\"\n" +
            "data-hveid=\"CA4QFQ\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQu04oAXoECA4QFQ\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-accordion-expander>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div style=\"clear:both\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"kno-ftr\">\n" +
            "<div class=\"HKxe9e kno-fb\">\n" +
            "<div data-async-context=\"async_id:duf3-44-3;authority:0;card_id:;entry_point:0;feature_id:;ftoe:0;header:0;open:0;suggestions:;suggestions_subtypes:;suggestions_types:;surface:0;title:;type:44\">\n" +
            "<div jscontroller=\"xz7cCd\" style=\"display:none\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"></div>\n" +
            "<div id=\"duf3-44-3\" data-jiis=\"up\"\n" +
            "data-async-type=\"duffy3\"\n" +
            "data-async-context-required=\"type,open,feature_id,async_id,entry_point,authority,card_id,ftoe,title,header,suggestions,surface,suggestions_types,suggestions_subtypes\"\n" +
            "class=\"y yp\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ-0F6BAgOEBw\"></div>\n" +
            "<a class=\"duf3\" href=\"#\" data-async-trigger=\"duf3-44-3\"\n" +
            "jsaction=\"async.u\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQtw96BAgOEB0\">Feedback\n" +
            "geben</a></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"bkWMgd\"><h2 class=\"bNg8Rb\">Webergebnisse</h2>\n" +
            "<div class=\"srg\">\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAIQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMAl6BAgCEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://www.w3schools.com/jquery/jquery_get_started.asp\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.w3schools.com/jquery/jquery_get_started.asp&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjAJegQIAhAB\">\n" +
            "<h3 class=\"LC20lb\">jQuery Get Started -\n" +
            "W3Schools</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://www.w3schools.com/jquery/jquery_get_started.asp</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b9\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wCXoECAIQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wCXoECAIQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:GcYlIsV1I8YJ:https://www.w3schools.com/jquery/jquery_get_started.asp+&amp;cd=10&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:GcYlIsV1I8YJ:https://www.w3schools.com/jquery/jquery_get_started.asp%2B%26cd%3D10%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDAJegQIAhAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://www.w3schools.com/jquery/jquery_get_started.asp+jquery&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQHzAJegQIAhAF\">Ähnliche Seiten</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://www.w3schools.com/jquery/jquery_get_started.asp&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://www.w3schools.com/jquery/jquery_get_started.asp%26prev%3Dsearch&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7gEwCXoECAIQBw\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\">The <em>jQuery</em> library is a single JavaScript file, and you reference it with the HTML &lt;<wbr>script&gt; tag (notice that the &lt;script&gt; tag should be inside the &lt;head&gt; section):.</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_3\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ2Z0BMAl6BAgCEAg\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAcQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMAp6BAgHEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://www.html-seminar.de/jquery-tutorial.htm\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.html-seminar.de/jquery-tutorial.htm&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjAKegQIBxAB\">\n" +
            "<h3 class=\"LC20lb\">jQuery-Tutorial für Anfänger -\n" +
            "HTML-Seminar</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://www.html-seminar.de/jquery-tutorial.htm</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b10\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wCnoECAcQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wCnoECAcQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:BHP9TJ64TA4J:https://www.html-seminar.de/jquery-tutorial.htm+&amp;cd=11&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:BHP9TJ64TA4J:https://www.html-seminar.de/jquery-tutorial.htm%2B%26cd%3D11%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDAKegQIBxAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://www.html-seminar.de/jquery-tutorial.htm+jquery&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQHzAKegQIBxAF\">Ähnliche Seiten</a></li></ol></div></div></span>\n" +
            "</div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><em>jQuery</em> ist zugegeben wesentlich mehr, also nur die schmerzfreie Art mit JavaScript zu arbeiten. <em>jQuery</em> beseitigt die Nachteile von JavaScript, die oft darin lagen,&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_7\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ2Z0BMAp6BAgHEAY\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAUQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMAt6BAgFEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://www.dev-insider.de/was-ist-jquery-a-782237/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.dev-insider.de/was-ist-jquery-a-782237/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjALegQIBRAB\">\n" +
            "<h3 class=\"LC20lb\">Was ist jQuery? -\n" +
            "Dev-Insider</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://www.dev-insider.de/was-ist-jquery-a-782237/</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b11\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wC3oECAUQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wC3oECAUQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:IKZ4M25fsPkJ:https://www.dev-insider.de/was-ist-jquery-a-782237/+&amp;cd=12&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:IKZ4M25fsPkJ:https://www.dev-insider.de/was-ist-jquery-a-782237/%2B%26cd%3D12%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDALegQIBRAE\">Im&nbsp;Cache</a></li></ol></div></div></span>\n" +
            "</div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><span\n" +
            "class=\"f\">01.01.2019 - </span><em>jQuery</em> ist eine JavaScript-Bibliothek, die Webentwicklern die Arbeit mit JavaScript erleichtern soll. Sie überbrückt technische Unterschiede&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"bkWMgd\">\n" +
            "<div>\n" +
            "<g-section-with-header data-hveid=\"CAoQAA\">\n" +
            "<div class=\"e2BEnf U7izfe\"><h3 aria-level=\"2\" role=\"heading\">\n" +
            "Videos</h3></div>\n" +
            "<div data-hveid=\"CAoQAQ\">\n" +
            "<g-scrolling-carousel class=\"COEoid\" jscontroller=\"XjCeUc\"\n" +
            "id=\"_hBi5XMOhNIHFwAL6lpKgBg9\"\n" +
            "jsdata=\"JcTXNb;;BuGL3I\" jsshadow=\"\"\n" +
            "jsaction=\"sc_em:EDKYjb;sc_rfir:aJ8u7;sc_dm:nnsrCf;ct_ia:HFYvKc;ct_ic:yUtVib;keydown:uYT2Vb;rcuQ6b:npT2md\">\n" +
            "<div jsname=\"haAclf\" class=\"mR2gOd\"\n" +
            "jsaction=\"fp_s:OR1BUb\" data-hveid=\"CAoQAg\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQzmR6BAgKEAI\">\n" +
            "<div jsname=\"s2gQvd\" class=\"EDblX DAVP1\" jsslot=\"\">\n" +
            "<div class=\"BFJZOc\">\n" +
            "<div class=\"P94G9b\" jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"true\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQr6oBKAAwDHoECAoQAw\">\n" +
            "<g-inner-card class=\"cv2VAd\">\n" +
            "<div class=\"y8AWGd llvJ5e\"><a\n" +
            "href=\"https://www.youtube.com/watch?v=hMxGhHNOkCU\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQwqsBMAx6BAgKEAQ\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.youtube.com/watch%3Fv%3DhMxGhHNOkCU&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQwqsBMAx6BAgKEAQ\">\n" +
            "<div>\n" +
            "<div class=\"MAMEle\"\n" +
            "style=\"height:115px\">\n" +
            "<div class=\"Rd246b\"\n" +
            "style=\"height:115px;width:205px\">\n" +
            "<g-img><img\n" +
            "id=\"dimg_10\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"115\"\n" +
            "width=\"205\"\n" +
            "alt=\"\">\n" +
            "</g-img>\n" +
            "</div>\n" +
            "<div class=\"OIL2le\">\n" +
            "<span class=\"qB1pae\"></span>\n" +
            "</div>\n" +
            "<div class=\"k8B8Pc\">\n" +
            "8:01\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"wCIBKb\">\n" +
            "<div class=\"mB12kf JRhSae ZyAH8d nDgy9d\"\n" +
            "aria-level=\"3\"\n" +
            "role=\"heading\"\n" +
            "style=\"height:6.875em;-webkit-line-clamp:5\">\n" +
            "jQuery Tutorial #1 -\n" +
            "jQuery Tutorial for\n" +
            "Beginners\n" +
            "</div>\n" +
            "</div>\n" +
            "</a>\n" +
            "<div class=\"MjS0Lc llvJ5e ivLVOc\">\n" +
            "<div class=\"zECGdd RgAZAc\"\n" +
            "style=\"max-height:1.5399999618530273em;min-height:1.5399999618530273em;font-size:13px;padding:2px 0;line-height:1.5399999618530273em\">\n" +
            "LearnCode.academy\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"MjS0Lc nHGuld\">\n" +
            "<div class=\"zECGdd\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">\n" +
            "<span class=\"cJzOGc\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">YouTube</span>\n" +
            "- 22.03.2014\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-inner-card>\n" +
            "</div>\n" +
            "<div class=\"P94G9b\" jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"true\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQr6oBKAEwDXoECAoQBg\">\n" +
            "<g-inner-card class=\"cv2VAd\">\n" +
            "<div class=\"y8AWGd llvJ5e\"><a\n" +
            "href=\"https://www.khanacademy.org/computing/computer-programming/html-js-jquery/jquery-intro/v/what-is-jquery\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQwqsBMA16BAgKEAc\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.khanacademy.org/computing/computer-programming/html-js-jquery/jquery-intro/v/what-is-jquery&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQwqsBMA16BAgKEAc\">\n" +
            "<div>\n" +
            "<div class=\"MAMEle\"\n" +
            "style=\"height:115px\">\n" +
            "<div class=\"Rd246b\"\n" +
            "style=\"height:115px;width:205px\">\n" +
            "<g-img><img\n" +
            "id=\"dimg_21\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"115\"\n" +
            "width=\"205\"\n" +
            "alt=\"\">\n" +
            "</g-img>\n" +
            "</div>\n" +
            "<div class=\"OIL2le\">\n" +
            "<span class=\"qB1pae\"></span>\n" +
            "</div>\n" +
            "<div class=\"k8B8Pc\">\n" +
            "1:17\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"wCIBKb\">\n" +
            "<div class=\"mB12kf JRhSae ZyAH8d nDgy9d\"\n" +
            "aria-level=\"3\"\n" +
            "role=\"heading\"\n" +
            "style=\"height:6.875em;-webkit-line-clamp:5\">\n" +
            "What is jQuery? (video)\n" +
            "| Welcome to jQuery\n" +
            "</div>\n" +
            "</div>\n" +
            "</a>\n" +
            "<div class=\"MjS0Lc llvJ5e ivLVOc\">\n" +
            "<div class=\"zECGdd RgAZAc\"\n" +
            "style=\"max-height:1.5399999618530273em;min-height:1.5399999618530273em;font-size:13px;padding:2px 0;line-height:1.5399999618530273em\">\n" +
            "Khan Academy Computing\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"MjS0Lc nHGuld\">\n" +
            "<div class=\"zECGdd\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">\n" +
            "<span class=\"cJzOGc\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">Khan Academy</span>\n" +
            "- 28.09.2015\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-inner-card>\n" +
            "</div>\n" +
            "<div class=\"P94G9b\" jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"true\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQr6oBKAIwDnoECAoQCQ\">\n" +
            "<g-inner-card class=\"cv2VAd\">\n" +
            "<div class=\"y8AWGd llvJ5e\"><a\n" +
            "href=\"https://www.youtube.com/watch?v=D0_WLNv2cJA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQwqsBMA56BAgKEAo\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://www.youtube.com/watch%3Fv%3DD0_WLNv2cJA&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQwqsBMA56BAgKEAo\">\n" +
            "<div>\n" +
            "<div class=\"MAMEle\"\n" +
            "style=\"height:115px\">\n" +
            "<div class=\"Rd246b\"\n" +
            "style=\"height:115px;width:205px\">\n" +
            "<g-img><img\n" +
            "id=\"dimg_28\"\n" +
            "src=\"data:image/gif;base64,R0lGODlhAQABAIAAAP///////yH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==\"\n" +
            "data-deferred=\"1\"\n" +
            "class=\"rISBZc M4dUYb\"\n" +
            "height=\"115\"\n" +
            "width=\"205\"\n" +
            "alt=\"\">\n" +
            "</g-img>\n" +
            "</div>\n" +
            "<div class=\"OIL2le\">\n" +
            "<span class=\"qB1pae\"></span>\n" +
            "</div>\n" +
            "<div class=\"k8B8Pc\">\n" +
            "10:23\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"wCIBKb\">\n" +
            "<div class=\"mB12kf JRhSae ZyAH8d nDgy9d\"\n" +
            "aria-level=\"3\"\n" +
            "role=\"heading\"\n" +
            "style=\"height:6.875em;-webkit-line-clamp:5\">\n" +
            "Google Pixelbook, jQuery\n" +
            "3.4.0 e sites inclusivos\n" +
            "- Weekly #290\n" +
            "</div>\n" +
            "</div>\n" +
            "</a>\n" +
            "<div class=\"MjS0Lc llvJ5e ivLVOc\">\n" +
            "<div class=\"zECGdd RgAZAc\"\n" +
            "style=\"max-height:1.5399999618530273em;min-height:1.5399999618530273em;font-size:13px;padding:2px 0;line-height:1.5399999618530273em\">\n" +
            "BrazilJS\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"MjS0Lc nHGuld\">\n" +
            "<div class=\"zECGdd\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">\n" +
            "<span class=\"cJzOGc\"\n" +
            "style=\"font-size:12px;padding:2px 0;line-height:1.3300000429153442em\">YouTube</span>\n" +
            "- vor 11 Stunden\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</g-inner-card>\n" +
            "</div>\n" +
            "<div class=\"P94G9b\" id=\"uid_1\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQr6oBKAMwD3oECAoQDA\"></div>\n" +
            "<div class=\"P94G9b\" id=\"uid_3\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQr6oBKAQwEHoECAoQDw\"></div>\n" +
            "<div class=\"P94G9b\" id=\"uid_5\"\n" +
            "jscontroller=\"F8FRnd\"\n" +
            "data-init-vis=\"false\"\n" +
            "style=\"width:205px\"\n" +
            "jsaction=\"rcuQ6b:npT2md\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQr6oBKAUwEXoECAoQEg\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<g-left-button jsname=\"sIJmDf\"\n" +
            "class=\"nb-disabled Lu0opc BlOseb nb-fades eSq3C\"\n" +
            "style=\"top:0px;left:-14px\"\n" +
            "jsaction=\"zq6Zjc\" aria-label=\"Zurück\"\n" +
            "role=\"button\" tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ55kCegQIChAV\">\n" +
            "<g-fab class=\"CNf3nf LhCR5d\"\n" +
            "style=\"background-color:#fff;color:#757575\">\n" +
            "<span class=\"PUDfGe z1asCe N5KMwd\"><svg\n" +
            "focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12z\"></path></svg></span>\n" +
            "</g-fab>\n" +
            "</g-left-button>\n" +
            "<g-right-button jsname=\"IHFM4\"\n" +
            "style=\"top:0px;right:-14px\"\n" +
            "jsaction=\"auwzmf\"\n" +
            "class=\"Lu0opc k2Oeod nb-fades eSq3C\"\n" +
            "aria-label=\"Weiter\" role=\"button\"\n" +
            "tabindex=\"0\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ5pkCegQIChAW\">\n" +
            "<g-fab class=\"CNf3nf LhCR5d\"\n" +
            "style=\"background-color:#fff;color:#757575\">\n" +
            "<span class=\"PUDfGe z1asCe kKuqUd\"><svg\n" +
            "focusable=\"false\"\n" +
            "xmlns=\"http://www.w3.org/2000/svg\"\n" +
            "viewbox=\"0 0 24 24\"><path\n" +
            "d=\"M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z\"></path></svg></span>\n" +
            "</g-fab>\n" +
            "</g-right-button>\n" +
            "<script nonce=\"0INoivvEW9U5ieJn4o6WWg==\">(function () {\n" +
            "google.sc = google.sc || {};\n" +
            "google.sc.init = function (b, e, n, f, p, q, r) {\n" +
            "if ((b = document.getElementById(b)) && (0 != b.offsetWidth || 0 != b.offsetHeight)) {\n" +
            "var h = b.querySelector(\"div\"),\n" +
            "k = h.querySelector(\"div\"), c = 0,\n" +
            "g = h.scrollWidth - h.offsetWidth;\n" +
            "if (0 < e) {\n" +
            "var l = k.children;\n" +
            "c = l[e].offsetLeft - l[0].offsetLeft;\n" +
            "if (f) {\n" +
            "for (var m = c = 0; m < e; ++m) c += l[m].offsetWidth;\n" +
            "c = Math.min(g, c)\n" +
            "}\n" +
            "}\n" +
            "c += n;\n" +
            "e = Math.min(f ? g - c : c, g);\n" +
            "h.scrollLeft = f && (p || r) ? c : f && q ? -c : e;\n" +
            "var a = b.getElementsByTagName(\"g-left-button\")[0],\n" +
            "d = b.getElementsByTagName(\"g-right-button\")[0];\n" +
            "a && d && (a.className =\n" +
            "a.className.replace(/\\bnb-fades\\b/g, \"\"), d.className = d.className.replace(/\\bnb-fades\\b/g, \"\"), 0 == e ? a.className = \"nb-disabled \" + a.className : a.className = a.className.replace(\"nb-disabled\", \"\"), e == g ? d.className = \"nb-disabled \" + d.className : d.className = d.className.replace(\"nb-disabled\", \"\"), 0 < a.className.indexOf(\"joint-bar-beside\") && 0 == e && e == g && (k.style.paddingLeft = \"0px\", k.style.paddingRight = \"0px\", a.style.display = \"none\", d.style.display = \"none\", b.style.paddingLeft = f ? \"0px\" : \"48px\", b.style.paddingRight = f ? \"48px\" : \"0px\", b.style.textAlign = f ? \"left\" : \"right\", document.getElementById(\"fade_forward\").style.display = \"none\", document.getElementById(\"fade_reverse\").style.display = \"none\"), setTimeout(function () {\n" +
            "a.className += \" nb-fades\";\n" +
            "d.className += \" nb-fades\"\n" +
            "}, 50))\n" +
            "}\n" +
            "};\n" +
            "}).call(this);\n" +
            "(function () {\n" +
            "var id = '_hBi5XMOhNIHFwAL6lpKgBg9';\n" +
            "var index = 0;\n" +
            "var offset = 0;\n" +
            "var is_rtl = false;\n" +
            "var is_ie8_or_above = false;\n" +
            "var is_gecko = false;\n" +
            "var is_edge = false;\n" +
            "google.sc.init(id, index, offset, is_rtl, is_ie8_or_above, is_gecko, is_edge);\n" +
            "})();</script>\n" +
            "</g-scrolling-carousel>\n" +
            "</div>\n" +
            "<script nonce=\"0INoivvEW9U5ieJn4o6WWg==\">(function () {\n" +
            "var a = document.querySelector(\"#taw\"),\n" +
            "b = document.querySelector(\"#topstuff\");\n" +
            "if (a && !a.clientHeight && b && !b.clientHeight) for (var c = document.querySelector(\"#rso\").children, d = 0; d < c.length; ++d) if (0 < c[d].clientHeight) {\n" +
            "var e = c[d].querySelector(\"div g-section-with-header\");\n" +
            "e && (e.style.marginTop = 0);\n" +
            "break\n" +
            "}\n" +
            ";\n" +
            "}).call(this);</script>\n" +
            "</g-section-with-header>\n" +
            "</div>\n" +
            "</div>\n" +
            "<span id=\"fld\"></span>\n" +
            "<div class=\"bkWMgd\"><h2 class=\"bNg8Rb\">Webergebnisse</h2>\n" +
            "<div class=\"srg\">\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAAQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMBJ6BAgAEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a\n" +
            "href=\"https://github.com/jquery/jquery\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://github.com/jquery/jquery&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjASegQIABAB\">\n" +
            "<h3 class=\"LC20lb\">GitHub - jquery/jquery: jQuery\n" +
            "JavaScript Library</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://github.com/jquery/jquery</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b18\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wEnoECAAQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wEnoECAAQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:QVO446I2roIJ:https://github.com/jquery/jquery+&amp;cd=19&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:QVO446I2roIJ:https://github.com/jquery/jquery%2B%26cd%3D19%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDASegQIABAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://github.com/jquery/jquery+jquery&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQHzASegQIABAF\">Ähnliche Seiten</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://github.com/jquery/jquery&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://github.com/jquery/jquery%26prev%3Dsearch&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7gEwEnoECAAQBw\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><em>jQuery</em> JavaScript Library. Contribute to <em>jquery</em>/<em>jquery</em> development by creating an account on GitHub.</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_1\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ2Z0BMBJ6BAgAEAg\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAQQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMBN6BAgEEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a href=\"https://jqueryui.com/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://jqueryui.com/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjATegQIBBAB\">\n" +
            "<h3 class=\"LC20lb\">jQuery UI</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://jqueryui.com/</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b19\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wE3oECAQQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wE3oECAQQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:QVeAY_5rx_wJ:https://jqueryui.com/+&amp;cd=20&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:QVeAY_5rx_wJ:https://jqueryui.com/%2B%26cd%3D20%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDATegQIBBAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://jqueryui.com/+jquery&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQHzATegQIBBAF\">Ähnliche Seiten</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://jqueryui.com/&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://jqueryui.com/%26prev%3Dsearch&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7gEwE3oECAQQBw\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\"><em>jQuery</em> UI is a curated set of user interface interactions, effects, widgets, and themes built on top of the <em>jQuery</em> JavaScript Library. Whether you&#39;re building highly&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_5\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ2Z0BMBN6BAgEEAg\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "<div class=\"g\"><!--m-->\n" +
            "<div data-hveid=\"CAEQAA\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFSgAMBR6BAgBEAA\">\n" +
            "<div class=\"rc\">\n" +
            "<div class=\"r\"><a href=\"https://jquery.org/\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://jquery.org/&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQFjAUegQIARAB\">\n" +
            "<h3 class=\"LC20lb\">jQuery Foundation</h3><br>\n" +
            "<div class=\"TbwUpd\"><cite class=\"iUh30\">https://jquery.org/</cite>\n" +
            "</div>\n" +
            "</a><span><div class=\"action-menu ab_ctl\"><a\n" +
            "class=\"GHDvEf ab_button\" href=\"#\" id=\"am-b20\"\n" +
            "aria-label=\"Ergebnisoptionen\"\n" +
            "aria-expanded=\"false\" aria-haspopup=\"true\"\n" +
            "role=\"button\"\n" +
            "jsaction=\"m.tdd;keydown:m.hbke;keypress:m.mskpe\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7B0wFHoECAEQAg\"><span\n" +
            "class=\"mn-dwn-arw\"></span></a><div\n" +
            "class=\"action-menu-panel ab_dropdown\"\n" +
            "role=\"menu\" tabindex=\"-1\"\n" +
            "jsaction=\"keydown:m.hdke;mouseover:m.hdhne;mouseout:m.hdhue\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQqR8wFHoECAEQAw\"><ol><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"https://webcache.googleusercontent.com/search?q=cache:NPaGBN8kveQJ:https://jquery.org/+&amp;cd=21&amp;hl=de&amp;ct=clnk&amp;gl=de\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://webcache.googleusercontent.com/search%3Fq%3Dcache:NPaGBN8kveQJ:https://jquery.org/%2B%26cd%3D21%26hl%3Dde%26ct%3Dclnk%26gl%3Dde&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQIDAUegQIARAE\">Im&nbsp;Cache</a></li><li\n" +
            "class=\"action-menu-item ab_dropdownitem\"\n" +
            "role=\"menuitem\"><a class=\"fl\"\n" +
            "href=\"/search?q=related:https://jquery.org/+jquery&amp;tbo=1&amp;sa=X&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQHzAUegQIARAF\">Ähnliche Seiten</a></li></ol></div></div></span><a\n" +
            "class=\"fl\"\n" +
            "href=\"https://translate.google.com/translate?hl=de&amp;sl=en&amp;u=https://jquery.org/&amp;prev=search\"\n" +
            "ping=\"/url?sa=t&amp;source=web&amp;rct=j&amp;url=https://translate.google.com/translate%3Fhl%3Dde%26sl%3Den%26u%3Dhttps://jquery.org/%26prev%3Dsearch&amp;ved=2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ7gEwFHoECAEQBw\">Diese\n" +
            "Seite übersetzen</a></div>\n" +
            "<div class=\"s\">\n" +
            "<div><span class=\"st\">The <em>jQuery</em> Foundation is now the JS Foundation. For more information about our expanded vision to become the center of gravity for the entire JavaScript&nbsp;...</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div data-base-uri=\"/search\" id=\"ed_2\"\n" +
            "data-ved=\"2ahUKEwjD84Sz9drhAhWBIlAKHXqLBGQQ2Z0BMBR6BAgBEAg\"></div>\n" +
            "</div>\n" +
            "</div><!--n--></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div><!--z--></div>\n" +
            "</div>\n" +
            "</div>";

    private final String mochRespose;

    public GoogleSearcherMock(String mochRespose) {
        this.mochRespose = mochRespose;
    }

    @Override
    public String search(String searchTerm) throws IOException, InterruptedException {
        logger.warn("USING MOCK AND RETURNING STATIC CONTENT AND NOT SEARCH TERM=" + searchTerm);
        return mochRespose;
    }
}
