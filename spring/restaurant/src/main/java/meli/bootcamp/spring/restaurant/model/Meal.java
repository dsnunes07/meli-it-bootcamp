package meli.bootcamp.spring.restaurant.model;

public class Meal {
    private int id;
    private int priceCents;
    private String description;
    private int quantity;

    public Meal(int id, int priceCents, String description, int quantity) {
        this.id = id;
        this.priceCents = priceCents;
        this.description = description;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(int priceCents) {
        this.priceCents = priceCents;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", priceCents=" + priceCents +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
