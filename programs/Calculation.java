package mind.core.programs;

public class Calculation {

	public static void main(String[] args) {
		
		Calculation f=new Calculation();
		
		System.out.println(f.calculate(2, 3));
		System.out.println(f.calculate(2.2, 3.2));
		System.out.println(f.calculate(2.4f, 3.6f));
		System.out.println(f.calculate(2000L, 1000L));
	
		even(4);
		prime(11);
		// TODO Auto-generated method stub

	}
	
	public static void prime(int x) {
		for(int i=2;i<x/2;i++) {
			if (x%i==0) {
				System.out.println("NOT a Prime number");
				break;
			}
			else {
				System.out.println("It is a Prime number");
				break;
			}
		}
	}
	public static void even(int x) {
		if (x%2==0) {
			System.out.println("It is an Even Number");
		}
		else {
			System.out.println("It is not an Even Number");
		}
	}
	
	
	
	public  int calculate(int a, int b) {
		return a+b;
	}
	public  double calculate(double a, double b) {
		return a-b;
	}
	public  float calculate(float a, float b) {
		return a*b;
	}
	public  long calculate(long a, long b) {
		return a/b;
	}

}
