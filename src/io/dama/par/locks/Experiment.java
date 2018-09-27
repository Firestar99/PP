package io.dama.par.locks;

public abstract class Experiment {
	
	final static int WRITES = 1;                                                 // 50
	final static int READS = 9999;                                              // 50
	final static int TRIALS = 100000000 / (Experiment.WRITES + Experiment.READS);
	
	protected int counter;
	
	public void experimentSingle() {
		for (int i = 0; i < Experiment.TRIALS; i++) {
			for (int j = 0; j < Experiment.WRITES; j++) {
				incCounter();
			}
			for (int j = 0; j < Experiment.READS; j++) {
				getCounter();
			}
		}
	}
	
	public void experimentPar() throws InterruptedException {
		final Thread t1 = new Thread(() -> experimentSingle());
		final Thread t2 = new Thread(() -> experimentSingle());
		final long now = System.currentTimeMillis();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.printf("Lauf %s, Zeitdauer: %dms",
				(getCounter() - (2 * Experiment.TRIALS * Experiment.WRITES)) == 0 ? "korrekt" : "fehlerhaft",
				System.currentTimeMillis() - now);
	}
	
	public abstract void incCounter();
	
	public abstract int getCounter();
}
