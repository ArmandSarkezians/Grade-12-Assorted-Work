public class Hard1 {
	public static int[] insertElement(int[] intArray, int integer) {
		int[] newArray = new int[intArray.length];
		for (int x = 0; x <= intArray.length - 1; x++) {
			if (intArray[x] > integer) {
				newArray[x] = integer;
				integer = Integer.MAX_VALUE;
			} else {
				newArray[x] = intArray[x];
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] intArray = { 10, 20, 30, 40, 50, 60, 70 };
		int insert = 45;
		int[] result = insertElement(intArray, insert);
		for (int x = 0; x <= result.length - 1; x++) {
			System.out.println(result[x]);
		}
	}
}
