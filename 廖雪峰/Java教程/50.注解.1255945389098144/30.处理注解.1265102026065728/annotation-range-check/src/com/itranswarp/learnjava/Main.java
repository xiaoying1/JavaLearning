package com.itranswarp.learnjava;

import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person("Bob", "Beijing", 20);
		Person p2 = new Person("", "Shanghai", 20);
		Person p3 = new Person("Alice", "Shanghai", 199);
		for (Person p : new Person[] { p1, p2, p3 }) {
			try {
				check(p);
				System.out.println("Person " + p + " checked ok.");
			} catch (IllegalArgumentException e) {
				System.out.println("Person " + p + " checked failed: " + e);
			}
		}
	}

	static void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
		for (Field field : person.getClass().getFields()) {
			Range range = field.getAnnotation(Range.class);
			if (range != null) {
				Object value = field.get(person);
				// TODO:
				if (value instanceof String) {
					// 值是字符串
					String s = (String) value;

					if (s.length() < range.min() || s.length() > range.max()) {
						throw new IllegalArgumentException("Invalid field: " + field.getName());
					}
				} else if (value instanceof Integer) {
					// 值是数字
					Integer n = (Integer) value;
					if (n < range.min() || n > range.max()) {
						throw new IllegalArgumentException("Invalid field: " + field.getName());
					}
				}
			}
		}
	}
}
