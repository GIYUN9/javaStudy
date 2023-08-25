package com.kh.ThreadStudy;

public class CurrentThreadName {
	public static void main(String[] args) {
//		Thread ct = Thread.currentThread();
//		String name = ct.getName();
//		System.out.println(name);
		
		Runnable task = () ->{
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + (n1 + n2));
		};
		
		Thread t = new Thread(task);
		t.start();
		System.out.println("End "+ Thread.currentThread().getName());
		
		   Runnable task1 = () -> { // 20 미만 짝수 출력
			      try {
			         for(int i = 0; i < 20; i++) {
			            if(i % 2 == 0)
			               System.out.print(i + " ");
			            Thread.sleep(100); // 0.1초간 잠을 잔다.
			         }
			      }catch(InterruptedException e) {
			         e.printStackTrace();
			      }
			   };
			   Runnable task2 = () -> { // 20 미만 홀수 출력
			      try {
			         for(int i = 0; i < 20; i++) {
			            if(i % 2 == 1)
			               System.out.print(i + " ");
			            Thread.sleep(100); // 0.1초간 잠을 잔다.
			         }
			      }catch(InterruptedException e) {
			         e.printStackTrace();
			      }
			   };
			   
			   Thread t1 = new Thread(task1);
			   Thread t2 = new Thread(task2);
			   t1.start();
			   t2.start();

	}
	
}
