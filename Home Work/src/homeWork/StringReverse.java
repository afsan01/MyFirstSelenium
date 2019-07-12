package homeWork;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		/*String Original, Reverse =("");
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a String");
		Original = str.nextLine();
		int length=Original.length ();
		for (int a = length -1; a>=0; a--)
			Reverse = Reverse+Original.charAt(a);
		System.out.println(Reverse);*/
		String Original = ("Mahbub");
		String Reverse = ("");
		//int length=Original.length ();
		for (int a = Original.length() -1; a>=0; a--)
			Reverse = Reverse+Original.charAt(a);
		
		System.out.println(Reverse.replace("M", "m"));
		//System.out.println(Reverse.replace("M", "m"));

	}

}
