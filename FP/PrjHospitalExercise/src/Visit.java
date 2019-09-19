import java.util.List;

public class Visit {
	private Patient patient;
	private Doctor doctor;
	private List<Result> result;
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Visit(Patient patient) {
		super();
		this.patient = patient;
	}
	public List<Result> getResult() {
		return result;
	}
	public void setResult(List<Result> result) {
		this.result = result;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	
	
}
