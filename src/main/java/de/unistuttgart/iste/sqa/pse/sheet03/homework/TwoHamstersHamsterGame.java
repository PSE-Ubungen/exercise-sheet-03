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
		controller.turnHamster(paule, 3);

		
		for (int i = 0; i < 3; i++) {
			controller.pickAllGrainsInRow(paule);
			controller.pickAllGrains(paule);
			controller.turnHamster(paule, 3);

			controller.pickAllGrainsInRow(paula);
			controller.pickAllGrains(paula);
			controller.turnHamster(paula, 1);
		}
		
		controller.doSteps(paule, 1);
		controller.doSteps(paula, 1);
		controller.turnHamster(paule, 3);
		controller.turnHamster(paula, 1);
		controller.pickAllGrainsInRow(paule);
		controller.pickAllGrains(paule);
		controller.pickAllGrainsInRow(paula);
		controller.pickAllGrains(paula);
		controller.turnHamster(paule, 1);
		controller.turnHamster(paula, 3);
		controller.doSteps(paule, 2);
		controller.doSteps(paula, 2);
		controller.putAllGrains(paule);
		controller.putAllGrains(paula);
		
	}
}
