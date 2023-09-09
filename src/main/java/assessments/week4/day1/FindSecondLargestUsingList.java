package assessments.week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> set = new TreeSet<>();
		for (Integer integer : data) {

			set.add(integer);

		}
		List<Integer> list = new ArrayList<>(set);
		int size = list.size();
		Integer integer = list.get(size - 2);
		System.out.println("second Largest Number " + integer);

	}

}
