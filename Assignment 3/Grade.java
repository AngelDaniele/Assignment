import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		char get;
		System.out.println("Test Data :");
		Scanner obj=new Scanner(System.in);
		System.out.println("Input the grade:");
		get=obj.next().charAt(0);
		
		switch(get)
		{
		case 'V':
		System.out.println("You have chosen: Very Good");
		break;
		
		case 'G':
			System.out.println("You have chosen: Good");
			break;
		case 'E':
			System.out.println("You have chosen: Excellant");
			break;
		
		case 'A':
			System.out.println("You have chosen: Average");
			break;
		default: System.out.println("Fail");
		break;
		
	
	}}

}
