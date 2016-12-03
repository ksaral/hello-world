package dev.learning.inheritance;

public class Cat implements Animal, Sounds {
	private int height;
	private String name;

	public Cat() {
		height = 10;
		name = "billi";
	}

	public void run() {
		System.out.println(CAT + RUNS);
	}

	public void sound() {
		System.out.println(CAT + MEOWS);
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return CAT;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
