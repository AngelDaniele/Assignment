package employeepackage;

public class Employee {
	public String empname;
	public int empid;
	public int empsalary;

	public void employeeDetails() {
		Employee empname1 = new Employee();
		empname1.empname = "Stephan";
		Employee empname2 = new Employee();
		empname2.empname = "katherine";

		Employee empid1 = new Employee();
		empid1.empid = 1;
		Employee empid2 = new Employee();
		empid2.empid = 2;

		Employee empsalary1 = new Employee();
		empsalary1.empsalary = 4000;
		Employee empsalary2 = new Employee();
		empsalary2.empsalary = 5000;

		System.out.println("The Employee details are:");
		System.out.println("employee name: " + empname1.empname + " empid: " + empid1.empid + " empsalary: "
				+ empsalary1.empsalary);
		System.out.println("employee name: " + empname2.empname + " empid: " + empid2.empid + " empsalary: "
				+ empsalary2.empsalary);

	}

}
