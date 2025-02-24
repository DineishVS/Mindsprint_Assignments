package mind.core.programs;

public class ThreadDemo extends Thread {
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    		Thread.sleep(3000);  // 3000 miliseconds = 3 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i + " >> " + Thread.currentThread().getState());  
		  }  
		   System.out.println(Thread.currentThread().getName()+ "  : >> " + Thread.currentThread().getState());  
		 }  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1=new ThreadDemo();  
		  t1.setName("Java");
		  t1.setPriority(MAX_PRIORITY); 
		  ThreadDemo t2=new ThreadDemo();  
		  t2.setName("Python");
		  t2.setPriority(NORM_PRIORITY);
		  ThreadDemo t3=new ThreadDemo(); 
		  t3.setName("Oracle");
		  ThreadDemo t4=new ThreadDemo(); 
		  t4.setName("C++");
		  t4.setPriority(MIN_PRIORITY); 
		  t1.start();  
		  t2.start();  
		  t3.start();
		  t4.start();
		  System.out.println(t1.getState());
		  System.out.println(t3.getState());
		  System.out.println(t2.getState());

	}

}

