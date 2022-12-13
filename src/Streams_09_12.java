import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Streams_09_12 {

	public static void main(String[] args) {

		List<Integer> salaries = new ArrayList<Integer>();
		
		salaries.add(54);   salaries.add(34);    salaries.add(87);   salaries.add(43);
		
		salaries.stream().filter(value -> value > 40).limit(2).forEach(value -> System.out.println(value));
		
		
	}
}


//public class Streams_09_12 {
//
//	public static void main(String[] args) {
//
//		List<Integer> salaries = new ArrayList<Integer>();
//		
//		salaries.add(54);   salaries.add(34);    salaries.add(87);   salaries.add(43);
//		
//		long count = salaries.stream().filter(value -> value > 50).count();
//		
//		System.out.println(count);
//	}
//}



//class Employee {
//
//	int id;
//	String name;
//	int salary;
//	int workX;
//
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//
//}
//
//public class Streams_09_12 {
//
//	public static void main(String[] args) {
//
//		List<Employee> employees = new ArrayList<Employee>();
//		List<Double> newList = new ArrayList<Double>();
//
//		Employee e1 = new Employee(100, "Amanullah", 5000, 6);
//		Employee e2 = new Employee(101, "Odion", 7000, 3);
//		Employee e3 = new Employee(102, "Bruce", 5500, 9);
//		Employee e4 = new Employee(103, "Nisha", 7500, 5);
//
//		employees.add(e1);   employees.add(e2);   employees.add(e3);    employees.add(e4);
//
////		for(Employee employee : employees) {
////			
////			if(employee.workX > 5) {
////				
////				double bonus = employee.salary * 0.5;
////				
////				newList.add(bonus);
////			}
////		}
//		
//		newList = employees.stream().filter(emp -> emp.workX > 5).map(emp -> emp.salary * 0.5).collect(Collectors.toList());
//		
//		
//		newList.forEach(bonus -> System.out.println(bonus));
//	}
//}


//class Employee {
//
//	int id;
//	String name;
//	int salary;
//	int workX;
//
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//
//}
//
//public class Streams_09_12 {
//
//	public static void main(String[] args) {
//
//		List<Employee> employees = new ArrayList<Employee>();
//		List<Double> newList = new ArrayList<Double>();
//
//		Employee e1 = new Employee(100, "Amanullah", 5000, 6);
//		Employee e2 = new Employee(101, "Odion", 7000, 3);
//		Employee e3 = new Employee(102, "Bruce", 5500, 9);
//		Employee e4 = new Employee(103, "Nisha", 7500, 5);
//
//		employees.add(e1);   employees.add(e2);   employees.add(e3);    employees.add(e4);
//
////		for(Employee employee : employees) {
////			
////			System.out.println(employee.id+", "+employee.name);
////		}
//		
//		employees.forEach(emp -> System.out.println(emp.id+", "+emp.name));
//	}
//}



//class Employee {
//
//	int id;
//	String name;
//	int salary;
//	int workX;
//
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//
//}
//
//public class Streams_09_12 {
//
//	public static void main(String[] args) {
//
//		List<Employee> employees = new ArrayList<Employee>();
//		List<Double> newList = new ArrayList<Double>();
//
//		Employee e1 = new Employee(100, "Amanullah", 5000, 6);
//		Employee e2 = new Employee(101, "Odion", 7000, 3);
//		Employee e3 = new Employee(102, "Bruce", 5500, 9);
//		Employee e4 = new Employee(103, "Nisha", 7500, 5);
//
//		employees.add(e1);   employees.add(e2);   employees.add(e3);    employees.add(e4);
//
//		//	for(Employee employee : employees) {
//		//		
//		//		double bonus = employee.salary * 0.5;;
//		//		
//		//		newList.add(bonus);
//		//	}
//		//	
//		//	for(double value : newList) {
//		//		System.out.println(value);
//		//	}
//
//		newList = employees.stream().map(emp -> emp.salary * 0.5).collect(Collectors.toList());
//
//		for(double bonus : newList) {
//			System.out.println(bonus);
//		}
//
//	}
//}

//public class Streams_09_12 {
//	
//	public static void main(String[] args) {
//		
//		List<String> employees = new ArrayList<String>();
//		
//		employees.add("Amanullah");
//		employees.add("Nisha");
//		employees.add("Odion");
//		employees.add("Manit");
//		
//		employees.stream().map(name -> "name is "+name+" and the length is "+name.length()).forEach(name -> System.out.println(name));
//		
//		employees.stream().filter(name -> name.length() > 5).forEach(name -> System.out.println(name));
//	}
//}




//class Employee {
//	
//	int id;
//	String name;
//	int salary;
//	int workX;
//	
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//	
//}
//
//public class Streams_09_12 {
//	
//	public static void main(String[] args) {
//		
//		List<Employee> employees = new ArrayList<Employee>();
//		
//		Employee e1 = new Employee(100, "Amanullah", 5000, 6);
//		Employee e2 = new Employee(101, "Odion", 7000, 3);
//		Employee e3 = new Employee(102, "Bruce", 5500, 9);
//		Employee e4 = new Employee(103, "Nisha", 7500, 5);
//		
//		employees.add(e1);   employees.add(e2);   employees.add(e3);    employees.add(e4);
//		
////		for(Employee employee : employees) {
////			
////			if(employee.workX >= 5) {
////				System.out.println(employee.id+" "+employee.name+" "+employee.salary);
////			}
////		}
//		
//		employees.stream().filter(emp -> emp.workX >= 5).forEach(emp -> System.out.println(emp.id+" "+emp.name+" "+emp.salary));
//		
//	}
//}



//public class Streams_09_12 {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> numbers = new ArrayList<Integer>();
//		
//		numbers.add(67);    numbers.add(45);    numbers.add(38);    numbers.add(78);
//		
//		numbers.stream().filter(value -> value % 2 == 0).forEach(value -> System.out.println(value));	
//	}
//}


//public class Streams_09_12 {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> numbers = new ArrayList<Integer>();
//		
//		numbers.add(67);    numbers.add(45);    numbers.add(38);    numbers.add(78);
//		
//		numbers.stream().filter(value -> value % 2 == 0).forEach(value -> System.out.println(value));
//		
//	}
//}


//public class Streams_09_12 {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> numbers = new ArrayList<Integer>();
//		List<Integer> newList = new ArrayList<Integer>();
//		
//		numbers.add(67);    numbers.add(45);    numbers.add(38);    numbers.add(78);
//		
//		newList = numbers.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());
//		
//		
//		for(int value : newList) {
//			System.out.println(value);
//		}
//		
//	}
//
//}
