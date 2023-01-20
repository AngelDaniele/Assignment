import java.util.Scanner;

public class ArraySumEvenOdd {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int even = 0;
		int odd = 0;

		int[] a = new int[10];

		System.out.println("Enter the 10 integer in an array:");
		for (int i = 0; i < a.length; i++) {

			a[i] = obj.nextInt();

		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even += a[i];
			}
			if (a[i] % 2 != 0) {
				odd += a[i];
			}

		}
		System.out.println("The sum of even integer in array is: " + even);
		System.out.println("The sum of odd integer in an array is: " + odd);

	}

}
