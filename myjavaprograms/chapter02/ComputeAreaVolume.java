package chapter02;

import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAreaVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner object
		final double p = 3.14159; // Create a cons variable for pi

		// Prompt the user to enter a radius and lenght
		System.out.print("Enter the radius and lenght of a cylender: ");
		double radius = input.nextDouble();
		double lenght = input.nextDouble();

		// Compute area and volume
		double area = radius * radius * p;
		double volume = area * lenght;

		// Display results
		System.out.println("The area is " + area);
		System.out.println("The volume is" + volume);
		input.close();
	}
}