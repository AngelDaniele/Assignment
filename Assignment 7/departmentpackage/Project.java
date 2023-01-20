package departmentpackage;

import employeepackage.Admin;
import employeepackage.Employee;
import employeepackage.Manager;

public class Project {

	public static void main(String[] args) {

		Admin admin = new Admin();
		admin.diaplayAdminDetails();

		Employee employee = new Employee();
		employee.employeeDetails();

		Manager manager = new Manager();
		manager.managerDetails();

		Department department = new Department();
		department.departmentDetails();

	}

}