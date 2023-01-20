package countsalrayrepeater;

import java.util.Scanner;

public class CountRepeaters {

	public static int count = 1;

	public static void arrayDetails(int array[], int size) {

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[j] == array[i]) {
					count++;

				}

			}

		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] array = new int[20];
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		size = scanner.nextInt();

		if (size >= 0) {

			System.out.println("enter the array");
			for (int i = 0; i < size; i++) {

				array[i] = scanner.nextInt();
				if (array[i] < 0) {
					System.out.println("Invalid Input");
					System.exit(0);
				}

			}
			arrayDetails(array, size);

		} else {
			System.out.println("Invalid Input");

		}

	}

}