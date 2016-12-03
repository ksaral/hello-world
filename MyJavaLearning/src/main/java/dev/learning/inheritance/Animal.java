package dev.learning.inheritance;

public interface Animal {
	String DOG = "DOG";
	String CAT = "CAT";
	String COW = "COW";
	String LION = "LION";
	String TIGER = "TIGER";

	void run();

	void sound();

	int getHeight();

	void setHeight(int height);
	
	String getName();
	
	void setName(String name);

}
