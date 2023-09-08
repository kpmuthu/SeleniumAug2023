package assessments.week3.day2;

import java.util.Arrays;

public class ReverseEvenWords {

//output: I ma a erawtfos tester

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";

		String[] split = test.split(" ");
		String result = "";

		for (int i = 0; i <= split.length - 1; i++) {
			// System.out.println(split[i]);

			if (i % 2 != 0) {
				// System.out.println("Odd " + split[i]);

				char[] charArray = split[i].toCharArray();

				for (int j = charArray.length - 1; j >= 0; j--) {

					result = result + charArray[j];

				}

			}

			else {

				result = result + split[i];

			}

			if (i < split.length) {
				result = result + " ";
			}

		}
		System.out.println(result);

	}
}
