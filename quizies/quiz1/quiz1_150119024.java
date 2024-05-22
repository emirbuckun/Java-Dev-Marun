/* 150119024 & Emir & B��k�n

I acknowledge that I will not share my work (not even a part of it) with my friends; 
I will be responsible for what has been submitted. 
In case of any form of copying and cheating on solutions, 
I know that I will get ZERO on all homework and quizzes of the course!

*/

package quizies;

import java.util.Scanner;

public class quiz1_150119024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get the first DNA Strand
		System.out.print("Enter the first DNA strand: ");
		String firstDNA = input.nextLine().toUpperCase();

		// Get the second DNA Strand
		System.out.print("Enter the second DNA strand: ");
		String secondDNA = input.nextLine().toUpperCase();

		// Check the lenghts are same or not
		if (firstDNA.length() != secondDNA.length()) {
			System.out.print("Strings should be of the same length!");
		} else { // Compute the Hamming distance
			int HammingDistance = 0;

			for (int i = 0; i < firstDNA.length(); i++) {
				if (firstDNA.charAt(i) != secondDNA.charAt(i))
					HammingDistance++;
			}

			// Print the result
			System.out.print("The Hamming distance is : " + HammingDistance);
		}

		input.close();
	}
}
