package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random diceRoller = new Random ();

        int rollResult = diceRoller.nextInt(6) + 1;

        System.out.println("TIME TO ROOOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        } else if (rollResult == 6) {
            System.out.println("You rolled a critical! Nice Job!");
        }

    }
}
