import java.util.Scanner;

public class Sum_of_natural_numbers {

	public static void main(String[] args) {
		int start;
		int end;
		int i;
		int result = 0;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the starting number  : ");
		start = obj.nextInt();
		System.out.println("Enter the ending number  : ");
		end = obj.nextInt();
		if ((start < 0) || (end < 0)) {
			System.out.println("Enter only postive numbers");
		} else {
			for (i = start; i <= end; i++) {
				result = result + i;

			}
			System.out.println("The sum of " + start + " and " +  end + " natural number" + " is "  + result);
		}

	}

}
