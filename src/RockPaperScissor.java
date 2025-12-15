import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random random= new Random();
		System.out.print("Enter your choice:");
		String uchoice=sc.next();
		String[] choices = {"rock","scissor","paper"};
		String cmove=choices[random.nextInt(3)];
		System.out.println("computer choice "+cmove);
		if (uchoice.equals(cmove)) {
			System.out.println("tie");
		}
		else if(uchoice.equals("rock") && cmove.equals("scissor") ||
				 
				uchoice.equals("scissor") && cmove.equals("paper")||
				uchoice.equals("paper") && cmove.equals("rock")) {
			System.out.println("you win!!!");
		}
		else {
			System.out.println("you lose");
		}	
		
	}

}
