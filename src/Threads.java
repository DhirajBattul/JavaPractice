class Thread1 extends Thread{
	public Thread1(String name) {
		super(name);
	}
	public void run() {
	int i=1;
	while(i<20) {
		if(i%2==0) {
			System.out.println(i);
		}
		
		i++;
	}
	}
}
class Thread2 extends Thread{
	public Thread2(String name) {
		super(name);
	}
	public void run() {
	int i=1;
	while(i<20) {
		if(i%2!=0) {
		System.out.println(i);
		
		}
		i++;
	}
	}
}

class Welcome extends Thread{
	public void run() {
		int i=0;
		while(i<10) {
		System.out.println("Welcome");
		try {
			Welcome.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		}
	}
}
class Hello extends Thread{
	public void run () {
		int i=0;
		while(i<10) {
		System.out.println("hello");
		i++;
	}
	}
}

public class Threads {
public static void main(String[] args) {
	Thread1 t1=new Thread1("felix");
	Thread1 t12=new Thread1("Rob");
	Thread2 t2=new Thread2("Alex");
	//t1.start();
	//t12.start();
	try{
		//t1.join();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	//t2.start();
	
	//System.out.println(t1.getName());
	//System.out.println(t2.getName());
	//System.out.println( "id"+t2.threadId());
	//t1.setPriority(Thread.MIN_PRIORITY);
	
	Welcome w1= new Welcome();
	Hello h1=new Hello();
	
	w1.start();
	h1.start();
	h1.setPriority(1);
	System.out.println(h1.getPriority());
	w1.setPriority(2);
	
}
}

