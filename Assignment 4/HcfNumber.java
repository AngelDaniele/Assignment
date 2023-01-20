import java.util.Scanner;

public class HcfNumber {

	public static void main(String[] args) {
		int number1, number2, max;
		int i;
		int hcf = 1;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the two  number to find hcf  : ");
		number1 = obj.nextInt();
		number2 = obj.nextInt();
		max = (number1 > number2) ? number1 : number2;
		for (i = 1; i <= max; i++) {
			if ((number1 % i == 0) && (number2 % i == 0)) {
				hcf = i;
			}

		}
		System.out.println("hcf of the two  number is: " + hcf);

	}

}
