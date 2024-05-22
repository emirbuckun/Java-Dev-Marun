package chapter05;

import java.util.Scanner;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = input.nextInt();

    int greatCommonDivisor = 1;
    int k = 2;

    // Find the greatest common divisor
    while (k <= n1 && k <= n2) {
      if (n1 % k == 0 && n2 % k == 0)
        greatCommonDivisor = k;
      k++;
    }

    System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + greatCommonDivisor);
    input.close();
  }
}