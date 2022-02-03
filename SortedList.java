package practice;
//the utility package of java contains the collections
import java.util.*;

public class SortedList {
	
	//making method static to access it directly from main instead of creating an object
	//in case of collections the reference is passed
	static void sortList(List<Integer> list) {
		//another paramter as custom comparator can be passes to override the default ascending sorting 
		Collections.sort(list);
	}
	
	public static void main(String[] args) {
		//declaring and adding elements to list in unsorted order
		//Arrays.asList() could also be used to do below thing in single line
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(8);
		list.add(0);
		list.add(6);
		
		System.out.println("List Before Sorting" + list);
		
		sortList(list);
		
		System.out.println("List After Sorting" + list);
	}

}
