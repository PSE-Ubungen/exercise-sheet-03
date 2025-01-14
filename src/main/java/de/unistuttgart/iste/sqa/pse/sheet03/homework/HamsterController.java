package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * A control unit to control hamsters.
 *
 * A HamsterController knows some behavioural patterns for hamsters and makes
 * given hamsters act according to those patterns.
 *
 * @author Sarah Stieß
 *
 */
public class HamsterController {

	/*@
	@ requires hamster != null;
	@ ensures !hamster.grainAvailable;
	@*/
	/**
	 * Pick all grains on the hamster's tile.
	 *
	 * @param hamster The hamster that picks the grains.
	 */
	void pickAllGrains(Hamster hamster) {
		hamster.write("Executing pickAllGrains:");
		Integer counter = 0;
		while (hamster.grainAvailable()) {
			hamster.pickGrain();
			counter++;
		}
		hamster.write(String.format("%d available grains on my Tile. I picked all of them!", counter));
	}

	/*@
	@ requires hamster != null;
	@ ensures hamster.mouthEmpty;
	@*/
	/**
	 * Put all of the hamster's grain on the current tile.
	 *
	 * @param hamster The hamster that puts the grains.
	 */
	void putAllGrains(Hamster hamster) {
		hamster.write("Executing putAllGrains:");
		Integer counter = 0;
		while (!hamster.mouthEmpty()) {
			hamster.putGrain();
			counter++;
		}
		hamster.write(String.format("I had %d grains in my mouth. I put all of them on my Tile!", counter));
	}

	/*@
	@ requires hamster != null;
	@ requires hamster.frontIsClear;
	@ ensures true;
	@*/
	/**
	 * The Hamster moves in a half circle.
	 * 
	 * @param hamster The hamster that moves in a half circle.
	 */ 
	void moveHalfCircle(Hamster hamster) {
		hamster.write("Executing moveHalfCircle:");
		hamster.turnLeft();
		hamster.move();
		hamster.turnLeft();
		hamster.write("I ran a half circle!");
	}

	/*@
	@ requires hamster != null;
	@ ensures true;
	@*/
	/**
	 * The Hamster picks up all Grains while he walks to the next Wall.
	 * 
	 * @param hamster The hamster that pickup the grains and moves.
	 */ 
	void pickAllGrainsInRow(Hamster hamster) {
		hamster.write("Executing pickAllGrainsInRow:");
		while (hamster.frontIsClear()) {
			pickAllGrains(hamster);
			hamster.move();
		}
		hamster.write("I picked all grains, on the tile behind me!");
	}

	/*@
	@ requires hamster != null;
	@ ensures true;
	@*/
	/**
	 * Turns the Hamster a specific time to the Left Side.
	 * 
	 * @param hamster The hamster that turns a specific time.
	 * @param turns The specific amount of turns.
	 */ 
	void turnHamsterLeft(Hamster hamster, Integer turns) {
		hamster.write("Executing turnHamster:");
		for (Integer i = 0; i < turns; i++) {
			hamster.turnLeft();
		}
		hamster.write(String.format("I turned %d times!", turns));
	}

	/*@
	@ requires hamster != null;
	@ ensures true;
	@*/
	/**
	 * The Hamser moves a specific amount of steps while hes not facing a wall.
	 * 
	 * @param hamster The hamster that moves.
	 * @param steps The specific amount of steps.
	 */ 
	void doSteps(Hamster hamster, Integer steps) {
		hamster.write("Executing doSteps:");
		Integer counter = 0;
		for (; counter < steps && hamster.frontIsClear(); counter++) {
			hamster.move();
		}
		hamster.write(String.format("I moved %d out of %d steps!", counter, steps));
	}
}
