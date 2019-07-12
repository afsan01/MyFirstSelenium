package homeWork;

public class SwapNumber {

	public static void main(String[] args) {
		/*int a = 25;
		int b = 35;
		int temp;
		temp = a; a=b; b= temp;
		
		System.out.println("A=" +a + ", B="+ b);*/
		
		//without using third variables
		int a =25;
		int b=35;
		
		a= a+b;
		b= a-b;
		a =a-b;
	
		System.out.println("A=" +a + ", B="+ b);

	}

}
