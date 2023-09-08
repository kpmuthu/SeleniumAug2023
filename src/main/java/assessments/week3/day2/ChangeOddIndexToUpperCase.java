package assessments.week3.day2;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "changeme";

		char[] charArray = text.toCharArray();

		System.out.println(charArray);

		System.out.println(text.length());

		for (int i = 1; i <= text.length(); i++) {
			if (i % 2 == 0) {

				System.out.println(text.charAt(i - 1));
			}

			else {

				char charAt = text.charAt(i - 1);
				System.out.println(Character.toUpperCase(charAt));
			}
		}

	}

}
