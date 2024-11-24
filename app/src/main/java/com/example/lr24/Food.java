package com.example.lr24;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Food[] foods = {
            new Food("Бургер", "Батон и мясо и троху овощей", R.drawable.fast_food),
            new Food("Пицца", "просто жесть всем советую", R.drawable.fast_food),
            new Food("Шаурма", "Лаваш и мясо и троху овощей", R.drawable.fast_food)};

    private Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
