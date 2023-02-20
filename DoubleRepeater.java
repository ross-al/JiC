import java.util.function.DoubleUnaryOperator;
/**
* Provides a method to apply a DoubleUnaryOperator repeatedly
*/
public class DoubleRepeater {
/**
* Returns the result of applying op max(n, 0) times to d.
*
* @param op the DoubleUnaryOperator to be applied
* @param d a value to which df should be applied repeatedly
* @param n the number of times op should be applied to d
* @return the result of applying op max(n, 0) times to d
* @throws NullPointerException if op is null
*/
	public static double repeat(DoubleUnaryOperator op, double d, int n) {
		double result = d;
		for (int i = 0; i < n; i++) {
			result = op.applyAsDouble(result);
		}
		return result;
		}
	
	public static void main(String[] args) {
        DoubleRepeater launcher = new DoubleRepeater();
        launcher.launch();
    }
		


	public void launch() {
	
		final double INPUT = 256;
		final int TIMES = 3;
		// lambda function for two times the number
		System.out.println(repeat(x -> x * 2, INPUT, TIMES));
		// Math.sqrt via lambda
		System.out.println(repeat(x -> Math.sqrt(x), INPUT, TIMES));
		// Math.sqrt via method reference (no ->)
		System.out.println(repeat(Math::sqrt, INPUT, TIMES));   
	}

}


