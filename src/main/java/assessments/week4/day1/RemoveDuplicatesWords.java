package assessments.week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");
		
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(split));

		Set<String> set = new LinkedHashSet<String>(strList);

		for (String string1 : set) {

			System.out.print(string1 + " ");

		}
	}

}
