package homeWork;

public class StringManupulation {

	public static void main(String[] args) {
		String str = "The rains have started here";
		String str1 = "The rains Have started here";
		
				System.out.println(str.length());//length of string
				System.out.println(str.charAt(5));//5th carrecter location
				System.out.println(str.indexOf("s"));
				System.out.println(str.indexOf("s", 9));
				System.out.println(str.indexOf("s",str.indexOf("s")+1 ));
				System.out.println(str.indexOf("have"));
				System.out.println(str.indexOf("hello"));//-1
				//string comporism:
				System.out.println(str.equals(str1));
				System.out.println(str.equalsIgnoreCase(str1));
				//substring:
				System.out.println(str.substring(0, 10));
				//trim:
				String s ="  Hello Word  ";
				System.out.println(s.trim());
				System.out.println(s.replace(" ", ""));
				
				String date = "01-02-2018";
				System.out.println(date.replace("-", "/"));
				//split:
				String test = "Hello_World_Test_Selenium";
				String testVal[]=test.split("_");
				for(int i=0; i<testVal.length; i++) {
					System.out.println(testVal[i]);
				}
				
				String s2 ="Care";
				System.out.println(s2.concat("s"));
				
				String x = "Hello";
				String y = "World";
				int a = 100;
				int b =200;
				System.out.println(x+y);//HelloWorld
				System.out.println(a+b); //300
				System.out.println(x+y+a+b);//HelloWorld100200
				System.out.println(a+b+x+y);//300HelloWorld
				System.out.println(x+y+(a+b));//HelloWorld300

	}

}
