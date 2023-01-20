import java.util.Scanner;

public class CountPositiveNegativeZero {

	public static void main(String[] args) {
		int count;
		int poscount = 0;
		int negcount = 0;
		int zerocount = 0;
		int integer;

		int i;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the total no of integers u want to check  : ");
		count = obj.nextInt();
		System.out.println("Enter the integer  : ");

		for (i = 1; i <= count; i++) {
			integer = obj.nextInt();
			if (integer > 0) {
				poscount = poscount + 1;
			} else if (integer < 0) {
				negcount = negcount + 1;
			} else {
				zerocount++;
			}

		}

		System.out.println("The count of positive inger is   : " + poscount);
		System.out.println("The count of negative inger is   : " + negcount);
		System.out.println("The count of zero inger is   : " + zerocount);

	}

}
