package abs;

public class Employee extends Person {

	public String workPlace;

	public Employee(String n, String g, String b, boolean i, String w) {
		super(n, g, b, i);
		workPlace = w;
	}

	@Override
	public void printInfo() {
		System.out.println("Name " + getName());
		System.out.println("Gender " + getGender());
		System.out.println("Birthday " + getBirthday());
		if (isMarried() == true) {
			System.out.println("is married : Yes ");
		} else {
			System.out.println("is married : No ");
		}
		System.out.println("Work place : " + workPlace);
	}

}
