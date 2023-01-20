package countsalrayrepeater;

import java.util.Scanner;

public class ArrayMaximum {
	static int even = 0;
	static int odd = 0;
	 

	public static void maximumSum(int number[], int size) {

		for (int i = 0; i < size; i++) {
			if (number[i] % 2 == 0) {
				even += number[i];
			}
			if (number[i] % 2 != 0) {
				odd += number[i];
			}
		}

		System.out.println(Math.max(even, odd));

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[20];
		int size;
		System.out.println("enter the size of the array");
		size = scanner.nextInt();
		if (size >= 0) {

			System.out.println("enter the numbers");
			for (int i = 0; i < size; i++) {

				number[i] = scanner.nextInt();

			}
			maximumSum(number, size);

		}

		else {

			System.out.println("Invalid array size");

		}

	}
}
