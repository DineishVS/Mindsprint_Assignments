package mind.core.programs;

public class Abstract_class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MNC obj =new Hello();
		
		obj.leaves();
		obj.holidays();
		obj.general();
		
		if (obj instanceof Hello) {			//downcast to access the hello specific method
			Hello helloObj=(Hello) obj;
			helloObj.helloinfo();
		}
		

	}

}

	
	
	
	abstract class MNC{
		abstract void leaves();
		abstract void holidays();
		
		MNC(){
			System.out.println("MNC Constructor");
		}
		
		void general(){
			System.out.println("normal method ");
		}
	}
	
	abstract class Mindsprint extends MNC{
		void holidays() {
			System.out.println("10 days holidays");
		}
	}
	
	class Hello extends Mindsprint{
		void leaves(){
			System.out.println("hello clss");
		}
		
		void helloinfo(){
			System.out.println("hello is a child of mindsprint");
		}
	}
	
	
	
	


