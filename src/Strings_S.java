public class Strings_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ways to create string
	/*	String st1= new String();
		String st= "Hello how are you";
		
		st1="HI";
		String st2;
		st2="hi";
		System.out.printf("%s,%s,%s",st,st1,st2);
		System.out.println(st.length());
		//String lcase= st.toLowerCase();
		String ucase= st2.toUpperCase();
		System.out.println(ucase);
		System.out.println(st1.toLowerCase());
		System.out.println(st2.trim());
		System.out.println(st.substring(2));  
		System.out.println(st.substring(1,4));//start index is included end index is excluded
		System.out.println(st.replace('e' ,'a'));
		System.out.println(st.startsWith("He"));
		System.out.println(st.endsWith("He"));
		System.out.println(st.charAt(1));
		System.out.println(st.indexOf("o"));//returns -1 if not found
		System.out.println(st.indexOf("l",3));// searches from given index number
		System.out.println(st.contains("you"));
		System.out.println(st.lastIndexOf("o", 4));
		System.out.println(st1.equals(ucase));
		System.out.println(st1.equalsIgnoreCase(st2));// ignores cases
		
		
		String s3= "Dear <name> welcome";
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name:");
		String name =sc.next();
		s3=s3.replace("<name>",name);
		System.out.println(s3);
		
		String s4 ="  dhiraj battul";
		
		System.out.println(s4.indexOf("  "));
		
		
		sc.close();   
		
		
		
		
		
		
		
		
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("a");
		for(int i=1;i<26;i++) {
			sb.append((char)('a'+i));
		}
				
		System.out.println(sb);
		
		String s="";
		for(int j=0;j<26;j++) {
			char ch=(char)('a'+j);
			s+=ch;
		}
		
		System.out.println(s);
		
		//palindrome
		
	String s="AesSwa";
	s=s.toLowerCase();
	boolean isPalindrome=true;
	for(int i=0;i<=s.length()/2;i++) {
		char start=s.charAt(i);
		char end=s.charAt(s.length()-1-i);
		
			if(start!=end) {
			isPalindrome=false;
				break;
			}
			
		
	}
		if(isPalindrome) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}*/
		
		String s="abcdcba";
		System.out.println(palindrome(s));

	}
		static boolean palindrome(String ss) {
			ss = ss.toLowerCase();
			
			for(int i=0;i<=ss.length()/2;i++) {
				char ch=(char)ss.charAt(i);
				char start=ss.charAt(i);
				char end=ss.charAt(ss.length()-1-i);
				
				if(start!=end) {
					return false;
				}
			}
			return true;
		
	}

}
