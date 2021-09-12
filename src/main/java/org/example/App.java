/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scale;
        float conF, conC;

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");

        scale = scanner.nextLine();

        if (scale.toLowerCase(Locale.ROOT).equals("f")) {
            System.out.print("Please enter the temperature in Celsius: ");
            conC = scanner.nextFloat();
            conF = (conC * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is " + conF + ".");
        }
        else if (scale.toLowerCase(Locale.ROOT).equals("c")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            conF = scanner.nextFloat();
            conC = (conF - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is " + conC + ".");
        }
    }
}