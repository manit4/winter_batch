
//---------topics covered in this files are- static, multiple classes and a bit of inheritance------------

//class Car {//This is parent class or base class or super class
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//}
//
//class Polo extends Car {//Polo is child class or derived class or sub class
//	
//	void abs() {
//		System.out.println("inside abs()");
//	}
//}
//
//class Benz extends Car {
//	
//	void climateControl() {
//		System.out.println("inside climateControl()");
//	}
//}
//
//public class Main0211 {
//	
//	public static void main(String[] args) {
//		
//	Polo p = new Polo();   p.abs();   p.steeringWheel();//with the help of inheritance, You can call members(variables as well as
//														//methods) of its own class as well as its parent class...
//	
//	Benz b = new Benz();     b.climateControl();      b.steeringWheel();
//		
//	}	
//}



//There is duplicacy in the below program since steeringWheel() is present in both the classes. In order to remove the duplicacy, we should go for inheritance...

//class Polo {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel() of Polo");
//	}
//	void abs() {
//		System.out.println("inside abs()");
//	}
//}
//
//class Benz {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel() of Benz");
//	}
//	void climateControl() {
//		System.out.println("inside climateControl()");
//	}
//}
//
//public class Main0211 {
//	
//	public static void main(String[] args) {
//		
//	Polo p = new Polo();        p.steeringWheel();   p.abs();//these method calls on Polo class object/s are legal since those methods belong to the Polo class...
//	p.climateControl();//calling climateControl on Polo class object/s not legal since climatecontrol() is not declared in Polo class
//	
//	Benz b = new Benz();    b.steeringWheel();   b.climateControl();////these method calls on Benz class object/s are legal since those methods belong to the Benz class...
//	b.abs();//calling abs on Benz class object/s is illegal since abs() is not present or declared in Benz class..
//		
//	}	
//}




//------------------below programs are for multiple classes and the meaning of class----------


//class Human {
//	
//	int height = 1;
//	int mascularStrength = 20;
//	int iq = 10;
//	
//	void studying() {
//		iq++;
//	}
//	
//	void gyming() {
//		mascularStrength++;
//	}
//	
//	void playingBasketball() {
//		height++;
//	}
//}
//
//public class Main0211 {
//	
//	public static void main(String[] args) {
//		
//		Human manit = new Human();
//		Human franklin = new Human();
//		
//		System.out.println(manit.iq);
//		System.out.println(manit.mascularStrength);
//		System.out.println(manit.height);
//		
//		System.out.println(franklin.iq);
//		System.out.println(franklin.mascularStrength);
//		System.out.println(franklin.height);
//		
//		System.out.println("------------------------");
//		
//		manit.studying();
//		
//		franklin.playingBasketball();
//		
//		System.out.println(manit.iq);
//		System.out.println(manit.mascularStrength);
//		System.out.println(manit.height);
//		
//		System.out.println(franklin.iq);
//		System.out.println(franklin.mascularStrength);
//		System.out.println(franklin.height);
//		
//	}	
//}





//class AnotherClass {
//	
//	static int i = 4;
//	
//}
//
//
//public class Main0211 {
//	
//	static int i = 20;
//	
//	public static void main(String[] args) {
//		
//		System.out.println(i);//you can access static variable without mentioning the class name only and only if your execution control
//								//is in the same class to which that static variable belong...
//		System.out.println(AnotherClass.i);//since I wanted to access the static variable of AnotherClass so I had to mention the 
//										//the class name also just to tell the syatem which "i" I wish to access since you can 
//										//have multiple classes having the same variable name in every class and system might get
//										//confused so to clear the confusion or ambiguity we must mention the class name
//		
//		System.out.println(ThirdClass.i);
//	}	
//}
//
//class ThirdClass {
//	
//	static int i = 10;
//}




//class AnotherClass {
//	
//	static int i = 4;
//	
//}
//
//
//public class Main0211 {
//	
//	public static void main(String[] args) {
//		
//		System.out.println(AnotherClass.i);//since you do not need object to call static variable however, make habit of accessing
//										//static variable with the class name....
//	}	
//}
//
//class ThirdClass {
//	
//	static int i = 10;
//}









//class AnotherClass {
//	
//	int i = 4;
//	
//	void greeting() {
//		System.out.println("Hello");
//	}
//}
//
//
//public class Main0211 {
//	
//	public static void main(String[] args) {
//		
//		AnotherClass a1 = new AnotherClass();
//		
//		System.out.println(a1.i);
//		
//		a1.greeting();
//	}	
//}






































//------------------below programs for "static" keyword-----------------


//public class Main0211 {
//	
//	int i = 4;
//	int j = 5;
//	static int k;//since static variables will have one copy and the only copy of variable "k" will be shared across objects 
//	
//	
//	public static void main(String[] args) {
//		
//		Main0211 m1 = new Main0211();
//		Main0211 m2 = new Main0211();
//		
//		m1.add();
//		
//		System.out.println(k);
//		
//		k = 100;
//		
//		m2.add();
//		
//		
//		System.out.println(k);
//	}
//	
//	void add() {
//		
//		k = i + j + k;
//	}
//}




//public class Main0211 {
//	
//	int i = 4;
//	static int j = 5;
//	
//	public static void main(String[] args) {
//		
//		Main0211 m1 = new Main0211();
//		
//		m1.greeting();
//	}
//	
//	void greeting() {
//		
//		System.out.println(i);//static variables as well as non-static variables can be accessed inside non-static method....
//		System.out.println(j);
//	}
//}

//public class Main0211 {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		greeting();//this is legal since caling static method with object is allowed 
//	}
//	
//	static void greeting() {
//		
//		System.out.println(i);//this is illegal since you can access only static variables inside static method.... 
//	}
//}



//public class Main0211 {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		
//	}
//	
//	static void greeting() {
//		
//		System.out.println(i);//this is illegal since accessing non-static variable can be accessed inside static method
//	}
//}


//public class Main0211 {
//	
//	public static void main(String[] args) {
//		
//		greeting();//since the greeting() method is static so I do not need object to call greeting()
//	}
//	
//	static void greeting() {
//		
//		System.out.println("hello");
//	}
//}


//public class Main0211 {
//
//	static int i = 4;//this is static variable and is not given space on objects and has 1 copy per class...
//	int j = 5;//this is non-static variable or instance variable which means the variables given space in object or in instance...
//	
//	public static void main(String[] args) {
//		
//		System.out.println(i);
//		
//		Main0211 main1 = new Main0211();
//		Main0211 main2 = new Main0211();
//		
//		System.out.println(main1.j);
//		System.out.println(main2.j);
//	}
//}


//public class Main0211 {
//
//	static int i = 4;//you can have 2 types of global variable which are instance variable and another is static variable
//					//local variables can't be static. It means, only global variables can be static...
//					//static is a keyword which is used with both methods and with global variable....
//	
//	public static void main(String[] args) {
//		
//		System.out.println(i);
//	}
//}
