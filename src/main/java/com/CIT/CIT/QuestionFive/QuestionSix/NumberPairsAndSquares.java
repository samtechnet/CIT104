package com.CIT.CIT.QuestionFive.QuestionSix;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@Slf4j
public class NumberPairsAndSquares {
    public void calculate(){
        log.info("**********************************************************************");
        log.info("Let play a number pair game ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the last number: ");
        int last = scanner.nextInt();

        scanner.close();
        if (first <= last) {
            System.out.println("Pairs (Number, Square):");
            for (int num = first; num <= last; num++) {
                int square = num * num;
                String greenColor = "\u001B[32m";
                String resetColor = "\u001B[0m";
                System.out.printf(greenColor + "(%d, %d) " + resetColor, num, square);
            }
        } else {
            String redColor = "\u001B[31m";
            String resetColor = "\u001B[0m";
            System.out.println(redColor + "Invalid input. The first number should be less than or equal to the last number." + resetColor);
        }

    }
}
