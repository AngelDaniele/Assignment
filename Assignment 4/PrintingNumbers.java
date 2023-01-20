import java.util.Scanner;

public class PrintingNumbers {

	public static void main(String[] args) {
		int start;
		int end;
		int i;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the starting number  : ");
		start = obj.nextInt();
		System.out.println("Enter the ending number  : ");
		end = obj.nextInt();
		for (i = start; i <= end; i++) {
			System.out.println(i);
		}

	}

}
