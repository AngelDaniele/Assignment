import java.util.Scanner;

public class Weathermessage {

	public static void main(String[] args) {
int temp;
		
        
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the temperature in celsius: ");
		temp=obj.nextInt();
		if(temp<0)
		{
			System.out.println("Freezing temperature");
			
		}else if((temp>=0)&&(temp<=10))
		{
			System.out.println("Very cold weather ");
		}
		else if((temp>=10)&&(temp<=20))
		{
			System.out.println(" cold weather ");
		}
		else if((temp>=20)&&(temp<=30))
		{
			System.out.println(" Normal temperature ");
		}
		else if((temp>=30)&&(temp<=40))
		{
			System.out.println(" Its hot ");
		}
		else
		{
			System.out.println(" Its very hot ");
		}
		
	}

}
