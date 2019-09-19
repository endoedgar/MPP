
public interface Result {
	public enum ResultID {
		LAB,
		MED
	};
	abstract ResultID getResultType();
}
