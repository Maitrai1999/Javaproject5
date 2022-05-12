import java.util.*;
class Square extends Thread{
	int x; 
		Square(int n){
			x=n;
		}public void run() {
			double sqr=Math.pow(x,2);					
		//	int sqr=x*x;
			System.out.println(sqr);
		}
	}
	class Cube extends Thread{
		int x;
			Cube(int n){
				x=n;
			}public void run() {
				double cube=Math.pow(x,3);
				//int cube=x*x*x;
				System.out.println(cube);
			}
		}

class Number extends Thread{
	public void run() {
		Random random=new Random();
		for(int i=0;i<1;i++) {
			int randomInteger=random.nextInt(10);
			System.out.println("int :"+randomInteger);
			Square a=new Square(randomInteger);
			a.start();
			Cube f=new Cube(randomInteger);
			f.start();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n=new Number();
		n.start();
}
}



