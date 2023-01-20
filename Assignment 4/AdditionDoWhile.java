import java.util.Scanner;

public class AdditionDoWhile {

	public static void main(String[] args) {
		int number1, number2;
		char ch2;
		int sum;

		do {
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter two numbers to add  : ");
			number1 = obj.nextInt();
			number2 = obj.nextInt();
			sum = number1 + number2;
			System.out.println("the sum of two numbers is  : " + sum);
			System.out.println("do you want to continue with options press y else press n");
			ch2 = obj.next().charAt(0);
		} while (ch2 == 'y' || ch2 == 'Y');

	}

}
