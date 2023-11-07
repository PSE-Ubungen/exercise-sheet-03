package de.unistuttgart.iste.sqa.pse.sheet03.presence;

import de.hamstersimulator.objectsfirst.external.model.Territory;

import java.io.PrintStream;

/**
 * Please describe this class here.
 *
 * @author LevinKohler DhurimHoxha
 * @version 1.0
 */
public final class ExerciseHamsterGame extends InternalExerciseHamsterGame {
	/**
	 * This {@link PrintStream} object is to be used for exercise 2b).
	 */
	protected final PrintStream output = System.out;

	@Override
	protected void hamsterRun() {
		final Territory territory = game.getTerritory();
		paule.write("Total Grains:" + territory.getTotalGrainCount());
		paule.write("Total Hamsters in Territory:" + territory.getTotalHamsterCount());
		paule.write("Size: " + territory.getTerritorySize().getColumnCount() * territory.getTerritorySize().getRowCount());
	
		System.out.println("Total Grains:" + territory.getTotalGrainCount());
		System.out.println("Total Hamsters in Territory:" + territory.getTotalHamsterCount());
		System.out.println("Size: " + territory.getTerritorySize().getColumnCount() * territory.getTerritorySize().getRowCount());
	}
}