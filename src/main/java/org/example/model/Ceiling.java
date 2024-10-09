package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    // Constructor
    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    // Getter metotları
    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    // create metodu
    public void create() {
        System.out.println("Ceiling has been built.");
    }
}
