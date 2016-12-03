package dev.learning.inheritance;

public class Dog implements Animal, Sounds {
	private int height;

	public void run() {
		System.out.println(DOG + RUNS);
	}

	public void sound() {
		System.out.println(DOG + BARKS);
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return DOG;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub

	}
}
