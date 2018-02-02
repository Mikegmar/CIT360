package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	
	public static void main(String[] args){
		//creates a set named games
		HashSet<String> games = new HashSet<String>();
		
	//Put data into the set
		games.add("The Legend of Zelda");
		games.add("Super Mario World");
		games.add("Metriod");
		games.add("Yoshi's Island");
		
		
		//shows all values in set
		System.out.println(games);
		
		
		//access via Iterator
		Iterator<String> iterator = games.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator loop: " + iterator.next());
        }
		games.remove("Super Mario World");
		System.out.println(games);
		
		
		
}
}
