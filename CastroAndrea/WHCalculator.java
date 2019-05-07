package com.company;


public class WHCalculator {

    private String healthyBaby;
    private int ageBaby;

    public WHCalculator(int ageBaby) {
        this.ageBaby = ageBaby;


    }

    public String getHealthyBaby(int ageBaby) {

        switch (ageBaby) {
            case 3:
                healthyBaby = ("5.6 kg and 50.3 cm");
                break;
            case 6:
                healthyBaby = ("7.3 kg and 65 cm");
                break;
            case 9:
                healthyBaby = ("8.9 kg and 70 cm");
                break;
            case 12:
                healthyBaby = ("9.5 kg and 74 cm");
                break;
            case 15:
                healthyBaby = ("11 kg and 77 cm");
                break;
            case 18:
                healthyBaby = ("11.5 kg and 80.5 cm");
                break;
            default:
                healthyBaby = "out of age range";

        }
        return healthyBaby;
    }


}
