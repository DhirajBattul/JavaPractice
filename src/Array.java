import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;
public class Array {
	public static void main(String[] args) {
		/*int [] id;
		id= new int[3];
		id[0]=1;
		id[1]=2;
		id[2]=3;
		
		String [] name= new String[5];
		name[0]="rahul";
		name[1]="rohit";
		name[2]="rakesh";
		name[3]="raj";
		name[4]="ramesh";
		
		char[] batch={'a','b','c'};
		
		System.out.println(id[0]+" "+name[0]+" "+batch[0]);
		System.out.println(name.length);
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		for(int x:id) {
			System.out.println(x);
		}
		
		
		// 2D arrays
		
		int [][]colony= new int[2][5];
		colony[0][0]=1;
		colony[0][1]=2;
		colony[0][2]=3;
		colony[0][3]=4;
		colony[0][4]=5;
		colony[1][0]=6;
		colony[1][1]=7;
		colony[1][2]=8;
		colony[1][3]=9;
		colony[1][4]=10;
		
		//or
		int [][]colony1={{1,2,3,4,5},{6,7,8,9,10}};
		
		for(int i=0;i<colony.length;i++) {
			for(int j=0;j<colony[i].length;j++) {
				System.out.print(colony[i][j]);
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		
		
		//sum of elements in an array
		int[]score= {5,10,15};
		
		int sum=0;
		for(int i=0;i<score.length;i++) {
		sum= sum+score[i];
		
		}
		System.out.println(sum);
		
		//OR
		
		int[]score1= {5,10,15};
		int sum1=0;
		for(int j:score1) {
			sum1+=j;
		}
		System.out.println(sum1);
		
		
		
		// finding a element in array
		
		int[]item= {1,2,3,4,5};
		boolean found=false;
		for(int i:item) {
			if(i==4) {
				found=true;
				break;
			}
			
		}
		if(found==true) {
			System.out.println("y");
			
		}
		else {
			System.out.println("n");
		}
		
		//average of value of elements in an array
		
		int[]marks= {50,60,70,80,90};
		
		int sum=0;
		for(int i:marks) {
			sum+=i;
		
		}
		
		System.out.println("average:"+sum/marks.length);
		
		//matrix addition
		int [][]m1= {{1,2,3},{1,2,3}};
		int [][]m2= {{9,8,7},{9,8,7}};
		int[][]m3= {{0,0,0},{0,0,0}};
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				m3[i][j]=m1[i][j]+m2[i][j];
				
			}
			
		}
		
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				System.out.print(m3[i][j]+" ");
				m3[i][j]=m1[i][j]+m2[i][j];
				
			}
			System.out.println("");
		}
		
		// reversing array
		int []a= {10,20,30,40,50};
		int l=a.length;
		int n=Math.floorDiv(l, 2); //to find midpoint
		
		for(int i=0;i<n;i++) {
			int temp=a[i];
			a[i]=a[l-1-i];   //l-1-i ->corresponding element to be swapped for i
			a[l-1-i]=temp;
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
		
		
		// max min element in an array
		
		int []a= {100,20,30,403,50};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int e:a) {
			if(e>max) {
				max=e;
			}
		}
		System.out.println(max);
		for(int e:a) {
			if(e<min) {
				min=e;
			}
		}
		System.out.println(min);
		
		
		
		//whether array is sorted or not
		int []a= {10,20,30,40,50};
		boolean Sorted=true;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				Sorted=false;
				break;
			}
			
		}
		if(Sorted) {
			System.out.println("sorted");
		}
		else {
			System.out.println("not sorted");
		}
		
		
		Scanner sc=new Scanner(System.in);
		
		int[]arr1=new int[5];
		System.out.print("enter elements:");
		for(int i=0;i<arr1.length;i++) {
			
			arr1[i]=sc.nextInt();
		}
		
		for(int element:arr1) {
			System.out.print(element+" ");
		}
		
	
		System.out.println(Arrays.toString(arr1));
		
		
		
		String[]s1=new String[5];
		System.out.print("enter elements:");
		for(int i=0;i<s1.length;i++) {
			
			s1[i]=sc.next();
		}
		
		for(String element:s1) {
			System.out.print(element+" ");
		}
		
	
		System.out.println("\n" +Arrays.toString(s1));*/
		
		
		Scanner sc=new Scanner(System.in);
		
		
		int[][] m1=new int [2][2];
		//int[][] m2=new int [2][2];
		System.out.print("enter m1 elements:");
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
	//	System.out.print("enter m2 elements:");
	//	for(int i=0;i<m2.length;i++) {
	//		for(int j=0;j<m2[i].length;j++) {
	//			m2[i][j]=sc.nextInt();
	//		}
	//	}
		System.out.println("elements of m1 are:");
		for(int[] rows:m1) {
				for(int element:rows) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
	
		//System.out.println("elements of m2 are:");
		//for(int rows=0;rows<m2.length;rows++) {
		//	for(int col=0;col<m2[rows].length;col++) {
		//		System.out.print(m2[rows][col]+" ");
		//	}
		//	System.out.println();
		//}
		
		
		/*int [][]m1= {{1,2,3},{4,5,6}};
		
	
		System.out.println(Arrays.toString(m1[1]));
		System.out.println(m1[1][1]);
		for(int i=0;i<m1.length;i++) {
			System.out.println(Arrays.toString(m1[i]));
		}
		
		for(int [] a: m1) {
			System.out.println(Arrays.toString(a));
		}*/
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

