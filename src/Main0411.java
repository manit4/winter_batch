////--------------instanceof and casting-------------
//
//class Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel() of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of Polo");
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//
//		Polo p1 = new Polo();  Polo p2 = new Polo();
//		Car c1 = new Car();    Car c2 = new Car();
//		
//		Car[] cars = {p1, c1, c2, p2};
//		
//		for(Car c : cars) {
//			
//			c.steeringWheel();
//			
//			if(c instanceof Polo) {
//				Polo castedCarToPolo = (Polo)c;
//				castedCarToPolo.tyres();
//			}
//			
//			
//		}
//	}
//}


//class Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel() of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of Polo");
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//
//		Polo p = new Polo();      
//		
//		Car c = p;//This is up-casting which is automatic....
//		Car c1 = (Car)p;//This is also legal but with explicit casting...
//		
//		Car c2 = new Car();     
//		Polo p = (Polo)c2;//this casting is not possible since you can not keep the object of parent class in the reference variable
//							//of child class
//	}
//}


//class Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel() of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of Polo");
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//
//		Polo p = new Polo();    Car c = new Polo();
//		
//		p.steeringWheel(); p.tyres();     c.steeringWheel();      c.tyres();//calling tyres() on Polo object but kept in 
//																			//Car class reference variable not possible
//		
//		 Polo downcastedPolo = (Polo)c;//This is downcasting
//		 
//		 downcastedPolo.steeringWheel();     downcastedPolo.tyres();
//	}
//}


//class Car {
//	
//	void steeringWheel() {//if your method in the parent class is final, you can not override that method declared final...
//		System.out.println("inside steeringWheel() of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of Polo");
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//
//		Polo p1 = new Polo(); Polo p2= new Polo(); Polo p3 = new Polo();
//		p1.steeringWheel();  p1.tyres();   p2.steeringWheel();  p2.tyres();   p3.steeringWheel();  p3.tyres();
//		//----------previous line was not the right way to call methods on every polo object so I kept it in an array and iterated
//			//the array with "for" loop. Below is the code...
//		
//		Polo[] polos = {p1, p2, p3};
//		
//		for(int i = 0; i < polos.length; i++) {//this iteration is done with the help of classic for-loop
//			polos[i].steeringWheel();
//			polos[i].tyres();
//		}
//		
//		
//		Car c1 = new Car();   Car c2 = new Car();   
//		c1.steeringWheel();    c2.steeringWheel();
//		
//		Car cars[] = {c1, c2};
//		
//		for(Car c : cars) {//this iteration is done with the help of enhanced for-loop...
//			c.steeringWheel();
//		}
//
//	}
//}



//final is a keyword which can be used either with variables(only global variables) or methods or with classes

//class Human {
//	
//	final int iq;//you can not leave any final variable uninitialized....you must provide some value to it.....
//	
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//		
//		
//	}
//}


//class Human {
//	
//	final int iq = 10;//final variables can not be updated....
//					//common example of final variables are pie value, speed of light, gravity value, bank' rate of interest
//	
//	void studying() {
//		iq++;////I am trying to update the variable "iq" which was declared final that means can not be updated.....
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//		
//		Human h = new Human();
//		
//		System.out.println(h.iq);
//		
//		h.iq = 100;//you can not update variable "iq" since "iq" is declared final 
//		
//		System.out.println(h.iq);
//	}
//}



//final class Human {//if you make any class final then no class can extend or sub-class the final class 
//	
//	int iq = 10;
//	int mascularStrength = 20;
//	
//	void studying() {
//		iq++;
//	}
//	void gyming() {
//		mascularStrength++;
//	}
//}
//
//class SuperHuman extends Human {//This is illegal since Human class is final and final classes can not be extended...
//	
//	void fly() {
//		System.out.println("Humans has started flying in the form of SuperHuman");
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//		
//		Human manit = new Human();   manit.studying();   manit.gyming();
//		
//		SuperHuman aman = new SuperHuman();    aman.studying();   aman.gyming();     aman.fly();
//	}
//}


//class Car {
//	
//	final void steeringWheel() {//if your method in the parent class is final, you can not override that method declared final...
//		System.out.println("inside steeringWheel() of Car");
//	}
//}
//
//class Polo extends Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of Polo");
//	}
//	void steeringWheel() {//this overriding is not legal since steeringWheel() in parent class is declared final
//		System.out.println("inside steeringWheel() of Polo");
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//
//		Polo p = new Polo();     p.tyres();     p.steeringWheel();
//
//	}
//}


//class ArithmeticOperations {//In overloading, we must have multiple methods with the same name but with different parameter's list
//							//return-types can be changed, it does not need to be same or different....
//
//	int add(int firstNumber, int secondNumber) {
//
//		System.out.println(firstNumber + secondNumber);
//		return firstNumber+secondNumber;
//	}
//
//	void add(int firstNumber, int secondNumber, int thirdNumber) {
//
//		System.out.println(firstNumber + secondNumber+thirdNumber);
//	}
//	void add(int firstNumber, int secondNumber, boolean status) {
//		System.out.println("The addition is "+(firstNumber+secondNumber) +" and the status is "+status );
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//
//		ArithmeticOperations ap = new ArithmeticOperations();
//
//		ap.add(100, 200, 300);
//		
//		ap.add(50, 10, false);
//
//	}
//}


//class ArithmeticOperations {//In overloading, we must have multiple methods with the same name but with different parameter's list
//							//return-types can be changed, it does not need to be same or different....
//
//	void add(int firstNumber, int secondNumber) {
//
//		System.out.println(firstNumber + secondNumber);
//	}
//
//	void add(int firstNumber, int secondNumber, int thirdNumber) {
//
//		System.out.println(firstNumber + secondNumber+thirdNumber);
//	}
//	void add(int firstNumber, int secondNumber, boolean status) {
//		System.out.println("The addition is "+(firstNumber+secondNumber) +" and the status is "+status );
//	}
//	void add(int firstNumber, int secondNumber, Human human) {
//		System.out.println("Human state is "+human.iq+", and the mascularStrength is "+human.mascularStrength+", and the addition of"
//				+ " 2 numbers is "+(firstNumber+secondNumber));
//	}
//}
//
//class Human {
//	
//	int iq = 10;
//	int mascularStrength = 20;
//	
//	void studying() {
//		iq++;
//	}
//	void gyming() {
//		mascularStrength++;
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//
//		ArithmeticOperations ap = new ArithmeticOperations();
//
//		ap.add(100, 200, 300);
//		
//		ap.add(50, 10, false);
//		
//		Human manit = new Human();
//		
//		ap.add(10, 15, manit);
//
//	}
//}

//class ArithmeticOperations {//In overloading, we must have multiple methods with the same name but with different parameter's list
//							//return-types can be changed, it does not need to be same or different....
//
//	void add(int firstNumber, int secondNumber) {
//
//		System.out.println(firstNumber + secondNumber);
//	}
//
//	void add(int firstNumber, int secondNumber, int thirdNumber) {
//
//		System.out.println(firstNumber + secondNumber+thirdNumber);
//	}
//	void add(int firstNumber, int secondNumber, boolean status) {
//		System.out.println("The addition is "+(firstNumber+secondNumber) +" and the status is "+status );
//	}
//}
//
//public class Main0411 {
//
//	public static void main(String[] args) {
//
//		ArithmeticOperations ap = new ArithmeticOperations();
//
//		ap.add(100, 200, 300);
//		
//		ap.add(50, 10, false);
//		
//
//	}
//}
