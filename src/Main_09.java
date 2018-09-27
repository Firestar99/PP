import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main_09 {
	
	interface Type {
	
	}
	
	interface ValType {
	
	}
	
	interface KeyType {
	
	}
	
	public static void main(final String[] args) {
		final List<Type> list = Collections.synchronizedList(new ArrayList<Type>());
		
		final Collection<Type> myCollection = new ArrayList<>();
		final Collection<Type> c = Collections.synchronizedCollection(myCollection);
		synchronized (c) {
			for (final Type e : c) {
				Main_09.foo(e);
			}
		}
		
		final Map<KeyType, ValType> m = Collections.synchronizedMap(new HashMap<KeyType, ValType>());
		final Set<KeyType> s = m.keySet();
		synchronized (m) {
			for (final KeyType k : s) {
				Main_09.foo(k);
			}
		}
	}
	
	private static void foo(final Object e) {
	
	}
}
