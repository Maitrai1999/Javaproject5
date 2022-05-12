package Strings;
import java.io.*;
class serzn implements Serializable{
	public static void nd() {
		System.out.println("maitrai");
	}
	int id;
	String name;
	String location;
	serzn(int id,String name,String location){
		this.id=id;
		this.name=name;
		this.location=location;
		System.out.println(id);
		System.out.println(name);
		System.out.println(location);
	}
}
public class Serialization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        serzn body= new serzn(1,"mike","eluru");
        FileOutputStream s=null;
        ObjectOutputStream s1=null;
        try {
        	s=new FileOutputStream("C:\\Users\\Maitrai Tumulury\\name.txt");
        	s1=new ObjectOutputStream(s) ;
        	s1.writeObject(body);
          }catch(FileNotFoundException e) {
        	  e.printStackTrace();
          }catch(IOException e) {
        	  e.printStackTrace();
          }
	}

}
