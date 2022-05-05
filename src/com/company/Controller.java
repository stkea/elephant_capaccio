package com.company;

public class Controller {




    public double statecodeToTaxBracket(String code) {
        switch (code.toUpperCase()) {
            case "UT" -> {return 6.85;}
            case "NV" -> {return 8.00;}
            case "TX" -> {return 6.25;}
            case "AL" -> {return 4.00;}
            case "CA" -> {return 8.25;}
            default -> {return 0.0;}
        }
    }

    public int discountFromValue(double value) {
        if (value >= 50000) return 15;
        else if (value >= 10000) return 10;
        else if (value >= 7000) return 7;
        else if (value >= 5000) return 5;
        else if (value >= 3000) return 3;
        else return 0;
    }

    public void run() {
    }
}
