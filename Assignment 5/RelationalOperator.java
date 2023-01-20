import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		int a;
		int b;
		int result;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number 1");
		a = obj.nextInt();
		System.out.println("Enter the number 2");
		b = obj.nextInt();

		System.out.println(("is number 1 greater than number 2:  ") + (a > b));
		System.out.println(("is number 1 lesser than number 2:  ") + (a < b));
		System.out.println(("is number 1 greater than or equal to number 2: ") + (a >= b));
		System.out.println(("is number 1 lesser  than or equal to number 2: ") + (a > b));
		System.out.println(("is number 1 not equal to number 2: ") + (a != b));
		System.out.println(("is number 1  equal to:  ") + (a == b));

	}

}
