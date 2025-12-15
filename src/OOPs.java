

class Car{
	String driver;
	int id;
	int mileage;
	int speed;
	
	public void getDetails() {
		System.out.println("driver name:"+driver);
		System.out.println("car id:"+id);
		
	}
	
	public void getMileage() {
		System.out.println(mileage);
		
	}
	public int getSpeedLimit(){
		return speed;
	}
	public void setDriver(String n) {
		driver=n;
	}
	
	
}



class Laptop{
	public void edit() {
		System.out.println("editing");
	}
	public void code() {
		System.out.println("coding");
	}
	public void store() {
		System.out.println("storing");
	}
}


class Sqaure{
	int side;
	
	public int Area() {
		
		return side*side;
	}
	public int Perimeter() {
		
		return 4*side;
	}
}


class Rectangle{
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle() {
		length=4;
		breadth=8;
		
	}

	public int Area() {
		
		return length*breadth;
	}
	public int Perimeter() {
		
		return 2*(length+breadth);
	}
	public void whichIsGreater() {
		if(Area()>Perimeter()) {
			System.out.println("area is greater");
		}
		else if(Area()==Perimeter()) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("perimeter is greater");
		}
	}
}


//getter setter

class Student{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name = name;
	}
	
}

// constructors

	class Mobile{
		private int price;
		private String model;
		private int storage;
		
		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}
		public int getStorage() {
			return storage;
		}

		public void setStorage(int storage) {
			this.storage = storage;
		}

		public Mobile(int Mprice, String Mmodel) {
			price=Mprice;
			model=Mmodel;
		}
		//overloading can be done in constructors
		
		public Mobile() {
			price=10000;
			model="Mi";
		}
		public Mobile(int Mstorage) {
			storage=Mstorage;
		}
	}
	
	class Cylinder{
		private int radius;
		private int height;
		
		
		public Cylinder(int radius, int height) {
			super();
			this.radius = radius;
			this.height = height;
		}
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		
		public float surfaceArea() {
			return 2*3.14f*radius*(height+radius);
		}
		public double volume() {
			return Math.PI*radius*radius*height;     
		}
		
	}

	class Sphere{
		private	int  radius;

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}

		public  Sphere(int radius) {
			this.radius=radius;			
		}
		public double volume() {
			return (4.0/3.0)* 3.142*radius*radius*radius ;
		}
		
	}
	
	// inheritance
	
	class Vehicle{
		String model;
		int regNo;
		String brand;
		Vehicle(String model, int regNo, String brand) {
			
			this.model = model;
			this.regNo = regNo;
			this.brand = brand;
			
			
		}
		public void getDetails(){
			System.out.println(model);
			System.out.println(regNo);
			System.out.println(brand);
		}
		 
		
		
	}
	class Truck extends Vehicle{
		int noOfWheels;
		int capacity;
		 Truck(String model, int regNo, String brand, int noOfWheels, int capacity) {
			super(model, regNo, brand);
			this.noOfWheels = noOfWheels;
			this.capacity = capacity;
			
		}
		 @Override
		 public void getDetails(){
			 	super.getDetails();
				System.out.println(noOfWheels);
				System.out.println(capacity);
		 }
		
		
		
}
	
	class Bike extends Vehicle{
		int cc;
		String type;
		public Bike(String model, int regNo, String brand, int cc, String type) {
			super(model, regNo, brand);
			this.cc = cc;
			this.type = type;
			
			
		}
		@Override
		public void getDetails(){
			super.getDetails();
			System.out.println(cc);
			System.out.println(type);
		}
		 
	}
	class Base{
		Base(){
			System.out.println("this is base");
		}
	}
	class Derived extends Base{
		Derived(){
			System.out.println("this is derived");
		}
	}
	
	//Dynamic method dispatch
	
	class Animal{
		public void noise() {
			System.out.println("animal makes noise!!!");
		}
		public void hasBrain() {
			System.out.println("animal has brain");
		}
		
	}
	class Dog extends Animal{
		@Override
		public void noise(){
			System.out.println("dog barks!!");
		}
		public void domestic() {
			System.out.println("dog is domestic");
		}
	}
	
	
	class Circle{
		public int radius;
		
		public Circle(int radius) {
			
			this.radius = radius;
		}
		double areaOfCircle() {
			return Math.PI*radius*radius;
		}
		double perimeterOfCircle(){
			return 2*Math.PI*radius;
		}
		
	}
	class Cylinder1 extends Circle{
		public int height;
		
	
		
		public Cylinder1(int radius, int height) {
			super(radius);
			this.height = height;
		}
		double surfaceArea() {
			return 2*3.14f*radius*(height+radius);
	}
		double volume() {
			return Math.PI*radius*radius*height;
		}
		
	}
	
	
	//Abstraction
	abstract class Parent{
		
		abstract void delivery() ;
	}
	
	class Amazon extends Parent{
		@Override
		public void delivery() {
			System.out.println("amazon delivery is done by ekart");
		}
	}
	class Flipkart extends Parent{
		@Override
		public void delivery() {
			System.out.println("flipkart delivery is done by bluedart");
		}
	}
	
	
	
	//Interfaces
	
	interface Car1{
		int tires=4;
		void engine(int a);
		void seater(int b);
		
	}
	
	class Hyundai implements Car1{
		public void engine(int hp) {
			System.out.println("Hyundai has "+hp+" hp eninge");
		}
		public void seater(int seats) {
			System.out.println("Hyundai has "+seats+" seats");
		}
	}
	
	
	//Polymorphism
	
	interface lonavala{
		String[] places();
		
		void tripToLonavala();
	}
	interface materan{
		void tripToMateran();
	}
	interface mahabaleshwar{
		void tripToMahabaleshwar();
	}
	
	class Bus1 implements lonavala,materan,mahabaleshwar{
		public String[] places( ){
		
			String[] place= {"villa","waterpark","treaking"};
			return place;
		}
		public void tripToLonavala() {
			System.out.println("going to lonavala");
		}
		public void tripToMateran() {
			System.out.println("going to materan");
		}
		public void tripToMahabaleshwar() {
			System.out.println("going to mahabaleshwar");
		}
	}
	
	
	//practice
	
	abstract class Pen{
		abstract void write();
		 abstract void refill(); 
		
	}
	
	class FountainPen extends Pen{
		public void write() {
			System.out.println("writing");
		}
		public void refill() {
			System.out.println("refilling");
		}
		public void changeNib() {
			System.out.println("changing nib");
		}
	}
	
	
	interface BasicAnimal{
		void eat();
		void sleep();
	}
	
	class Monkey implements BasicAnimal{
		void jump(){
			System.out.println("jumping");
		}
		void bite() {
			System.out.println(" biting");
		}
		@Override
		public void eat() {
			System.out.println("monkey eats");
			
		}
		@Override
		public void sleep() {
			System.out.println("monkey sleeps");
			
		}
	}
	
	class Human extends Monkey implements BasicAnimal{
		public void eat() {
			System.out.println("Human eating");
		}
		public void sleep() {
			System.out.println("Human sleeping");
		}
		public void write() {
			System.out.println("writing");
		}
	
		
	}
	
