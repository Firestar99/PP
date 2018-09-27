package io.dama.par.coll;

import java.util.Vector;

class ExperimentVector {
	
	Integer countA;
	Integer countB;
	Vector<Integer> list;
	
	void work(final int size) throws InterruptedException {
		this.countA = 0;
		this.countB = 0;
		this.list = new Vector<>();
		final Thread t1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				this.list.add(1);
			}
		});
		final Thread t2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				this.list.add(1);
			}
		});
		final Thread t3 = new Thread(() -> {
			for (int i = 0; i < (size * 2); i++) {
				this.countA += this.list.get(i);
			}
		});
		final Thread t4 = new Thread(() -> {
			for (int i = (size * 2) - 1; i >= 0; i--) {
				this.countB += this.list.get(i);
			}
		});
		final long now = System.currentTimeMillis();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		System.out.printf("Lauf %s, i=%d, Zeitdauer: %dms (%s)\n",
				(this.countA.equals(this.countB)) ? "ok" : "fehlerhaft", size, System.currentTimeMillis() - now,
				"Vector");
	}
}
