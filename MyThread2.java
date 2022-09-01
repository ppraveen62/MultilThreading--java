//creating thread class by implementing runnable interface
public class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("my thread is running");
		
	}

	public static void main(String[] args) {
		Thread t=new Thread(new MyThread2());
		t.start();

	
		
	}
}