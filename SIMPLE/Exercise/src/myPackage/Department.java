package myPackage;
import java.util.List;

public class Department {
	private String name;
	private String location;
	private List<Position> positions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	public Department(String name, String location, List<Position> positions) {
		super();
		this.name = name;
		this.location = location;
		this.positions = positions;
	}
	
	public double getSalaries() {
		double sum = 0;
		
		for(Position p : positions) {
			sum += p.getSalary();
		}
		
		return sum;
	}
	
}
