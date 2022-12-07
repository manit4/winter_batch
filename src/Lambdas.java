//Functional interface is used to access Lambdas Expressions and Functional interface can have just 1 abstract method and other 
	//default as well as static methods which are fully implemented... 

interface Arithmatic {
	
	void arrayIterate(int[] array);
}


public class Lambdas {
	
	public static void main(String[] args) {
		
		Arithmatic arithmatic = (arr) ->  {
			
			for(int value : arr) {
				
				if(value % 2 == 0) {
					System.out.println(value + 5);
				}
				else {
					System.out.println(value + 10);
				}
			}
			
		};
		
		int[] array = {34, 56, 43, 13, 32};
		
		arithmatic.arrayIterate(array);
			
	}
}




//interface Arithmatic {
//	
//	void arrayIterate(int[] array);
//}
//
//class Legends implements Arithmatic {
//	
//	public void arrayIterate(int[] array) {
//		
//		for(int value : array) {
//			
//			if(value % 2 == 0) {
//				System.out.println(value + 5);
//			}
//			else {
//				System.out.println(value + 10);
//			}
//		}
//	}
//	
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Arithmatic arithmatic = new Legends();
//		
//		int[] array = {23, 54, 45, 12, 76};
//		
//		arithmatic.arrayIterate(array);
//	}
//}



//interface Cab {
//	
//	String book(String source, String destination);
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = (source, destination) -> { System.out.println("your cab is booked from "+source+ " to "+destination);
//				return "The fare is 70";
//		};
//		
//		String fare = cab.book("New Delhi", "Mumbai");
//		
//		System.out.println(fare);
//	}
//}


//interface Cab {
//	
//	String book(String source, String destination);
//}
//
//class Uber implements Cab {
//	
//	public String book(String src, String dest) {
//		
//		System.out.println("Your cab is booked from "+src+" "+dest);
//		
//		return "The fare is "+70;
//	}
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		
//		String fare = cab.book("New Delhi", "Bangalore");
//		
//		System.out.println(fare);
//	}
//}



//interface Cab {
//	
//	void book(String source, String destination);
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = (src, dest) ->  System.out.println("Your cab is booked from "+src+" to "+dest);
//		
//		cab.book("New Delhi", "Bangalore");
//	}
//}



//interface Cab {
//	
//	void book(String source, String destination);
//}
//
//class Uber implements Cab {
//	
//	public void book(String source, String destination) {
//		
//		System.out.println("Your cab is booked from "+source+" to "+destination);
//	}
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		
//		cab.book("New Delhi", "Bangalore");
//	}
//}



//interface Cab {
//	
//	void book();
//}
//
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = () -> System.out.println("Your cab is booked...");
//		
//		cab.book();
//	}
//}

//-----below code is without Lambdas...

//interface Cab {
//	
//	void book();
//}
//
//class Uber implements Cab {
//	
//	public void book() {
//		System.out.println("Your cab is booked...");
//	}
//}
//
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		
//		cab.book();
//	}
//}



////Functional interface is used to access Lambdas Expressions and Functional interface can have just 1 abstract method and other 
//	//default as well as static methods which are fully implemented... 
//
//
//@FunctionalInterface
//interface Employee {//annotation is used to give more information to the compiler or to your fellow developers...
//	
//	void add();
//	void sub();//this is illegal since sub() is the second abstract method and functional interface can not have more than 1 abstract method... 
//	
//	default void mul() {
//		System.out.println("inside mul()");
//	}
//	
//}
//
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		
//	}
//}
