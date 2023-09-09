package assessments.week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] text = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		int length = text.length;

		ArrayList<String> arrlist = new ArrayList<>();
		for (String string : text) {

			arrlist.add(string);

		}

		Collections.sort(arrlist);

		Collections.reverse(arrlist);

		/*
		 * for (String revValue : arrlist) {
		 * 
		 * System.out.println(revValue);
		 * 
		 * }
		 */

	}

}
