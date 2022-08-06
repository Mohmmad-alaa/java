package sta;


public class Example {

	public String bookName;
	public String bookAuthor;
	public int pageNumber;
	
	public final int id;

	private static int bookCounter;

	public Example(String bookName, String bookAuthor, int pageNumber) {

		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.pageNumber = pageNumber;
		bookCounter++;
		id = bookCounter;
	}

	public void print() {
		System.out.println("ID " + id);
		System.out.println("Book " + bookName);
		System.out.println("Author " + bookAuthor);
		System.out.println("Number of pages " + pageNumber);
		System.out.println("--------------------");
	}

	public static void printTotalNumberOfBook() {
		System.out.println("The totual number of books is: " + bookCounter);
	}

}
