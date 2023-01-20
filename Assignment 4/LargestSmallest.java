import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		int count;
		int integer;
		int max = 0;
		int min = 0;

		int i;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the total no of integers u want to check  : ");
		count = obj.nextInt();
		System.out.println("Enter the integer  : ");

		for (i = 1; i <= count; i++) {
			integer = obj.nextInt();
			if (integer > max) {
				max = integer;

			}
			if (integer < min) {
				min = integer;

			}
		}

		System.out.println("The largest number is   : " + max);
		System.out.println("The smallest number is   : " + min);
	}

}
