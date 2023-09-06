/*
* Class: CMSC203
* Instructor: David Kuijt
* Description: ESP game where you guess the color the computer is thinking of
* Due: 09/10/2023
* Platform/compiler: Eclipse
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or
* any source. I have not given my code to any student.
* Print your Name here: Daniel Badman
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String name, description, dueDate, correctColor = null, guessedColor;
		int colorNum, totalCorrect = 0;
		
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Describe yourself: ");
		description = sc.nextLine();
		System.out.print("Due date: ");
		dueDate = sc.nextLine();
		System.out.println("CSMC203 Assignment1: Test your ESP skills!");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Round " + (i + 1) + "\n");
			
			colorNum = random.nextInt(5);
			switch (colorNum) {
			case 0 -> correctColor = "Red";
			case 1 -> correctColor = "Green";
			case 2 -> correctColor = "Blue";
			case 3 -> correctColor = "Orange";
			case 4 -> correctColor = "Yellow";
			}
			
			System.out.println("I am thinking of a color.\n"
					+ "Is it Red, Green, Blue, Orange, or Yellow?\n"
					+ "Enter your guess:");
			guessedColor = sc.nextLine();
			
			while (!guessedColor.equalsIgnoreCase("Red") && !guessedColor.equalsIgnoreCase("Green") && 
					!guessedColor.equalsIgnoreCase("Blue") && !guessedColor.equalsIgnoreCase("Orange") && !guessedColor.equalsIgnoreCase("Yellow")) 
			{
				System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?\n"
						+ "Enter your guess again:");
				guessedColor = sc.nextLine();
			}
			
			if (guessedColor.equalsIgnoreCase(correctColor)) {
				totalCorrect++;
			}
			System.out.println("\nI was thinking of " + correctColor + ".");
			
		}
		System.out.println("Game Over\n\n"
				+ "You guessed " + totalCorrect + " out of 10 colors correctly.\n"
						+ "User Name: " + name 
						+ "\nUser Description: " + description
						+ "\nDue Date: " + dueDate);
		
	}
}
