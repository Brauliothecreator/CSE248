package starting_multithread_1;

public class Demo {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		runner1.start();
		System.out.println("Done");
	}

}
