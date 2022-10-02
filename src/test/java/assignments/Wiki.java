package assignments;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.Document;
import javax.swing.text.Element;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class Wiki {
public static void main(String[] args) throws Exception {
	 // TODO Auto-generated method stub    
    //fetching web page via HTTP
    org.jsoup.nodes.Document page = Jsoup.connect("https://www.waterless-toilet.com/top-6-best-composting-toilets-to-choose/").get();

    //selecting all hyperlinks
    Elements pageElements = page.select("a[href]");

    ArrayList<String> hyperLinks = new ArrayList<String>();

    //iterating and extracting
    for (org.jsoup.nodes.Element e:pageElements) {
      hyperLinks.add("Text: " + e.text());
      hyperLinks.add("Link: " + e.attr("href"));
    }

    for (String s : hyperLinks) {
      System.out.println(s);
    }
  }
}
