import java.util.Scanner;

public class BMICalc {
	public static void main(String[] args) {
		/*
		 * Purpose of program is to make a BMI calculator that displays BMI
		 * Needs to be in metric and empirical 
		 * Also displays table from website for comparison
		 */
		Scanner scnr = new Scanner(System.in);
		double BMI;
		int weightInPounds;
		int heightInInches;
		double weightInKilograms;
		double heightInMeters;	
		int choice;
		
		System.out.print("Enter 1 if you want to use metric or 2 if you want to use empirical to calculate BMI:");
		choice = scnr.nextInt();
		if(choice == 1) {
			System.out.print("Please enter your weight in kilograms here:");
			weightInKilograms = scnr.nextInt();
			System.out.print("Please enter your height in meters here:");
			heightInMeters = scnr.nextDouble();
			BMI = weightInKilograms / (heightInMeters * heightInMeters);
			System.out.printf("Your BMI is:%.1f\n", BMI);
		}
		if(choice == 2){
			System.out.print("Please enter your weight in pounds here:");
			weightInPounds = scnr.nextInt();
			System.out.print("Please enter your height in inches here:");
			heightInInches = scnr.nextInt();
			BMI = (703 * weightInPounds) / (1.0 * heightInInches * heightInInches);
			System.out.printf("Your BMI is:%.1f\n", BMI);
		}
		System.out.print("Below is a table to describe your BMI:\n");
		System.out.println("Category \t      BMI");
		System.out.println("Underweight\t  Below 18.5");
		System.out.println("Normal\t\t   18.5-24.9");
		System.out.println("Overwieght\t   25.0-29.9");
		System.out.println("Obesity\t\t 30.0 and Above");
		scnr.close();
	}
}
