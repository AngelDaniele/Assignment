import java.util.Scanner;

public class Sum_odd_evev {

	public static void main(String[] args) {
		int number_integer;
		int number;
		int even = 0;
		int odd = 0;
		int i;
		Scanner obj = new Scanner(System.in);
		System.out.println("How many numbers u wanted to check  : ");
		number_integer = obj.nextInt();
		for (i = 1; i <= number_integer; i++) {

			System.out.println("Enter the  integer : ");
			number = obj.nextInt();
			if (number % 2 == 0) {
				even = number + even;

			} else {
				odd = number + odd;

			}

		}
		System.out.println("the sum of even integer is : " + even);
		System.out.println("the sum of odd integer is : " + odd);

	}

}
