import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			new Hourly(1, 1, 1),
			new Salaried(2, 100),
			new Commissioned(3, 0.1d, 100, 
				Arrays.asList(
					new Order(1, LocalDate.of(2019, 7, 2), 100),
					new Order(2, LocalDate.of(2019, 8, 2), 100),
					new Order(3, LocalDate.of(2019, 8, 5), 100)
				)
			)
		);
		
		for(Employee e : employees) {
			e.print();
		}
	}

}
