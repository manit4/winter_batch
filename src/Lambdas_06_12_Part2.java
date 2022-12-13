import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//we have so many functional interfaces present which basically provide the signatures for the method. For example, if you have
//situation like- you need to pass something to a method and returns the boolean as a value so you should use Predicate in-built
//functional interface...


public class Lambdas_06_12_Part2 {//This is the example of Supplier functional interface which does not take anything and returns something...

	public static void main(String[] args) {
		
		String str = "name";
		
		Supplier<String> supplier = () -> "Hi";
		
		System.out.println(supplier.get());
	}
}





//class Employee {
//
//	int id;
//	String name;
//	int salary;
//	int workX;
//
//	public Employee() {
//
//	}
//
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//}
//
//
//public class Lambdas_06_12_Part2 {//This is the example of Consumer interface which takes something and returns nothing...
//
//	public static void main(String[] args) {
//		
//		Employee employee = new Employee(1, "Bruce", 2000, 6);
//		
//		Consumer<Employee> consumer = (value) -> {
//			
//			if(value.workX >= 5) {
//				
//				double bonus = value.salary * 0.5;
//				System.out.println(value.name+" You are eligible for the bonus and the bonus amount is "+bonus);
//			}
//			else {
//				System.out.println(value.name+" Sorry, You are not eligible for the bonus");
//			}
//		};
//		
//		consumer.accept(employee);
//		
//	}
//}

//public class Lambdas_06_12_Part2 {//This is the example of Consumer interface which takes something and returns nothing...
//
//	public static void main(String[] args) {
//		
//		Consumer<String> consumer = (value) -> System.out.println(value.length());
//		
//		consumer.accept("Hey there..");
//	}
//}


//class Employee {
//
//	int id;
//	String name;
//	int salary;
//	int workX;
//
//	public Employee() {
//
//	}
//
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//}
//
//
//public class Lambdas_06_12_Part2 {//This is the example of Function interface which takes something and returns something and that something could be anything such as Object, Integer, String...
//
//	public static void main(String[] args) {
//		
//		Employee emp1 = new Employee(100, "Nisha", 5000, 2);
//
//		Function<Employee, String> function = (emp) -> {
//			
//			if(emp.workX >= 5) {
//				System.out.println("I am inside if");
//				return emp.name+" You are eligible for the bonus";
//			}
//			else {
//				System.out.println("I ma inside else");
//				return emp.name+" You are not eligible for the bonus";
//			}
//		};
//		
//		System.out.println(function.apply(emp1));
//	}
//}



//public class Lambdas_06_12_Part2 {//This is the example of Function interface which takes something and returns something and that something could be anything such as Object, Integer, String...
//
//	public static void main(String[] args) {
//
//		Function<Integer, Integer> function = (value) -> {
//			
//			if(value % 2 == 0) {
//				return value + 5;
//			}
//			else {
//				return value + 10;
//			}
//		};
//		
//		System.out.println(function.apply(77));	
//	}
//}


//class Employee {
//
//	int id;
//	String name;
//	int salary;
//	int workX;
//
//	public Employee() {
//
//	}
//
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//}
//
//public class Lambdas_06_12_Part2 {//This is the example of Predicate functional interface which says I will take anything and returns only boolean 
//
//	public static void main(String[] args) {
//
//		Employee employee1 = new Employee(100, "Amanullah", 500, 7);
//		Employee employee2 = new Employee(101, "Nisha", 700, 3);
//		Employee employee3 = new Employee(102, "Ryan", 600, 5);
//
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(employee1);    employees.add(employee2);   employees.add(employee3);
//		
//		Predicate<Employee> predicate = (emp) -> {
//
//			if(emp.workX >= 5) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
//
//		for(Employee emp : employees) {
//
//			boolean status = predicate.test(emp);
//			
//			if(status == true) {
//				System.out.println(emp.name+" You are eligible...");
//			}
//			else {
//				System.out.println(emp.name+ " You are not eligible...");
//			}
//		}
//	}
//}




//class Employee {
//
//	int id;
//	String name;
//	int salary;
//	int workX;
//
//	public Employee() {
//
//	}
//
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//}
//
//public class Lambdas_06_12_Part2 {//This is the example of Predicate functional interface which says I will take anything and returns only boolean 
//
//	public static void main(String[] args) {
//
//		Employee employee1 = new Employee(100, "Amanullah", 500, 7);
//		Employee employee2 = new Employee(101, "Nisha", 700, 3);
//		Employee employee3 = new Employee(102, "Ryan", 600, 5);
//
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(employee1);    employees.add(employee2);   employees.add(employee3);
//
//		for(Employee emp : employees) {
//
//			if(emp.workX >= 5) {
//				System.out.println(emp.name+" You are eligible");
//			}
//			else {
//				System.out.println(emp.name+" You are not eligible");
//			}
//		}
//	}
//}


//class Employee {
//	
//	int id;
//	String name;
//	int salary;
//	int workX;
//	
//	public Employee() {
//		
//	}
//
//	public Employee(int id, String name, int salary, int workX) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.workX = workX;
//	}
//}
//
//public class Lambdas_06_12_Part2 {//This is the example of Predicate functional interface which says I will take anything and returns only boolean 
//
//	public static void main(String[] args) {
//
//		Employee employee = new Employee(100, "Amanullah", 500, 7);
//		
//		Predicate<Employee> predicate = (emp) -> {
//			
//			if(emp.workX >= 5) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
//		
//		System.out.println(predicate.test(employee));
//	}
//}


//public class Lambdas_06_12_Part2 {//This is the example of Predicate functional interface which says I will take anything and returns only boolean 
//
//	public static void main(String[] args) {
//
//		Predicate<Integer> predicate = (i) -> {
//			if(i < 9) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
//		
//		System.out.println(predicate.test(17));
//	}
//
//}
