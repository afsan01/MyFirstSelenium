import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("Give me a Number you want");
		Scanner num = new Scanner(System.in);
		int Num = num.nextInt();
		for(int i= 1; i<=Num; i++)
		if(i%3==0 && i%5==0) {
			System.out.println("FizzBuzz");
		}
		else if(i%3 ==0) {
			System.out.println("Fizz");
			
		}
		else if (i%5==0) {
			System.out.println("Buzz");
		}
		else {System.out.println(i);	
		}
}
}



