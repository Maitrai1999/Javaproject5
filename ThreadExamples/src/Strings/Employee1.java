package Strings;
import java.io.*;
class Employee1{

	public static void main(String[] args) {
        try {
        	FileInputStream fis=new FileInputStream("C:\\Users\\Maitrai Tumulury\\name.txt");
    		ObjectInputStream in =new ObjectInputStream(fis);
    		serzn e= (serzn)in.readObject();
        	System.out.println(e.id+" "+e.name+" "+e.location);
        	in.close();
        }
          catch(Exception e) {
        	  System.out.println(e);
          }
	}

}
