interface A
{
	 void msg();
}
interface B
{
	void msg();
	}	
class C implements A,B
 {
	@Override
	  public void msg()
	  {
		  System.out.println("hello");
	  }
 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C obj=new C();
        obj.msg();

	}
	}
