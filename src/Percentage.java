import java.util.Scanner;

class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		//Percentage
		System.out.println("Students marks: ");
		System.out.println("English:");
		double English = sc.nextDouble();
		System.out.println("Maths:");
		double Maths = sc.nextDouble();
		System.out.println("Science:");
		double Science = sc.nextDouble();
		double total= English+Maths+Science;
		
		
		double percentage=(total/300)*100;
	    System.out.println("Percentage is:"+percentage +"%" );
		
		//Conversion kms to miles
		/*System.out.println("enter kms:");
		double kms=sc.nextDouble();
		double miles= kms/1.60934;
		System.out.println("miles:"+miles);*/
	    System.out.println("Weather is good and fresh");
	    System.out.println("Weather is good \n and fresh");// adds newLine in print stmt
	    System.out.println("Weather is good \\ and fresh");// adds \ in print stmt
	    System.out.println("Weather is good \" and fresh");// adds " in print stmt
	    System.out.println("Weather is good \' and fresh");// adds ' in print stmt
		System.out.println("Shripad");

	    sc.close(); 
	}

}
