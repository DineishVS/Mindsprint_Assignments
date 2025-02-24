package mind.core.programs;
import java.util.LinkedHashSet;

import java.util.Scanner;
public class CollectionAssignment {
	public static void main(String[] args) {
		LinkedHashSet h1=new LinkedHashSet();
		LinkedHashSet <Integer>h2=new LinkedHashSet<Integer>();
		
		h1.add(10);
		h1.add(20);
		h1.add(10.01);
		h1.add(11.01);
		h1.add("A");
		h1.add("B");
		h1.add(true);
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int k=s.nextInt();
			h2.add(k);
		}
		System.out.println(h1);
		System.out.println(h2);
		
		h1.add("Dine");
		h1.add("Dine2");
		
		System.out.println(h1);
		h1.remove("A");
		h1.contains("Dine");
		h1.contains(5);
		h1.clear();
		
		System.out.println(h1);
			
		
		
	
	}

}



//Assignment 1:
//create 2 objects of the set interface in same class
//LinkedHashSet (L1 & L2)
//L1  - 1st object will be ( add two int, two float ,two char, one boolean)
//L2  - 2nd object will be be Integer type only and take 10 different random numbers from user console.
//
// 
//Assignment 2:
//Create one object of treeset and add the any 6 programming languages in random order
//   - remove two languages
//   - add three more languages after removal
//   - Check if " Java" is part of your treeset or not
//   - remove all the elements from the treeset and display it