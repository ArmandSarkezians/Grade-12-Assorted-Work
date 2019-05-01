import java.util.*;

public class Hard3 {
	public static String commonLetters(String s1, String s2) {
		String common = " ";
		final String INVALID = "!@#$%^&*()_+-=0987654321`~[]{}|';:,<.>/?";
		boolean isItThere = false;
		boolean inTheAlphabet = true;
		for (int x = 0; x < s1.length(); x++) {
			for (int y = 0; y < s2.length(); y++) {
				if (s1.charAt(x) == s2.charAt(y)) {
					for (int z = 0; z < common.length(); z++) {
						if (s1.charAt(x) == common.charAt(z)) {
							isItThere = true;
						}
					}
					for (int a = 0; a < INVALID.length(); a++) {
						if (s1.charAt(x) == INVALID.charAt(a)) {
							inTheAlphabet = false;
						}
					}
					if (isItThere == false && inTheAlphabet == true) {
						common += s1.charAt(x);
					}
				}
				isItThere = false;
				inTheAlphabet = true;
			}
		}
		return common;
	}

	public static void main(String[] args) {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in String #1");
		s1 = in.nextLine().toLowerCase();
		System.out.println("Enter in String #2");
		s2 = in.nextLine().toLowerCase();
		in.close();
		System.out.println(commonLetters(s1, s2).trim());
	}
}