interface IBMer {
	
	int gravity = 9;//so the variable of an interface is static implicitly. not just static, variables are final also..
					//variables inside the interfaces are public also...
	
	abstract void formalShirt();
	void formalTrousers();
}


public class Main_0711 {

	public static void main(String[] args) {

		System.out.println(IBMer.gravity);//so the variable of an interface is static implicitly and that is why I could access it with the interface name...
		
		IBMer.gravity = 100;//not just variables are static, variables are final also that means you can not update the variable in future..
	}
}



//interface IBMer {
//	
//	abstract void formalShirt();
//	void formalTrousers();
//}
//
//interface IT extends IBMer {//interfaces do not give implementation so interface can extend another interface but interfcae can not 
//							//implement another interface
//	
//	void bachelorDegreeInIT();
//}
//
//interface Finance extends IBMer {//an interface can extend another interface but can not implement another interface....
//	
//	void managementDegreeInAccounting();
//}
//
//class SoftwareDeveloper implements IT {
//	
//	public void bachelorDegreeInIT() {
//		System.out.println("inside bachelorDegreeInIT()");
//	}
//	public void formalShirt() {
//		System.out.println("inside formalShirt()");
//	}
//	public void formalTrousers() {
//		System.out.println("inside formalTrousers");
//	}
//}
//
//class Accountant implements Finance {
//	
//	public void formalShirt() {
//		System.out.println("inside formalShirt()");
//	}
//	public void formalTrousers() {
//		System.out.println("inside formalTrousers");
//	}
//	public void managementDegreeInAccounting() {
//		System.out.println("inside managementDegreeInAccounting()");
//	}
//}
//
//public class Main_0711 {
//
//	public static void main(String[] args) {
//
//		SoftwareDeveloper amanullah = new SoftwareDeveloper();
//		amanullah.bachelorDegreeInIT();  amanullah.formalShirt();   amanullah.formalTrousers();
//		
//		Accountant franklin = new Accountant();
//		franklin.managementDegreeInAccounting();   franklin.formalShirt();    franklin.formalTrousers();
//		
//		IBMer manit = new IBMer();//this is illegal
//		IBMer franklin1 = new SoftwareDeveloper();//as we have seen with the abstract classes that we can not instantiate the 
//											//interface however, we can have the object of implementation class in the reference
//											//variable of interface type
//	}
//}

//interface IBMer {
//	
//	abstract void formalShirt();
//	void formalTrousers();
//}
//
//class SoftwareDeveloper implements IBMer {//class giving implementation should implement the interface.....
//	
//	public void formalShirt() {//so make sure you keep inherited methods in the implementation class as public since it is mandatory ... 
//		System.out.println("inside formalShirt()");
//	}
//	public void formalTrousers() {
//		System.out.println("inside formalTrousers()");
//	}
//	public void laptop() {
//		System.out.println("inside laptop()");
//	}
//}
//
//class ShuttleDriver implements IBMer {
//	
//	public void formalShirt() {//so make sure you keep inherited methods in the implementation class as public since it is mandatory ... 
//		System.out.println("inside formalShirt()");
//	}
//	public void formalTrousers() {
//		System.out.println("inside formalTrousers()");
//	}
//	void bringCar() {
//		System.out.println("inside bringCar()...");
//	}
//}
//
//public class Main_0711 {
//
//	public static void main(String[] args) {
//
//		SoftwareDeveloper odion = new SoftwareDeveloper();
//		
//		odion.formalShirt();  odion.formalTrousers();    odion.laptop();
//		
//		ShuttleDriver manit = new ShuttleDriver();
//		
//		manit.formalShirt();   manit.formalTrousers();     manit.bringCar();
//		
//	}
//}



//interface IBMer {//interfaces are there only to give specifications not the implementation. That means, all the methods are
//				//unimplemented
//	
//	abstract void formalShirt();//keeping the abstract keyword with the methods of an interface is optional since there are implicitly abstract...
//	void formalTrousers();//here. I did not keep the abstract keyword with the method since methods in an interfaces are implicitly abstract...
//	void laptop();	
//}
//
//public class Main_0711 {
//
//	public static void main(String[] args) {
//
//		IBMer odion = new IBMer();//You can not instantiate an interface.....
//	}
//}

