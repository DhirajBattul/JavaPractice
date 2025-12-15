 import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*int English=sc.nextInt();
		int Maths=sc.nextInt();
		int Science=sc.nextInt();
		int totalmarks=English+Maths+Science;
		float percentage=(totalmarks/300.0f)*100.0f;
		System.out.println(percentage);
		
		
		
		if( English>33 && Science>33 && Maths>33 && percentage>40f ) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		int score=5;
		int penalty=3;
		if(score>2 && penalty<2) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
		if(score>2 || penalty<2) {
		System.out.println("win");}
		else {
			System.out.println("lose");
		}
		int height=sc.nextInt();
		
		if (height>12) {
			System.out.println("yes");
		}
		else if(height>10) {
			System.out.println("no");
		}
		else {
			System.out.println("x");
		}*/
		System.out.println("enter choice");
		int choice=sc.nextInt();
		
		
		switch(choice){
		case 1:{
			System.out.println("ur choice 1");
			break;
		}
		case 2:{
			System.out.println("ur choice 2");
			break;
		}
		case 3:{
			System.out.println("ur choice 3");
			break;
		}
		default:{
			System.out.println("err");
			
		}
			
		}
		/*
		System.out.println("enter salary");
		float salary=sc.nextFloat();
		float tax = 0;
		if(salary>250000 && salary<500000) {
			 tax=tax +(salary-250000f)*0.05f;
			
			
		}
		else if(salary>500000 && salary<1000000) {
			tax= tax+ 0.05f*(500000f-250000f);
			tax=tax+ 0.2f*(salary-500000f);
			
			
		}
		else if(salary>=1000000) {
			tax= tax+ 0.05f*(500000f-250000f);
			tax=tax+ 0.2f*(1000000f-500000f);
			tax=tax+ 0.3f*(salary-1000000f);
			
			
		}
		
		System.out.println("your tax"+tax);
		System.out.println("enter website");
		String website =sc.next();
		
		if (website.endsWith(".com")) {
			System.out.println("Commmercial website");
		}
		if (website.endsWith(".org")) {
			System.out.println("Organization website");
		}
		if (website.endsWith(".in")) {
			System.out.println("Indian website");
		}
		else {
			System.out.println("Not valid");
		}*/
		
		sc.close();
	}
	

}
