
public class MultiThrd extends Thread {
	
	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		MultiThread1 multiThread1=new MultiThread1();
		multiThread1.setName("First Thread");
		multiThread1.setPriority(Thread.MIN_PRIORITY);
		MultiThread1 multiThread2=new MultiThread1();
		multiThread2.setName("Second Thread");
		multiThread2.setPriority(Thread.MAX_PRIORITY);
		MultiThread1 multiThread3=new MultiThread1();
		multiThread3.setName("Third Thread");
		multiThread1.start();
		multiThread2.start();
		multiThread3.start();
	    //multiThread3.suspend();
		//multiThread2.resume();	
		//multiThread1.sleep(2000);
	}			
}
	 class MultiThread1 extends Thread
	{
		public void run()
		{
             try {
			     for(int i=5; i>0; i--) {
			     System.out.println("value of i :"+i);
			      Thread.sleep(1000);
			}
			}catch (InterruptedException e) {
			    System.out.println(e);		
			System.out.println("Running Thread Name:" +this.currentThread().getName());
			System.out.println("Running Thread Priority:" +this.currentThread().getPriority());
		}
	}

}