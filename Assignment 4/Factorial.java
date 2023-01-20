import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number;
		int i;
		int result = 1;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to find factorial  : ");
		number = obj.nextInt();
		while (number > 0) {
			result = number * result;
			number--;
		}
		System.out.println(result);
	}

}
