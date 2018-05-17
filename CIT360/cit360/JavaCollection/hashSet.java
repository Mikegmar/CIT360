package JavaCollection;

public class hashSet {

	HashSet<String> set = new HashSet<String>();   
    
	  // Adding Guns to set  
	  set.add("Remington");  
	  set.add("Smith & Wesson");  
	  set.add("Remington"); // This adds a duplicate. In sets that isn't allowed
	  set.add("Beretta");
	  set.add("Smith & Wesson"); // Ditto. Won't add duplicates.
	  set.add("Smith & Wesson");
	  
	  System.out.println("\nSet example\n");
	  // Display set items 
	  for(String gunSet:set){  
			System.out.println(gunSet); 
}
