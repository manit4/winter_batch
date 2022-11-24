import java.util.List;
import java.util.Vector;

public class Collection_23_11_Part2 {

	public static void main(String[] args) {

		List<Integer> vector = new Vector<Integer>();

		vector.add(4);
		vector.add(30);
		vector.add(25);
		vector.add(12);
		vector.add(10);

		for(Integer value : vector) {
			System.out.println(value);
		}
		Integer i = 4;
		
		vector.remove(i);//here I could successfully removed the element holding value as "4" but not the index 4th element....
		
		System.out.println("--------after removing element----------");
		
		for(Integer value : vector) {
			System.out.println(value);
		}
	}
}




//public class Collection_23_11_Part2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> vector = new Vector<Integer>();
//
//		vector.add(4);
//		vector.add(30);
//		vector.add(25);
//		vector.add(12);
//		vector.add(10);
//
//		for(Integer value : vector) {
//			System.out.println(value);
//		}
//		
//		vector.remove(4);//It removed the fourth index element not the element value as "4"If you want to remove element value 4, check the next program............
//		
//		System.out.println("--------after removing element----------");
//		
//		for(Integer value : vector) {
//			System.out.println(value);
//		}
//	}
//}



//public class Collection_23_11_Part2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> vector = new Vector<Integer>();
//
//		vector.add(4);
//		vector.add(30);
//		vector.add(25);
//		vector.add(12);
//		vector.add(10);
//
//		System.out.println("Befroe removing, the size is "+vector.size());
//		
//		//vector.remove(25);//here this is illegal to say since I am trying to remove element "25" from the collection but it takes it as index "25" not the element...and will end-up getting exception as IndexoutFfBounds... 
//		
//		Integer i = 25;
//		
//		vector.remove(i);
//		
//		System.out.println("Size after removing element is "+vector.size());
//	}
//}



//public class Collection_23_11_Part2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> al = new ArrayList<Integer>();
//
//		al.add(10);
//		al.add(30);
//		al.add(25);
//		al.add(12);
//		al.add(10);
//
//		System.out.println("the size of Collection is "+al.size());
//		
//		al.clear();//clear() deletes all the elements from the collection...
//		
//		System.out.println("the size after clear() is "+al.size());
//	}
//}


//public class Collection_23_11_Part2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> al = new ArrayList<Integer>();
//
//		al.add(10);
//		al.add(30);
//		al.add(25);
//		al.add(12);
//		al.add(10);
//
//		for(Integer value : al) {
//			System.out.println(value);
//		}
//
//		al.set(2, 50);//here I am using set(index, element) method. set method replaces the element from the collection completely. Howver, 
//						//add(index, element) method does not replace the element from the collection. Instead, add(index, element) method
//						//asks politely to the element to give up its original index and move to the next index and the next
//							//elements will move 1 step back in the collection...
//
//		for(Integer value : al) {
//			System.out.println(value);
//		}
//	}
//}


//public class Collection_23_11_Part2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> al = new ArrayList<Integer>();
//
//		al.add(10);
//		al.add(30);
//		al.add(25);
//		al.add(12);
//		al.add(10);
//
//		for(Integer value : al) {
//			System.out.println(value);
//		}
//
//		al.set(2, 50);//here I am using set(index, element) method. set method replaces the element from the collection completely. Howver, 
//						//add(index, element) method does not replace the element from the collection. Instead, add(index, element) method
//						//asks politely to the element to give up its original index and move to the next index and the next
//							//elements will move 1 step back in the collection...
//
//		for(Integer value : al) {
//			System.out.println(value);
//		}
//	}
//}


//public class Collection_23_11_Part2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> al = new ArrayList<Integer>();
//
//		al.add(10);
//		al.add(30);
//		al.add(25);
//		al.add(12);
//		al.add(10);
//
//		for(Integer value : al) {
//			System.out.println(value);
//		}
//
//		al.add(2, 50);//here I am using the add(index, element) method which will take 2 arguments, first argument is index and the 
//		//second argument is element which you wish to save...After adding the element at specific index, all the elements
//		//rest elements will move back 1 step... 
//
//		for(Integer value : al) {
//			System.out.println(value);
//		}
//	}
//}



	//public class Collection_23_11_Part2 {
	//	
	//	public static void main(String[] args) {
	//		
	//		List<Integer> al = new ArrayList<Integer>();
	//		
	//		al.add(10);
	//		al.add(30);
	//		al.add(25);
	//		al.add(12);
	//		al.add(10);
	//		
	//		for(Integer value : al) {
	//			System.out.println(value);
	//		}
	//		
	//		al.remove(1);//here I am trying to remove the element based on its index. After the removal is done, all the next elements
	//						//will move up 1 step...
	//		
	//		System.out.println("----------after removing element------------");
	//		
	//		for(Integer value : al) {
	//			System.out.println(value);
	//		}
	//	}

//}


//public class Collection_23_11_Part2 {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> al = new ArrayList<Integer>();
//		
//		al.add(10);
//		al.add(30);
//		al.add(25);
//		al.add(12);
//		al.add(10);
//		
//		for(int i = 0; i < al.size(); i++) {
//			
//			System.out.println(al.get(i));
//		}
//		
//		System.out.println("=----------Below retreiving elemnts is done with the help of Enhanced for-loop---------");
//		
//		for(Integer value : al) {
//			System.out.println(value);
//		}
//	}
//
//}



//public class Collection_23_11_Part2 {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> al = new ArrayList<Integer>();
//		
//		al.add(10);
//		al.add(30);
//		al.add(25);
//		al.add(12);
//		al.add(10);
//		
//		Integer i = al.get(0);//I am trying to access the element at index "0" since the collection' first index starts from "0" index...
//		
//		System.out.println(i);
//		
//		System.out.println(al.get(2));
//		
//		System.out.println(al.get(5));//here I am trying to fetch the element out of ArrayList size so I will get exception on runtime...since 
//											//the last index I can access is "4" since the size is 5 and the collection starting index begins from "0" index...
//	}
//
//}



//public class Collection_23_11_Part2 {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> al = new ArrayList<Integer>();
//		
//		al.add(10);
//		al.add(30);
//		al.add(25);
//		al.add(12);
//		al.add(10);//here I am suppying duplicates which ArrayList or all List's implemenation classes supports...
//		
//		System.out.println("the size is "+al.size());
//	}
//
//}


//public class Collection_23_11_Part2 {
//	
//	public static void main(String[] args) {
//		
//		List<Integer> al = new ArrayList<Integer>();
//		
//		Integer i = 10;//Here I am creating an object of Integer Wrapper class...
//		
//		al.add(i);//and here I am supplying the integer wrapper class Object created above to the add method of arrayList...
//		
//		al.add(12);//here I am directly supplying the primitive value which is not possible but this is legal since when you supply
//						//primitive value, then this primitive value gets converted into Respective wrapper class Object and then gets saved with 
//						//the help of Auto-Boxing feature of wrapper classes....
//	}
//
//}
