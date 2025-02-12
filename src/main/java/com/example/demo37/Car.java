package com.example.demo37;

public class Car {
    private String brand;
    private int year;
    private double price;

    public Car(String brand, int year, double price) {
        setBrand(brand);
        setYear(year);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || !brand.matches("[a-zA-Z0-9 ]+")) {
            throw new IllegalArgumentException("Invalid brand name.");
        }
        this.brand = brand.trim();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2025) {
            throw new IllegalArgumentException("Year must be between 1886 and 2025.");
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }
}
