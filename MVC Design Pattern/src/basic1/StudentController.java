package basic1;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
		
	}
	public void updateView() {
		view.displayStudentDetails(getName(), getId());
	}
	public String getName() {
		return model.getName();
	}
	public String getId() {
		return model.getId();
	}
	public void setName(String name) {
		model.setName(name);
	}
	public void setId(String id) {
		model.setId(id);
	}
}
