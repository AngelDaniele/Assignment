import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		int number;
		int reverse;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the  number to be reversed  : ");
		number = obj.nextInt();
		while (number > 0) {
			reverse = number % 10;
			System.out.print(reverse);
			number = number / 10;

		}

	}

}
