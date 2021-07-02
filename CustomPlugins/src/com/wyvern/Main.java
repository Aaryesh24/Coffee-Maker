package com.wyvern;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.billInfo();
    }
    public void billInfo() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        MakingCoffee makingCoffee = new MakingCoffee();
        String regex = "[0-9]+";
        System.out.println("Please enter your first name");
        String nextLine = scanner.nextLine();
        if (nextLine.equals("") || (nextLine.length() > 15) || (nextLine.matches(regex))) {
            error();
        } else {
            br();
            System.out.println("Okay "+nextLine+", Please enter you phone number");
            String nextLine2 = scanner.nextLine();
            if (nextLine2.equals("") || (!nextLine2.matches(regex)) || (nextLine2.length() >= 11)){
                error();
            } else {
                br();
                System.out.println("Great, which coffee would you like?");
                System.out.println("");
                System.out.println("We have Caffe Latte, Caffe Mocha, Cappuccino, Espresso and Double espresso");
                System.out.println("Type 1 for Caffe Latte");
                System.out.println("Type 2 for Caffe Mocha");
                System.out.println("Type 3 for Cappuccino");
                System.out.println("Type 4 for Espresso");
                System.out.println("Type 5 for Double Espresso");
                String nextLine3 = scanner.nextLine();
                if (!(nextLine3.equals("1") || nextLine3.equals("2") || nextLine3.equals("3") || nextLine3.equals("4") || nextLine3.equals("5"))){
                    error();
                } else {
                    String coffeeName = null;
                    if (nextLine3.equals("1")){
                        coffeeName = "Cafe Latte";
                    }
                    else if (nextLine3.equals("2")){
                        coffeeName = "Cafe Mocha";
                    }
                    else if (nextLine3.equals("3")){
                        coffeeName = "Cappuccino";
                    }
                    else if (nextLine3.equals("4")){
                        coffeeName = "Espresso";
                    }
                    else if (nextLine3.equals("5")){
                        coffeeName = "Double Espresso";
                    }
                    int max = 99;
                    int min = 1;
                    int randomNumber = (int) Math.floor(Math.random() * (max-min+1) + min);
                    br();
                    System.out.println("Ok done. Your order number is "+ randomNumber);
                    br();
                    System.out.println("Your coffee is being made");
                    TimeUnit.SECONDS.sleep(2);
                    clearScreen();
                    makingCoffeeStart(coffeeName);
                }
            }
        }
    }

    public void br() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void error() throws InterruptedException {
        System.out.println("We have detected some error, you will have to fill the form again. Trying again in 3 seconds!");
        TimeUnit.SECONDS.sleep(3);
        clearScreen();
        billInfo();
    }

    public static void clearScreen() {
        for (int i=0; i < 10; ++i) {
            System.out.println("");
        }
    }
    public void makingCoffeeStart(String coffeeName) throws InterruptedException {
        MakingCoffee makingCoffee = new MakingCoffee();
        makingCoffee.crushBeans(coffeeName);
        makingCoffee.brew(coffeeName);
        makingCoffee.serve(coffeeName);
    }
}
