package ru.mirea.pr16;

import java.util.HashMap;

public class InternetOrder {
    protected HashMap<Dish, Drink> dishesAndDrinks = new HashMap();

    public InternetOrder(Dish dish, Drink drink){
        dishesAndDrinks.put(dish, drink);
    }

    @Override
    public String toString() {
        if (dishesAndDrinks.size() == 0)
            return "";
        else
            return String.format("Your order: %s", dishesAndDrinks);
    }

    public boolean isEmpty() {
        return dishesAndDrinks.size() == 0;
    }

    public HashMap<Dish, Drink> getDishesAndDrinks() {
        return dishesAndDrinks;
    }
}
