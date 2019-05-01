import java.util.Scanner;

public class Easy2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double number;
		double average = 0;
		double lowest = Integer.MAX_VALUE;
		for (int x = 0; x <= 4; x++) {
			System.out.println("Enter in number #" + (x + 1));
			number = in.nextDouble();
			average += number;
			if (number <= lowest)
				lowest = number;
		}
		System.out.println("The average is: " + (average / 5));
		System.out.println("The lowest number is: " + lowest);
	}
}
