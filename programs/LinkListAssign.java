package mind.core.programs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("May");
		l.add("June");
		l.add("July");
		l.add("August");
		l.add("April");
		l.add("November");
		
		l.addLast("December");
		l.addFirst("January");
		
		l.add(1,"Febuary");
		l.add(2,"March");
		
		System.out.println(l);
		
		l.add(7,"September");
		l.add(8,"October");
		
		l.add(3,"April");
		l.remove(10);
		System.out.println(l);
		
		System.out.println("odd Dates");
		for(int i=0;i<l.size();i++) {
			if(i%2==0) {
				System.out.println(l.get(i));
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("even Dates");
		for(int i=0;i<l.size();i++) {
			if(i%2!=0) {
				System.out.println(l.get(i));
			}
		}
		System.out.println();
		System.out.println();
		
		Iterator itr =l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(l.getFirst()+"   "+l.getLast());
		
		l.remove("September");
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<l.size();i++) {
			if(l.get(i)=="January" || l.get(i)=="Febuary" || l.get(i)=="December" )  {
				System.out.println("Yes it is Present");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		
		System.out.println(l);
		
				
		
		
			
		
		
		
		

	}

}

//Assignment 4:
//Use LinkedList only in the below program
//   - Add 6 months (May, June, July, August, April, November)
//   - Add 'December' month as last
//   - Add 'January' month as first
//   - Add 'March' and then add 'Febuary' using the index based 
//   - Add 'September' and then ad d 'October' using the index based

//(1) Print the linkedlist in such a way that proper order of months are displayed
//(2) Get all the even months and print them 
//(3) Get all the odd months and print them
//(4) Use iterator to fetch and print all months 
//(5) Print the first and last month of the year together
//(6) remove your birthday month from the linkedList and print it
//(7) Check whether this linkedList contains any winter month inside it or not?
//(8) Fetch the first and last months using peek()
//(9) Remove the first and last months using poll()