import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map is used to save data in key and value pair and is not under Collection interface unlike List, Set and Queue...

public class Collection_30_11_part5 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Nisha");    map.put(6, "Manit");    map.put(5, "Odion");    map.put(4, "Ryan");
		map.put(3, "Ronnie");   map.put(2, "Sardor");
		
		
		Set<Integer> set = map.keySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Integer key = (Integer)it.next();
			
			System.out.println(map.get(key));
		}
		
	}
}



//public class Collection_30_11_part5 {
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> map = new Hashtable<Integer, String>();
//
//		map.put(1, "Nisha");    map.put(2, "Amanullah");    map.put(3, "Odion");    map.put(4, "Ryan");
//		
//		Set<Integer> set = map.keySet();
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			Integer key = (Integer)it.next();
//			
//			System.out.println(map.get(key));
//		}
//		
//	}
//}


//public class Collection_30_11_part5 {
//
//	public static void main(String[] args) {
//
//		Set<Integer> ids = new HashSet<Integer>();
//		
//		ids.add(103);   ids.add(567);    ids.add(678);
//		
//		Iterator iterator = ids.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//	}
//}


//public class Collection_30_11_part5 {
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> map = new Hashtable<Integer, String>();
//
//		map.put(1, "Nisha");    map.put(2, "Amanullah");
//		map.put(null, "Odion");//here I am trying to set null as key which will again end-up into null-pointer Exception...
//
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
//		System.out.println(map.get(3));
//	}
//}



//public class Collection_30_11_part5 {//Hashtable is another implementation legacy/old class of Map which does not allow null at all whether
//										//key or value....
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> map = new Hashtable<Integer, String>();
//
//		map.put(1, "Nisha");    map.put(2, "Amanullah");
//		map.put(3, null);//here I am trying to give null as value which will end-up the program into Null-Pointer Exception....
//		map.put(4, null);
//		
//		
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
//		System.out.println(map.get(3));
//		System.out.println(map.get(4));
//	}
//}



//public class Collection_30_11_part5 {//HashMap allows only 1 null as key and you can have multiple null as values...
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> map = new HashMap<Integer, String>();
//
//		map.put(1, "Nisha");    map.put(2, "Amanullah");    map.put(3, null);   map.put(4, null);
//		
//		
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
//		System.out.println(map.get(3));
//		System.out.println(map.get(4));
//	}
//}



//public class Collection_30_11_part5 {//HashMap allows only 1 null as key and you can have multiple null as values...
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> map = new HashMap<Integer, String>();
//
//		map.put(1, "Nisha");    map.put(2, "Amanullah");    map.put(3, "Ryan");   map.put(4, "Odion");
//		
//		map.put(null, "Franklin");
//		map.put(null, "Bruce");
//		
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
//		System.out.println(map.get(3));
//		System.out.println(map.get(4));
//		System.out.println(map.get(null));
//	}
//}


//public class Collection_30_11_part5 {//HashMap is the first implementation class of Map interface and keys are unique and values can 
//	//can be duplicated...
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> map = new HashMap<Integer, String>();
//
//		map.put(1, "Nisha");    map.put(2, "Amanullah");    map.put(3, "Ryan");   map.put(4, "Odion");
//		
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
//		System.out.println(map.get(3));
//		System.out.println(map.get(4));
//		
//		map.put(2, "Manit");//so here I an trying to add new entry with the duplicate key. What it does, it does not deny the 
//							//entry but it will replace the old value with the new entry' value... 
//
//		System.out.println(map.size());
//		
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
//		System.out.println(map.get(3));
//		System.out.println(map.get(4));
//	}
//}



//public class Collection_30_11_part5 {//HashMap is the first implementation class of Map interface and keys are unique and values can 
//										//can be duplicated...
//
//	public static void main(String[] args) {
//		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		
//		map.put(1, "Nisha");    map.put(2, "Amanullah");    map.put(3, "Ryan");   map.put(4, "Odion");
//		
//		System.out.println(map.size());
//	}
//}


//class Employee {
//	
//	private int id;
//	private String name;
//	
//	public Employee() {	
//	}
//	
//	public Employee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//}
//
//public class Collection_30_11_part5 {
//
//	public static void main(String[] args) {
//		
//		List<Employee> employees = new ArrayList<Employee>();
//		
//		Employee e1 = new Employee(1, "Nisha");   Employee e2 = new Employee(2, "Amanullah");
//		Employee e3 = new Employee(3, "Ryan");    Employee e4 = new Employee(4, "Odion");
//		
//		employees.add(e1);   employees.add(e2);   employees.add(e3);   employees.add(e4);
//	}
//}


//public class Collection_30_11_part5 {
//
//	public static void main(String[] args) {
//		
//		List<Integer> ids = new ArrayList<Integer>();
//		List<String> employeeNames = new ArrayList<String>();
//		
//		ids.add(1);    ids.add(2);    ids.add(3);    ids.add(4);
//		
//		employeeNames.add("Nisha");
//		employeeNames.add("Amanullah");
//		employeeNames.add("Rya");
//		employeeNames.add("Odion");
//	}
//}
