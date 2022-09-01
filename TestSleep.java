
public class TestSleep extends Thread {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			try {
				//the thread will sleep 500 milli seconds
				Thread.sleep(2000);
			}
			catch(InterruptedException iex) {
				System.out.println(iex);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestSleep t1=new TestSleep();
		TestSleep t2=new TestSleep();
		t1.start();
		Thread.sleep(4000);
		t2.start();
	}

}