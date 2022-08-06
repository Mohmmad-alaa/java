package sta;

public class Main {
	public static void main(String[] args) {
		Example p1 = new Example("JAVA", "sun", 250);
		Example p2 = new Example("data", "Java", 500);
		Example p3 = new Example("SQL", "DataBase", 50);
		
		p1.print();
		p2.print();
		p3.print();
		
		Example.printTotalNumberOfBook();
			
	}

}
