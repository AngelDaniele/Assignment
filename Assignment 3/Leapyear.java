import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the year name:");
		year=obj.nextInt();
		if((year % 400 == 0) || (year %4==0)&& (year %100 !=0))
		{
	    System.out.println("The given Year is  leap year"+year);
		}
		else
		{
			 System.out.println("The given Year is not  leap year"+year);	
		}
				
			
				
		
		

	}

}
