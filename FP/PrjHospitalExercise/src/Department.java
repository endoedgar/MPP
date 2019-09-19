import java.util.List;

public class Department {
	private List<Doctor> doctors;

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public Department(List<Doctor> doctors) {
		super();
		this.doctors = doctors;
	}
	
	
}
