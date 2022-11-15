import java.util.Scanner;

//Exception Handling is made from 2 words, first is "Exception" which is the undesired situation might arise on runtime or while executing your code
// which will lead to alter the normal program flow and second word is "handling" which means to do something or extra work to save your program from 
//crash....


public class ExceptionHandling_1411 {

	public static void main(String[] args) {

		divide();
	}
	
	static void divide() {
		
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any number for Numerator!!");

			int numerator = sc.nextInt();

			System.out.println("Enter any number for Denominator!!");

			int denominator = sc.nextInt();

			int result = numerator/denominator;

			System.out.println("The result is  "+result);
		}
		catch(Exception e) {
			System.out.println("Kindly do not give Denominator as zero!!");
			divide();
		}
	}




//public class ExceptionHandling_1411 {
//
//	public static void main(String[] args) {
//
//		try {//try is a block where I would write the error-prone code
//
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter any number for Numerator!!");
//
//			int numerator = sc.nextInt();
//
//			System.out.println("Enter any number for Denominator!!");
//
//			int denominator = sc.nextInt();
//
//			int result = numerator/denominator;
//
//			System.out.println("The result is  "+result);
//		}
//		catch(Exception e) {//catch is also a block which is used to handle the problem...
//			System.out.println("Kindly do not give Denominator as zero!!");
//			
//			main(null);
//		}
//	}
}


//public class ExceptionHandling_1411 {
//
//	public static void main(String[] args) {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter any number for Numerator!!");
//
//			int numerator = sc.nextInt();
//
//			System.out.println("Enter any number for Denominator!!");
//
//			int denominator = sc.nextInt();
//
//			int result = numerator/denominator;
//
//			System.out.println("The result is  "+result);
//		}
//		catch(Exception e) {
//			System.out.println("inside catch block...");
//			
//			e.printStackTrace();//this is the method which is used to print the Exception details on console....
//
//		}
//	}
//}


//public class ExceptionHandling_1411 {//This is the first program for "Handling" an Exception. So the first rule is -
//									//Always keep your error-prone code in the try block and the try block must be immediately
//									//followed by the catch block. "Immediately" means here, you must not write any statement between
//									//the end of try block and the beginning of catch block...  So catch is the place where you would write
//									//the handling code so that you do not see program crashed unexpectedly...
//	
//	public static void main(String[] args) {
//		
//		try {
//		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter any number for Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Enter any number for Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The result is  "+result);
//		}
//		catch(Exception e) {
//			System.out.println("inside catch block...");
//		}
//	}
//}




//public class ExceptionHandling_1411 {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);//This Scanner is in-built class which is used to take input from the user on runtime
//											//and this class is on "util" package so we need to import it...
//		System.out.println("Enter any number for Numerator!!");
//		
//		int numerator = sc.nextInt();
//		
//		System.out.println("Enter any number for Denominator!!");
//		
//		int denominator = sc.nextInt();
//		
//		int result = numerator/denominator;
//		
//		System.out.println("The result is  "+result);
//	}
//
//}



//public class ExceptionHandling_1411 {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("first statement...");
//		
//		int i = 4/0;//The moment runtime environment finds or encounters any situation which is problematic for the runtime to execute the rest of the program or to go further
//				//, it give-up the control and creates an object of that Exception class which is made dedicatedly for that problematic situation
//				//and keeps all the necessary details in that Exception class object and throws it to someone so that "someone" here I am 
//				//referring "catch" block which we have not discussed. will see in next programs...
//				//So for this program, the problematic situation to the runtime environment is "any number divided by zero", So it give-up
//				// the control to go further executing the rest of the statements then thenext step is to create the Object of ArithmeticException class object and keeps the
//				//necessary details in that ArithemticException class Object such as which line no had the problematic situation, which class and method that problematic situation belong to...
//		
//		System.out.println("second statement ");
//		
//	}
//
//}



//public class ExceptionHandling_1411 {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("first statement...");
//		
//		String name = "Amanullah";
//		
//		char c = name.charAt(10);//I am trying to access the index out of String size or range which is quite probleamtic for the runtime
//environment and it give-up the control and refuses to go further executing the rest if the 
//program statements then creates the Object of dedicated class for this problematic situation
//and the Exception class name is "StringIndexOutOfBoundsException". Once the object is created,
//, then it keeps all the necessary information in the Exception class Object whch will
//help developer to fix the code in future such as which line, which class and which method will be 
//kept in the object as information so developer can easily know the probleatic situation in the program or in the huge project....
//		
//		System.out.println("second statement "+c);
//		
//	}
//
//}
