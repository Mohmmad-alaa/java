package abs;

public class Student extends Person {

	public String specialization;

	public Student(String n, String g, String b, boolean i, String s) {
		super(n, g, b, i);
		specialization = s;
	}

	@Override
	public void printInfo() {
		System.out.println("Name " + getName());
		System.out.println("Gender " + getGender());
		System.out.println("Birthday " + getBirthday());
		System.out.println("IsMarried " + isMarried());
		System.out.println("Specialization " + specialization);

	}

}
