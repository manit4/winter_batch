//import java.util.Scanner;
//
//public class ExcptionHandling_15_11_Part2 {
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
//
//			String[] names = {"Nisha", "Bruce", "Amanullah"};
//
//			System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//
//			int indexArray = sc.nextInt();
//
//			String name = names[indexArray];
//
//			System.out.println("The name is "+name);
//
//			System.out.println("Enter the index of name of which you wish to fetch the character!!");
//
//			int indexString = sc.nextInt();
//
//			char ch = name.charAt(indexString);
//
//			System.out.println("The Fetched character is "+ch);
//		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("inside catch of Exception...");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside catch of ArithException...");
//		}
//		catch (StringIndexOutOfBoundsException e) {//This is also illegal since we already have catch block with parent Exception class.... 
//			System.out.println("inside catch of IndexOutOfBoundsException....");
//		}
//		
//	}
//}

//public class ExcptionHandling_15_11_Part2 {
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
//
//			String[] names = {"Nisha", "Bruce", "Amanullah"};
//
//			System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//
//			int indexArray = sc.nextInt();
//
//			String name = names[indexArray];
//
//			System.out.println("The name is "+name);
//
//			System.out.println("Enter the index of name of which you wish to fetch the character!!");
//
//			int indexString = sc.nextInt();
//
//			char ch = name.charAt(indexString);
//
//			System.out.println("The Fetched character is "+ch);
//		}
//		catch (Exception e) {
//			System.out.println("inside catch of Exception...");
//		}
//		catch (ArithmeticException e) {//This catch block is illegal since any Exception raised inside the try block will be 
//										//already caught by the above catch so the control will never look for the child classes for handling Exception/s
//										//In short, you can not have any catch block with the parent Exception class before child Exception class
//											//since sequence matters if you have multiple catch blocks ...
//			System.out.println("inside catch of ArithException...");
//		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("inside catch of IndexOutOfBoundsException....");
//		}
//		
//	}
//}



//public class ExcptionHandling_15_11_Part2 {
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
//
//			String[] names = {"Nisha", "Bruce", "Amanullah"};
//
//			System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//
//			int indexArray = sc.nextInt();
//
//			String name = names[indexArray];
//
//			System.out.println("The name is "+name);
//
//			System.out.println("Enter the index of name of which you wish to fetch the character!!");
//
//			int indexString = sc.nextInt();
//
//			char ch = name.charAt(indexString);
//
//			System.out.println("The Fetched character is "+ch);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside catch of ArithException...");
//		}
//		catch (IndexOutOfBoundsException e) {//This catch block will catch or handle both StringIndexOutOfBounds as well as 
//											//ArrayIndexOtOfBoundsException object so the following catch block after this current catch  
//											//block will never be used so it is useless for our current program...
//			System.out.println("inside catch of IndexOutOfBoundsException....");
//		}
//		catch (Exception e) {
//			System.out.println("inside catch of Exception...");
//		}
//	}
//}


//public class ExcptionHandling_15_11_Part2 {
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
//
//			String[] names = {"Nisha", "Bruce", "Amanullah"};
//
//			System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//
//			int indexArray = sc.nextInt();
//
//			String name = names[indexArray];
//
//			System.out.println("The name is "+name);
//
//			System.out.println("Enter the index of name of which you wish to fetch the character!!");
//
//			int indexString = sc.nextInt();
//
//			char ch = name.charAt(indexString);
//
//			System.out.println("The Fetched character is "+ch);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("inside catch of ArithException...");
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("inside catch of StringIndexExxception....");
//		}
//		catch (Exception e) {//Since I do not have any catch block for the ArrayIndexOutOfBoundsException so this catch block will 
//							//catch the ArrayIndexOutOfBoundsException object thrown from the try block but not ArithmeticException or 
//							//StringIndexoutOfBoundsException object since they will have already caught by their own catch blocks...
//			System.out.println("inside catch of Exception...");
//		}
//	}
//}


//public class ExcptionHandling_15_11_Part2 {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			divide();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of Arith..");
//			divide();
//		}
//		catch(StringIndexOutOfBoundsException e) {
//			System.out.println("inside catch of Stringindex..");
//			
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside catch of ArrayIndex..");
//			arrayAccess();
//		}
//	}
//
//	static void divide() {
//
//		Scanner sc = new Scanner(System.in);
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
//
//		arrayAccess();
//	}
//
//	static void arrayAccess() {
//
//		Scanner sc = new Scanner(System.in);
//
//		String[] names = {"Nisha", "Bruce", "Amanullah"};
//
//		System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//
//		int indexArray = sc.nextInt();
//
//		String name = names[indexArray];
//
//		System.out.println("The name is "+name);
//
//		charAccess(name);
//	}
//
//	static void charAccess(String name) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the index of name of which you wish to fetch the character!!");
//
//		int indexString = sc.nextInt();
//
//		char ch = name.charAt(indexString);
//
//		System.out.println("The Fetched character is "+ch);	
//	}
//}


