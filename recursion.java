import java.util.*;
public class recursion {

	public static int fib(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib(n - 2) + fib(n - 1);}


	public static int multiply(int num, int multiplier) {	
		if (multiplier == 1 || multiplier == -1)
			return num;
		if (multiplier < 0)
			return num + multiply (num, multiplier + 1);
		else
			return num + multiply(num, multiplier - 1);}


	public static String repeat(char s, int num) {
		if (num == 1)
			return s + "";
		return s + repeat(s, num - 1);}


	public static String reverse(String s) {
		if (s.length() - 1 == 0)
			return s;
		return reverse(s.substring(1)) + "-" + s.substring(0, 1);}


	public static int count(String s, char letter) {
		int num = 0;
		if (s.length() - 1 == 0)
			return 0;
		if (s.charAt(0) == letter)
			num++;
		return num + count(s.substring(1), letter);}


//	public static int domino(int n) {
//		return (n * 2) - 2;} // thats the equation for finding the number of avaliable spots for the dominos
	
	public static int domino (int n) {
		if (n == 2)
			return 1;
		return n + domino (n - 1);
	}


	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		boolean continu = true;

		//Input for Program 1
		int n = 0;
		System.out.println("Enter in n to find the nth term of the fibonacci sequence");
		while (continu) {
			try {
				n = Integer.parseInt(in.nextLine());
				if (n >= 0) 
					continu = false;
				else if (n < 0)
					System.out.println("Enter in a number greater than 0");
			}catch (NumberFormatException e) {
				System.out.println("Invalid Format. Try again");}}
		System.out.println(fib(n));
		continu = true;


		//Input for Program 2
		int multiple = 0;
		System.out.println("Enter in the base number you would like to multiply");
		while (continu) {
			try {
				multiple = Integer.parseInt(in.nextLine());
				continu = false;
			}catch (NumberFormatException e) {
				System.out.println("Invalid Format. Try again");}}
		continu = true;
		int multiplier = 0;
		System.out.println("Enter in the multiplier");
		while (continu) {
			try {
				multiplier = Integer.parseInt(in.nextLine());
				continu = false;
			}catch (NumberFormatException e) {
				System.out.println("Invalid Format. Try again");}}
		continu = true;
		if (multiplier < 0) 
			System.out.println(-1 * (multiply (multiple, (multiplier * -1))));
		else
			System.out.println(multiply(multiple, multiplier));


		//Input for Program 3
		String repeater = ""; 
		System.out.println("Enter in the character you would like to repeat");
		while (repeater.trim() == null) {
			repeater = in.nextLine();
			if (repeater.trim() == null)
			System.out.println("Invalid char, please enter in something as the character");
		}
		System.out.println("Enter in the number of characters you would like outputted");
		int numOfRepetitions = 0;
		while (continu) {
			try {
				numOfRepetitions = Integer.parseInt(in.nextLine());
				continu = false;
			}catch (NumberFormatException e) {
				System.out.println("Invalid Format. Try again");}}
		continu = true;
		char repeat = repeater.charAt(0);
		System.out.println(repeat(repeat, numOfRepetitions));
		
		
		//Input for Program 4
		String reversed = ""; 
		System.out.println("Enter in the string you want reversed");
		while (reversed.trim() == null) {
			reversed = in.nextLine();
			if (reversed.trim() == null) 
			System.out.println("Invalid string, please enter in something as the character");
		}
		System.out.println(reverse(reversed));
		
		
		// Input for Program 5
		String checked = ""; 
		System.out.println("Enter in the original string");
		while (checked.trim() == null) {
			checked = in.nextLine();
			if (checked.trim() == null) 
			System.out.println("Invalid string, please enter in something as the character");}
		char checker = ' '; 
		System.out.println("Enter in the character you would like to check for");
		while (checker == ' ' || checker == '\u0000') {
			reversed = in.nextLine();
			if (checker == ' ' || checker == '\u0000') 
			System.out.println("Invalid char, please enter in something as the character");
		}
		checker = in.nextLine().charAt(0);
		System.out.println(count(checked, checker));
		
		
		//Input for Program 6
		int length = 0; 
		System.out.println("Enter in the length of the rectangle");
		while (continu) {
			try {
				length = Integer.parseInt(in.nextLine());
				continu = false;
			}catch (NumberFormatException e) {
				System.out.println("Invalid Format. Try again");}}
		System.out.println(domino(length));}}
