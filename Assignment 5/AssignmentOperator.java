import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 3;
		float d;
		d = a + b;
		System.out.println(" the initialized variables are");
		System.out.println("a=5 ");
		System.out.println("b=4 ");
		System.out.println("c=3 ");
		System.out.println("d=a+b ");

		c += d;
		System.out.println("c+=d operator ans is " + c);

		c -= d;
		System.out.println("c-=d operator ans is " + c);

		c *= d;
		System.out.println("c*=d operator ans is " + c);

		c /= d;
		System.out.println("c/=d operator ans is " + c);

	}

}
