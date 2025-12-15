import java.util.Scanner;

public class Library {
	private static String[] availableBooks=new String[5];
	private static String[] issuedBooks=new String[5];
	private static int availableCount=0;
	private static int issuedCount=0;
	
	
	public static void addBook(String bookName) {
		if(availableCount<5) {
		availableBooks[availableCount]=bookName;
		availableCount++;	
		System.out.println("book added:"+bookName);
		}
		else {
			System.out.println("Library is full!!!");
		}
	}
	
	public static void issueBook(String bookName) {
		
		 int index=-1;
		 for(int j=0;j<availableCount;j++) {
			 if(availableBooks[j].equals(bookName)) {
			 index=j;
			 break;
			 }
		 }
		 if(index!=-1) {
		issuedBooks[issuedCount]=bookName;
		
		issuedCount++;
		System.out.println("book issued:"+bookName);
		for(int i=index;i<availableCount-1;i++) {
			availableBooks[i]=availableBooks[i+1];
		}
		availableCount--;
		 }
		 else {
			 System.out.println("book not avialable");
		 }
		
	}
	public static void returnBook(String bookName) {
		int index=-1;
		 for(int j=0;j<issuedCount;j++) {
			 if(issuedBooks[j].equals(bookName)) {
			 index=j;
			 break;
			 }
		 }
		 if(index!=-1) {
		availableBooks[availableCount]=bookName;
		
		availableCount++;
		System.out.println("book returned:"+bookName);
		for(int i=index;i<issuedCount-1;i++) {
			issuedBooks[i]=issuedBooks[i+1];
		}
		issuedCount--;
		 }
		 else {
			 System.out.println("book wasnt issued");
		 }
		
	}
	
	 
	 public static void ShowAvailableBooks(){
		 if(availableCount==0) {
			 System.out.println("no books available!!!");
		 }
		 else {
		 for(int i=0;i< availableCount;i++) {
			 System.out.println(availableBooks[i]);
			 
		 }
		 }
	 }
	 public static void ShowIssuedBooks(){
		 if(issuedCount==0) {
			 System.out.println("no book issued!!!");
		 }
		 else {
		 for(int i=0;i< issuedCount;i++) {
			 System.out.println(issuedBooks[i]);
			 
		 }
		 }
	 }
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	
	
	
	int exit=0;
	while(exit==0) {
		System.out.println("enter your choice: 1.addBook  2.issueBook  3.returnBook  4.showAvailableBooks 5.showIssuedBooks 6.exit");
		int choice=sc.nextInt();
	switch(choice) {
	
	case 1:{
		System.out.print("name of the book (single word)to add:");
		String bookToAdd=sc.next();
		addBook(bookToAdd);
		break;
	}
	case 2:{
		if(availableCount==0) {
			System.out.println("no book available to issue!!!");
		}
		else {
		System.out.print("name of the book to issue:");
		String bookToIssue=sc.next();
		issueBook(bookToIssue);
		//ShowBooks();
		}
		break;
		
	}
	case 3:{
		System.out.print("name of the book to return:");
		String bookToReturn=sc.next();
		returnBook(bookToReturn);
		//ShowAvailableBooks();
		break;
	}
	case 4:{
		ShowAvailableBooks();
		break;
	}
	case 5:{
		ShowIssuedBooks();
		break;
	}
	case 6:{
		exit++;
		break;
	}
	 default:
		 System.out.println("invalid choice!! try again");
		 continue;
		
	
	}
	break;
	}
	sc.close();
}
}

