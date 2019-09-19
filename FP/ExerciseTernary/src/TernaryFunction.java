@FunctionalInterface
public interface TernaryFunction<X,Y,Z,R> {
	R apply(X x,Y y,Z z);
}