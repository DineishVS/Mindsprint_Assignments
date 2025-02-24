package mind.core.programs;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo d= new demo();
		int p=1000;
		int n=10;
		double r=0.03;
		double amount= p + d.calculateSI(p, n, r);
		
		
		System.out.println("The amount is :" +amount);
		d.disp();
		
	}
	
	public void disp() {
		System.out.println("Displayed");
	}

	public double calculateSI(int p,int n,double r) {
		return (p*n*r)/100;
	}

}
