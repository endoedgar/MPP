import org.junit.jupiter.api.Test;

class SavingsAccountTest {

	@Test
	void testComputeUpdatedBalance() {
		SavingsAccount[] saList = {
				new SavingsAccount("TestAccount", 0.03, 200),
				new SavingsAccount("21-9672", 0.03, 200),
				new SavingsAccount("68-0902", 0.04, 600)
		};
		
		assert(saList[0].computeUpdatedBalance() == 206.0d); 
		assert(saList[1].computeUpdatedBalance() == 206.0d); 
		assert(saList[2].computeUpdatedBalance() == 624.0d); 
	}

}
