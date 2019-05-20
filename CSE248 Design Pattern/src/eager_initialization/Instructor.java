package eager_initialization;

public class Instructor {

	private static String name;
	private static Instructor _instructor = new Instructor();
	private Instructor() {
		
	}
	public static Instructor makeTheInstructor(String name) {
		Instructor.name = name;
		return _instructor;
		
	}
	
}
