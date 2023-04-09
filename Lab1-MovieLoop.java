import java.util.Scanner;

public class MovieLoop {

	public static void UserInput(Scanner Keyboard, Movie nmovie) {

		// Create a new object of type Scanner that reads from the keyboard
		Scanner Keyboard1 = new Scanner(System.in);

		// Create a new movie object
		Movie nMovie = new Movie();

		// Prompt the user to enter the title of a movie
		System.out.print("Enter the title of the movie: ");
		String title = Keyboard1.nextLine();

		// Set the title in the movie object
		nMovie.setTitle(title);

		/*
		 * 1. Prompt the user to enter the movie’s rating 2. Read in the line that the
		 * user types 3. Set the rating in the movie object
		 */
		System.out.print("Enter the rating of the movie: ");
		String rating = Keyboard1.nextLine();
		nMovie.setRating(rating);

		/*
		 * 1. Prompt the user to enter the number of tickets sold at a (unnamed) theater
		 * 2. Read in the integer that the user types 3.Set the number of tickets sold
		 * in the movie object
		 * 
		 */

		System.out.print("Enter the number of tickets sold for this movie: ");
		int tix = Keyboard1.nextInt();
		nMovie.setSoldTickets(tix);

		System.out.println(" \nThis is the printout using to.string method: " + nMovie.toString());

	}

	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);
		Movie nMovie = new Movie();
		String answer;

		do {
			UserInput(Keyboard, nMovie);
			System.out.print("Do you want to enter another movie (Y/N)? ");
			answer = Keyboard.nextLine();
		} while (answer.equalsIgnoreCase("Y"));

		System.out.println("Goodbye.");
	}

}
	
