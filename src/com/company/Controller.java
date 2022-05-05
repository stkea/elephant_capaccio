package com.company;

import java.util.Scanner;

public class Controller {

    public String readLine_str(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        return scanner.nextLine();
    }

    public double readline_double(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        return scanner.nextDouble();
    }

    public double calculateEBITA(double amount, double price) {
        return price*amount;
    }

    public double calculateEBITAWithDiscount(double EBITA, double discount) {
        return EBITA * (1 - (discount) / 100);
    }

    public double calculateTotalWithTax(double EBITA, double tax) {
        return EBITA * (1 + (tax) / 100);
    }


    public double statecodeToTaxBracket(String code) {
        switch (code.toUpperCase()) {
            case "UT" -> {return 6.85;}
            case "NV" -> {return 8.00;}
            case "TX" -> {return 6.25;}
            case "AL" -> {return 4.00;}
            case "CA" -> {return 8.25;}
            default ->   {return 0;}
        }
    }

    public int discountFromValue(double value) {
        if          (value >= 50000)    return 15;
        else if     (value >= 10000)    return 10;
        else if     (value >= 7000)     return 7;
        else if     (value >= 5000)     return 5;
        else if     (value >= 1000)     return 3;
        else                            return 0;
    }




    public void run() {
        double packageAmount    =          readline_double("Amount of items: ");
        double price            =          readline_double("Price per item: ");
        String stateCode        =          readLine_str("State code: ");
        double EBITA            =          calculateEBITA(packageAmount, price);
        double possibleDiscount =          discountFromValue(EBITA);
        double possibleTax      =          statecodeToTaxBracket(stateCode);

        EBITA                   =          calculateEBITAWithDiscount(EBITA, possibleDiscount);
        double total            =          calculateTotalWithTax(EBITA, possibleTax);

        System.out.println("Total price: " + total);




    }
}
