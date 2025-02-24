package mind.core.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinklistDemo {
	public static void main(String[] args) {
    	int a1=5;
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("January");
        ll.add("March");
        ll.add("May");
        ll.add("July");
        ll.add("March");
        System.out.println(ll);      
        //ll.add(a1);    // wrapping of primitive is done automatically to convert to Integer object
        ll.set(3, "December");
        System.out.println(ll);  
        ll.addFirst("Hello");
        System.out.println(ll);
        ll.add(5, "August");
        System.out.println(ll);  
        ll.remove(3);
        System.out.println(ll);
        Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("list is"+ itr.next());
        }
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'September'? "+ll.contains("September"));
        ll.addLast("November");
        System.out.println("after adding nov" +ll);
        System.out.println("check contains august or not "+ ll.contains("August"));
        System.out.println(ll);
        System.out.println(">>>>>" +ll.stream());
        System.out.println(ll.getFirst());
        System.out.println(ll);
        System.out.println(ll.peekFirst());
        System.out.println(ll);
        System.out.println(ll.peekLast());
        System.out.println(ll);
        System.out.println(ll.pollFirst());
        System.out.println(ll);
        System.out.println(ll.pollLast());
        System.out.println(ll);             

        Vector<String> v = new Vector<String>();
        v.add("Jaipur");
        v.add("Delhi");
        v.add("Mumbai");
        Iterator itr1=v.iterator();
        while(itr1.hasNext()) {
        System.out.println("Vector is"+ itr1.next());
		
	}

}
}

