package pp_12_01_StreamsInterneIteration.tpe.streams.iterate;

import java.util.stream.Stream;

/**
 * Spiele auflisten.
 */
public class ListGames {
	
	/**
	 * Hauptmethode.
	 *
	 * @param args Kommandozeilenargumente.
	 */
	public static void main(final String[] args) {
		final GameDatabase db = new GameDatabase();
		
		System.out.println("Interne Iterartion");
		System.out.println();
		Stream<ComputerGame> stream = db.getGames().stream();
		// TODO: Spiele per Lambda-Ausdruck auf der Konsole ausgeben
		
		System.out.println();
		System.out.println();
		System.out.println("Spiele aus 2012");
		stream = db.getGames().stream();
		// TODO: Spiele aus dem Jahr 2012 mit eimem Labda-Ausdruck ausgeben
	}
}
