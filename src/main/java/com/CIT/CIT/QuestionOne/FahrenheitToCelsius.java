package com.CIT.CIT.QuestionOne;

import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class FahrenheitToCelsius {

    public static void convert(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5.0/9.0;
        String greenColor = "\u001B[32m";
        // ANSI escape code to reset text color to default
        String resetColor = "\u001B[0m";
        String output= String.format("%s%.2f degrees Fahrenheit is equal to %.2f degrees Celsius%n%s", greenColor, fahrenheit, celsius, resetColor);
        System.out.printf(output);

        // Close the scanner
        //scanner.close();
    }
}
