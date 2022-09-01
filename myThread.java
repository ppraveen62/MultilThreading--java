//creating thread class by extending thread class
public class myThread extends Thread {

	public void run() {
		System.out.println("Concurrent thread started running");
	}

	public static void main(String[] args) {
		myThread tr =new myThread();
		tr.start(); //when we call start method the run method executed in multithreded way
	
	}

}
