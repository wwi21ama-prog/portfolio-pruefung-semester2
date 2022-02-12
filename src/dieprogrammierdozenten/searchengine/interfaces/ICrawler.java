package dieprogrammierdozenten.searchengine.interfaces;

public interface ICrawler {
    public int getId();

    void crawl(String startUrl);
}
