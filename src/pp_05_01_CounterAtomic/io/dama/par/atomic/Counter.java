package pp_05_01_CounterAtomic.io.dama.par.atomic;

class Counter {
	
	private int c = 0;
	
	public void increment() {
		this.c++;
	}
	
	public void decrement() {
		this.c--;
	}
	
	public int value() {
		return this.c;
	}
}
