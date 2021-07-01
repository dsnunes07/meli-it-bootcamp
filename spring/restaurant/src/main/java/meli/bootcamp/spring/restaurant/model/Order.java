package meli.bootcamp.spring.restaurant.model;

import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Meal> meals;
    private int totalPriceCents;

    public Order(int id, Customer customer, List<Meal> meals, int totalPriceCents) {
        this.id = id;
        this.customer = customer;
        this.meals = meals;
        this.totalPriceCents = totalPriceCents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalPriceCents() {
        return totalPriceCents;
    }

    public void setTotalPriceCents(int totalPriceCents) {
        this.totalPriceCents = totalPriceCents;
    }

    public List<Meal> getMeals() {
        return this.meals;
    }

    public void addMeal(Meal meal) {
        this.meals.add(meal);
    }
}
