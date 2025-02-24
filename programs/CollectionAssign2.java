package mind.core.programs;
import java.util.TreeSet;
public class CollectionAssign2 {
	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>();
		
		t.add("Python");
		t.add("C");
		t.add("C++");
		t.add("Ruby");
		t.add("Java");
		t.add("JavaScript");
		
		System.out.println(t);
		t.remove("Python");
		t.remove("C");
		System.out.println(t);
		t.add("c#");
		t.add("SQL");
		t.add("PHP");
		
		System.out.println(t);
		
		System.out.println(t.contains("Java"));
		
		t.clear();
		
		System.out.println(t);
			
		
		
		
		
		
	}

}

//Assignment 2:
//Create one object of treeset and add the any 6 programming languages in random order
// - remove two languages
// - add three more languages after removal
// - Check if " Java" is part of your treeset or not
// - remove all the elements from the treeset and display it