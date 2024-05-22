package week2Lab;

import java.util.Scanner;

public class Exercise12_03 {
  public static void main(String[] args) {
    int[] data = new int[100];

    // Initialize array
    for (int i = 0; i < data.length; i++)
      data[i] = (int) (Math.random() * 10000);

    // Get input from the user
    System.out.print("Enter an index number: ");
    Scanner input = new Scanner(System.in);

    // Try to show the element in the entered index, catch if any
    // ArrayIndexOutOfBoundsException exists.
    try {
      int index = input.nextInt();
      System.out.println("Element in the given index is : " + data[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("The index you have entered is invalid!");
      System.out.println("Please enter an index number between 0 and 99.");
    }

    input.close();
  }
}
