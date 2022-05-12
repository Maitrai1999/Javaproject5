
public class Example implements Runnable {
	@Override
	public void run()
	{
		System.out.println("thread is running.....");
	}
	public static void main(String[] args) {
		Example m=new Example();
		Thread t1=new Thread(m);
		t1.start();
		System.out.println("thread 1");
		Thread t2=new Thread(m);
		t2.start();
		System.out.println("thread 2");
		
		
		
	}

}
