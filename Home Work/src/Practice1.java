import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		int a= 0;
		int b= 0;
		int c=1;
		System.out.println("Enter the number ");
		Scanner Num = new Scanner(System.in);
		int x = Num.nextInt();
		System.out.println("Fibonacci series are");
		for (int i=0; i<=x; i++) {
			a=b; b=c; c= a+b;
			System.out.print(a + ", ");
		}
			
		
		
		
}
}
