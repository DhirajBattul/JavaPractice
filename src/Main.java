import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	
		
		Scanner sc = new Scanner (System.in);
		/*System.out.print("numer 1:");
		int x = sc.nextInt();
		System.out.print("num2:");
		int y= sc.nextInt();
		int z=x*y;
		System.out.println(z);*/
		
		System.out.println("string:");
		String m = sc.nextLine();
		System.out.println("string1:");
		String n= sc.nextLine();
		String o= m+n;
		System.out.println(o);
		
		
		String str= "i am happy";
		System.out.println(str);
		System.out.println("letter to replace in given string:");
		char a = sc.next().charAt(0);
		System.out.println(" new letter:");
		char b=sc.next().charAt(0);
		String new1 = str.replace(a,b);
		
		System.out.println(new1);
		
		
		
		
		
	}

}
