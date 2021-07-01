package com.wyvern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MakingCoffee makingCoffee = new MakingCoffee();
        makingCoffee.crushBeans("Cappuccino");
        makingCoffee.brew("Cappuccino");
        makingCoffee.serve("Cappuccino");
    }
}
