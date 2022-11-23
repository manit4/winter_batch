//Wrapper classes were introduced to give Object form/format to primitive data-types....
//Since we have 8 primitive data-types so we gave us 8 Wrapper classes...

//int---Integer
//byte---Byte
//short---Short
//long---Long
//float---Float
//double---Double
//char---Character
//boolean---Boolean


//public class Wrapper_22_11 {
//	
//	public static void main(String[] args) {
//		
//		String value1 = "100";
//		String value2 = "200";
//		System.out.println(value1+value2);
//		
//		
//		int convertedvalue1 = Integer.parseInt(value1);//here I am using parseInt() of Integer class which will convert String into int...
//		int convertedValue2 = Integer.parseInt(value2);
//		
//		System.out.println(convertedvalue1+convertedValue2);
//	}
//}


//public class Wrapper_22_11 {
//	
//	public static void main(String[] args) {
//		
//		int i = 10;
//		int j = 20;
//		
//		System.out.println(i+j);//here I am adding 2 int which is quite possible
//		
//		
//		String value1 = "10";
//		String value2 = "20";
//		
//		System.out.println(value1+value2);//You can not apply arithmetic operation on String/s and if you do, you will end-up appending string/s... 
//		
//		
//		System.out.println(i+value1);//here "i" is int but value1 is not int but string and you will end-up appending int with string since anything goes with String will eventually becomes string...
//	}
//}


//public class Wrapper_22_11 {
//	
//	public static void main(String[] args) {
//		
//		int i = 100;
//		
//		String converted = ""+i;//this statement converts int "i" into String....
//		
//		System.out.println(converted.charAt(2));
//		
//	}
//}




//
//public class Wrapper_22_11 {
//	
//	public static void main(String[] args) {
//		
//		Byte b = 50;
//		
//		System.out.println(b);
//		
//		Character c = 'f';
//		
//		System.out.println(c);
//		
//		Boolean bo = true;
//		
//		System.out.println(bo);
//		
//	}
//}


//class Human {
//	
//	int i = 4;
//	
//	public String toString() {//I am overriding the toString() in Human class in order to see the actual value/s of Object but
//
//		
//		
//		
//		//not the address if someone tries to write reference variable inside sysout...
//		
//		return ""+i;
//	}
//}


//public class Wrapper_22_11 {
//	
//	public static void main(String[] args) {
//		
//		Integer i = 10;//here "i" is reference variable holding the address at which value "10" is saved but if I try to use
//							//the reference variable "i" inside sysout, you get the actual value but not the address to that location
//							//and the reason is Integer class has already overridden toString() in Integer class as String class has overridden...
//							//So the conclusion is "if you write or refer any reference variable in the sysout and you get the actual value/data but not the address
//							//that means, that class(reference variable which you are trying to print) has already overridden the toString() in that class...
//		
//		System.out.println(i);
//		
//		String name = "Sardor";
//		
//		System.out.println(name);
//		
//		Human h1 = new Human();
//	
//		System.out.println(h1);//here I am trying to write the reference variable inside sysout and will end up getting the value/s
//								//of Object "h1" not the address...
//		
//	}
//}



//public class Wrapper_22_11 {
//	
//	public static void main(String[] args) {
//		
//		int i = 10;//here "10" is in primitive data-type form...
//		
//		Integer wv2 = 10;//here "10" is in Wrapper class form or in Object form. This Wrapper form is highly recommended over the below one...
//		Integer wv = new Integer(10);//here also "10" is in Wrapper class form or in Object form...
//		
//		
//	}
//
//}
