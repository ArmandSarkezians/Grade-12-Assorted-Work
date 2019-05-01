import java.io.*;
import java.util.*;

public class StringToken2 {


	public static void whyDoIHaveToDoThis (String s) {
		StringTokenizer st = new StringTokenizer (s, " ,./<>?;':[]=-+_0)9(8*7&6^5%4$3#@2!1`~");
		String [] sArray = new String [st.countTokens()];
		
		for (int x = 0; x < sArray.length; x++) {
			sArray [x] = st.nextToken();
		}
		
		String finalWord = "";
		
		for (int x = 0; x < sArray.length; x++) {
			finalWord += sArray[x].substring(0, 1);
		}
		
		System.out.println (finalWord);
	}


	public static void main (String [] args) {
		String s = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader("input.txt"));
			s = in.readLine();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found. Please create the file and try again.");
		} catch (IOException e) {
			System.out.println("There was an error with the Input and Output of texts. Please try again.");
		}
		whyDoIHaveToDoThis (s);
	}
}
