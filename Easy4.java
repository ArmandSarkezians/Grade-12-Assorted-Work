public class Easy4 {
	public static int MultipleThree(int[] intArray) {
		int returnValue = 0;
		for (int x = 0; x <= intArray.length - 1; x++) {
			if (intArray[x] % 3 == 0) {
				returnValue++;
			}
		}
		return returnValue;
	}

	public static void main(String[] args) {
		int[] hello = { 3, 6, 4, 17, 21, 24, 30, 7, 3, 3, 3, 3, 3 };
		System.out.println(MultipleThree(hello));
	}
}
