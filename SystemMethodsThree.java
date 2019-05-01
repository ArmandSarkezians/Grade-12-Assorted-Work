import java.io.*;
//Armand Sarkezians
//Thursday, February 21st, 2019
//Assignment Number 1
//This program inputs a string from a file and checks to see where the largest palidnrome is located, if there even is one

public class SystemMethodsThree {

	//This method has one parameter, a string called palindrome. Palindrome is the string that was inputted in from the file
	//This method has no return value, it outputs the information onto the screen at the very end
	//This method takes in a string from the main program, checks to see where the largest palindrome is and saves its length and location
	public static void palindrome(String palindrome) {
		int counter = 1;
		int length = 1;
		String longest = "";
		int longestLength = 3, startingPosition = 1;
		int rightSide = 0;
		for (int x = 1; x <= palindrome.length() - 2; x++) { // checks from position 1 till the second last letter of the program
			//			while ((palindrome.charAt(x - counter) == palindrome.charAt(x + counter + rightSide))) { // loops through the palindrome, finds if it is a palindrome or if its not
			//				length += 2;
			//				if (!((x - counter - 1 >= 0) || ((x + counter + 1 + rightSide) <= palindrome.length() - 1))){
			//					break;
			//				}
			//				counter++;
			//			}
			//			
			//			if (length > longestLength) { // If the palindrome found is the longest then save it, if not ignore it
			//				longest = palindrome.substring(x - counter + 1, x + counter + rightSide);
			//				longestLength = length;
			//				startingPosition = x - counter + 1;
			//			}
			//			
			//			counter = 1; // Resetting variables
			//			length = 1;
			//			rightSide = 0; 
			//		}

			if (palindrome.charAt(x) == palindrome.charAt (x + 1)) { // RIGHT SIDE
				rightSide = 1;}

			//Runs through 

			if (!((x - counter >= 0) || (x + counter + rightSide <= palindrome.length() - 1))) {
				while (palindrome.charAt(x - counter) == palindrome.charAt(x + counter + rightSide)) {
					counter++;
					length += 2;
				}
			}
			if (length > longestLength) {
				longest = palindrome.substring(x - counter, x + counter + rightSide + 1);
				longestLength = length;
				startingPosition = x - counter + 1;}

			counter = 1; // Resetting Variables
			length = 1;
			rightSide = 0;
		}














		System.out.println("The longest Palindrome is " + longest + "."); // Outprints information
		System.out.println("The length is " + longestLength + " characters long.");
		System.out.println("The starting position is " + startingPosition + ".");
	}

	public static void main(String[] args){
		long startTime = java.lang.System.currentTimeMillis();
		String s = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader("input.txt")); // Reads in text file
			while (in.ready()) {
				s += in.readLine();
			}
			in.close();
			s = s.toUpperCase();
		} catch (FileNotFoundException e) { // Catches exceptions
			System.out.println("The file was not found. Please create the file and try again.");
		} catch (IOException e) {
			System.out.println("There was an error with the Input and Output of texts. Please try again.");
		}
		palindrome(s);
		System.out.println("This program took " + (java.lang.System.currentTimeMillis() - startTime) + " milliseconds to run."); // Prints out the time that it took to run the program

	}

}
