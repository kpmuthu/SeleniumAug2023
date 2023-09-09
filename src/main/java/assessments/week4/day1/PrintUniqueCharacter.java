package assessments.week4.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "babu";

		char[] charArray = text.toCharArray();

		Set<Character> set = new HashSet<>();
		for (Character character : charArray) {
			if (set.contains(character)) {
				set.remove(character);
			} else {
				set.add(character);
			}
		}
				
		for (Character charc : set) {
			System.out.print(charc+ " ");
			
		}

	}

}
