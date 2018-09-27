package io.dama.par.pool;

public interface Callable<V> {
	
	public V call() throws Exception;
}
