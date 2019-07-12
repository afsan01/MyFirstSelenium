package homeWork;

public class FizzBuzz {

	public static void main(String[] args) {
		int n=90;
		for(int i=1; i<=n; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println("FIZZbUZZ");
			}
			else if(i%3 ==0) {
				System.out.println("FIZZ");
			}
			else if (i%5==0) {
				System.out.println("BUZZ");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
