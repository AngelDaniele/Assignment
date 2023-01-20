import java.util.Scanner;
public class LowerCaseArray {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the count of your name letter: ");
		int size = obj.nextInt();
		
		
		char [] name = new char[size];
		
		
		
		for(int i =0; i< size;i++)
		{
			name[i] = obj.next().charAt(0);
			 
		}
		System.out.println("The lowercase used in the name are:");
		for(int i =0; i< size;i++)
		{
			
			if(name[i]>='a' && name[i]<='z')
			{
				System.out.println(name[i]);
		
				
			}
		}
		
	
		
		

	}

}
