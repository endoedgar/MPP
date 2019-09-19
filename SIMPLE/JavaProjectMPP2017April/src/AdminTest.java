import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class AdminTest {
	@Mock
	Department d1, d2, d3;
	
	Admin admin;
	
	@BeforeEach
	public void setup() throws EmptyQueueException {
		MockitoAnnotations.initMocks(this);
		Department[] depts = {d1,d2,d3};
		this.admin = new Admin(depts);
	}
	
	@Test
	void testFormat() {
		assert(admin.format("Some Dept", "Some message").equals("Some Dept: Some message"));
	}
	
	@Test
	void testHourlyCompanyMessage() {
		when(d1.getName()).thenReturn("D1");
		when(d2.getName()).thenReturn("D2");
		when(d3.getName()).thenReturn("D3");
		
		when(d1.nextMessage()).thenReturn("Dequeued d1 message");
		when(d2.nextMessage()).thenReturn("Dequeued d2 message");
		when(d3.nextMessage()).thenReturn("Dequeued d3 message");
		
		assert(admin.hourlyCompanyMessage().equals("D1: Dequeued d1 message\n" + 
				"D2: Dequeued d2 message\n" + 
				"D3: Dequeued d3 message\n"));
	}

}
