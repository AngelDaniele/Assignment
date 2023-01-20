import java.util.Scanner;

public class BasePower {

	public static void main(String[] args) {
		int base;
		int exponent;
		int i;
		int result = 1;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the base number  : ");
		base = obj.nextInt();
		System.out.println("Enter the exponent number  : ");
		exponent = obj.nextInt();
		for (i = 1; i <= exponent; i++)
			result = base * result;

		System.out.println(result);

	}

}
