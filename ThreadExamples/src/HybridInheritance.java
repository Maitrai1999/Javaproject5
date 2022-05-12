class call0
{
	void display()
	{
		System.out.println("calling from A");
	}
}

interface call1
{
	void message();
}
interface call2
{
	void message();
}
class HybridInheritance extends call0 implements call1,call2 {
@Override
    public void message()
    {
	System.out.println("Implemented");
    }
	public static void main(String[] args) {
		HybridInheritance n=new HybridInheritance();
		n.message();
        n.display();
	}

}







