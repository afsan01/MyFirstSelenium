package homeWork;

public class SwapString {

	public static void main(String[] args) {
		String a= "Hello";
		String b = "World";
		System.out.println("Before swapping");
		System.out.println("The value of a is:"+ a);
		System.out.println("The Value of b is:"+ b);
		//appent a and b
		a = a+b; //HelloWorld
		//store initial string a in string b
		b = a.substring(0, a.length()-b.length());
		//store initial b into string a
		a= a.substring(b.length());
		System.out.println("The value of a and b after swapping");
		System.out.println("The value of a is:"+ a);
		System.out.println("The Value of b is:"+ b);
		
		

	}

}
