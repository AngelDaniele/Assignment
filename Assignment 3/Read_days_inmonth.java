import java.util.Scanner;

public class Read_days_inmonth {

	public static void main(String[] args) {
    int monthno;
    int year;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Month number: ");
		monthno=obj.nextInt();
		if((monthno==1)||(monthno==3)||(monthno==5)||(monthno==7)||(monthno==9)||(monthno==11))
		{
			System.out.println("It has 31 days ");
			
		}else if((monthno==4)||(monthno==6)||(monthno==8)||(monthno==10)||(monthno==12))
		{
			System.out.println("It has 30 days ");
		}
		else if(monthno==2)
		{
			System.out.println("Enter the Year: ");
			year=obj.nextInt();
			if((year % 400 == 0) || (year %4==0)&& (year %100 !=0))
			{
			    System.out.println("This month has 29 days");
				}
				else
				{
					 System.out.println("This month has 28 days");	
				}
					}
			
	
	}

}
