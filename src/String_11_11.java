//String is a class in which you are given many methods to apply on certain String object holding certain data...
//String class is in-built class and is kept in the java.lang package
//We can create object of String class by 16 different ways (15 ways with the help of "new" keyword and last one is by String literal
//or I would say without new "keyword" for e.g. String name = "Amanullah";


public class String_11_11 {
	
	public static void main(String[] args) {
	
		String name1 = "Bruce";
		
		String name2 = "Amanullah";
		
		String name3 = new String("Bruce"); 
		
		System.out.println(name1.equals(name3));
		
		System.out.println(name1.equals(name2));
	}
}


//public class String_11_11 {//here I am checking the addresses again but objects are created with String literal....
//	public static void main(String[] args) {
//	
//		String name1 = "Bruce";
//		
//		String name2 = "Amanullah";
//		
//		String name3 = "Bruce"; 
//		
//		System.out.println(name1 == name3);//it will return true since both name1 and name3 will point to the same location because of memory share in Sting-pool area......
//		
//		System.out.println(name1 == name2);//will return false;
//	}
//}


//public class String_11_11 {//below is the example of checking addresses if they are pointing to the same location and we created objects with constructors and object are created on Heap memory area and they do not share memory also in Heap...
//	//next example is to check what would happen if I create the same 3 String objects with String literal but not with the constructor...
//	public static void main(String[] args) {
//	
//		String name1 = new String("Bruce");
//		
//		String name2 = new String("Amanullah");
//		
//		String name3 = new String("Bruce"); 
//		
//		System.out.println(name1 == name3);//you will get false as output since name1 and name3 are holding only addresses even though both the variables are holding same data as "Bruce" but we are comparing just addresses not the data...
//		
//		System.out.println(name1 == name2);//will get false...
//	}
//}




//public class String_11_11 {
//	
//	public static void main(String[] args) {
//	
//		String name = "Bruce";//since "name" variable here is the reference variable which is holding the address of the location of String-pool. So,
//							//if I try to refer/write the reference variable inside the sysout so I should get the address printed however, I will get the actual data printed which is "Bruce"
//							//since toString() is overridden in the String class also and is overridden in such a way so that if anyone writes 
//							//string variable in the sysout so it should get the actual data printed not the address....
//		
//		System.out.println(name);
//			
//	}
//}


//public class String_11_11 {
//	
//	public static void main(String[] args) {
//	
//		String name1 = "Bruce";
//		
//		String name2 = "Amanullah";
//		
//		String name3 = "Yin";
//		
//		String name4 = "Amanullah"; 
//		
//		name2.substring(1);//name2 is still pointing to object holding "Amanullah". If you think, name2 should point-out to the 
//							//substring you fetched, then you must assign the fetched substring in the reference variable name2 manually..below is the 
//							//example of manual assignment of fetched substring to the reference variable name2... 
//		System.out.println(name2);
//		
//		name1 = name1.substring(2);
//		
//		System.out.println(name1);	
//	}
//}



//public class String_11_11 {
//	
//	public static void main(String[] args) {
//	
//		String name = "Bruce";//I am creating object with String literal and the object is created in String-Pool area...
//		String name1 = new String("Amanullah");//I am creating String object with constructor and the object of String is created in Heap memory area...
//	}
//}




//public class String_11_11 {
//	
//	public static void main(String[] args) {
//	
//		String name = "Bruce";
//		
//		boolean status = name.startsWith("Br");
//		
//		System.out.println("I am checking whether String name holding 'Bruce' starts with 'Br' or not " +status);
//		
//		boolean status1 = name.endsWith("e");
//		
//		System.out.println("I am checking whetehr String name is ending with 'e' or not "+status1);
//		
//		boolean status2 = name.startsWith("A");//since "A' is not present, you will get false
//		
//		System.out.println("i am trying to find whether Strinmg name is starting with 'A' or not "+status2);
//		
//	}
//}




//public class String_11_11 {
//	
//	public static void main(String[] args) {
//		
//		String name = "Amanullah";
//		
//		System.out.println("The characater present at index no 4 is "+name.charAt(4));//I should get "u" as an output since the string' index starts from 0. If
//																					//you ask for the 4 index character so you will get the 5th character from the start since the index of String starts with "0"....
//		
//		//----------------------------------indexOf()--------------
//		
//		int index = name.indexOf('m');//character 'm' is at the second position or I would say the index no 1 since the index starts from 0...
//		
//		System.out.println("The index of character 'm' is "+index);
//		
//		//--------what if I want to find the character which is not even present in the whole string-------
//		
//		int index1 = name.indexOf('x');
//		
//		System.out.println("The index of character x is "+index1);//you will get "-1" if the character you wish to find index of is not present in the whole string....
//	}
//}


//public class String_11_11 {
//	
//	public static void main(String[] args) {
//		
//		char[] c = {'N', 'i', 's', 'h', 'a'};
//		
//		String name = new String(c);//this is another constructor which is used to convert the array into String and the constructor present in the String class API is ----- public java.lang.String(char[])
//									//once the char[] is converted into string with the help of the constructor, after that you can play around with the converted String data which once was in char[] format...
//		
//		System.out.println(name.length());
//	}
//}




//public class String_11_11 {
//	
//	public static void main(String[] args) {
//		
//		String str = "";
//		
//		System.out.println("Checking whether str is empty or not "+str.isEmpty());//will get true since I do not have anything in str not even space...
//		
//		String str1 = " ";
//		
//		System.out.println("Checking whether str1 is empty or not "+str1.isEmpty());//will get false since I have space in str1....
//	}
//}


//public class String_11_11 {
//	
//	public static void main(String[] args) {
//		
//		String str = "";
//		
//		System.out.println("The length of str is "+str.length());//will get "0" as an output...
//		
//		String str1 = " ";
//		
//		System.out.println("The length of sr1 is "+ str1.length());//will get 1 as an output...	
//	}
//}


//
//public class String_11_11 {
//	
//	public static void main(String[] args) {
//		
//		String str = "Amanullah";
//		
//		System.out.println("The length of str is "+str.length());
//		
//		String str1 = " Amanullah";//If you notice, there is a space right before name "Amanullah" and space itself is considered as character. So if you find the number of characters present, you will get 10 not 9 since space itself is character...
//		
//		System.out.println(str1.length());//will get 10 as output of this statement since space in "str1" is considered as character...
//	}
//}


//public class String_11_11 {
//	
//	public static void main(String[] args) {
//		
//		String name1 = new String("Amanullah");//if you create String object with new keyword then String object will be created in
//											//the "Heap" memory area....
//		
//		System.out.println("The size or the number of characters present are "+name1.length());
//		
//		String sentence = "I am learning java here since ast 11 days in which we started with the primitive data-types, operators, control statements, loops such as while loop, for loop etc... ";
//		
//		System.out.println("The senetence length or the characters present in the sentence are "+sentence.length());
//	}
//}
