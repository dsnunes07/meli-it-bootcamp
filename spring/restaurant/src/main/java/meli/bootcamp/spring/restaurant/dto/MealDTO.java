package meli.bootcamp.spring.restaurant.dto;

import meli.bootcamp.spring.restaurant.dao.MealDAO;
import meli.bootcamp.spring.restaurant.model.Meal;

public class MealDTO {
    private int priceCents;
    private String description;
    private int quantity;

    public MealDTO(int priceCents, String description, int quantity) {
        this.priceCents = priceCents;
        this.description = description;
        this.quantity = quantity;
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

    public static MealDTO convert(Meal meal) {
        return new MealDTO(meal.getPriceCents(), meal.getDescription(), meal.getQuantity());
    }

    public static Meal convert(MealDTO meal) {
        return new Meal(MealDAO.getMeals().size() + 1, meal.getPriceCents(), meal.getDescription(), meal.getQuantity());
    }
}
