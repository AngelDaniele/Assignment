import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		System.out.println(" the program to check the age is greater than 18");
		int age;
		String result;
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the  age");
		age = obj.nextInt();
		result = (age > 18) ? " the age is greater than 18" : "the age is not greater than 18";
		System.out.println(result);
	}

}
