import java.util.Scanner;
public class Alph_char_num {

	public static void main(String[] args) {
		char get;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter: ");
		get=obj.next().charAt(0);
		if((get>='A' && get<='Z')|| (get>='a' && get<='z')) {
			System.out.println(" The given is alphabets ");
		}
		else if(get>='0')
		{
			System.out.println("The given is number");
		}else
			System.out.println("The given is special characters");
	
		
		

	}

}
