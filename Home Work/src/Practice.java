import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String Original, Reverse = ("");
		System.out.println("Please enter a String");
		Scanner str =new Scanner(System.in);
		Original= str.nextLine();
		for(int a = Original.length()-1; a>=0; a--) 
			Reverse = Reverse + Original.charAt(a);
			System.out.println(Reverse);
		
		if(Original.equalsIgnoreCase(Reverse)) {
			System.out.println("Palindrome");
		}
		else{System.out.println("Not Palindrom");}

	}

}