//public class ExcptionHandling_15_11_Part2 {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			divide();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of Arith..");
//		}
//		catch(IndexOutOfBoundsException e) {
//			System.out.println("inside catch of index..");
//		}
//	}
//
//	static void divide() {
//
//		Scanner sc = new Scanner(System.in);
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
//
//		arrayAccess();
//	}
//
//	static void arrayAccess() {
//
//		Scanner sc = new Scanner(System.in);
//
//		String[] names = {"Nisha", "Bruce", "Amanullah"};
//
//		System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//
//		int indexArray = sc.nextInt();
//
//		String name = names[indexArray];
//
//		System.out.println("The name is "+name);
//
//		charAccess(name);
//	}
//
//	static void charAccess(String name) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the index of name of which you wish to fetch the character!!");
//
//		int indexString = sc.nextInt();
//
//		char ch = name.charAt(indexString);
//
//		System.out.println("The Fetched character is "+ch);	
//	}
//}


//public class ExcptionHandling_15_11_Part2 {//This program might generate 3 different types of Exceptions and try is being followed
//											//by only 2 catch blocks. One catch block to handle the ArithmeticException of raised and
//											//another catch block(with IndexOutOfBoundsException) is written to handle if any of the Exception raised such as
//											//StringIndexOutOfBoundsException or ArrayIndexOutOfBoundsException since IndexOfOboundsExceptiuon class is the parent
//											//class of both StringIndexOutOfBoundsException and ArrayIndexOutOfBoundsException...
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
//			
//			String[] names = {"Nisha", "Bruce", "Amanullah"};
//			
//			System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//			
//			int indexArray = sc.nextInt();
//			
//			String name = names[indexArray];
//			
//			System.out.println("The name is "+name);
//			
//			System.out.println("Enter the index of name of which you wish to fetch the character!!");
//			
//			int indexString = sc.nextInt();
//			
//			char ch = name.charAt(indexString);
//			
//			System.out.println("The Fetched character is "+ch);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of ArithmeticException e...");
//			
//			main(null);
//		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("inside catch of IndexOfBoundsException...");
//			
//			main(null);
//		}
//	}	
//}

//public class ExcptionHandling_15_11_Part2 {
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
//			
//			String[] names = {"Nisha", "Bruce", "Amanullah"};
//			
//			System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//			
//			int indexArray = sc.nextInt();
//			
//			String name = names[indexArray];
//			
//			System.out.println("The name is "+name);
//			
//			System.out.println("Enter the index of name of which you wish to fetch the character!!");
//			
//			int indexString = sc.nextInt();
//			
//			char ch = name.charAt(indexString);
//			
//			System.out.println("The Fetched character is "+ch);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of ArithmeticException e...");
//			
//			main(null);
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("inside catch of StringIndexOutOfBoundsException...");
//			main(null);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside catch of ArrayIndexOutOfBoundsException ...");
//			
//			main(null);
//		}
//	}	
//}


//public class ExcptionHandling_15_11_Part2 {
//
//	public static void main(String[] args) {
//
//		divide();
//	}
//
//	static void divide() {
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
//
//			arrayAccess();
//		}
//		catch(Exception e) {
//			System.out.println("Kindly do not give Denominator as zero!!");
//			divide();
//		}
//	}
//
//	static void arrayAccess() {
//
//		try {
//			Scanner sc = new Scanner(System.in);
//
//			String[] names = {"Nisha", "Bruce", "Amanullah"};
//
//			System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//
//			int indexArray = sc.nextInt();
//
//			String name = names[indexArray];
//
//			System.out.println("The name is "+name);
//			
//			charAccess(name);
//		}
//		catch(Exception e) {
//			System.out.println("inside catch of arrayAccess method...");
//			arrayAccess();
//		}
//	}
//
//	static void charAccess(String name) {
//
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.println("Enter the index of name of which you wish to fetch the character!!");
//
//			int indexString = sc.nextInt();
//
//			char ch = name.charAt(indexString);
//
//			System.out.println("The Fetched character is "+ch);	
//		}
//		catch (Exception e) {
//			
//			System.out.println("inside catch of charAccess()...");
//			
//			charAccess(name);
//		}
//	}
//}




//public class ExcptionHandling_15_11_Part2 {
//	
//	public static void main(String[] args) {
//
//		divide();
//	}
//	
//	static void divide() {//This program has the tendency to generate 3 different types of Exceptions...
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
//			
//			String[] names = {"Nisha", "Bruce", "Amanullah"};
//			
//			System.out.println("Kinldy give the index of names array which you would like to fetch!!");
//			
//			int indexArray = sc.nextInt();
//			
//			String name = names[indexArray];
//			
//			System.out.println("The name is "+name);
//			
//			System.out.println("Enter the index of name of which you wish to fetch the character!!");
//			
//			int indexString = sc.nextInt();
//			
//			char ch = name.charAt(indexString);
//			
//			System.out.println("The Fetched character is "+ch);
//		}
//		catch(Exception e) {
//			System.out.println("Kindly do not give Denominator as zero!!");
//			divide();
//		}
//	}
//}


