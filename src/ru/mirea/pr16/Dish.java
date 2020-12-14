package ru.mirea.pr16;

final class Dish implements Item {
    final String name;
    final String description;
    final int cost;

    public Dish(String name, String description){
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Dish(int cost, String name, String description){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }
}
