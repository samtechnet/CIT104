package com.CIT.CIT;

import com.CIT.CIT.QuestionFive.CountryClubMembership;
import com.CIT.CIT.QuestionFive.QuestionSix.NumberPairsAndSquares;
import com.CIT.CIT.QuestionOne.FahrenheitToCelsius;
import com.CIT.CIT.QuestionThree.SalaryCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitApplication implements CommandLineRunner {
	@Autowired
	FahrenheitToCelsius fahrenheitToCelsius;
	@Autowired
	SalaryCalculation salaryCalculation;
	@Autowired
	CountryClubMembership countryClubMembership;
	@Autowired
	NumberPairsAndSquares numberPairsAndSquares;
	public static void main(String[] args) {
		SpringApplication.run(CitApplication.class, args);

	}
	public void runCalculation(){
		fahrenheitToCelsius.convert();
		salaryCalculation.calculate();
		countryClubMembership.calculate();
		numberPairsAndSquares.calculate();
	}

	@Override
	public void run(String... args) throws Exception {
		this.runCalculation();
	}
}
