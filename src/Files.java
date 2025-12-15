import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) {
		
		
		File a=new File("a.txt");
		try {
			a.createNewFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter 	w= new FileWriter("a.txt");
			w.write("this is a.txt");
			w.close(); 
			Scanner sc= new Scanner(a);
			while(sc.hasNextLine()) {
				String line=sc.nextLine();
				System.out.println(line);
				
				
			}
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 