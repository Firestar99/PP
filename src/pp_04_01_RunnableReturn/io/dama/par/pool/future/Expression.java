package pp_04_01_RunnableReturn.io.dama.par.pool.future;

@FunctionalInterface
public interface Expression<T> {
	
	public T eval();
}
