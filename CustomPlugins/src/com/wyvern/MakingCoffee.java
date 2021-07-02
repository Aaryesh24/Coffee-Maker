package com.wyvern;
import java.util.concurrent.TimeUnit;

public class MakingCoffee implements Coffee {

    @Override
    public void crushBeans(String coffeeName) throws InterruptedException {
        System.out.println("Crushing the "+coffeeName+" coffee beans!");
        for (int i = 0; i < 5; i++){
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println("");
    }

    @Override
    public void brew(String coffeeName) throws InterruptedException {
        System.out.println(coffeeName+" is being brewed!");
        for (int i = 0; i < 5; i++){
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println("");
    }

    @Override
    public void serve(String coffeeName) {
        System.out.println("Serving your "+coffeeName+"!");
    }
}