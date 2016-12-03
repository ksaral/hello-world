package dev.learning.utils;

public class SimpleCalc {

	public static Integer sum(Integer... inputs) {
		assert (inputs != null);
		Integer sum = 0;
		for (Integer integer : inputs) {
			sum += integer;
		}
		return sum;
	}

	public static Integer difference(Integer... inputs) {
		assert (inputs != null);
		Integer difference = 0;
		for (Integer integer : inputs) {
			difference -= integer;
		}
		return difference;
	}

	public static Integer product(Integer... inputs) {
		assert (inputs != null);
		Integer product = 1;
		for (Integer integer : inputs) {
			product *= integer;
		}
		return product;
	}

	public static Float division(Integer... inputs) {
		assert (inputs != null);
		Float division = 1.0f;

		for (Integer integer : inputs) {
			try {
				division = integer / division;
			} catch (ArithmeticException e) {
				System.out.println("Divisor cannot be zero");
			}

		}
		return division;
	}
}
