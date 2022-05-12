package Strings;
import java.io.*;
	public class FileReadWrite {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			FileReader input=null;
			FileWriter output=null;
			try {
				input=new FileReader("C:\\Users\\Maitrai Tumulury\\Mike1.txt");
				output=new FileWriter("C:\\Users\\Maitrai Tumulury\\Mytri.txt");
				int contain;
				while((contain=input.read())!=-1) {
					output.write(contain);
				}
			}
			finally {
				if(input!=null) {
					input.close();
				}
				if(output!=null) {
					output.close();
			}

			}
		}
	}


