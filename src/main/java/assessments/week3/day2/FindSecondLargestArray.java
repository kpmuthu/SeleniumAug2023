package assessments.week3.day2;

import java.util.Arrays;

public class FindSecondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 3, 2, 11, 4, 6, 7 };

		int length = data.length;
		Arrays.sort(data);

		System.out.println(data[data.length - 2]);

	}

}
