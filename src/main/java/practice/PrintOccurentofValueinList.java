package practice;

import java.util.ArrayList;
import java.util.List;

public class PrintOccurentofValueinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("Ben");
		list.add("James");
		list.add("Adam");
		list.add("George");
		list.add("Adam");
		
		int count=0;
		
		for (int i=0;i<=list.size()-1;i++)
		{
			if(list.get(i).contains("Adam"))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
