

public abstract class Department {
	private StringQueue queue = new StringQueue();
	
	public abstract String getName();
	public void addMessage(String message) {
		this.getQueue().enqueue(message);
	}
	
	public StringQueue getQueue() {
		return queue;
	}
	
	public String nextMessage() {
		String nextMessage = "";
		try {
			nextMessage = this.getQueue().dequeue();
		} catch(EmptyQueueException ex) {
		}
		return nextMessage;
	}
	
	
}
