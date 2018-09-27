package pp_01_02_Runnable.io.dama.par.threads.runnable;

public class Starter {
	
	static int WORKERS = 200;
	
	public static void main(final String[] args) {
		for (int i = 0; i < WORKERS; i++) {
			final Thread t = new Thread(new MyWorker(), String.format("Worker-%03d", i));
			t.start();
		}
	}
}
