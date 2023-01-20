package employeepackage;

public class Admin {
	public String admin;

	public void diaplayAdminDetails() {
		Admin admin1 = new Admin();
		admin1.admin = "Angel";
		Admin admin2 = new Admin();
		admin2.admin = "Messiah";
		Admin admin3 = new Admin();
		admin3.admin = "David";

		System.out.println("The Admin details are: " + " " + admin1.admin + " " + admin2.admin + " " + admin3.admin);

	}

}
