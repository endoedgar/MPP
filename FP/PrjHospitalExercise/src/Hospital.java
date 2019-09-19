import java.util.List;

public class Hospital {
	private List<Department> departments;

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Hospital(List<Department> departments) {
		super();
		this.departments = departments;
	}
}
