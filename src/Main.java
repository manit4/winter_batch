
public class Main {

	int i = 4;
	
	public static void main(String args[]) {

		Main m1 = new Main();
		
		m1.add();
	}

	void add() {
		
		int i = 5;
		
		System.out.println(this.i);//"this" is keyword which means current reference or current object. Usually, we use "this"
									//keyword when we have local variable and instance variable with the same name. And we
									//know that local variables are given preference however, in order to use the instance variable
									//instead of local variable, we use "this" keyword
	}
}


//public class Main {
//
//	int i = 4;
//	
//	
//	public static void main(String args[]) {
//
//		Main m1 = new Main();
//		
//		m1.add();
//	}
//
//	void add() {
//		
//		int i = 5;//you can have local and instance(global) variable with the same name as we did in this program, as varibale
//				//"i" is declared as instance variable means outside the methods as well as inside the add() method but as
//				//local variable. Mind this, local variables are always given preference... 
//
//		System.out.println(i);
//	}
//}


//public class Main {
//
//	int i = 4;
//	int j = 5;
//	
//	public static void main(String args[]) {
//
//		Main m1 = new Main();
//		
//		m1.add();
//		
//		Main m2 = new Main();
//		
//		m2.add();
//	}
//
//	void add() {
//
//		int k = i + j;//Local variable exist as long as method is still in execution mode...
//		
//		System.out.println(k);
//	}
//}


//public class Main {
//
//	int i = 4;
//	int j = 5;
//	int k;
//
//	public static void main(String args[]) {
//
//		Main m = new Main();
//		
//		int argumentValue = 100;
//		
//		int returnedValue = m.add(argumentValue);
//		
//		System.out.println(returnedValue);
//	}
//
//	int add(int passedValue) {
//
//		k = i + j + passedValue;
//
//		k = k + passedValue * 2;
//		
//		k = i -k + passedValue;
//		
//		int finalValue = passedValue - k;
//		
//		return finalValue;
//	}
//}




//public class Main {
//
//	int i = 4;
//	int j = 5;
//	int k;
//
//	public static void main(String args[]) {
//
//		Main m = new Main();
//		
//		int argumentValue = 100;
//		
//		m.add(argumentValue);//I am passing the data or value held by the variable named "argumentValue" not the variable itself...  
//	}
//
//	void add(int passedValue) {
//
//		k = i + j + passedValue;
//		
//		System.out.println(k);		
//	}
//}


//public class Main {
//
//	int i = 4;
//	int j = 5;
//
//	public static void main(String args[]) {
//
//		Main m = new Main();
//		System.out.println(m.add());//passing the "m.add" sysout is not legal since add() does not return anything and sysout
//									//looks for something as an input in order to print since that is sysout only task...
//		
//
//	}
//
//	void add() {
//
//		int k = i + j;
//	}
//}



//public class Main {
//
//	int i = 4;
//	int j = 5;
//
//	public static void main(String args[]) {
//
//		Main m = new Main();
//		System.out.println(m.add());// I am directly calling the "m.add()" from the sysout parenthesis and I am not taking in 
//									//separate variable since I wish to use the returnedValue just once....
//		
//
//	}
//
//	int add() {
//
//		int k = i + j;
//		
//		return k;//return must be the last statement
//	}
//}



//public class Main {
//
//	int i = 4;
//	int j = 5;
//
//	public static void main(String args[]) {
//
//		Main m = new Main();
//		int returnedValue = m.add();
//		
//		System.out.println(returnedValue);
//	}
//
//	int add() {
//
//		int k = i + j;
//		
//		return k;//return must be the last statement
//	}
//}

//public class Main {
//	
//	public static void main(String args[]) {
//
//	Main m = new Main();
//	m.add();
//		
//	}
//	
//	void add() {
//		
//		int i = 4;
//		int j = 5;
//		int k = i + j;
//		
//		System.out.println(k);
//	}
//}

//public class Main {
//	
//	int i = 4;
//	int j = 5;
//	int k;
//
//	public static void main(String args[]) {
//
//		Main m = new Main();
//		
//		m.add();
//	}
//	
//	void add() {
//		
//		k = i + j;
//		System.out.println(k);
//	}
//}
