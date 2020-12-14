package ru.mirea.pr12.task3;

public class Main {

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] newShirts = new Shirt[11];
        for (int i = 0; i <= 10; i++) {
            newShirts[i] = new Shirt(shirts[i]);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(newShirts[i]);
        }
    }
}
class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] parts = str.split(",");
        this.code = parts[0];
        this.name = parts[1];
        this.color = parts[2];
        this.size = parts[3];
    }

    @Override
    public String toString() {
        return "Shirt: " +
                "code - " + code +
                ", name - " + name +
                ", color - " + color +
                ", size - " + size;
    }
}