import java.util.ArrayList;
import java.util.List;

//Collection is a framework which  is used to store multiple objects...

//Collection interface sits on top which has all the basic specification which need to be in all the Collection Implementation classes
//such as ArrayList, Vector, LinkedList, HashSet, LinkedHashset, TreeSet...

//The very first Implementation class is ArryList which says I am ordered but not sorted. That means, you will get the elements back
//in the same order in which they were inserted...Not just ArrayList but all the implementation classes of List(I) such as 
//ArrayList, Vector and linkedList...

//public class Collection_22_11_Part1 {
//	
//	public static void main(String[] args) {
//
//		List<int> al = new ArrayList<int>();//I am trying to make collection object as Int generic but found error and the reason is
//												//since Collection says I support collection of objects not primitives such as int, byte
//												//short, boolean, char, float, double, long
//		
//		
//
//		
//	}
//}



//public class Collection_22_11_Part1 {//This program proves Collection supports heterogeneous types of Objects or data. for example,
//										//I am trying to store numbers as well as names which is highly discouraged...
//	
//	public static void main(String[] args) {
//		
//		List al = new ArrayList();//if you notice yellow lines, under every line, depicts warnings but not errors....
//		
//		System.out.println("Before adding elements the size is "+al.size());
//		
//		al.add(10);//if you notice yellow lines, under every line, depicts warnings but not errors....
//		al.add(50);//if you notice yellow lines, under every line, depicts warnings but not errors....
//		al.add(20);//if you notice yellow lines, under every line, depicts warnings but not errors....
//		al.add(15);//if you notice yellow lines, under every line, depicts warnings but not errors....
//		al.add("Franklin");//if you notice yellow lines, under every line, depicts warnings but not errors....
//		al.add("Sardor");//if you notice yellow lines, under every line, depicts warnings but not errors....
//		
//		System.out.println("After adding elements the Size is "+al.size());
//	}
//}


//public class Collection_22_11_Part1 {
//	
//	public static void main(String[] args) {
//		
//		List al = new ArrayList();//even though we can hold the ArrayList object in the reference variable of ArrayList however,
//									//we do not do such as ArrayList al = new ArrayList();. Instead, we hold the object of Arraylist
//									//object in the reference variable of List interface such as List al = new ArrayList();....
//		
//		System.out.println("Before adding elements the size is "+al.size());
//		
//		al.add(10);
//		al.add(50);
//		al.add(20);
//		al.add(15);
//		
//		System.out.println("After adding elements the Size is "+al.size());
//	}
//}



//public class Collection_22_11_Part1 {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();
//		
//		System.out.println("Before adding elements the size is "+al.size());
//		
//		al.add(10);
//		al.add(50);
//		al.add(20);
//		al.add(15);
//		
//		System.out.println("After adding elements the Size is "+al.size());
//	}
//}


//public class Collection_22_11_Part1 {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();//I used  no-arg constructor to create Object of ArrayList
//		
//		System.out.println("Elements present in the ArrayList are "+al.size());//size tells you the number of elements present...
//		
//		
//	}
//
//}
