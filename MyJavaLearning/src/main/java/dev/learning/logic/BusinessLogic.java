package dev.learning.logic;

import dev.learning.utils.SimpleCalc;
import dev.learning.model.Division;
import dev.learning.model.Student;

public class BusinessLogic {

	public void execute() {
		Student a = new Student("Hari", "Sadu", "BI", 1, new Integer[] { 62,
				55, 58, 56, 54 });
		Student b = new Student("Ryan", "Angel", "BI", 2, new Integer[] { 92,
				95, 88, 96, 84 });

		System.out.println("Division for Student: " + a.getFirstName() + "\t"
				+ a.getLastName() + "\t  is: \t"
				+ getDivision(getPercentage(a)));

		System.out.println("Division for Student: " + b.getFirstName() + "\t"
				+ b.getLastName() + "\t  is: \t"
				+ getDivision(getPercentage(b)));
	}

	public Float getPercentage(Student student) {
		assert (student != null && student.getMarks() != null);
		System.out.println("Start calculating division for Student: "
				+ student.getFirstName() + "\t" + student.getLastName());

		Integer totalMarks = SimpleCalc.sum(student.getMarks());
		Float percentage = SimpleCalc.division(student.getMarks().length,
				totalMarks);
		System.out.println("Calculation Complete");
		return percentage;
	}

	public String getDivision(Float percentage) {

		if (Float.compare(percentage, 60.0f) > 0) {
			return Division.getValue(Division.FIRST);
		} else if (Float.compare(percentage, 60.0f) < 0
				&& Float.compare(percentage, 50.0f) > 0) {
			return Division.getValue(Division.SECOND);
		} else if (Float.compare(percentage, 50.0f) < 0
				&& Float.compare(percentage, 40.0f) > 0) {
			return Division.getValue(Division.THIRD);
		} else if (Float.compare(percentage, 40.0f) < 0) {
			return Division.getValue(Division.FAILED);
		}

		return null;
	}

	public void changeName(Student student, String newName,
			boolean changeFirstName) {
		if (changeFirstName) {
			student.setFirstName(newName);
		} else {
			student.setLastName(newName);
		}
	}

	public void printFirstKMaxNumbers(int[] nums, int k) {

		int[] maxNums = new int[k];
		for (int n : nums) {
			int f = n;
			for (int j = 0; j < k; j++) {
				int temp = 0;
				if (maxNums[j] < f) {

					temp = maxNums[j];

					maxNums[j] = f;
					f = temp;

				}
			}

		}

		for (int j = 0; j < k; j++) {
			System.out.println(maxNums[j]);
		}
	}

	public void printMininumFromInput(Integer[] nums) {
		int min = nums[0];
		for (Integer num : nums) {
			if (num < min) {
				min = num;
			}
		}

		System.out.println("The minium number is: " + min);
	}

	/**
	 * {@link https://www.hackerrank.com/challenges/flatland-space-stations}
	 */
	public static void printMaxDistance(int n, int m, int[] stations) {
		// Check for invalid data
		if ((m < 1 || m > n) || (n < 1 || n > 100000)) {
			return;
		}

		// if each city has a space station, then max distance = 0;
		if (n == m) {
			System.out.println("0");
			return;
		}

		// Lets find out the cities that are not space stations
		int justCities[] = new int[n - m];
		boolean isStation = false;
		for (int i = 0; i < justCities.length; i++) {
			isStation = false;
			for (int j = 0; j < stations.length; j++) {
				if (i == stations[j]) {
					// this means city 'i' is a space station so break
					isStation = true;
					break;
				}
			}

			if (!isStation) {
				justCities[i] = i;
			}
		}

		// This variable signifies the min distance of a city from a space
		// station
		int min = 0;
		int temp = 0;

		// This variable signifies the overall maximum distance of a city from a
		// space station
		int overallMax = 0;
		for (int i = 0; i < justCities.length; i++) {
			for (int j = 0; j < m; j++) {
				if (stations[j] > justCities[i]) {
					temp = stations[j] - justCities[i];
				} else {
					temp = justCities[i] - stations[j];
				}

				if (j == 0) {
					min = temp;
				}

				min = Math.min(temp, min);
			}
			overallMax = Math.max(overallMax, min);
		}

		System.out.println(overallMax);
	}
	
}
