package mind.core.programs;
import java.util.AbstractCollection; 	
import java.util.HashSet;
import java.util.LinkedHashSet;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> h=new LinkedHashSet<String>();
		h.add("asd");
		h.add("hi");
		h.add("h");
		h.add("uiui");
		
		
		System.out.println(h);
		System.out.println(h.contains("India"));
		System.out.println(h.remove("h"));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		
		h.addAll(h);
		System.out.println(h);

	}

}
