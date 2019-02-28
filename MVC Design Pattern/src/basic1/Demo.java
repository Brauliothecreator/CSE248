package basic1;

public class Demo {

	public static void main(String[] args) {
		Student model = new Student("Adam", "111");
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		

	}

}
