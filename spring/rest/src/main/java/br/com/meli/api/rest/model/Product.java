package br.com.meli.api.rest.model;

public class Product {
    private String title;
    private String description;
    private Integer priceCents;
    private int id;

    public Product(int id, String title, String description, Integer priceCents) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priceCents = priceCents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(Integer priceCents) {
        this.priceCents = priceCents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
