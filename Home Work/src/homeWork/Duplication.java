package homeWork;

import java.util.Scanner;

public class Duplication {
	
	//private static Scanner userSentence;
	public static void main(String[] args) {
		System.out.println("Type a Sentence");
		Scanner userSentence = new Scanner(System.in);
		String input =userSentence.nextLine();
		
		char[] letters = input.toCharArray();
		System.out.println("Duplicate characters are:");
		for (int i=0; i<input.length(); i++) {
			for( int j= i+1; j<input.length(); j++) {
				if (letters [i]==letters[j]) {
					System.out.println(letters[j]);
					
				}
			}
		}
		
	}

}
