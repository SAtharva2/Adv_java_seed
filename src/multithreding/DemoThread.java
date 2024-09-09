package multithreding;

public class DemoThread extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i++)
			{
				if(currentThread().getName().equals("Shyam"))
				{
					System.out.println("hi.."+getName());
					Thread.sleep(200);
					
				}
				if(currentThread().getName().equals("Ram"))
				{
					System.out.println("Bye..."+getName());
					Thread.sleep(200);
				}
				
				
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
     public static void main(String[] args) {
		
    	 DemoThread t1=new DemoThread();
    	 t1.setName("Shyam");
    	 t1.start();
    	 
    	 DemoThread t2=new DemoThread();
    	 t2.setName("Ram");
    	 t2.start();
	}
}
