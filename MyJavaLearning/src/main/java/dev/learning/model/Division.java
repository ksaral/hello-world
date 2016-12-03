package dev.learning.model;

public enum Division {

	FIRST, SECOND, THIRD, FAILED;

	public static String getValue(Division division) {
		return division.toString();
	}

}
