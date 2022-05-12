 class SynchoThread {
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		
			try {
				Thread.sleep(400);
			}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	
}
class MyThread1 extends Thread{
	SynchoThread t;
	MyThread1(SynchoThread t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread
{
	SynchoThread t;
	MyThread2(SynchoThread t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
		
	}
}
class SynchronousThread{
	public static void main(String args[]) {
		SynchoThread obj=new SynchoThread();
		MyThread1 t1=new MyThread1(obj);
		MyThread2  t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}

	}

