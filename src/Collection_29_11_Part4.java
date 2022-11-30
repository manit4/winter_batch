
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Human1 implements Comparable<Human1>{
	
	int iq = 10;
	int mascularStrength = 25;
	int height = 1;
	
	@Override
	public int compareTo(Human1 o) {
		
		if(mascularStrength < o.mascularStrength) {
			return -1;
		}
		else {
			return 1;
		}
	}

}

public class Collection_29_11_Part4 {

	public static void main(String[] args) {
		
		List<Human1> names = new ArrayList<Human1>();
		
		Human1 h1 = new Human1();    Human1 h2 = new Human1();    Human1 h3 = new Human1();
		
		names.add(h1);   names.add(h2);    names.add(h3);   h1.mascularStrength = 100;
		
		for(Human1 human : names) {
			System.out.println(human.iq+", "+human.mascularStrength+", "+human.height);
		}
		
		Collections.sort(names);
		
		System.out.println("---------------");
		
		for(Human1 human : names) {
			System.out.println(human.iq+", "+human.mascularStrength+", "+human.height);
		}
	}
}


//class Human1 {
//
//	int iq = 10;
//	int mascularStrength = 25;
//	int height = 1;
//
//}
//
//public class Collection_29_11_Part4 {
//
//	public static void main(String[] args) {
//		
//		List<Human1> names = new ArrayList<Human1>();
//		
//		Human1 h1 = new Human1();    Human1 h2 = new Human1();    Human1 h3 = new Human1();
//		
//		names.add(h1);   names.add(h2);    names.add(h3);
//		
//		for(Human1 human : names) {
//			System.out.println(human.iq+", "+human.mascularStrength+", "+human.height);
//		}
//		
//		Collections.sort(names);//This is illegal since I am trying to give list which is not sortable as of now since list
//									//holding Human1 class object which is little hard for the system to know how and on what basis, it should sort the list holding Human1 objects... 
//	}
//}
//
////public class Collection_29_11_Part4 {
////
////	public static void main(String[] args) {
////		
////		List<String> names = new ArrayList<String>();
////		
////		names.add("Nisha");
////		names.add("Amanullah");
////		names.add("Franklin");
////		names.add("Bruce");
////		
////		for(String name : names) {
////			System.out.println(name);	
////		}
////		
////		System.out.println("----------sorted list after calling Collections.sort()");
////		
////		Collections.sort(names);//since list is unordered but if you want list to give-up its by default behavior as ordered and be sorted then
////								//use Collections.sort(list). sort() takes list which you wish to sort and this method is static also...
////		
////		for(String name : names) {
////			System.out.println(name);	
////		}
////		
////		System.out.println("----------reverse list---------");
////		
////		Collections.reverse(names);//reverse does not give the list in descending order, it basically returns you the list in reverse order of the current list status...
////									//here in this program, you will get the list in descending order since you called the reverse on the sorted list(ascending order)...
////		
////		for(String name : names) {
////			System.out.println(name);	
////		}
////	}
////}
//
//
////-------------Below program Sorting is done in descending order since I replaced "<" to ">"....
//
////class Human1 implements Comparable<Human1>{//Comparable is an interface holding method compareTo(object obj)...
////	
////	int iq = 10;
////	int mascularStrength = 25;
////	int height = 1;
////	
////	public int compareTo(Human1 human) {
////		System.out.println("inside");
////		if(iq > human.iq) {
////			return -1;
////		}
////		else {
////			return 1;
////		}
////	}	
////}
////
////class AnotherHumanSort implements Comparator<Human1> {//Comparator is another interface holding compare(Obj o1, Object o2). This 
////														//interface is used when you want to sort any class object with another property. For example,
////														//if you notice, AnotherhumanSort class is telling system to sort on the basis of mascularStrength property
////														// since Human1 class object is already sorted on the basis of iq. Like this,
////														//you can give as many sorting definitions to any class... 
////
////	
////	public int compare(Human1 o1, Human1 o2) {
////		
////		if(o1.mascularStrength > o2.mascularStrength) {
////			return -1;
////		}
////		else {
////			return 1;
////		}
////	}
////}
////
////class HumanSortHeight implements Comparator<Human1> {
////
////	
////	public int compare(Human1 o1, Human1 o2) {
////		
////		if(o1.height < o2.height) {
////			return -1;
////		}
////		else {
////			return 1;
////		}
////	}
////
////}
////
////public class Collection_29_11_Part4 {
////
////	public static void main(String[] args) {
////		
////		Set<Human1> humans = new TreeSet<Human1>(new HumanSortHeight());//here at the time of TreeSet object, I am telling system to sort on the basis of Height since
////																		//HumanSortHeight object is passed in the TreeSet constructor and HumanSortheight class defines sorting on the
////																		//basis of height attribute/property...
////		
////		Human1 h1 = new Human1();    Human1 h2 = new Human1();   Human1 h3 = new Human1();
////		
////		h2.mascularStrength = 7; h2.iq = 100; h2.height = 4;  h3.mascularStrength = 9;    h3.iq = 60;   h1.height = 2;
////		
////		humans.add(h1);    humans.add(h2);   humans.add(h3);
////		
////		for(Human1 human : humans) {
////			System.out.println(human.iq+", "+human.mascularStrength+", "+human.height);
////		}
////	}
////}
//
////-------------Below program Sorting is done in ascending order since I have "<" sign in compareTo() and compare()....
//
////class Human1 implements Comparable<Human1>{//Comparable is an interface holding method compareTo(object obj)...
////	
////	int iq = 10;
////	int mascularStrength = 25;
////	int height = 1;
////	
////	public int compareTo(Human1 human) {
////		System.out.println("inside");
////		if(iq < human.iq) {
////			return -1;
////		}
////		else {
////			return 1;
////		}
////	}	
////}
////
////class AnotherHumanSort implements Comparator<Human1> {//Comparator is another interface holding compare(Obj o1, Object o2). This 
////														//interface is used when you want to sort any class object with another property. For example,
////														//if you notice, AnotherhumanSort class is telling system to sort on the basis of mascularStrength property
////														// since Human1 class object is already sorted on the basis of iq. Like this,
////														//you can give as many sorting definitions to any class... 
////
////	
////	public int compare(Human1 o1, Human1 o2) {
////		
////		if(o1.mascularStrength < o2.mascularStrength) {
////			return -1;
////		}
////		else {
////			return 1;
////		}
////	}
////}
////
////class HumanSortHeight implements Comparator<Human1> {
////
////	
////	public int compare(Human1 o1, Human1 o2) {
////		
////		if(o1.height < o2.height) {
////			return -1;
////		}
////		else {
////			return 1;
////		}
////	}
////
////}
////
////public class Collection_29_11_Part4 {
////
////	public static void main(String[] args) {
////		
////		Set<Human1> humans = new TreeSet<Human1>(new HumanSortHeight());//here at the time of TreeSet object, I am telling system to sort on the basis of Height since
////																		//HumanSortHeight object is passed in the TreeSet constructor and HumanSortheight class defines sorting on the
////																		//basis of height attribute/property...
////		
////		Human1 h1 = new Human1();    Human1 h2 = new Human1();   Human1 h3 = new Human1();
////		
////		h2.mascularStrength = 7; h2.iq = 100; h2.height = 4;  h3.mascularStrength = 9;    h3.iq = 60;   h1.height = 2;
////		
////		humans.add(h1);    humans.add(h2);   humans.add(h3);
////		
////		for(Human1 human : humans) {
////			System.out.println(human.iq+", "+human.mascularStrength+", "+human.height);
////		}
////	}
////}
////
////class Human1 implements Comparable<Human1>{
////	
////	int iq = 10;
////	int mascularStrength = 25;
//	
//	public int compareTo(Human1 human) {
//		System.out.println("inside");
//		if(iq < human.iq) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
//	}	
//}
//
//public class Collection_29_11_Part4 {
//
//	public static void main(String[] args) {
//		
//		Set<Human1> humans = new TreeSet<Human1>();
//		
//		Human1 h1 = new Human1();    Human1 h2 = new Human1();    Human1 h3 = new Human1();
//		
//		h2.iq = 20;    h3.iq = 15;
//		
//		humans.add(h1);   humans.add(h2);     humans.add(h3);
//		
//		for(Human1 human : humans) {
//			System.out.println(human.iq+", "+human.mascularStrength);
//		}	
//	}
//}
