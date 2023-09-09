package assessments.week4.day1;

import java.util.ArrayList;
import java.util.Collections;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 4, 2, 1, 6, 3, 5, 10, 8, 9 };

		ArrayList<Integer> arrList = new ArrayList<>();
		for (Integer integer : data) {

			arrList.add(integer);

		}

		Collections.sort(arrList);
		System.out.println(arrList);

		for (int i = 0; i <= arrList.size() - 1; i++) {

			if (arrList.get(i) != ++i) {
				System.out.println(i);
				break;
			}
		}
	}

}
