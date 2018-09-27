package pp_09_00_PresentationCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachInIterator<T> {
	
	void iterate1() {
		final List<T> l = new ArrayList<>();
		for (final T e : l) {
			System.out.println(e);
		}
	}
	
	void iterate2() {
		final List<T> l = new ArrayList<>();
		final Iterator it = l.iterator();
		while (it.hasNext()) {
			final T e = (T) it.next();
			System.out.println(e);
		}
	}
}
