package io.dama.par.pool.future;

@FunctionalInterface
public interface Expression<T> {
	
	public T eval();
}
