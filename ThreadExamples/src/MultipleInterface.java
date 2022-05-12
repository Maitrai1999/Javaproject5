
interface E
{
	 void msg();
}
interface D
{
	void msg1();
	}	
class MultipleInterface implements E,D
 {
	  public void msg()
	  {
		  System.out.println("hello");
	  }
	public void msg1()
	{
		System.out.println("hiiiii");
	}
 

	public static void main(String args[]) {
		// TODO Auto-generated method stub
        MultipleInterface obj=new MultipleInterface();
        obj.msg();
        obj.msg1();
	}
	}

 

