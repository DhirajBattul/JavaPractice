
public class Methods {
	
	//parameters are declarations eg: int a , int b
	//arguments are actual values of parameters eg: 1,2,3
	
	
	static int Add(int x,int y) {
		int z;
		z=x+y;
		return z;
	}
	int Sub(int x,int y) {
		int z;
		z=x-y;
		return z;
	}
	
	
	static void Alphabets() {  //void is used when there is nothing to return
		System.out.println("abcdefghijklmnopqrstuvwxyz");
	}
	
	
	
	//method overloading
	static void Display() {
		System.out.println("addition");
	}
	static int Display(int a,int b) {
		
		return a*b;		
	}
	static int Display(int s) {
		
		return s*s;	
	}
	
	
	//varargs
	
	static int Multiply(int...arr) { //can pass as many arguments as we want where arguments will be stored in an array
		int value=1;
		for(int i:arr) {
			value*=i;
		}
		return value;
	}
	static String Concat(String a, String...arr) {// compulsory argument for String a needs to be passed
		String result=a;
		for(String w:arr) {
			result=result.concat(w);
		}
		return result;
	}
	
	
	//recursion
	
	static int fact(int a) {
		if(a==0 || a==1) {
			return 1;
		}
		else {
			return a*fact(a-1);
		}
	}
	
	//without recursion
	static int factloop(int a) {
		if(a==0 || a==1) {//optional
			return 1;
		}
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact*=i;
		}
		return fact;
	}
	
	//multiplication table
	static void MultiTable(int t) {
		for(int i=1;i<=10;i++) {
			System.out.println(t*i);
		}
	}
	
	//star pattern
	static void StarPattern(int r) {
		for(int i=0;i<=r;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
	}
	
	//recursion function for sum of n natural numbers
	static int RecSumNatural(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
		return n+RecSumNatural(n-1);
		}
		    
	}
	//non recursion sum of natural numbers
	static int Rec(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			
		}
		return sum;
	}

	//fibonacci series with recursion  0,1,1,2,3,5,8.....
	static int Fibo(int n) {
		if(n==1 || n==2) {
			return n-1;
		}
		else {
			return Fibo(n-1)+Fibo(n-2);
		}
	}
	public static void main(String[] args) {
		/*int a=1;
		int b=2;
		int c=Add(a,b);// for static method
		System.out.println(c);
		
		Methods obj= new Methods();// for non static method
		int d=obj.Sub(a, b);
		System.out.println(d);
		
		Alphabets();
		
		// method overloading
		
		//int a=1;
		//int b=2;
		System.out.println(Display(1,2));
		System.out.println(Display(2));
		Display();
		
		
		//varargs
		System.out.println(Multiply(1,2));
		System.out.println(Multiply(1,2,3));
		
		
		System.out.println(Concat("g","o","o","d"));
		
		//recursion
		System.out.printf("factorial of %d: " +fact(5),5);
		System.out.println("");
		System.out.printf("factorial of %d: " +factloop(4),4);
		
		MultiTable(4);
		
		StarPattern(6);
		
		int n=RecSumNatural(9);
		System.out.println(n);
		
		int b=Rec(9);
		System.out.println(b);*/
		
		
		int f=Fibo(5);
		System.out.println(f);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
