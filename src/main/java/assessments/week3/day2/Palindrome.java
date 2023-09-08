package assessments.week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "madam";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		if (rev.equalsIgnoreCase(name)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is non palindrome");
		}

	}

}
