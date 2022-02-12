package com.dhbw.searchengine.interfaces;

import com.dhbw.www.Link;

import java.util.List;

public interface IDatabase {
    int getVisitedDomainsCount();

    int getVisitedUniquePagesCount();

    List<Link> getVisitedLinks();

    List<Link> findLinksContaining(String query);
}
