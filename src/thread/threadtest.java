package thread;

public class threadtest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread tread=new Thread(new runable());
		tread.start();
		tread.join(10);
		System.out.println("main");
	}
	
	static class runable implements Runnable{

		public void run() {
			System.out.println("start");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("end");
			
		}
		
	}

}
