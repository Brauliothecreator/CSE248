package pugh_singleton;

public class Instructor {

	private static String name;
	private static Instructor _instructor;
	private Instructor () {
		
	}
	private static class SingletonHelper{
		private static final Instructor _instructor = new Instructor();
		}
	
	
	}

