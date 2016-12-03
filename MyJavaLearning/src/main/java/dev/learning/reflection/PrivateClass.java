package dev.learning.reflection;

public class PrivateClass {
	private String string;

	public String getString() {
		printString();
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	private void printString() {
		System.out.println(string);
	}

}
