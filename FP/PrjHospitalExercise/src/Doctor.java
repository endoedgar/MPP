import java.util.List;

public class Doctor {
	private String name;
	private List<Visit> visits;
	private int age;

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

	public Doctor(String name, int age, List<Visit> visits) {
		super();
		this.visits = visits;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "" + this.getVisits().size();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
