
class A1{  
	public A1(int i) {
		System.out.println("a1"+i);
	}
public void msg()

{
System.out.println("Helloooo");
}  
}  
public class Single extends A1
{  
	public Single() {
		super(10);
		System.out.println("super");
	}
public void msg1()
{

	super.msg();
System.out.println("Java programming");
}  
 
public static  void main(String args[]){  
Single c=new Single();  
c.msg1(); 

}
}  



