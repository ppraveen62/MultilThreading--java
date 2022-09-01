
public class ThreadDemo implements Runnable {
	Thread thread;
	String threadname;
	ThreadDemo(String threadname){
		this.threadname=threadname;
		System.out.println("creating thread "+this.threadname);
	}
	
	public void run() {
		System.out.println("Running thread is "+this.threadname);
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Running thread is "+this.threadname+"."+i);
				thread.sleep(50);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread tr1=new Thread(new ThreadDemo("thread1"));
		tr1.start();
		Thread tr2=new Thread(new ThreadDemo("thread2"));
		tr2.start();
	}

}
