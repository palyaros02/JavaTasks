package ru.mirea.pr16;

final class Drink implements Item{
    final String name;
    final String description;
    final int cost;

    public Drink(String name, String description){
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Drink(int cost, String name, String description){
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