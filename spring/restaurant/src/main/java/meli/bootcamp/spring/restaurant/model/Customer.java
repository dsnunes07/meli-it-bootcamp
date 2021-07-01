package meli.bootcamp.spring.restaurant.model;

import java.util.List;

public class Customer {
    private int id;
    private List<Order> orders;
    private int totalPriceCents;

    public Customer(int id, List<Order> orders, int totalPriceCents) {
        this.id = id;
        this.orders = orders;
        this.totalPriceCents = totalPriceCents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public int getTotalPriceCents() {
        return totalPriceCents;
    }

    public void setTotalPriceCents(int totalPriceCents) {
        this.totalPriceCents = totalPriceCents;
    }
}
