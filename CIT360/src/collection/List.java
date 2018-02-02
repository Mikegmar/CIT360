package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	
	public static void main(String[] args){
		//Creates an array list
		ArrayList<String> listA = new ArrayList<String>();
	
		//adds content to listA
	listA.add("John");
	listA.add("Matt");
	listA.add("Luke");
	listA.add("Mark");
	listA.add("Fred");
	

	//prints out just what is in location 3	
	System.out.println(listA.get(3));
	//prints out all of listA
	System.out.println(listA);
	
	//deletes what was stored in location 4
	listA.remove(4);
	System.out.println(listA);
	
	//access via Iterator
	Iterator<String> iterator = listA.iterator();
	while(iterator.hasNext()){
	  String element = (String) iterator.next();
	  System.out.println(element);
	}
	
	 ArrayList<Integer> list2 = new ArrayList<Integer>();

     list2.add(1);
     list2.add(2);
     list2.add(3);
     list2.add(4);

     System.out.println(list2);
     
     System.out.println("Adding an element that is out of bounds");
     try {
         list2.add(15, 5);
         System.out.println(list2);
     } catch (Exception e) {
         System.out.println("Failure");
     }
     System.out.println("Geting an element that is out of bounds");
     try {
         list2.get(54);
         System.out.println(list2.get(54));
     } catch (Exception e) {
         System.out.println("Failure");
     }
     
     
	
}
	
}
