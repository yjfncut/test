package ddstack;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class test {

	/**
	 * @param args
	 */
	static BlockingQueue queue = new ArrayBlockingQueue(1024);  
	static int arr[]=new int[5];
	public static void main(String a[]) {
//		putThread p=new putThread();
//		takeThread t=new takeThread();
//		t.start();
//		p.start();
		System.out.print(arr[0]);

	}
	
//	static class putThread extends Thread{
//		@Override
//		 public void run() {
//		 	for(int i=0;i<1000;i++){
//		 		try {
//					queue.put(i);
//					System.out.println("put: "+i);
//					sleep(2000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//		 		
//		 	}
//		}
//	}
//	
//	static class takeThread extends Thread{
//		@Override
//		 public void run() {
//
//				while(true){
//				System.out.println("take: "+queue.remove());
//				}
//
//		}
//	}

}
