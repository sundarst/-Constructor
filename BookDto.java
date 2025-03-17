package constructor;
import java.util.*;
public class BookDto {
	private static String nameOfBook;
	 //static String authorName;
	private static  String amountBook;
	 
	 BookDto ()
	 {
	  //addBook()	;
		
	 }
	
	 public void addBook()
	 {

		Scanner scan = new Scanner(System.in);
		 System.out.println("Ente the book");
		 nameOfBook=scan.next();
		 System.out.println("Ente Amount");
		 amountBook=scan.next();
		 //BookDto.authorName=scan.next();
		
		 
		 
	 }
	 public void displayAll()
	 {
		 System.out.println(nameOfBook+" "+amountBook);

	 }
	 
	
	 
//	 public void bookRelease()
//	 {
//		 System.out.println("Welcome every one to my book show");
//	 }
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the list of book");
		 int size=scan.nextInt();
		BookDto [] bookarr=new BookDto[size];
		 for(int i=0;i<size;i++)
		 {
			 
			 bookarr[i] = new BookDto();
		 }	
		 
		 System.out.println("List of book:");
		 for(BookDto book:bookarr )
		 {
			 book.displayAll(); 
		 }
		 
		
	}

}


/*BookDto book=new  BookDto("Default book");
		 
 * 
 * 
 * 
 * */
