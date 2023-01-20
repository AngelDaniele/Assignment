package shapecount;

public class Count {

	public static int i;
	public String shape;

	public Count() {

		i++;

	}

	public static void main(String[] args) {

		Count shape1 = new Count();
		shape1.shape = "Rectangle";

		Count shape2 = new Count();
		shape2.shape = "circle";

		Count shape3 = new Count();
		shape3.shape = "Triangle";

		Count shape4 = new Count();
		shape4.shape = "Square";

		Count shape5 = new Count();
		shape5.shape = "Parallelogram";

		System.out.println(" The number of shape objects created are:" + i);

	}

}
