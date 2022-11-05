//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//
//	void tyres() {
//		System.out.println("inside tyres() of car...");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("inside abs()");
//	}
//}
//
//public class Main0311 {
//
//	public static void main(String[] args) {
//		
//
//		Car car = new Car();   Car cp = new Polo();//You can have object of child in the reference variable of parent class....   Polo pc = new Car();//you can't have object of parent class  in the reference variable of Child class... 
//		
//		Polo p1 = new Polo();   Polo p2 = new Polo();  Polo p3 = new Polo();   Polo p4 = new Polo();
//		
//		Car c1 = new Car();   Car c2 = new Car();     Car c3 = new Car();   Car c4 = new Car();
//		
//		Polo[] polos = {p1, p2, p3, p4};//this array can hold only objects of Polo class 
//		
//		Car[] cars = {c1, c2, c3, c4}; //this array is holding objects of class Car but can hold objects of Polo class also...
//		
//		Car[] c = {p1, c1};//this array is holding objects of both Polo and Car class.... 
//	}
//}



//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//
//	void tyres() {
//		System.out.println("inside tyres() of car...");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("inside abs()");
//	}
//}
//
//public class Main0311 {
//
//	public static void main(String[] args) {
//
//		Car c = new Polo();
//		
//		c.steeringWheel();  c.tyres();      c.abs();//calling abs() on reference variable "c" is not legal. The reason is 
//											//- system checks the reference variable type which in our case is Car so it is must
//											//to have abs() in the car class but abs() is not present in class Car and that's
//											//why you get an compilation error...
//	}
//}

//Overriding says if you have same method in parent as well as in child then we call it overriding provided the complete 
//method signature must be same. Method signature means- its return, its argument list and its name must be same in the
//parent as well as in child class...

//why do we go for overriding?
//The answer is- when I do not like some method/s of my parent class and I do not wish to access it child class object. So
//you give your own implementation to the same method in child class...

//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//	
//	void tyres() {//this is over-ridden method.....
//		System.out.println("inside tyres() of car...");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("inside abs()");
//	}
//	
//	void tyres() {//this is overriding method
//		System.out.println("inside tyres() of polo...");
//	}
//}
//
//
//public class Main0311 {
//
//	public static void main(String[] args) {
//
//		Polo p = new Polo();   p.abs();   p.steeringWheel();   p.tyres();
//	}
//}

//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//}
//
//class Polo extends Car {
//
//	void abs() {
//
//		System.out.println("inside abs()");
//	}
//}
//
//public class Main0311 {
//
//	public static void main(String[] args) {
//
//		Polo p = new Polo();//Object of child class is held in the reference variable of child class...
//		Car c = new Car();//Object of Parent class is held in the reference variable of parent class...
//		
//		Car c1 = new Polo();//Object of child class is held in the variable of parent class...
//	}
//}

//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println(i);
//	}
//}
//
//class Polo extends Car {
//	
//	int i = 5;
//	
//	void abs() {
//		
//		int i = 6;
//		
//		System.out.println(i);//this example shows, you can have parent class, child class instance variable and the local variable of child class method with the 
//								//same name but local variable is given preference over everthing....
//								//This program will give you "6" as an output....
//	}
//}

//public class Main0311 {
//	
//	public static void main(String[] args) {
//		
//	   Polo p = new Polo();
//			
//		p.abs();	   
//		
//	}	
//}

//
//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println(i);
//	}
//}
//
//class Polo extends Car {
//	
//	int i = 5;
//	
//	void abs() {
//		System.out.println(super.i);//since variable "i" is present in both parent and child class but you try to access the variable
//								//"i" then child' class variable "i" will be given preference...
//								//However, if I wish to use the parent class version of "i" then we should use another keyword
//								//which is "super"....
//	}
//}
//
//public class Main0311 {
//	
//	public static void main(String[] args) {
//		
//	Polo p = new Polo();
//	
//	p.abs();          
//		
//	}	
//}

//
//class Car {//If you run this program, you would get 5 as an output since variables names in parent and child class are same which is
//				//quite possible but child class variable is given preference in the method of child class
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println(i);
//	}
//}
//
//class Polo extends Car {
//	
//	int i = 5;
//	
//	void abs() {
//		System.out.println(i);//since variable "i" is present in both parent and child class but you try to access the variable
//								//"i" then child' class variable "i" will be given preference...
//								//However, if I wish to use the parent class version of "i" then we should use another keyword
//								//which is "super". will see in the next example... 
//	}
//}
//
//public class Main0311 {
//	
//	public static void main(String[] args) {
//		
//	Polo p = new Polo();
//	
//	p.abs();
//		
//	}	
//}

//
//class Car {
//	
//	int i = 4;//You can have same variable name in the parent as well as in child class... 
//	
//	void steeringWheel() {
//		System.out.println(i);
//	}
//}
//
//class Polo extends Car {
//	
//	int i = 5;
//	
//	void abs() {
//		System.out.println(i);
//	}
//}
//
//public class Main0311 {
//	
//	public static void main(String[] args) {
//		
//	Polo p = new Polo();
//	
//	p.abs();
//		
//	}	
//}

//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println(i);//We can access only variable of its own class since there is no parent of Car class. So I can access only variable
//								//"i" not variable "j" since j is defined in the Polo class and Polo is not the parent class 
//								//of Class Car....
//	}
//}
//
//class Polo extends Car {
//	
//	int j = 5;
//	
//	void abs() {
//		System.out.println(i+j);//We can access the variables of parent class as well as the child class in the method/s of child class
//									//which in this case are "i as well as j"....
//	}
//}
//
//public class Main0311 {
//	
//	public static void main(String[] args) {
//		
//	Polo p = new Polo();
//	
//	p.abs();
//	
//	p.i = 100;     p.j = 200;
//		
//	}	
//}

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
//public class Main0311 {
//	
//	public static void main(String[] args) {
//		
//		Human amanullah = new Human();

//		amanullah.studying();       amanullah.iq = 1000;
//		
//	}	
//}

//class Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//}
//
//class Polo extends Car {
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
//public class Main0311 {
//	
//	public static void main(String[] args) {
//		
//	Polo p = new Polo();   p.abs();    p.steeringWheel();
//	Benz b = new Benz();   b.steeringWheel();   b.climateControl();
//	Main0311 m = new Main0311();
//	Car c = new Car();   c.steeringWheel();
//		
//	}	
//}