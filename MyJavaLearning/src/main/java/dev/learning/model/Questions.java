package dev.learning.model;

/**
 * 
 * @author saral.khare
 * @since 15th August 2016
 * @category Interview Questions
 * @version 0.0
 *
 */
public final class Questions {

	// What is Synchronized method?

	/*
	 * Synchronized methods are the one which can be accessed by only one Thread
	 * at a time. If a particular thread is accessing a Synchronized method, and
	 * if another thread needs to access the same method, then it has to wait
	 * until the first thread releases the lock on the method. Only then the
	 * second thread can access the same method. Synchronized keyword is
	 * applicable only to methods. It cannot be used in variables, classes,
	 * parameters etc.
	 */

	// What is a native method? Any example?

	/*
	 * Native methods are implemented in platform dependent code (for example in
	 * C language). Most of the methods in Thread class are native
	 * implementation.
	 */

	// Where are the local variables stored in JVM?

	/*
	 * The variables which are declared within a method are called Local
	 * variables. Once a local variable is created inside the method, then its
	 * memory reference in created in the Java Stack. Once the method completes
	 * it execution, the Java stack for this method will be elapsed hence the
	 * Local variable will be removed from the Java stack and no longer be
	 * reclaimed or used. If the local variable is an Object, then the actual
	 * object creation happens in the Java Heap but the object reference will be
	 * placed in the Java Stack.
	 */

	// Can Local variable be final?

	/*
	 * Yes. Local variables can be marked as "final" variables but it cannot be
	 * one of public, transient, volatile, static etc
	 */

	// Data structure to be used when multiple threads access shared data in a
	// web application?

	/*
	 * In a multi threaded application the best data structure to be used is
	 * ConcurrentHashMap. It ensures concurrency in a thread safe manner.
	 */

	// What is enum?

	/*
	 * Enum is nothing but an enumerated list with a set of pre-defined values.
	 * You can create a variable with set of pre-defined values, so that at any
	 * point of time, it can have one of the values defined. By this way, you
	 * are making sure that your variable cannot have another values except the
	 * defined ones.
	 */

}
