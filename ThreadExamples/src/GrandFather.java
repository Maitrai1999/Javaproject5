interface Son{
	public static void message() {
}
}
interface Daughter{
	public static void message1() {
}
}
class Father implements Son,Daughter {
    public static void message1()
{
	System.out.println("daughter");
}
public static void message()
    {
	System.out.println("son");
    }
public static void father() 
{
	System.out.println("father");
}
}
public class GrandFather extends Father {
	public static void main(String[] args) {
		GrandFather gf=new GrandFather();
		gf.message1();
        gf.message();
        gf.father();
	}
}






