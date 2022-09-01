class Sender{
	//a method to print a msg
	public void Send(String msg) {
		System.out.println("Sending\t"+msg);
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n"+msg+" Sent");
	}
}
class ThreadedSend extends Thread{
	private String msg;
	private Thread t;
	Sender sender;//sender class reference variable
	//parameterized constructor used for initialization of variables
	ThreadedSend(String m,Sender obj){
		msg=m;
		sender=obj;
	}
	//overriding run of Thread class to support synchronized communication
	public void run() {
		synchronized (sender) {
			sender.Send(msg);
		}
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a sender class object
		Sender snd=new Sender();
		
		//Creating Threads by passing msg and sender class obj
		ThreadedSend s1=new ThreadedSend("Hi",snd);
		ThreadedSend s2=new ThreadedSend("Bye",snd);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}
		
	}

}