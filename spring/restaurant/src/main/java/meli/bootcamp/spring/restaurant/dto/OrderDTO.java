package meli.bootcamp.spring.restaurant.dto;

import meli.bootcamp.spring.restaurant.dao.OrderDAO;
import meli.bootcamp.spring.restaurant.model.Customer;
import meli.bootcamp.spring.restaurant.model.Meal;
import meli.bootcamp.spring.restaurant.model.Order;

import java.util.List;

public class OrderDTO {
    private Customer customer;
    private List<Meal> meals;
    private int totalPriceCents;

    public OrderDTO(Customer customer, List<Meal> meals, int totalPriceCents) {
        this.customer = customer;
        this.meals = meals;
        this.totalPriceCents = totalPriceCents;
    }

    public Customer getCustomer() {
        return customer;
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
        return meals;
    }

    public static Order convert(OrderDTO order) {
        OrderDAO dao = new OrderDAO();
        return new Order(dao.getOrders().size() + 1, order.getCustomer(), order.getMeals(), order.getTotalPriceCents());
    }

    public static OrderDTO convert(Order order) {
        return new OrderDTO(order.getCustomer(), order.getMeals(), order.getTotalPriceCents());
    }
}
