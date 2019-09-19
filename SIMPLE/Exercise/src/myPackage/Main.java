package myPackage;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Position> devPositions = Arrays.asList(
				new Position("Developer", 
						new Employee(0, "Some employee", new Date(), "213-123-22", 2000)
						), 
				new Position("Beta Tester", 
						new Employee(1, "Some employee", new Date(), "213-123-22", 2000)
						)
				);
		
		List<Position> humanResourcesPositions = Arrays.asList(
				new Position("Director", 
						new Employee(2, "Some employee", new Date(), "213-123-22", 4000)
						)
				); 
		
		Company c = new Company("Some Company", Arrays.asList(
				new Department("Dev Department", "Somewhere", devPositions ), 
				new Department("Human Resources Department", "Somewhere", humanResourcesPositions )
				)
			);
		
		System.out.println(c.calculateTotalSalaries());
	}

}
