package pp_12_00_PresentationCode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
	
	public static void main(final String[] args) {
		final String[] weasleys = {"Arthur", "Molly", "Bill", "Charlie", "Percy", "Fred", "George", "Ron", "Ginny"};
		final List<String> st1 = Arrays.asList(weasleys);
		System.out.println(st1.stream() //
				.map(s -> s.toUpperCase()) //
				.map(s -> s.indexOf("y")).filter(n -> n > 3) //
				.map(n -> n - 3).reduce(0, (a, b) -> a + b));
		
		final Object[] res = Main.transfer(weasleys, (Function<String, Integer>) s -> s.length());
		Arrays.asList(res).stream().forEach(s -> System.out.println(s));
	}
	
	public static <T, R> R[] transfer(final T[] array, final Function<T, R> func) {
		final R[] res = (R[]) new Object[array.length];
		for (int i = 0; i < array.length; i++) {
			res[i] = func.apply(array[i]);
		}
		return res;
	}
}
