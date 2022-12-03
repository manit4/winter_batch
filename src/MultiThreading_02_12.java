//Multi-threading is the concept which is used to accomplish any task not with 1 person(means 1 thread) but with multiple people(people here means threads)....
//There are 2 ways to create thread/s. One way is to extend the Thread class and override the run() in that class and this way is 
//the simplest one. Second way is to implement the runnable interface and override run() in that class and this second way is the preferred one..
//After you create the thread, you have to make sure that the plain thread object/s in Thread Pool if you wish those threads to be considered
// for providing processor access and for that we need to call start() on every thread which you wish to be part of your multithreading program...
//After the run() is finished by any thread, then that thread will go to dead state...


class MyRunnable implements Runnable{

	public void run() {
		
		for(int i = 0; i < 20; i++) {
			System.out.println(i);
		}
	}
}

public class MultiThreading_02_12 {
	
	public static void main(String[] args) {
		
		MyRunnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();   t2.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		System.out.println(t1.isAlive());
		
		System.out.println(t2.isAlive());
		
	}
}



//class MyThread extends Thread {
//	
//	public void run() {
//		
//		Thread obj = Thread.currentThread();
//		
//		for(int i = 0; i < 100; i++) {
//			System.out.println(obj.getName()+"      "+i);
//		}
//	}	
//}
//
//public class MultiThreading_02_12 {
//	
//	public static void main(String[] args) {
//		
//		Thread obj = Thread.currentThread();
//		
//		System.out.println("inside main 1"+obj.getName());
//		
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		
//		t1.setName("Odion");        t2.setName("Nisha");
//		
//		t1.start();  t2.start();
//		
//		for(int i = 0; i < 100; i++) {
//			System.out.println(obj.getName()+"      "+i);
//		}
//	}
//}



//class MyThread extends Thread {
//	
//	public void run() {
//		
//		Thread obj = Thread.currentThread();
//		
//		for(int i = 0; i < 100; i++) {
//			System.out.println(obj.getName()+"      "+i);
//		}
//	}	
//}
//
//
//public class MultiThreading_02_12 {
//	
//	public static void main(String[] args) {
//		
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		
//		t1.setName("Odion");        t2.setName("Nisha");
//		
//		t1.start();;  t2.start();
//	}
//}
		
		
		
//class MyThread extends Thread {
//	
//	public void run() {
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i);
//		}
//	}	
//}
//
//
//public class MultiThreading_02_12 {
//	
//	public static void main(String[] args) {
//		
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		
//		t1.run();   t2.run();//calling run() is legal however, we do not call since my duty is to create thread/s and put them
//							//in a thread pool and let the under-lying system know to which thread it should give processor to run...
//	}
//}



//class MyThread extends Thread {
//	
//	public void run() {
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i);
//		}
//	}	
//}
//
//
//public class MultiThreading_02_12 {
//	
//	public static void main(String[] args) {
//		
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		
//		t1.start();       t2.start();	
//	}
//}
