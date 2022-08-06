package abs;

public class Main {
	
	public static void main(String[] args) {
		Student student = new Student("Mohammad", "Male", "1997/9/12" ,true, "Cis");
		student.printInfo();
		System.out.println("--------------------");
		Employee employee = new Employee("doaa", "female", "1998", false, "qaffin");
		employee.printInfo();
	}

}
