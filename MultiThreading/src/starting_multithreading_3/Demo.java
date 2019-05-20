package starting_multithreading_3;

public class Demo {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("Hello " + i);
				}
			}
			
		});
		Thread thread2 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("Hello World" + i);
				}
			}
			
		});

	thread1.start();
	thread2.start();
	try {
		thread1.join();
		thread2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Done");
	}
	

}
