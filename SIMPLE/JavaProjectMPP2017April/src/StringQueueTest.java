import org.junit.jupiter.api.Test;

class StringQueueTest {

	@Test
	void testDequeueWithoutAnyContent() {
		try {
			StringQueue sq = new StringQueue();
		
			sq.dequeue();
		} catch(Exception eqe) {
			assert(eqe instanceof EmptyQueueException);
		}
	}
	
	@Test
	void testEnqueue() throws EmptyQueueException {
		StringQueue sq = new StringQueue();
		sq.enqueue("Something");
		
		assert(sq.dequeue().equals("Something"));
	}

}
