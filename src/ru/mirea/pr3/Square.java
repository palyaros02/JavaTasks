package ru.mirea.pr3;

public class Square extends Rectangle{
    public Square() {}
    public Square(double side){
        this.width = side;
        this.length = side;
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.width = side;
    }

    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}

