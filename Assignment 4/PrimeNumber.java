import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int number;
		int i;
		int count = 0;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the  number  : ");
		number = obj.nextInt();

		if (number < 0) {
			System.out.println("Enter only postive numbers");
		} else {
			for (i = 1; i <= number; i++) {

				if (number % i == 0) {
					count = count + 1;
				}

			}
			if (count == 2) {
				System.out.println(number + " It is a prime number");
			} else {
				System.out.println(number + " It is not a prime number");
			}

		}

	}
}
