package org.example.model;

public class Wall {
    private String direction;

    // Constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    // Getter metodu
    public String getDirection() {
        return direction;
    }

    // create metodu
    public void create() {
        System.out.println("Wall has been built.");
    }
}
