import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the array of a:");
			a[i] = obj.nextInt();

		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter the  array of b:");
			b[i] = obj.nextInt();

		}

		for (int i = 0; i < 5; i++) {
			c[i] = a[i] + b[i];

		}
		System.out.println("The addition of array a and array b is: ");
		for (int i = 0; i < 5; i++) {

			System.out.println(c[i]);
		}
		

	}

}
