package randomNumber;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GenerateRandom {

	public static void main(String[] args) {
		
		Random randNum = new Random();
		Set<Integer> random500 = new HashSet<Integer>();
		
		/*for(int i=0; i<random500.size(); i++) {
		int num = randNum.nextInt(900) + 100;
		//1000 is the maximum and 100 is out minimum.
		random500.add(num);
		
		}*/
		
		while (random500.size() !=500 )
		{
			int num = randNum.nextInt(900) + 100;
			random500.add(num);
		}
		
		System.out.println(random500);
		System.out.println(random500.size());
		
		System.out.println("Give me which Nth number you want ? ");
		Scanner userInput = new Scanner (System.in);
		
		int userData = userInput.nextInt();
		
		
		Object[] randomNumbersArray = random500.toArray();
		
		//System.out.println(randomNumbersArray[userData]);
		if (userData<=0)
		{
			System.out.println("I dont deal with 0, Please try another Number :");
		}
		else if (userData>500) {
			System.out.println("I dont deal with large data, please try again");
		}
		else
		{
			System.out.println(randomNumbersArray[userData-1]);
		}
		
		
	}

}
