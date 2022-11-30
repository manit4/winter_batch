import java.util.Set;
import java.util.TreeSet;

//class Human implements Comparable<Human>{
//
//	int height = 1;
//	int iq = 20;
//
//	public int compareTo(Human o) {
//		
//		if(iq < o.iq) {
//			return -1;
//		}
//		else {
//			return 1;
//		}	
//	}
//}
//
//public class Collection_25_11_part3 {
//
//	public static void main(String[] args) {
//
//		Set<Human> humans = new TreeSet<Human>();
//		
//		Human h1 = new Human();    Human h2 = new Human();    Human h3 = new Human();
//		
//		h1.iq = 10;   h2.iq = 8;   		
//		
//		humans.add(h1);    humans.add(h2);    humans.add(h3);
//		
//		for(Human human : humans) {
//			System.out.println(human.iq+", "+human.height);
//		}
//
//	}
//}



//public class Main_25_11_part3 {//if you need any class which needs to be sorted as well as non-duplicate, then go for TreeSet...
//	
//	public static void main(String[] args) {
//		
//		Set<String> names = new TreeSet<String>();
//		
//		names.add("Nisha");   names.add("Sighatullah");
//		names.add("Ryan");    names.add("Odion");
//		names.add("Ryan");
//		
//
//		for(String name : names) {
//			System.out.println(name);
//		}	
//	}
//}

//public class Main_25_11_part3 {//This LinkedHashSet is ordered as well as non-duplicate...
//	
//	public static void main(String[] args) {//HashSet class is unordered however, we have class which will maintain order and the class name is LinkedHashset
//		
//		Set<String> names = new LinkedHashSet<String>();
//		
//		names.add("Nisha");   names.add("Sighatullah");
//		names.add("Ryan");    names.add("Odion");
//		names.add("Ryan");
//		
//
//		for(String name : names) {
//			System.out.println(name);
//		}	
//	}
//}


//public class Main_25_11_part3 {
//	
//	public static void main(String[] args) {
//		
//		Set<String> names = new HashSet<String>();
//		
//		names.add("Nisha");   names.add("Sighatullah");
//		names.add("Ryan");    names.add("Odion");
//		
//		names.get();//calling get() on implementation classes of Set interface is illegal since get(int index) needs index to be called
//					//and Set implementation classes do not maintain index internally...
//		
//		
//	}
//}


//Set interface and its implementation classes say- we maintain non-duplicacy and we are unordered also since they do not maintain index... 
//unordered means, you will get the elements back in the same order in which they were inserted...

//class Human {
//	
//	int height = 1;
//	int iq = 20;
//	
//	public int hashCode() {
//		System.out.println("inside hashCode");
//		return 100;
//	}
//	
//	public boolean equals(Object obj) {
//		
//		Human human = (Human)obj;
//		
//		if(iq == human.iq && height == human.height) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//
//public class Main_25_11_part3 {
//	
//	public static void main(String[] args) {
//		
//		Set<Human> humans = new HashSet<Human>();
//		
//		Human h1 = new Human();   Human h2 = new Human();  Human h3 = new Human();
//		
//		h3.iq = 25;
//		
//		humans.add(h1);   humans.add(h2);   humans.add(h3);
//		
//		for(Human human : humans) {
//			
//			System.out.println(human.iq+", "+human.height);
//		}		
//	}
//}

//public class Main_25_11_part3 {//The very first implementation class of Set interface is HashSet...
//	
//	public static void main(String[] args) {
//		
//		Set<String> names = new HashSet<String>();
//		
//		names.add("Sighatullah");
//		names.add("Sardor");
//		names.add("Nisha");
//		names.add("Manit");
//		names.add("Amanullah");
//		names.add("Ryan");
//		
//		names.add("Nisha");//I am trying to insert "Nisha" again but will end-up getting "Nisha" once since HashSet is the collection class being used if it was ArrayList or any implementation class of
//							//List then you would have got "Nisha" 2 times since List implementation classes do not maintain non-duplicacy...
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
//	}
//}





//import java.util.LinkedList;
//import java.util.List;
//
////LinkedList is another implementation class of List interface which is doubly-linked which means whenever you insert any element
//	//in LinkedList collection, it creates node and node does not hold just data or element but it has 3 sections. First Section 
//		//holds the address to the previous node, second section holds the actual data/element and third section holds the address to the 
//		//next node...
//
//public class Main_25_11_part3 {
//	
//	public static void main(String[] args) {
//		
//		LinkedList<String> names = new LinkedList<String>();
//		
//		names.add("Nisha");
//		names.add("Amanullah");
//		names.add("Ryan");
//		names.add("Yin");
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
//		String name = names.pop();
//		
//		System.out.println("The poped element is "+name);//pop() fetches element and removes also from the LinkedList... 
//		
//		for(String name1 : names) {
//			System.out.println(name1);
//		}
//	}
//}


//public class Main_25_11_part3 {
//	
//	public static void main(String[] args) {
//		
//		LinkedList<String> names = new LinkedList<String>();
//		
//		names.add("Nisha");
//		names.add("Amanullah");
//		names.add("Ryan");
//		names.add("Yin");
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
//		String name = names.peek();//peek() will give you the first element from the LinkedList but does not remove the peeked element from the LinkedList....
//		
//		System.out.println("The peeked element is "+name);
//		
//		for(String name1 : names) {
//			System.out.println(name1);
//		}
//	}
//
//}


//public class Main_25_11_part3 {
//	
//	public static void main(String[] args) {
//		
//		LinkedList<String> names = new LinkedList<String>();
//		
//		names.add("Nisha");
//		names.add("Amanullah");
//		names.add("Ryan");
//		names.add("Yin");
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
//		names.addFirst("Manit");
//		
//		System.out.println("after adding LinkedList specific addFirst()...");
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
//		
//	}
//
//}
