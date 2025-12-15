import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// while loop
		
		/*char var ='k';
		while(var>='d') {
			System.out.println(var);
			var--;
		}
		
		float i=1.0f;
		while(i<=2f) {
			System.out.println(i);
			i+=0.25f;
			
		}
		
		int i=100;
		while(i<=200) {
			
			if(i%3==0) {
				System.out.println(i);
			}
			i++;
		}
		// sum of n numbers
		int sum=0;
		int a=1;
		while(a<=10) {
			sum+=a;
			
			a++;
		}
		System.out.println(sum);
		
		//factorial 
		System.out.print("enter number:");
		int f=sc.nextInt();
		int i=1;
		int total=1;
		while(i<=f) {
			
			total*=i;
			i++;
		}
		System.out.println(total);
		// Do while loop
		
		int i= 3;   // executes do at least once prior to checking while condition
		do {
			System.out.println(i);
			i++;
		}while(i<2);
		
		int n;
		System.out.println("enter limit:");
		n=sc.nextInt();
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		
		// for loop
		
		
		System.out.print("enter no. of even numbers:");
		int x=sc.nextInt();
		
		for(int i=0; i<x;i++) {
			
			System.out.println(2*i);
		}
		
		
		for(int y=10; y>5;y--) {
			System.out.println(y);
			
			
		}
		
		// break &continue
		System.out.println("enter range");
		int r = sc.nextInt();
		
		for(int t=0;t<r;t++) {
			//System.out.println(t);
			//if(t==r/2) {
			//	System.out.println("midpoint");
				
				
			//}
			if(t==r/2) {
				System.out.println("midpoint");
				continue;
			}
			System.out.println(t);
			
		}
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		//addition of even numbers in given n natural numbers
		System.out.print("enter n:");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n) {
			if(i%2==0) {
			sum+=i;
			
			}
			i++;
		}
		System.out.println(sum);
		
		// addition of first n even numbers
		System.out.print("enter n:");
		int n=sc.nextInt();
		int i=0;
		int sum=0;
		while(i<n) {
			
			sum+= (2*i);
			
			
		i++;
		}
		System.out.println(sum);
		
		
		// multiplication table
		System.out.print("enter n:");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i*n);
			
		}
		
		
		//factorial of given number
		System.out.print("enter n:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
			//or
			//fact= fact*i;
		}
		System.out.println(fact);
		
		
		// sum of multiplication table values sum
		
		System.out.print("enter n:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i*n;
		}
		System.out.println(sum);
		
		
		//array reversing using for loop without changing in memory
		int []num= {0,1,2,3,4};
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}*/
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();	
		
}
}