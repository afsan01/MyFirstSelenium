package homeWork;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
	String Original, reverse = "";
	Scanner userInput = new Scanner (System.in);
	System.out.println("Enter a String to check for Palindrome");
	Original = userInput.nextLine();
	
	StringBuilder abc = new StringBuilder();
	if(userInput.equals(abc.reverse()))
		System.out.println("Palindrome");
	else {System.out.println("Not Palindrome");
	
	/*int length = Original.length();
	
	for (int a = length -1; a>=0; a--)
	reverse = reverse+Original.charAt(a);
	
	if (Original.equals(reverse))
	{
		System.out.println("String is a Palindrome");
	}
	
	else
	{
		System.out.println("String is not a Palindrome");*/
	}

	}

}
