//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
import java.util.*;
import java.io.*;


public class Streams {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
//		try(InputStreamReader inr=new InputStreamReader(System.in)){
//			System.out.print("enter letters:");
//			int letters=inr.read();
//			while(inr.ready()) {
//				System.out.println((char)letters);
//				letters=inr.read();
//			}
//			inr.close();
//			System.out.println();
//			
//		}catch(IOException e) {
		//System.out.println(e.getMessage());
//		}
		
//		try(FileReader fr=new FileReader("file1.txt")){
//			//System.out.print("enter letters:");
//			int letters=fr.read();
//			while(fr.ready()) {
//				System.out.println((char)letters);
//				letters=fr.read();
//			}
//			fr.close();
//			System.out.println();
//			
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try(BufferedReader br=new BufferedReader(new FileReader("file1.txt"))){
//			while (br.ready()) {
//				System.out.println(br.readLine());
//			}
//		}
//		catch(IOException e) { 
//			System.out.println(e.getMessage());
//		}
//		
//		
//		
//		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
//			System.out.println("you typed: "+br.readLine());
//		}
//		catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		
//		try(OutputStreamWriter osw= new OutputStreamWriter(System.out)) {
//			osw.write("a");
//			osw.write(97);
//			char[]arr="hello".toCharArray();
//			osw.write(arr);
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}

	
//		try(FileWriter fw= new FileWriter("file1.txt",true)) {
//			fw.write("this is second line");
//			fw.write("this is third line");
		
//			
//
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try(BufferedWriter bw=new BufferedWriter(new FileWriter("file1.txt"))){
//			bw.write("this is BufferedWriter1 \n");
//			bw.write("this is BufferedWriter2\n");
//			bw.write("this is BufferedWriter3");
//			}
//		catch(IOException e) { 
//			System.out.println(e.getMessage());
//		}
		
		
		try {
			File f=new File("file2.txt");
			f.createNewFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	
		
	}
}
