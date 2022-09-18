package collections;

import java.util.ArrayList;
import java.util.List;

/* 1. Red, Green, Blue, Yellow, Brown] [Brown, Yellow, Blue, Green, Red] 
 * 2. Print the even numbers in the list [1,12,22,34,31,97,1154,32,2445,57,88]
 */

public class ListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("Yellow");
		list.add("Brown");
		//list.add("Red");
		int size = list.size(); 
		System.out.println("Size of the list "+size);
		System.out.println(list);

	}

}