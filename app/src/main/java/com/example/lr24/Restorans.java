package com.example.lr24;

public class Restorans {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Restorans[] restorans = {
            new Restorans("Мама кормит", "Все вкусно как дома, мама я тебя люблю", R.drawable.restaurant),
            new Restorans("Папа кормит", "Ну это батя тут как получится но обычно вкусно, папа легенда", R.drawable.restaurant),
            new Restorans("Юрич кормит", "Не советую", R.drawable.restaurant)};

    private Restorans(String name, String description, int imageResourceId) {
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
