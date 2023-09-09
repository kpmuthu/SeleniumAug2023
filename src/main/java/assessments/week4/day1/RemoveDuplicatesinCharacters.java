package assessments.week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesinCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "PayPal India";
		String case1 = text.toLowerCase();
		String replaceAll = case1.replaceAll(" ", "");

		char[] charArray = replaceAll.toCharArray();

		Set<Character> set = new LinkedHashSet<>();
		for (Character eachcharacter : charArray) {
			set.add(eachcharacter);
		}

		for (Character charr : set) {
			System.out.print(charr);
		}

	}

}
