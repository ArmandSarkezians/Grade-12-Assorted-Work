import java.util.*;
public class StringToken1 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		String s = "";
		System.out.println("Enter in a sentence");
		s = in.nextLine();

		StringTokenizer st = new StringTokenizer (s, " ,./';[]<>?:0987654321)(*&^%$#@!`~=+-_");
		int length = 0;
		String longestWord = "";
		int count = 0;
		String [] sArray = new String [st.countTokens()];

		while (st.hasMoreTokens()) { // Setting list to an array
			sArray [count] = st.nextToken();
			count++;
		}

		for (int x = 0; x < sArray.length; x++) { // looping through array
			if (sArray [x].length() > length) {
				longestWord = sArray[x];
				length = sArray[x].length();
			}
		}
		
		System.out.println("The longest word is " + longestWord + " with a length of " + length);

	}
}
