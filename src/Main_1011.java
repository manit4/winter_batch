//constructor is used to create an object of any class..
//no-arg constructor is given by default
//constructor name must be as same as class name and must be present in the same class itself. For example, Human constructor/s 
	//must be present in the Human class, Polo class constructor/s must be present in the Polo class....
//Question 1-- since methods and constructors seem same then how to identify whether the member of a class is constructor or method??
	//Answer is--- methods have return-types but constructor does not have return-types....


//class Human {//This is the example of constructor over-loading since I see many constructor with the same name but different parameters list...
//	
//	int iq = 10;
//	int mascularStrength = 20;
//
//	Human(int iq, int mascularStrength) {
//		
//		this.iq = iq;
//		this.mascularStrength = mascularStrength;
//	}
//	
//	Human() {
//		
//	}
//	
//	Human(int iq) {
//		this.iq = iq;
//	}
//}
//
//public class Main_1011 {
//
//	public static void main(String[] args) {
//
//		Human einstein = new Human(35, 60);
//		Human newton = new Human(43, 10);
//		
//		Human manit = new Human();//in the previous example, this statement was illegal since I did not have no-arg constructor
//									//defined manually expecting no-arg constructor will be given to the Human class automatically...
//		
//		Human h1 = new Human(50);//since Im creating object of Human class with parameterized constructor taking only "iq" which will be 
//							//further set to the "iq" instance variable of Object but the mascularStrength is not passed so
//							//the default values decided by the author of the Human class will be given which is 20 ...
//		
//		System.out.println(h1.iq);//since I am 
//		System.out.println(h1.mascularStrength);
//		
//		}
//}



//class Human {
//	
//	int iq = 10;
//	int mascularStrength = 20;
//
//	Human(int value1, int value2) {
//		
//		iq = value1;
//		mascularStrength = value2;
//	}
//}
//
//public class Main_1011 {
//
//	public static void main(String[] args) {
//
//		Human einstein = new Human(35, 60);
//		Human newton = new Human(43, 10);
//		
//		Human manit = new Human();//This is illegal here since no-arg constructor is given by-default only and only if you do not have any other constructor
//								//So here if you notice, there is already parameterized constructor so runtime system will not give you no-arg constructor
//								// by default. So if you need it, you can declare it by yourself....
//								//next program will be for parameterized as well as for no-arg constructor altogether...
//		
//		}
//}




//class Human {
//	
//	int iq = 10;
//	int mascularStrength = 20;
//
//	Human(int value1, int value2) {
//		
//		iq = value1;
//		mascularStrength = value2;
//	}
//}
//
//public class Main_1011 {
//
//	public static void main(String[] args) {
//
//		Human einstein = new Human(35, 60);//here I am creating the object with parameterized constructor that means you can specify the values to the instance variable of
//										//any particular object. That means the default values will be over-written by the new values which you are passing through the parameterized constructor...
//		
//		System.out.println(einstein.iq);
//		System.out.println(einstein.mascularStrength);	
//	}
//
//}



//class Human {//So Human class author has decided to keep the iq to 10 and mascularStrength to 20. So whenever, you create object
//				//with the no-arg constructor then iq as 10 and mascularstrength as 20 will be given every-time with the new object created....  
//
//	int iq = 10;
//	int mascularStrength = 20;
//
//	Human() {//This is no-args or default constructor which is given by default. It is your choice to declare it in most of the 
//					//cases whether to write it or not does not make any difference....
//		System.out.println("inside Human constructor...");
//	}
//
//}
//
//public class Main_1011 {
//
//	public static void main(String[] args) {
//
//		Human h1 = new Human();//Whenever you create object with the no-arg constructor so the values to the instance variables of the object will be as same as the 
//								//values given or initialized to the instance variable at the time of class creation by the author of the class...
//	}
//
//}

//class Human {
//	
//	int iq = 10;
//	int mascularStrength = 20;
//	
//	
//}
//
//
//public class Main_1011 {
//
//	public static void main(String[] args) {
//		
//		Human h1 = new Human();//This is no-arg constructor which is given by default. Why we say no-argument constructor and the 
//							//reason is you do not pass anything in the argument or parenthesis of a constructor....
//	}
//}
