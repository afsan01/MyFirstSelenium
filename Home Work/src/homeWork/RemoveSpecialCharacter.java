package homeWork;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String s= "<.>()$@latinString012345";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
