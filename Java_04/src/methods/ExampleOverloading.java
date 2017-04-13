package methods;

public class ExampleOverloading {

	public static void main(String[] args) {
		int a = 11;
		int b = 6;

		double c = 7.3;
		double d = 9.4;

		int result = minFunction(a, b);
		// same function name with different parameters

		double result_2 = minFunction(c, d);

		System.out.println("Minimum Value: " + result);
		System.out.println("Minimum Value: " + result_2);
	}

	// for integer

	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}

	// for double

	public static double minFunction(double n1, double n2) {
		double min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}

}
