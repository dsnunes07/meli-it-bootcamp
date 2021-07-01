package meli.bootcamp.spring.restaurant.dao;

import meli.bootcamp.spring.restaurant.model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderDAO {
    private static List<Order> orders = new ArrayList<Order>();

    public List<Order> getOrders() {
        return orders;
    }

    public void add(Order order) {
        orders.add(order);
    }

    public Order get(int id) {
        Optional<Order> optional = this.orders.stream().filter(order -> order.getId() == id).findFirst();
        if (optional.isPresent())
            return optional.get();
        return null;
    }
}
