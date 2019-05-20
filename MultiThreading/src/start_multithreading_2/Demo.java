package start_multithreading_2;

public class Demo {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runner());
		thread1.start();
		System.out.println("Done");
	}

}
