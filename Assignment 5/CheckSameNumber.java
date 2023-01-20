import java.util.Scanner;

public class CheckSameNumber {

	public static void main(String[] args) {
		int number1;
		int number2;
		String result;

		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the number 1");
		number1 = obj.nextInt();
		System.out.println(" Enter the number 2");
		number2 = obj.nextInt();
		result = (number1 == number2) ? " both numbers are same" : " both numbers are not same";
		System.out.println(result);
	}

}
