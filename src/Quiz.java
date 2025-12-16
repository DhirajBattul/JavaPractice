import java.util.Scanner;

class Question{
	int id;
	String question;
	String opt1;
	String opt2;
	String opt3;
	String opt4;
	String answer;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOpt1() {
		return opt1;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public String getOpt2() {
		return opt2;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public String getOpt3() {
		return opt3;
	}

	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}

	public String getOpt4() {
		return opt4;
	}

	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.answer = answer;
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}
	
}
public class Quiz {
	
	Question[] questions=new Question[5];
	int score=0;
	Scanner sc= new Scanner(System.in);
	void questionData() {
		questions[0]= new Question(1,"what is A for","Apple","Ball","Cat","Dog","Apple");
		questions[1]= new Question(2,"what is B for","Apple","Ball","Cat","Dog","Ball");
		questions[2]= new Question(3,"what is C for","Apple","Ball","Cat","Dog","Cat");
		questions[3]= new Question(4,"what is D for","Apple","Ball","Cat","Dog","Dog");
		questions[4]= new Question(5,"what is E for","Apple","Ball","Cat","Egg","Egg");
	}
	
	void displayQuestions(){ 
		questionData();
		for (Question q : questions) {
			System.out.println(q.getQuestion());
		}
		
		
		
		
	}
	
	void startQuiz() {
		questionData();
		
		for (Question q : questions) {
			System.out.println(q.getQuestion());
			System.out.println("A: "+ q.getOpt1() );
			System.out.println("B: "+ q.getOpt2() );
			System.out.println("C: "+ q.getOpt3() );
			System.out.println("D: "+ q.getOpt4() );
			
			System.out.print("Enter you answer:");
			String	userAns=sc.nextLine();
			
			checkAnswer(q,userAns);
			
			
		}
		
		displayResult();
	}
	
	
	
		
	void checkAnswer(Question q, String userAns) {
		String correctAns=q.getAnswer();
		
		if(correctAns.equalsIgnoreCase(userAns)) {
			score++;
		}
		
	}
	
	void displayResult() {
		System.out.println("Your score is : "+score);
	}
	

	public static void main(String[] args) {
		Quiz q=new Quiz();
		q.startQuiz();
		
		
	}
}
