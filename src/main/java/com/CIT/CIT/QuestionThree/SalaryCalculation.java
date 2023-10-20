package com.CIT.CIT.QuestionThree;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
@Slf4j
public class SalaryCalculation {

    public void calculate(){
        log.info("**********************************************************************");
        log.info("Let calculate your monthy take home ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate allowances and deductions
        double transportationAllowance = (basicSalary * 10) / 100;
        double rentAllowance = (basicSalary * 15) / 100;
        double hazardAllowance = (basicSalary * 6.5) / 100;

        double pensionDeduction = (basicSalary * 7.5) / 100;
        double nhisDeduction = (basicSalary * 5) / 100;
        double taxDeduction = (basicSalary * 2) / 100;

        // Calculate the take-home pay
        double takeHomePay = basicSalary + transportationAllowance + rentAllowance + hazardAllowance
                - pensionDeduction - nhisDeduction - taxDeduction;

        // Display the results
        System.out.println("Allowances:");
        System.out.println("Transportation: " + transportationAllowance);
        System.out.println("Rent: " + rentAllowance);
        System.out.println("Hazard: " + hazardAllowance);

        System.out.println("Deductions:");
        System.out.println("Pension: " + pensionDeduction);
        System.out.println("NHIS: " + nhisDeduction);
        System.out.println("Tax: " + taxDeduction);
        String greenColor = "\u001B[32m";
        String resetColor = "\u001B[0m";

        String coloredOutput = greenColor + "Monthly Take-Home Pay: " + takeHomePay + resetColor;
        System.out.println(coloredOutput);


        // Close the scanner
        //scanner.close();
    }

}
