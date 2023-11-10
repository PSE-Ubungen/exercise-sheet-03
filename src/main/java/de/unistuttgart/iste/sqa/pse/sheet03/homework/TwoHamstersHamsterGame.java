package de.unistuttgart.iste.sqa.pse.sheet03.homework;

/**
 * Describe the class TwoHamstersHamsterGame here.
 *
 * @author LevinKohler DhurimHoxha
 * @version 1.0
 */
public class TwoHamstersHamsterGame extends InternalTwoHamstersHamsterGame {

	@Override
	void hamsterRun() {
		
		controller.doSteps(paule, 2);
		controller.turnHamsterLeft(paule, 3);

		
		for (int i = 0; i < 3; i++) {
			controller.pickAllGrainsInRow(paule);
			controller.pickAllGrains(paule);
			controller.turnHamsterLeft(paule, 3);

			controller.pickAllGrainsInRow(paula);
			controller.pickAllGrains(paula);
			controller.turnHamsterLeft(paula, 1);
		}
		
		controller.doSteps(paule, 1);
		controller.doSteps(paula, 1);
		controller.turnHamsterLeft(paule, 3);
		controller.turnHamsterLeft(paula, 1);
		controller.pickAllGrainsInRow(paule);
		controller.pickAllGrains(paule);
		controller.pickAllGrainsInRow(paula);
		controller.pickAllGrains(paula);
		controller.turnHamsterLeft(paule, 1);
		controller.turnHamsterLeft(paula, 3);
		controller.doSteps(paule, 2);
		controller.doSteps(paula, 2);
		controller.putAllGrains(paule);
		controller.putAllGrains(paula);
		
	}
}
