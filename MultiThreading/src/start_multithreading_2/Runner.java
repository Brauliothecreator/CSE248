package start_multithreading_2;

public class Runner implements Runnable {

	@Override
	public void run() {

		for(int i = 0; i < 5; i++) {
			System.out.println("Hello " + i);
		}
	}

	
}
