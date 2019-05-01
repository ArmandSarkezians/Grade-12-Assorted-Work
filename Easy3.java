import java.util.Scanner;

public class Easy3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String check = "aeiou";
		String word = "";
		int vowels;
		System.out.println("Enter in a word");
		word = in.nextLine().trim();
		while (!(word.equalsIgnoreCase("stop"))) {
			vowels = 0;
			for (int x = 0; x < word.length(); x++) {
				for (int y = 0; y < check.length(); y++) {
					if (word.substring(x, x + 1).equals(check.substring(y, y + 1)))
						vowels++;
				}
			}
			System.out.println("There are " + vowels + " vowels and " + (word.length() - vowels) + " consonants");
			System.out.println("Enter in a word");
			word = in.nextLine().trim();
		}
	}
}