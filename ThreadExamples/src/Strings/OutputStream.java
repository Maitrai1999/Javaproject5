package Strings;

import java.io.FileOutputStream;

public class OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s=null;
      try {
    	  FileOutputStream fos=new FileOutputStream("C:\\Users\\Maitrai Tumulury\\maitrai1.txt");
    	  s="Developing IO Stream program";
    	  byte b[]=s.getBytes();
    	  fos.write(b);
    	  fos.close();
      }
      catch(Exception e) {
    	  System.out.println(e);
      }
      System.out.println("Data inserted"+"/n"+s);
	}

}
