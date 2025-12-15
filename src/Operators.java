import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* System.out.println("hello");
     int a=2;
     int b=3;
     int c=a+b;
     
     int x=12;
     int y=6;
     x%=5;//modifies variable acc. to operator
     y+=4;
     
     int w= 3*5-4*8/2*3; //does not follow bodmas but precedence and associativity use brackets 
     int i= 12;
     int j=i++;//i value is stored first in j then incremented
     System.out.println(j);     
     
     int k=++i;//i is first incremented then stored in k
     System.out.println(k);
     
     System.out.println(c);
     System.out.println(x);
     System.out.println(x>1);// can compare variables in sout
     System.out.println(x==y);//checks the comparison given or modifies variables acc to operater
     System.out.println(x!=y);
     System.out.println(x>y && x>1);// And operator:returns true only if all true
     System.out.println(x>1 || y>67);// OR operator : returns true if any one is true
     System.out.println(w);
     
     System.out.println("Enter marks:");
     
     int marks =sc.nextInt();
     marks +=8;
     System.out.println("Encrypted marks:"+marks);
     char grade='A';
     grade =(char) (grade + 5);// typecasting int to char forcefully
     grade += 5;// or can directly modify
     System.out.println(grade);*/
     Scanner sc= new Scanner(System.in);
     System.out.print("enter 1st number:");
     double n1=sc.nextDouble();
     
     System.out.print("enter operator");
     char choice=sc.next().charAt(0);
     
     System.out.print("enter 2nd number:");
     double n2=sc.nextDouble();
     
     
     switch(choice) {
     case '+': {
    	 System.out.println(n1+n2);
    	 break;
     }
     case '-': {
    	 System.out.println(n1-n2);
    	 break;
     }
     case '*': {
    	 System.out.println(n1*n2);
    	 break;
     }
     case '/': {
    	 System.out.println(n1/n2);
    	 break;
     }
     }
     sc.close();
	}

}
