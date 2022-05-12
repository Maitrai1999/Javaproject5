public class Thread1Example extends Thread {
	
	public void run()
	{
		System.out.println("thread is running");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread1Example t1=new Thread1Example();
        t1.start();
	}
}