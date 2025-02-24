package mind.core.programs;

import java.util.ArrayList;

public class CollectionAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("Apple");
		a.add("Banana");
		a.add("kiwi");
		a.add("pineapple");
		a.add("orange");
		a.add("strawberry");
		
		a.add("chennai");
		a.add("Trichy");
		
		a.add("Movies");
		a.add("Gaming");
		
		
		System.out.println(a);
		
		a.remove("Gaming");
		
		System.out.println(a);
		
		System.out.println( a.contains("cricket"));
		
		a.remove("Trichy");
		a.remove("Banana");
		System.out.println(a);
		System.out.println(a.get(4));
		System.out.println(a.get(5));
		
		a.set(6, "Dancing");
		System.out.println(a);
		System.out.println("Reversed :" +  a.reversed());
//		System.out.println("Reversed"+a);
		a.add(3,"kerala");
		a.add(1,"Mango");
		
		System.out.println(a);	
		System.out.println(a.subList(2, 5));
	}

}

//Assignment 3:
//Create object of ArrayList and add
//6 fruits
//2 cities
//2 hobbies
//do following operations:
//- print the arraylist
//- remove one hobby
//- search("cricket")
//- remove 1 city & remove 1 fruit
//- print 4th & 6th element
//- replace the hobby "Singing" with new hobby "Dancing"
//- reverse the arraylist
//- add "Kerala" at 4th position and add "Mango" at 2nd position

//-fetch the substring from index 2 to 5 and print it 