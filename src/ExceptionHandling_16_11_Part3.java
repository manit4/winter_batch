import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class AgeNot18Exception extends RuntimeException {
	
}


public class ExceptionHandling_16_11_Part3 { 

	public static void main(String[] args) throws IOException {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("kindly enter your Age!!");
			
			int age = sc.nextInt();
			
			if(age >= 18) {
				System.out.println("You are allowed..");
			}
			else {
				throw new AgeNot18Exception();
			}
	}
}




//public class ExceptionHandling_16_11_Part3 { 
//
//	public static void main(String[] args) throws IOException {
//
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("kindly enter your Age!!");
//			
//			int age = sc.nextInt();
//			
//			if(age >= 18) {
//				System.out.println("You are allowed..");
//			}
//			else {
//				throw new ArithmeticException();//here I am manually throwing the Exception with the throw keyword but throwing
//											//ArithmeticException is not good since ArithmeticException is booked already for the situation
//											// when you try to divide any number by zero...
//			}
//	}
//}


//never ever forget, Exceptions come/occur on runtime or when we execute the program... 
//We have 2 types of Exceptions, first those which are under the RuntimeException class such as ArithmeticException, NullPointer etc and the code which might
//generate these types of Exceptions are not mandatory to keep it inside the try and catch block. Second type of Exception is-
//those which are not under RuntimeException class but under the EXception class directly need to be kept inside the 
//try and catch block or simple words "you have to handle that". Below is the code for CompiletimeException since
//keeping the code inside the try and catch was mandatory otherwise, you will get compile-time error with red-lines in your code
//All the file reading-writing operation code or database related code requires try and catch block... 






//public class ExceptionHandling_16_11_Part3 { 
//
//	public static void main(String[] args) throws IOException {
//
//			readData();		
//		
//	}
//
//	static void readData() throws IOException {
//
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\first.txt");
//
//		FileReader reader = new FileReader(file);	
//
//		System.out.println((char)reader.read());	
//	}
//}


//public class ExceptionHandling_16_11_Part3 { 
//
//	public static void main(String[] args) {
//
//				readData();	
//	}
//	
//	static void readData() {
//		
//		try {
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\first.txt");
//
//			FileReader reader = new FileReader(file);	
//
//			System.out.println((char)reader.read());	
//		}
//		catch (Exception e) {
//			System.out.println("inside catch block...");
//			e.printStackTrace();
//		}
//		
//	}
//}



//public class ExceptionHandling_16_11_Part3 {//this code belongs to "throws" keyword i.e. especially in technical language "declared to be thrown" 
//
//	public static void main(String[] args) throws IOException {
//
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\first.txt");
//
//			FileReader reader = new FileReader(file);	
//
//			System.out.println((char)reader.read());		
//	}
//}



//public class ExceptionHandling_16_11_Part3 {
//
//	public static void main(String[] args) {
//
//		try {
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\first.txt");
//
//			FileReader reader = new FileReader(file);	
//
//			System.out.println((char)reader.read());
//		}
//		catch (Exception e) {
//			System.out.println("inside catch block...");
//			e.printStackTrace();
//		}
//	}
//}




////"finally" is a keyword and a block which will execute every time whether Exception is raised or not...
////you can have try with catch block/s only....
////you can have try with both catch and finally block...
////you can have try either with catch or finally also....
////You can not have try alone...
//
//public class ExceptionHandling_16_11_Part3 {//This program shows how " how try becomes illegal without catch or finally block"...
//	
//	public static void main(String[] args) {
//		
//		try {
//			System.out.println("I am trying to get connection from the remote machine...");
//			
//			System.out.println("I am trying to open the file");
//			
//			System.out.println("I am trying to read data from the opned file...");
//			
////			System.out.println("I am trying to close the file once the data is read...");
////
////			System.out.println("I am trying to return the connnection back..");
//		}
//		catch(Exception e) {
//			
////			System.out.println("I am trying to close the file once the data is read...");
////
////			System.out.println("I am trying to return the connnection back..");
//						
//			e.printStackTrace();	
//		}
//		
//		finally {
//			
//			System.out.println("I am trying to close the file once the data is read...");
//			System.out.println("I am trying to return the connnection back..");
//		}
//	
//	}
//}



//public class ExceptionHandling_16_11_Part3 {//This program shows how " try comes with only finally block"...
//	
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Enter the Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The Result is "+result);
//		}
//		finally {//try with finally only...
//			System.out.println("inside fianlly block...");
//		}
//		
//	
//	}
//}




//public class ExceptionHandling_16_11_Part3 {//This program shows how " try comes with both catch and finally blocks"...
//	
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the Numerator!!");
//			
//			int numerator = sc.nextInt();
//			
//			System.out.println("Enter the Denominator!!");
//			
//			int denominator = sc.nextInt();
//			
//			int result = numerator/denominator;
//			
//			System.out.println("The Result is "+result);
//		}
//		//System.out.println("in-between try and catch block");//writing anything in-between try and catch block is illegal...
//		catch(Exception e) {//catch will execute only and only if any Exception is raised in the try block...
//			
//			System.out.println("inside catch...");
//			e.printStackTrace();
//		}
//		//System.out.println("writing in-between catch and finally block...");//writing anything in-between catch and finally is also illegal...
//		finally {//finally will execute every time whether any Exception is raised in the try block or not...
//			System.out.println("inside fianlly block...");
//		}
//		
//	
//	}
//}




//class ArithOperations {
//	
//	int i = 5;
//	
//	void print() {
//		
//		System.out.println("The value of i is "+i);
//	}
//}
//
//
//public class ExceptionHandling_16_11_Part3 {//NullPointerException raised on runtime if you try to access any member on reference
//											//variable pointing to null...
//	
//	public static void main(String[] args) {
//		
//		ArithOperations ao = new ArithOperations();
//		
//		System.out.println(ao.i);
//		
//		ao.i = 100;
//		
//		ao.print();
//		
//		ao = null;//only reference variable/s can be assigned to null not primitive variable/s....
//		
//		System.out.println(ao.i);//This statement will lead to NullPointerException since I am trying to access the value of i
//								//on reference variable which is pointing to null...
//	}
//
//}
