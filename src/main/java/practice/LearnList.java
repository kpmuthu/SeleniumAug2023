package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Papaya");
		list.add("Lemon");
		list.add("Butter fruit");
		list.add("Grapes");
		list.add("Papaya");

		System.out.println(list);
		int size = list.size();
		System.out.println(size);

		for (String string : list) {
			System.out.println(string);
		}

		for (int i = 0; i <= size - 1; i++) {
			System.out.println(list.get(i));
		}
		list.add(5, "Jackfruit");
		System.out.println("newly added" + list);
		list.set(3, "Banana");
		System.out.println("updated the index value 3" + list);
		list.remove(5);
		System.out.println("removed index 5" + list);

		boolean contains = list.contains("Lemon");
		System.out.println("checking isContains method" + contains);
		boolean empty = list.isEmpty();
		System.out.println("Checking isEmpty method" + empty);

		list.clear();
		System.out.println("After clear print list values " + list);

	}

}
