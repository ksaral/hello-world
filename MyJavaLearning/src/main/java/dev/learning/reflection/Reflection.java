package dev.learning.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	private static Class<?> cls;
	private static Object object;

	public static void setClass(Class<?> cls) {
		Reflection.cls = cls;
	}
	public static Class<?> getCls() {
		return cls;
	}

	public static Object getObject() {
		return object;
	}


	public static void testMethod(String name, Class<?>... parameterTypes)
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Method declaredMethod = cls.getDeclaredMethod(name, parameterTypes);
		declaredMethod.setAccessible(true);
	}

	public static void testConstrutor(Class<?>... parameterTypes)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Constructor<?> declaredConstructor = cls
				.getDeclaredConstructor(parameterTypes);
		declaredConstructor.setAccessible(true);
		object = declaredConstructor.newInstance();
	}

	public static void testField(String name) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		Field privateField = cls.getDeclaredField(name);
		privateField.setAccessible(true);
		System.out.println("Value is: " + privateField.get(object));
	}

}
