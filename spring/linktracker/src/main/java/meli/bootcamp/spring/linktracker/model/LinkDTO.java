package meli.bootcamp.spring.linktracker.model;

public class LinkDTO {
    private String url;
    private int accessCounter;
    private String password;

    public LinkDTO(String url, int accessCounter, String password) {
        this.url = url;
        this.accessCounter = accessCounter;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public int getAccessCounter() {
        return accessCounter;
    }

    public void increaseAccessCounter() {
        this.accessCounter++;
    }
}
