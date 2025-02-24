package mind.core.programs;

public class FunctionOverloading {
	
	public void area(int a, int b) {
		System.out.println((a*b));
		
	}
	public void area(double radius) {
		System.out.println(radius*radius);
		}
	
	public void area(int x, int y,int z) {
		System.out.println((x*y*z));
	}

	public static void main(String[] args) {
		FunctionOverloading mf=new FunctionOverloading();
		mf.area(2,4);
		mf.area(2,3,4);
		mf.area(2.3);
		
		
		
		// TODO Auto-generated method stub

	}

}
