import java.util.Scanner;

public class Easy1 {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in the first side of the triangle");
		a = in.nextInt();
		while (a < 0) {
			System.out.println("Invalid response, try again");
			a = in.nextInt();
		}
		System.out.println("Enter in the second side of the triangle");
		b = in.nextInt();
		while (b < 0) {
			System.out.println("Invalid response, try again");
			b = in.nextInt();
		}
		System.out.println("The third side of the triangle is " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
	}
}