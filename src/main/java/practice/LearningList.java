package practice;

import java.util.ArrayList;
import java.util.List;

public class LearningList {

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
		
		for (int i=0;i<=list.size()-1;i++)
		{
			for (int j=i+1;j<=list.size()-1;j++)
			{
				if(list.get(i)==list.get(j))
				{
					System.out.println(list.get(i));
				}
			}
		}

	}

}
