package dieprogrammierdozenten.searchengine.interfaces;

import dieprogrammierdozenten.www.Link;

import java.util.List;

public interface IDatabase {
    int getVisitedDomainsCount();

    int getVisitedUniquePagesCount();

    List<String> getSearchIndex();

    List<Link> getVisitedLinks();

    List<Link> findLinksContaining(String query);
}
