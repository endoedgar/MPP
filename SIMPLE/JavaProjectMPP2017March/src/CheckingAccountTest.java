import org.junit.jupiter.api.Test;

class CheckingAccountTest {

	@Test
	void test() {
		CheckingAccount[] caList = {
				new CheckingAccount("231-471", 25.00, 100),
				new CheckingAccount("446-973", 25.00, 200)
		};
		assert(caList[0].computeUpdatedBalance() == 75.0d); 
		assert(caList[1].computeUpdatedBalance() == 175.0d);
	}

}
