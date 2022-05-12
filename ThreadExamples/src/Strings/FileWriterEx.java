package Strings;
import java.io.*;
class FileWriterEx{
public static void main(String[] args){
try
{
FileWriter fw=new FileWriter("C:\\Users\\Maitrai Tumulury\\MikeWriter.txt");
fw.write("Congrats");
fw.close();
}
catch(Exception e){
System.out.println(e);
}
System.out.println("Success");
}}
