public class Main {
	
	public static void main(String[] args) {
		TernaryFunction<Integer, Integer, Integer, Integer> sumIntSquares = (x,y,z) -> (x*x+y*y+z*z);
		
		int i = sumIntSquares.apply(1,1,1);
	}
}