public class OOPs {
	public static void main(String[] args) {
		
		//about class car
		/*Car maruti= new Car();
		Car honda= new Car();
		Car toyota=new Car();
		
		maruti.driver="rahul";
		maruti.id=1;
		maruti.mileage=20;
		maruti.speed=80;
		
		honda.driver="rajesh";
		honda.id=2;
		honda.mileage=15;
		honda.speed=100;
		
		toyota.driver="ramesh";
		toyota.id=3;
		toyota.mileage=10;
		toyota.speed=120;
		
		
		maruti.getDetails();
		maruti.getMileage();
		int speed=maruti.getSpeedLimit();
		System.out.println("speed limit is:"+speed);
			
		honda.getDetails();
		honda.getMileage();
		
		toyota.getDetails();
		toyota.getMileage();
		toyota.setDriver("rishi");
		toyota.getDetails();
		
		
		//about class laptop
		
		Laptop mac= new Laptop();
		
		mac.code();
		mac.edit();
		mac.store();
		
		
		//about class square	
		Sqaure s1=new Sqaure();
		
		s1.side=6;
		
		System.out.println(s1.Area());
		System.out.println(s1.Perimeter());
			
		
		//about class rectangle
		
		Rectangle r1=new Rectangle();
		
		r1.length=6;
		r1.breadth=4;
		
		System.out.println(r1.Area());
		System.out.println(r1.Perimeter());
		
		r1.whichIsGreater();	
		
		//getter setter
		
		
		Student ertan=new Student();
		
		ertan.setId(23);
		System.out.println(ertan.getId());
		
		ertan.setName("ertan");
		System.out.println(ertan.getName());
		
		
		//constructors
		
		Mobile samsung=new Mobile(12000,"Samsung M10");
		Mobile mi=new Mobile();
		samsung.setStorage(24);
		
		System.out.println(samsung.getModel());
		System.out.println(samsung.getPrice());
		System.out.println(samsung.getStorage());
		
		System.out.println(mi.getModel());
		System.out.println(mi.getPrice());
		
		
		Cylinder c1=new Cylinder(4,5);
		//c1.setRadius(4);
		//c1.setHeight(5);
		
		System.out.println(c1.surfaceArea());
		System.out.println(c1.volume());
		

		Rectangle r1=new Rectangle();
		System.out.println(r1.Area());
		System.out.println(r1.Perimeter());
		
		Rectangle r2=new Rectangle(8,16);
		System.out.println(r2.Area());
		System.out.println(r2.Perimeter());
		
		
		Sphere s1=new Sphere(4);
		System.out.println(s1.volume());
		
		
		Truck t1=new Truck();
		t1.setBrand("tata");
		t1.setModel("Signa");
		t1.setRegNo(111);
		t1.setCapacity(20);
		t1.setNoOfWheels(10);
		
		
		System.out.println(t1.getBrand());
		System.out.println(t1.getModel());
		System.out.println(t1.getRegNo());
		System.out.println(t1.getCapacity());
		System.out.println(t1.getNoOfWheels());
		
		Bike b1=new Bike();
		b1.setBrand("re");
		b1.setModel("himalaya");
		b1.setRegNo(222);
		b1.setCc(350);
		b1.setType("mountain");
		
		
		System.out.println(b1.getBrand());
		System.out.println(b1.getModel());
		System.out.println(b1.getRegNo());
		System.out.println(b1.getCc());
		System.out.println(b1.getType());
		
		//Derived d=new Derived();
		
		Truck t1=new Truck("a",1,"b",2,3);
		Bike b1=new Bike("d",4,"f",222,"road");
		
		b1.getDetails();
		
		Animal a1= new Dog();
		a1.noise();
		//a1.domestic();       explicit methods of subclass are not allowed	
		
		Cylinder1 c=new Cylinder1(2,3);
		
		System.out.println(c.surfaceArea());
		
		Parent a1=new Amazon();
		Parent f1=new Flipkart();
		Amazon a2=new Amazon();
		//Parent p1=new Parent();  abstract class object cannot be created but methods can be inherited
		
		a1.delivery();
		f1.delivery();
		a2.delivery();
		
		Hyundai elantra=new Hyundai();
		elantra.engine(250);
		elantra.seater(5);
		System.out.println("no. of tires "+elantra.tires);
		
		
		Bus1 b1=new Bus1();
		b1.tripToLonavala();
		String[] p=b1.places();
		for(String i:p) {
			System.out.println(i);
		}
		b1.tripToMahabaleshwar();
		b1.tripToMateran();
		
		lonavala l1=new Bus1();
		l1.tripToLonavala();
		//l1.tripToMateran();    cannot call method of another interface when creating a object of class referring interface
		
		FountainPen pen1=new FountainPen();
		pen1.refill();*/
		
		Human h1=new Human();
		h1.bite();
		h1.eat();
		h1.sleep();
		h1.jump();
		
		Monkey m1=new Human();
		m1.bite();
		m1.jump();
		m1.sleep();
		//m1.write();    polymorphism where reference cannot use child explicit methods
		
		BasicAnimal b=new Human();
		//b.bite();  reference interface cannot use methods of class
		//b.write();
		b.sleep();
		
	} 
	
}

