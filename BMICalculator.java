package day4;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your weight in lbs:");
		
		double weightInPounds = scanner.nextDouble();
		
		System.out.println("Please enter your height in meters:");
		
		double height = scanner.nextDouble();
		
		// Formula to convert lbs to kgs is to multiply the lbs value by 0.45359237 kg.
		
		double weightInKg = weightInPounds*0.453592;
		
		// The BMI formula is BMI = weight (kg) / height (m)^2.
		
		double bmi = weightInKg / (height*height) ; 
		
		System.out.println("Your BMI is: " + bmi);
		
		if (bmi < 18.5) 
		{
			System.out.println("You are underweight.");
		}
		else if (bmi>=18.5 && bmi <24.9) 
		{
			System.out.println("You are healthy weight.");
		}
		else if (bmi>=25 && bmi <29.9) 
		{
			System.out.println("You are overweight.");
		}
		else
		{
			System.out.println("You are obese.");
		}
	}
}
