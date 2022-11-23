import java.util.Scanner;



//public class Collection_17_11_Part1 {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the size of the array");
//		
//		int size = sc.nextInt();
//		
//		int[] salaries = new int[size];
//		
//		for(int i = 0; i < salaries.length; i++) {
//			
//			System.out.println("Enter the salary!!");
//			
//			int salary = sc.nextInt();
//			
//			for(int j = 0; j < salaries.length; j++) {
//				
//				if(salaries[j] == salary) {
//					i--;
//					break;
//				}
//				else {
//					if(salaries.length-1 == j) {
//						salaries[i] = salary;	
//					}	
//				}
//			}
//		}
//		
//		for(int salary : salaries) {
//			System.out.println(salary);
//		}
//	}
//}


//public class Collection_17_11_Part1 {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int counter = 0;
//		
//		int[] salaries = {2000, 1700, 2500, 4000, 1700, 2300, 1700, 2400, 66454, 2500, 46745, 35353,2342342};//Things which I can perform on array is to get the value on specific index,
//												//set the value at specific index, get the size or length of the array...
//		
//		System.out.println("Enter any salary which you would like to check whether duplicate or not!!");
//		
//		int salary = sc.nextInt();
//		
//		for(int i = 0; i < salaries.length; i++) {
//			
//			System.out.println("inside for loop "+i);
//			
//			if(salaries[i] == salary) {
//				counter++;
//				
//				if(counter == 2) {
//					break;
//				}
//			}
//		}	
//		
//		if(counter > 1) {
//			System.out.println("yes, element is duplicate..");
//		}
//		else {
//			System.out.println("No, element is not duplicate..");
//		}
//	}
//}

//
//public class Collection_17_11_Part1 {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] salaries = {2000, 1700, 2500, 4000};//Things which I can perform on array is to get the value on specific index,
//												//set the value at specific index, get the size or length of the array...
//		
//		System.out.println("Enter any salary which you would like to check!!");
//		
//		int salary = sc.nextInt();
//		
//		for(int i = 0; i < salaries.length; i++) {
//			
//			if(salaries[i] == salary) {
//				System.out.println("2500 is present...");
//				break;
//			}
//			else {
//				if(salaries.length-1 == i) {
//					System.out.println("it is not present...");	
//				}
//			}
//		}	
//	}
//}
