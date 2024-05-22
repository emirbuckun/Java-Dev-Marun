/*
Some of the methods for this exercise:
String Methods:
- public int length(): Returns the length of this String
� public char charAt(int index): Returns the character at position index in this String.

Character methods:
- public static boolean isDigit(char ch): Determines if character ch is a digit.
� public static boolean isLetter(char ch): Determines if character ch is a letter

*/
package chapter06;

public class ValidPassword {
	public static void main(String[] args) {
		// Prompt the user to enter a password
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a string for password: ");
		String s = input.nextLine();

		if (isValidPassword(s)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
		input.close();
	}

	/** Check if a string is a valid password */
	public static boolean isValidPassword(String s) {
		// Only letters and digits?
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)))
				return false;
		}

		// Check length
		if (s.length() < 8)
			return false;

		// Count the number of digits
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				count++;
		}

		// Check the number of digits
		if (count >= 2)
			return true;
		else
			return false;
	}
}