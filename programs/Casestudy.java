package mind.core.programs;

class Ecommerce
{
	int prod_id;
	String name;
	int price;
	static int discount=5;
	Ecommerce(int id,String name1,int price1)
	{
		prod_id=id;
		name=name1;
		price=price1;
		//discount=dis;	
		
	}
	
	void original()
	{
		System.out.println("Discounted Price is :"+(price*(100-discount)/100));
	}
	void print()
	{
		
		System.out.println(prod_id+" "+name+" "+price*(100-discount)/100+" "+discount);
		
	}
	static void change1()
	{
		discount=10;
		
	}
	static void change2()
	{
		discount=30;
	}
	
}


public class Casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ecommerce e1 = new Ecommerce(10,"ram",100);
		Ecommerce e2 = new Ecommerce(101,"rahi",1003);
		Ecommerce e3 = new Ecommerce(1011,"mahi",500);
		Ecommerce e4 = new Ecommerce(110,"rsa",8000);
		e1.original();
		e1.print();
		e2.original();
		e2.print();
		e3.original();
		e3.print();
		e4.original();
		e4.print();
		e1.change1();
		e1.original();
		e1.print();
		e2.change1();
		e2.original();
		e2.print();
		e3.change2();
		e3.original();
		e3.print();
		e4.change2();
		e4.original();
		e4.print();

	}

}
