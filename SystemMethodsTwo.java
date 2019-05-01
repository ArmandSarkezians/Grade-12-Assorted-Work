import java.util.*;
//Armand Sarkezians
//Thursday, February 21st, 2019
// Assignment Number 1
// This program checks to see if numbers with n digits (entered in by the user) have the same numbers as their multiplies by 3

public class SystemMethodsTwo { 

	// This method checks to see if two numbers have the same digits inside them
	// This method has one parameter, an integer called n, n is the number of digits that the user (entered in the main method) wants for the number
	// This method has no return value as the System.out.println is inside the method
	public static void checkForSameDigits(int n) {
		String s, sMultiplied;
		int numberIsInside = 0;
		int counter = 0;
		int totalMultiplied = 0;
		for (int x = (int) Math.pow(10, n - 1); x <= ((int) Math.pow(10, n) - 1) / 3; x++) { // For a digit 3, checks from 100 to 333 (as 333 * 3 is 999, the largest 3 digit number
			s = Integer.toString(x);
			sMultiplied = Integer.toString(x * 3);

			do {
				for (int y = 0; y <= sMultiplied.length() - 1; y++) { // Checks the multiplied number if it has the same numbers as the number before
					if (s.charAt(counter) == sMultiplied.charAt(y)) {
						numberIsInside++;
						if (y == n - 1) {
							sMultiplied = sMultiplied.substring(0, y);
							break; //found the first digit in the multiplied number so the program removes that number and ends the for loop
						} else {
							sMultiplied = sMultiplied.substring(0, y) + sMultiplied.substring(y + 1);
							break;
						}
					}
				}
				counter++;
			} while (numberIsInside == counter && counter <= n - 1); // if the first digit is not in the multiplied number, the program leaves immediately, for efficiency
			if (numberIsInside == counter) {
				totalMultiplied++;
				System.out.println(s);
			}
			counter = 0;
			numberIsInside = 0;
		}
		System.out.println("There are a total of " + totalMultiplied + " numbers listed.");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		boolean again = false;
		do {
			System.out.println("Please enter in a number between 1 and 7"); // finds digit and ensures its a number
			try {
				n = Integer.parseInt(in.nextLine());
				if (n > 8) {
					System.out.println("Too large a number. Ensure that the number you are entering is lower than 7.");
					again = true;
				} else if (n < 1) {
					System.out.println("Too small a number. Ensure that the number you are entering is above or equal to 1.");
					again = true;
				}
			} catch (NumberFormatException e) { // Catches exceptions
				System.out.println("Please enter in a valid integer.");
				again = true;
			}
		} while ((n < 1 || n > 8) && again == true);
		long startTime = java.lang.System.currentTimeMillis();
		checkForSameDigits(n);
		in.close();
		System.out.println("This program took " + (java.lang.System.currentTimeMillis() - startTime) + " milliseconds to run."); // Prints out the time it took to find the digits
	}

}
