package meli.bootcamp.spring.linktracker.model;

public class Link {
    private String url;
    private int linkId;
    private int accessCounter;

    public Link(String url, int linkId, int accessCounter) {
        this.url = url;
        this.linkId = linkId;
        this.accessCounter = accessCounter;
    }

    public String getUrl() {
        return url;
    }

    public int getLinkId() {
        return linkId;
    }

    public int getAccessCounter() {
        return accessCounter;
    }
}
