package ua.ukma.distedu.ykrukovska.unit2;

import stanford.karel.Karel;

public class Practice2_PickUpNewspapper extends Karel {

    public void run() {
        goToNewspapper();
        pickBeeper();
        goHome();
    }

    private void goHome() {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        if (frontIsBlocked()) {
            if (rightIsClear()) {
                turnRight();
            }
            while (frontIsClear()) {
                move();
            }
            if (facingWest()) {
                turnAround();
            }
            if (facingNorth()) {
                turnRight();
            }
        }
    }

    private void goToNewspapper() {
        while (leftIsBlocked() && frontIsClear()) {
            move();
        }

        if (frontIsBlocked()) {
            turnRight();
            while (leftIsBlocked()) {
                move();
            }
            turnLeft();
            move();
        }
    }

    private void turnAround() {
        turnLeft();
        turnLeft();
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}
