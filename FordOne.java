package com.bridgelabz.workshop;

public class FordOne {
static class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}
 public class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public Truck(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }

    public double getSalePrice() {
        return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80);
    }
}
public static class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
    public double getSalePrice() {
        return super.getSalePrice() * (length > 20 ? 0.95 : 0.90);
    }
}
 public static class Ford extends Car {
    private int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public Ford(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }

    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
    public static class MyShop {
        public static void main(String[] args) {
            Sedan Sedan = new Sedan(500, 500, "red", 30);
            Ford fordOne = new Ford(300, 300, "black", 2021, 35);
            Ford fordTwo = new Ford(250, 250, "yellow", 2020, 40);
            Car car = new Car(100, 100, "white");
            System.out.println("Sedan. " + Sedan.getSalePrice());
            System.out.println("fordOne " + fordOne.getSalePrice());
            System.out.println("fordTwo " + fordTwo.getSalePrice());
            System.out.println("car " + car.getSalePrice());
        }
    }
} }
