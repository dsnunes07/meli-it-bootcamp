package meli.bootcamp.spring.restaurant.dao;

import meli.bootcamp.spring.restaurant.model.Meal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MealDAO {
    private static List<Meal> meals = new ArrayList<Meal>(
            Arrays.asList(
                    new Meal(1, 1000, "Chicken", 1),
                    new Meal(2, 3000, "Beans", 1),
                    new Meal(3, 1200, "Beer", 1)
            )
    );

    public static List<Meal> getMeals() {
        return meals;
    }

    public void add(Meal meal) {
        meals.add(meal);
    }

    public Meal get(int id) {
        Optional<Meal> optional = meals.stream().filter(meal -> meal.getId() == id).findFirst();
        if (optional.isPresent())
            return optional.get();
        return null;
    }
}
