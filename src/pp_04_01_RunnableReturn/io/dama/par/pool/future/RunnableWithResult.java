package pp_04_01_RunnableReturn.io.dama.par.pool.future;

public class RunnableWithResult<T> implements Runnable {
	
	private final Expression<T> expr;
	
	public RunnableWithResult(final Expression<T> expr) {
		this.expr = expr;
	}
	
	@Override
	public void run() {
		// hier programmieren
	}
	
	public synchronized Boolean isAvailable() {
		// hier programmieren
		return null;
	}
	
	public synchronized T get() {
		// hier programmieren
		return null;
	}
}
