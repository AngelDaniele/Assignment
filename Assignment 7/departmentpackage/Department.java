package departmentpackage;

class Department {
	String depname;
	int depmembers;

	void departmentDetails() {
		Department depname1 = new Department();
		depname1.depname = " manufacturing department ";
		Department depname2 = new Department();
		depname2.depname = " sales department ";

		Department depmembers1 = new Department();
		depmembers1.depmembers = 55;
		Department depmembers2 = new Department();
		depmembers2.depmembers = 23;

		System.out.println(" The Department details are");
		System.out.println(
				"Department name: " + depname1.depname + " Members in the department are: " + depmembers1.depmembers);
		System.out.println(
				"Department name: " + depname2.depname + " Members in the department are: " + depmembers2.depmembers);

	}

}
