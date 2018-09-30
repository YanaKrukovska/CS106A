import stanford.karel.*;

public class Homework4_2 extends SuperKarel {

	public void run() {
		fillFirstRow();
		while (true) {
			goToStart();
			markWestBorder();
			fillNextRow();
			
			turnAround();
			if(rightIsClear()) {
				move();
				turnRight();
				move();
				if(beepersPresent()) {
					break;
				} else {
					turnAround();
					move();
					turnLeft();
					move();
					
				}
			}
			
			markEastBorder();
		}
		
	}
	private void fillNextRow() {
		while (noBeepersPresent()) {
			putBeeper();
			move();

		}

	}

	private void goToStart() {
		turnLeft();
		move();
		while (noBeepersPresent()) {
			move();
		}
		turnAround();

	}

	private void fillFirstRow() {
		putBeeper();
		markWestBorder();
		while (frontIsClear()) {
			putBeeper();
			move();
		}
		putBeeper();
		markEastBorder();

	}

	private void markEastBorder() {
		turnAround();
		if (rightIsClear()) {
			move();
			turnRight();
			move();
			putBeeper();
		}
	}

	private void markWestBorder() {
		if (frontIsClear() && leftIsClear()) {
			move();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
		}
	}

}
