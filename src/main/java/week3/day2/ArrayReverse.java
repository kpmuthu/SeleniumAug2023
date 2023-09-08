package week3.day2;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = { 98, 97, 76, 87, 90 };

		int len = scores.length;

		Arrays.sort(scores);

		for (int i = len - 1; i >= 0; i--) {
			System.out.println(scores[i]);
		}

	}

}
