package pp_12_03_Reduce.tpe.streams.mapreduce;

import java.util.List;
import java.util.stream.Stream;

/**
 * Spiele auflisten.
 */
public class MapReduceGames {
	
	/**
	 * Hauptmethode.
	 *
	 * @param args Kommandozeilenargumente.
	 */
	public static void main(final String[] args) {
		final GameDatabase db = new GameDatabase();
		final List<ComputerGame> games = db.getGames();
		
		// Abweichung des Metascores von dem Userscore
		// als Quadratisches Mittel berechnen.
		Stream<ComputerGame> stream = games.stream();
		
		// Abweichung als RMS ("root mean square")
		stream = games.stream();
		final double rms = 0; // TODO: berechnen statt 0
		
		// Abweichung als Arithmetisches Mittel
		stream = games.stream();
		final double mw = 0; // TODO: berechnen statt 0
		
		System.out.printf("Abweichung Metascore: Durchschnitt=%.2f%n", mw);
		System.out.printf("Abweichung Metascore: RMS=%.2f%n", rms);
	}
}
