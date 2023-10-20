package com.CIT.CIT.QuestionFive;

import org.springframework.stereotype.Service;

@Service
public class CountryClubMembership {

    public void calculate(){
        double initialFee = 25000.00;
        double feeIncreaseRate = 0.04; // 4% increase rate
        int years = 6;

        System.out.println("Year\tMembership Fee");

        for (int year = 1; year <= years; year++) {
            // Calculate the membership fee for the current year
            double membershipFee = initialFee * Math.pow(1 + feeIncreaseRate, year);

            String yellowColor = "\u001B[33m";
            String cyanColor = "\u001B[36m";
            String resetColor = "\u001B[0m";

            // Display the year and the calculated membership fee with colors
            System.out.print(yellowColor);
            System.out.printf("%d\t", year);
            System.out.print(cyanColor);
            System.out.printf("%.2f%n", membershipFee);
            System.out.print(resetColor);
        }
    }
}
