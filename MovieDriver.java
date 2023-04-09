import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
//Create a new object of type Scanner that reads from the keyboard
		Scanner Keyboard = new Scanner(System.in);

//Create a new movie object
		Movie nMovie = new Movie();

		// Prompt the user to enter the title of a movie
		System.out.print("Enter the title of the movie: ");
		String title = Keyboard.nextLine();

//Set the title in the movie object
		nMovie.setTitle(title);

		/*
		 * 1. Prompt the user to enter the movie’s rating 2. Read in the line that the
		 * user types 3. Set the rating in the movie object
		 */
		System.out.print("Enter the rating of the movie: ");
		String rating = Keyboard.nextLine();
		nMovie.setRating(rating);

		/*
		 * 1. Prompt the user to enter the number of tickets sold at a (unnamed) theater
		 * 2. Read in the integer that the user types 3.Set the number of tickets sold
		 * in the movie object
		 * 
		 */

		System.out.print("Enter the number of tickets sold for this movie: ");
		int tix = Keyboard.nextInt();
		nMovie.setSoldTickets(tix);

		System.out.println(" \nThis is the printout using to.string method: " + nMovie.toString());
		System.out.println("Goodbye");

	}

}
