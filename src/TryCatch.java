import java.util.Scanner;

class NegativeHeightException extends Exception{

	@Override
	public String toString() {
		return "NegativeHeightException";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Height cannot be negative";
	}
	
}
public class TryCatch {
	
	static int division(int a , int b) throws ArithmeticException {
		int c= a/b;
		return c;
	}
	
	static int drivingLicense(int a) throws NegativeHeightException{
		if(a<0) {
			throw new NegativeHeightException();
		}
		if(a<18) {
			System.out.println("not eligible");
		}
		return a;
	}
	public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);
	System.out.print("enter index:");
	int index= sc.nextInt();
	System.out.println("enter upgrade");
	int up=sc.nextInt();
	int [] rank=new int[5];
	rank[0]=1;
	rank[1]=2;
	rank[2]=3;
	
	
	
	try {
		System.out.println("original rank"+rank[index]);
		try {
			System.out.println("updated rank" +(rank[index]-up));
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("inner exception");
		}
	}
	catch (Exception e) {
		System.out.println(e);
		System.out.println("outer exception");
	}
	System.out.println("end");
	
	try{
		int r= division(6,0 );
		System.out.println(r);
	}
	catch (Exception e){
		System.out.println("its an exception");
		
	}
	try {
		int ram= drivingLicense(11);
		
	} catch (NegativeHeightException e) {
		// TODO Auto-generated catch block
		System.out.println("negativeheightexception");
	}*/
	
	
	
	try {
		int w=1/0;
	}
	catch(ArithmeticException e) {
		System.out.println("arithmetic");
	}
	catch(IllegalArgumentException e) {
		System.out.println("argument");
	}
	
}
}
