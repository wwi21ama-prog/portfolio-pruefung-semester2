package dieprogrammierdozenten.searchengine;

import dieprogrammierdozenten.searchengine.interfaces.ICrawler;

public class Crawler implements ICrawler {
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void crawl(String startUrl) {
    }
}
