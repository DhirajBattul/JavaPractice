import java.util.*;


public class Collections {

	public static void main(String[] args) {
/*	ArrayList<String> s1=new ArrayList<>(4);
	ArrayList<String> s2=new ArrayList<>();
	
	s1.add("a");
	s1.add("b");
	s1.add("c");
	s1.add("d");
	s1.add("e"); //we can resize dynamically
	
	s2.add("z");
	s2.add(1,"y");
	s1.addAll(s2);// adds elements of s2 in s1
	s1.remove(0);
	s1.remove("c");
	s1.set(0,"s");// replaces element at the given index
	
//	s2.clear();   clears entire arraylist
	/*System.out.println(s1);
	System.out.println(s1.contains("s"));
	System.out.println(s1.indexOf("d"));
	
	
	
	
	for(int i=0;i<s1.size();i++) {
		System.out.println(s1.get(i)+"-");
	}
	
	LinkedList<String> l1=new LinkedList<>();
	l1.add("ram");
	l1.add("raj");
	l1.addFirst("roy");
	l1.addLast("roj");
	l1.add(1,"rik");
	
	System.out.println(l1);
	System.out.println(l1.peek());
	
	System.out.println(l1.indexOf("ram"));
	
	System.out.println(l1.contains("a"));
	*/
	
	//2d arraylist
	Scanner sc=new Scanner(System.in);
	ArrayList<ArrayList<Integer>> a1=new ArrayList<>();

	for(int i=0;i<2;i++) {
		a1.add(new ArrayList<>());
	}
	System.out.print("add elements:");
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			a1.get(i).add(sc.nextInt());
		}
	}
	System.out.println(a1);
	
}
}
