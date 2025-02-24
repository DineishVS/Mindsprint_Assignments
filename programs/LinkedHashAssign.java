package mind.core.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <Integer,String> l=new LinkedHashMap<Integer,String>();
		
		l.put(93,new String("Afghanistan"));
		l.put(880,new String("Bangladesh"));
		l.put(975,new String("Bhutan"));
		l.put(855,new String("Cambodia"));
		l.put(1,new String("Canada"));
		l.put(86,new String("China"));
		l.put(299,new String("Greenland"));
		l.put(91,new String("India"));
		l.put(39,new String("Italy"));
		l.put(81,new String("Japan"));
		
		for(int i:l.keySet()) {
			System.out.println("Keys of HashMap: "+i);
			
		}
		
		for(int i:l.keySet()) {
			System.out.println("Values of HashMap: "+l.get(i));
			
		}
		
		
			System.out.println("India "+(l.containsValue("India")));
			
			System.out.println("the 45 is not present "+(l.containsKey(45)));
				
				

			
		
		
		l.remove(1);
		System.out.println(l);
		
		Map <Integer,String> ll=new LinkedHashMap<Integer,String>();
		
		ll.put(22,new String("tamil"));
		ll.put(23,new String("english"));
		ll.put(24,new String("hindi"));
		ll.put(5,new String("german"));
		ll.put(26,new String("french"));
		
		
		System.out.println(ll);
		ll.remove(5);
		System.out.println(ll);
		
		l.putAll(ll);
		System.out.println(l);
		
		
		System.out.println(l.isEmpty());
		
		ll.clear();
		
		

	}

}

//Assignment 6:
//Create object of LinkedHashmap of 10 countries of your choice( countrycode = key and countryname= value)
//do following operations:
//- fetch all the map keys
//- fetch all the map values
//- check if the value("India") exists or not
//- check if the key(45) exists or not
//- remove 1 country
// 
//Also create a new map with (key=statecode , value=statename) and marge with the above map
//- also delete the key(5) 
//- check if the map is empty or not
//- clear the map
