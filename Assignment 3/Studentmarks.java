import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) {
		String sname;
		int rollno;
		int phy,chem,ca;
		int total;
		int per;
		
        
		Scanner obj=new Scanner(System.in);
		System.out.println("Input the rollnumber of the student: ");
		rollno=obj.nextInt();
		System.out.println("Name of the student:");
		sname= obj.next();
		System.out.println("Marks in physics: ");
		phy=obj.nextInt();
		System.out.println("Marks in Chemistry: ");
		chem=obj.nextInt();
		System.out.println("Marks in computer application ");
		ca=obj.nextInt();
		total=phy+chem+ca;
		System.out.println("Total Mark="+total);	
		per=total * 100/300;
		System.out.println("percentage="+per);
		if(per>=80) {
			System.out.println("Division = First");	
		}
		
				
	}

}
