
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class AdminTest {
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testComputeUpdatedBalanceSum() {;
		Employee e1 = mock(Employee.class);
		Employee e2 = mock(Employee.class);
		Employee e3 = mock(Employee.class);
		
		when(e1.computeUpdatedBalanceSum()).thenReturn(10.0d);
		when(e2.computeUpdatedBalanceSum()).thenReturn(20.0d);
		when(e3.computeUpdatedBalanceSum()).thenReturn(30.0d);
		List<Employee> list = Arrays.asList(e1, e2, e3);
	
		assert(60.0d == Admin.computeUpdatedBalanceSum(list));
		
	}

}
