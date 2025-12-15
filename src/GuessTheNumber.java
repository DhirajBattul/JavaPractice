import java.util.Random;
import java.util.Scanner;



class GuessTheNumber {
	public int comGen;
	int userInput;
	private int noOfGuesses=0;
	
	
	/*public int getNoOfGuesses() {
		return noOfGuesses;
	}
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}*/
	

	public GuessTheNumber() {
		Random random= new Random();
		comGen=random.nextInt(200);
	}
	public void userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your guess:");
		userInput=sc.nextInt();
		
		
	}
	
	public void isCorrect() {
		
		while(userInput!=comGen) {
			userInput();
			 noOfGuesses++;
		
		 if(comGen>userInput) {
			System.out.println("your guess is smaller: try again");
			

			
		}
		else if(comGen<userInput) {
			System.out.println("your guess is greater: try again");
			
				
		}
		else {
			System.out.println("\nwin!!!"+"\nNumber of guesses:"+noOfGuesses);
		
		}
		 
		
	
	}
	}
	

	
	public static void main(String[] args) {

		GuessTheNumber g1=new GuessTheNumber();
		
		
		g1.isCorrect();
				
		
	}

}
