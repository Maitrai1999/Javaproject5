interface call
{
	void callback(int param);
}
class client implements call
{
	public void callback(int p)
	{
		System.out.println("callback called with "+p);
	}
}
class client1 implements call
{
	public void callback(int p1)
	{
		System.out.println("callback called with "+p1);
	}
}
public class TestIface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        call c=new client();
        c.callback(423);
        call c1=new client1();
        c1.callback(123);
        
	}

}
