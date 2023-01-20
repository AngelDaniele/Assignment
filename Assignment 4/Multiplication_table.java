import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		int number;
		int end;
		int i;
		int result;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the  multiplication no  : ");
		number = obj.nextInt();
		System.out.println("Enter the ending number  : ");
		end = obj.nextInt();
		System.out.println("The multiplication table of  " + number);
		if ((number < 0) || (end < 0)) {
			System.out.println("Enter only postive numbers");

		}

		else {
			for (i = 1; i <= end; i++) {
				result = number * i;

				System.out.println(result);

			}

		}

	}

}
