package constructor;
import java.util.*;
public class Movie {

	private static  String movie;
	private static  int amountTicket;
	
	Movie(String movie,int relaseDate)
	{
		Movie.movie=movie;
		Movie.amountTicket=relaseDate;
	}
	public void displayMovie()
	{
		System.out.println("Movie Name: "+movie+" Release date:"+amountTicket);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter movie name");
		int size=scan.nextInt();
		Movie [] moviearr=new Movie[size]; 
		for(int i=0;i<size;i++)
		{
			moviearr[i]=new Movie(movie,amountTicket);
			System.out.println("Enetr movie name");
			movie=scan.next();
			System.out.println("Enetr release date");
			amountTicket=scan.nextInt();
		}
		
		for(Movie mv:moviearr)
		{
			mv.displayMovie();
		}
	}

}
