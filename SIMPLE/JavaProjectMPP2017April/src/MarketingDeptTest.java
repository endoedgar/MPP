import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarketingDeptTest {
	MarketingDept dp;
	
	@BeforeEach
	void setup() {
		 this.dp = new MarketingDept();
	}
	
	@Test
	void testName() {
		assert(dp.getName().equals("Marketing"));
	}
	
	@Test
	void testNullMessage() {
		assert(dp.nextMessage().equals(""));
	}
	
	@Test
	void testMessage() {
		dp.addMessage("Some message");
		assert(dp.nextMessage().equals("Some message"));
	}

}
