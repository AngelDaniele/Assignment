import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {

		boolean a;
		boolean bool1;
		boolean bool2;

		Scanner obj = new Scanner(System.in);
		System.out.println("enter the boolean 1:");
		bool1 = obj.nextBoolean();
		System.out.println("enter the boolean 2:");
		bool2 = obj.nextBoolean();

		System.out.println("bool1 &&  bool2 = " + (bool1 && bool2));
		System.out.println("bool1 ||  bool2 = " + (bool1 || bool2));

		System.out.println("enter the number to perform not operator");
		a = obj.nextBoolean();

		System.out.println((" the not operator ") + (!(a)));

	}

}
