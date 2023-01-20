import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int number;
		String result;
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the number");
		number = obj.nextInt();

		result = (number % 2 == 0) ? "  It is a even number" : "   It is a odd number";
		System.out.println(result);

	}

}
