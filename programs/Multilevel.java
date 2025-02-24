package mind.core.programs;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subA a=new subA();
		a.display();
		subB b=new subB();
		b.display();

	}
}
	
	class  Product{
		int id=78;
		String name="Amul";
		
		public  void display() {
			System.out.println("Hi my id is :"+id +"my name is " +name);
		}
		
		
	}
	
	class classA extends Product{
		int count=50;
		String category="butter";
		
		public  void display() {
			System.out.println(count+category);
		}
		
	}
	class classB extends Product{
		int count=90;
		String category="Milk";
		
		public  void display() {
			System.out.println(count+category);
		}
			
			
		}
	class classC extends Product{
		int count=56;
		String category="choco";
		
		public  void display() {
			System.out.println(count+category);
		}
		
	
		
		
	}
	class subA extends classA{
		
	
		int price=30;
		
		public  void display() {
			int total=count * price;
		
			System.out.println("ProductID "+ id + "  Category "+ category);
			System.out.println("Total_Price "+total);

}
	class subB extends classB{
		int price=10;
		
		public  void display() {
			int total= count * price;
		
			System.out.println("\nProductID "+ id + "  Category "+ category);
			System.out.println("Total_Price "+total);
		}
		
	}

	