//abstract class Car {
//
//	void tyres() {
//		System.out.println("inside tyres()");
//	}
//	void engine() {
//		System.out.println("inside engine of Car");
//	}	
//}
//
//abstract class SUV extends Car {
//	
//	void allWheelDrive() {
//		System.out.println("inside allWheelDrive()");
//	}
//	abstract void highGroundClearance();
//}
//
//class SkodaKausaq extends SUV {
//	
//	void highGroundClearance() {
//		System.out.println("insie highGroundClearance() ");
//	}
//}
//
//class VolkswagonTaigun extends Car {
//	
//	void highGroundClearance() {
//		System.out.println("insie highGroundClearance() ");
//	}
//	
//	
//}
//public class Main_0711 {
//
//	public static void main(String[] args) {
//
//		SkodaKausaq sk = new SkodaKausaq();
//		VolkswagonTaigun vt = new VolkswagonTaigun();
//		
//		SUV suv = new SUV();//this is illegal.... 
//	}
//}



//abstract class Car {//you can declare any class abstract even though the methods in that class are fully implemented in order to
//					//not to be instantiated or to let others not to create objects of that class....
//
//	void tyres() {
//		System.out.println("inside tyres()");
//	}
//
//	void engine() {
//		System.out.println("inside engine of Car");
//	}	
//}
//
//class Polo extends Car {
//
//	void airConditioner() {
//		System.out.println();
//	}
//}
//
//public class Main_0711 {
//
//	public static void main(String[] args) {
//
//		Car c = new Car();//since the class Car is abstract and can  not be instantiated even though all the methods are fully implemented
//		Polo p = new Polo();
//		
//		Car c1 = new Polo();//I am keeping the object of Polo class in the reference variable of abstract class Car which is
//							//quite possible but never ever think of creating the object of any class abstract but
//								//reference variable is possible ....
//	}
//
//}






//abstract class Car {
//
//	void tyres() {
//		System.out.println("inside tyres()");
//	}
//
//	abstract void engine();
//
//	abstract void airConditioner();
//}
//
//abstract class Volkswagon extends Car {
//
//	void engine() {
//		System.out.println("inside engine of Volkswagon");
//	}
//}
//
//class Polo extends Volkswagon {
//
//	void airConditioner() {
//		System.out.println();
//	}
//}
//
//public class Main_0711 {
//
//	public static void main(String[] args) {
//
//		Car c = new Car();// You can not instantiate or create an object of abstract class....
//		Volkswagon v = new Volkswagon();// you can not instantiate Volkswagon since the class is abstract
//		Polo p = new Polo();// the only class which you can instantiate is Polo
//	}
//
//}

//abstract class Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//	abstract void musicSystem();//This method is unimplemented so the class which will extend the class Car will have to give
//						//implementation to all its unimplemented methods or make itself abstract....
//}
//
//class Polo extends Car {//So as you can see Polo is extending the class Car and implementing the only unimplemented method
//					//which is musicSystem()
//	
//	void musicSystem() {
//		System.out.println("inside musicSystem()");
//	}
//	void antiPinchWindow() {
//		System.out.println("inside antiPinchWindow()");
//	}
//}
//
//class Benz extends Car {//Since Benz is extending class Car and is not giving implementation to the only unimplemented method of
//					//class Car and the unimpemented method of class Car is musicSystem()
//	
//	
//	void climateControl() {
//		System.out.println();
//	}
//
//}
//
//public class Main_0711 {
//
//public static void main(String[] args) {
//	
//	Car c = new Car();//You can not instantiate or create an object of abstract class....
//	Polo p = new Polo();
//	Benz b = new Benz();//you can instantiate the Benz class however, I can see the Benz class is implemented not correctly...
//}
//
//}

//abstract class Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//	abstract void musicSystem();
//}
//
//
//public class Main_0711 {
//	
//	public static void main(String[] args) {
//		
//		Car c = new Car();//You can not instantiate or create an object of abstract class....
//	}
//
//}

//abstract is a keyword which is used with either methods or classes. You use abstract keyword with methods either when you do not know or do not want
//to give implementation/body to any method. If any of the methods in a class is abstract then you must declare that class also
//abstract.

//abstract class Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//	abstract void musicSystem();
//}
//
//
//public class Main_0711 {
//	
//	public static void main(String[] args) {
//		
//		
//	}
//
//}
