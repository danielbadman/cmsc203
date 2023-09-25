import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Movie movie = new Movie();
		String strInput;
		int intInput;
		boolean repeat;
		do {
		System.out.println("Enter Title of a Movie: ");
		strInput = scStr.nextLine();
		movie.setTitle(strInput);
		System.out.println("Enter Rating of a Movie: ");
		strInput = scStr.nextLine();
		movie.setRating(strInput);
		System.out.println("Enter Tickets Sold at theater: ");
		intInput = scInt.nextInt();
		movie.setSoldTickets(intInput);
		System.out.println(movie.toString());
		System.out.println("Do you want to enter another? (y or n)");
		strInput = scStr.nextLine();
		if (strInput.equalsIgnoreCase("y")) {
			repeat = true;
		} else {
			repeat = false;
		}
		} while (repeat);
		System.out.println("Goodbye");
	}

}
