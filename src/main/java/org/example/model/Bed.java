package org.example.model;

public class Bed {
    // Tüm instance değişkenleri private olarak tanımlandı
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts; // Test `quilts` ismini beklediği için `quilts` olarak tanımlandı

    // Constructor
    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    // Getter metotları
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() { // Testte `getQuilts()` metodu çağrıldığı için bu metodu düzenledik
        return quilts;
    }

    // make metodu
    public void make() {
        System.out.println("The bed is being made.");
    }
}
