package starting_multithread_1;

public class Runner extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
