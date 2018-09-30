import stanford.karel.*;

public class Homework4_2 extends SuperKarel {

	public void run() {
		if (frontIsBlocked()) {
			System.out.println("single");
			putBeeper();
		} else {
			fillFirstRow();
			while (frontIsClear()) {
				goToStart();
				markWestBorder();
				fillNextRow();

				turnAround();
				if (rightIsClear()) {
					System.out.println("rightIsClear");

					move();
					turnRight();
					move();
					if (beepersPresent()) {
						break;
					} else {
						turnAround();
						move();
						turnLeft();
						move();
					}
				} else {
					System.out.println("rightIsNotClear");
					goToStart();
					fillNextRow();
					break;
				}

				markEastBorder();
			}
		}
	}

	private void fillNextRow() {
		System.out.println("fillNextRow");
		if(beepersPresent()) {
			move();
		}
		while (noBeepersPresent()) {
			putBeeper();
			move();

		}

	}
	


	private void goToStart() {
		System.out.println("goToStart");
		printOrientation();
		System.out.println("-----");
		do { move(); 
		System.out.println("*");

		}
		while (noBeepersPresent());
		turnAround();
		printOrientation();
		System.out.println("goToStartEnd");

	}

	private void fillFirstRow() {
		System.out.println("fillFirstRow");
		printOrientation();
		putBeeper(); 
		markWestBorder();
		while (frontIsClear()) {
			if(noBeepersPresent()){
					putBeeper(); }
			move();
		}
		putBeeper();
		if(leftIsClear()) {
		markEastBorder();
		}
		printOrientation();
	}

	private void markEastBorder() {
		System.out.println("markEastBorder");
		turnAround();
		if (rightIsClear()) {
			move();
			turnRight();
			move();
			putBeeper();
			turnLeft();
		}
	}

	private void markWestBorder() {
		if (frontIsClear() && leftIsClear()) {
			System.out.println("markWestBorder");
			move();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
		}
	}
	
	private void printOrientation() {
		if(facingNorth()) {
			System.out.println("North");
		} else if (facingSouth()) {
			System.out.println("South");
		}else if (facingEast()) {
			System.out.println("East");
	} else {
			System.out.println("west");
	} }

}
