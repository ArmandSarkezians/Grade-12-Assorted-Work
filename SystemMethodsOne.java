import java.util.*;
//Armand Sarkezians
//Thursday, February 21st, 2019
//Assignment Number 1
// This program calculates the displays the total price for a certain amount of a product, then combines the total cost after all products have been entered

public class SystemMethodsOne {

	// This method receives input from the user and calculates a price for the number of product that the user has entered
	// This method has no parameters, as the input from the user is read in inside the method
	// This method does not return anything, as the System.out.println (total price and other information) is inside the method
	public static void inventoryManagementProgram() {
		Scanner in = new Scanner(System.in);
		String product = "";
		double price = 0;
		boolean continueOrNot = true;
		String moreItems = "";
		double totalPrice = 0;
		double highestPrice = 0;
		String highestItem = "";
		int howMany = 0;
		System.out.println("Inventory Management Program\n");
		do {
			do { // Ensures that the product name has at least 1 letter in it
				System.out.print("Please enter the name of the next product: "); // Gets the name
				product = in.nextLine();
				product = product.trim();
				if (product.equals(""))
					System.out.println("Please enter in something as the name of the product");
			}while (product.equals(""));

			do {
				try { // Tries to get product price and catches any errors
					System.out.print("Please enter in the unit price for " + product + ": $");
					price = Double.parseDouble(in.nextLine());
					if (price <= 0) {
						System.out.println("Please enter in a number greater than 0");
					} else {
						continueOrNot = false;
					}
				} catch (NumberFormatException e) {
					System.out.println("Please enter in a valid number");
				}
			} while (price <= 0 || continueOrNot);


			continueOrNot = true; // checks to see if the program should 
			do { // gets the number of products they have
				try {
					System.out.print("How many " + product + " do you have on hand?:");
					howMany = Integer.parseInt(in.nextLine());
					if (howMany <= 0) {
						System.out.println("Please enter in a number greater than 0");
					} else {
						continueOrNot = false;
					}
				} catch (NumberFormatException e) {
					System.out.println("Please enter in a valid integer");
				}

			} while (howMany <= 0 || continueOrNot);
			
			if ((price * howMany) > highestPrice) { // Sets the highest price and the product name for that price
				highestPrice = price * howMany;
				highestItem = product;
			}
			
			System.out.printf ("You have %d %s at a price of $%.2f for a total value of: $%.2f%n", howMany, product, price, (howMany * price)); // Printing out all information
			
			do {
				System.out.print("Do you have any more products? (y/n): "); // Asks if there are more products and if yes repeats the program
				moreItems = in.nextLine();
				if (!(moreItems.equalsIgnoreCase("y") || moreItems.equalsIgnoreCase("n")))
					System.out.println("Invalid string, please try again.");
			} while (!(moreItems.equalsIgnoreCase("y") || moreItems.equalsIgnoreCase("n")));

			totalPrice += price * howMany;
			System.out.println();
		} while (moreItems.equalsIgnoreCase("y"));

		System.out.printf("The total value of all inventory is $%.2f%n", totalPrice);
		System.out.printf("The item with the highest value is: $%.2f for %s.%n", highestPrice, highestItem);
		System.out.println("Thank you for using the Inventory Management Program");
		in.close();
	}

	public static void main(String[] args) {
		inventoryManagementProgram();
	}
}
