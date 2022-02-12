package com.dhbw.www;

public class Link {
    private String domain;
    private String path;

    public Link() {

    }

    public Link(String url) {
        this.fromUrl(url);
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void fromUrl(String url) {
        String domainAndPath = url.replaceAll("http(s?):\\/\\/(www\\.)?", "");
        String[] urlParts = domainAndPath.split("/", 2);
        this.domain = urlParts[0];

        this.path = "/";
        if (urlParts.length > 1) {
            this.path += urlParts[1];
        }
    }
}
