public class Hard2 {
	public static String encryptMessage(String s, int rotate) {
		final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();
		String newS = "";
		for (int x = 0; x <= s.length() - 1; x++) {
			for (int y = 0; y <= ALPHABET.length() - 1; y++) {
				if (s.charAt(x) == ALPHABET.charAt(y)) {
					newS += ALPHABET.charAt(y + rotate);
				}
			}
		}
		return newS;
	}

	public static String decryptMessage(String s, int rotate) {
		final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();
		String newS = "";
		for (int x = 0; x <= s.length() - 1; x++) {
			for (int y = 0; y <= ALPHABET.length() - 1; y++) {
				if (s.charAt(x) == ALPHABET.charAt(y)) {
					if (rotate > y) {
						y += 26;
						newS += ALPHABET.charAt(y - rotate);
					} else {
						newS += ALPHABET.charAt(y - rotate);
					}
				}
			}
		}
		return newS;
	}

	public static void main(String[] args) {
		String s = "abcde";
		int rotate = 2;
		System.out.println(encryptMessage(s, rotate));
		System.out.println(decryptMessage(s, rotate));
	}
}
