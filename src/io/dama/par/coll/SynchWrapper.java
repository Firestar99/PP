package io.dama.par.coll;

import java.util.List;

public class SynchWrapper<T> {
	
	private final List<T> decorated;
	
	// s. public static <K, V> boolean compare in:
	// https://docs.oracle.com/javase/tutorial/java/generics/methods.html
	// "For static generic methods, the type parameter section must appear
	// before the method's return type."
	static <T> List<T> synchronizedList(final List<T> list) {
		return (List<T>) new SynchWrapper<>(list);
	}
	
	private SynchWrapper(final List<T> list) {
		this.decorated = list;
	}
}
