package mind.core.programs;

public class Assignment1 {
//	int length,breadth,width;
	
	

	public static void main(String[] args) {
		Assignment1 mf=new Assignment1();
		System.out.println(mf.calculate(2,3));
		System.out.println(mf.calculate(2));
		System.out.println(mf.calculate(3.23f,3.13f));
		System.out.println(mf.calculate(2));
		
		
		// TODO Auto-generated method stub

	}
	
	public int  calculate(int d1, int d2) {
		int ans=(int)(d1*d2)/2;
		return ans;
		
	}
	public int calculate(int radius) {
		int ans= (int)3.14 * radius * radius;
		return ans;
		
	}
	public float calculate(float l,float b) {
		float ans= l*b;
		return ans;
		
	}
	public long calculate(long side) {
		long ans=side*side;
		System.out.println(ans);
		
	}

}
