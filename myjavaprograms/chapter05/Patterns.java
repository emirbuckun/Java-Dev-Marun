package chapter05;

public class Patterns {
	public static void main(String[] args) {
		System.out.println("Pattern A");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
		System.out.println();

		System.out.println("Pattern B");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 7 - i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
		System.out.println();

		System.out.println("Pattern C");
		for (int i = 1; i <= 6; i++) {
			for (int k = 1; k <= 6 - i; k++)
				System.out.print("  ");
			for (int j = i; j >= 1; j--)
				System.out.print(j + " ");
			System.out.println();
		}
		System.out.println();

		System.out.println("Pattern D");
		for (int i = 1; i <= 6; i++) {
			for (int k = 1; k <= i - 1; k++)
				System.out.print("  ");
			for (int j = 1; j <= 7 - i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}