package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
	ArrayList<Guns> list = new ArrayList<Guns>(); //Creating arraylist of objects 
	  
	  // Creating objects
	  Guns model1 = new Guns("H&K", "VP9SK");
	  Guns model2 = new Guns("Glock", "G21 Gen4");
	  Guns model3 = new Guns("Glock", "G21 Gen4"); // List can include duplicates
	  Guns model4 = new Guns("Sig Sauer", "P229");
	  
	  list.add(model1); //Add objects to list  
	  list.add(model2);  
	  list.add(model3);  
	  list.add(model4);
	  
	  // Display list items
	  System.out.println("List example\n");
	  for (Gun gunList:list){
			System.out.println(gunList.getTitle() + ", " + gunList.getModel());
	  }
	  
	  // Clear list
	  System.out.println("Before clear, size is: " + list.size());
	  list.clear(); // Empties list of items, but the list as a data structure still is in memory
	  System.out.println("After clear, size is: " + list.size());
	  
	  
}
