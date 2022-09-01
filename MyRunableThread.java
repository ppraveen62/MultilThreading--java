
public class MyRunableThread implements Runnable{

	public static int myCount=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(MyRunableThread.myCount<=100) {
			try {
				System.out.println("Exmple Thread:"+(++MyRunableThread.myCount));
				Thread.sleep(100);
			}
			catch(InterruptedException iex) {
				System.out.println("Exception in Thread:"+iex.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main THread...");
		MyRunableThread mrt=new MyRunableThread();
		Thread t=new Thread(mrt);
		t.start();
		while(MyRunableThread.myCount<=10) {
			try {
				System.out.println("Main THread:"+(++MyRunableThread.myCount));
				Thread.sleep(100);
			}
			catch(InterruptedException iex) {
				System.out.println("Exception in Main Thread:"+iex.getMessage());
			}
		}
		System.out.println("End of main thread...");
	}

}