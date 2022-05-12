class Thread1 extends Thread{
	public void run ()
	{
		 try {
		     for(int i=1; i<=3; i++) {
		     System.out.println("thread1..."+i);
		      Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
		    System.out.println(e);
		}}}
	class Thread2 extends Thread{
		public void run ()
		{
			 try {
			     for(int i=1; i<=3; i++) {
			     System.out.println("thread2... "+i);
			      Thread.sleep(2000);
			}
			}catch (InterruptedException e) {
			    System.out.println(e);
			}}}
	
public class MainThread {
public static void main(String[] args) {
	
	Thread1 t1=new Thread1(); 
	Thread2 t2=new Thread2(); 
	t1.start();
	t2.start();
	System.out.println("Thread State"+t1.getState());
	System.out.println("Thread is live"+t1.isAlive());
	System.out.println("Threads priority"+t1.getPriority());
	System.out.println("Class of thread"+t1.getClass());
	System.out.println("Active counts"+t1.activeCount());

}
	


	}


