package ru.mirea.pr16;

public class TablesOrderManager {
    InternetOrder order;

    public void createOrder(Dish dish, Drink drink){
        InternetOrder order = new InternetOrder(dish, drink);
        this.order = order;
    }

    public void deleteOrder(Dish dish, Drink drink){
        this.order.dishesAndDrinks.clear();
        this.order = null;
    }
}
