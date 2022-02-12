package dieprogrammierdozenten.searchengine;

import dieprogrammierdozenten.www.Link;
import dieprogrammierdozenten.searchengine.interfaces.IDatabase;

import java.util.List;

public class Database implements IDatabase {
    @Override
    public List<Link> getVisitedLinks() {
        return null;
    }

    @Override
    public List<Link> findLinksContaining(String query) {
        return null;
    }

    @Override
    public int getVisitedDomainsCount() {
        return 0;
    }

    @Override
    public int getVisitedUniquePagesCount() {
        return 0;
    }

    @Override
    public List<String> getSearchIndex() {
        return null;
    }
}
