package ua.ukma.distedu.ykrukovska.unit3;

import stanford.karel.SuperKarel;

public class Practice3_Maze extends SuperKarel {

    public void run() {
        if (beepersPresent()) {
            pickBeeper();
        }
        check();
        while (frontIsClear()) {
            goEast();
            goWest();
            if (facingNorth() && frontIsBlocked() && rightIsBlocked()) {
                turnRight();
            }
        }

    }

    private void goWest() {
        movingWest();
        if (frontIsBlocked() && rightIsClear()) {
            turnRight();
            move();
            turnRight();
        }
        if (rightIsBlocked()) {
            turnAround();
            while (frontIsClear()) {
                move();

            }

        }
        doCleaning();

    }

    private void movingWest() {
        while (facingWest() && frontIsClear()) {
            doCleaning();
            move();
        }
    }

    private void goEast() {
        movingEast();
        if (frontIsBlocked() && leftIsClear()) {
            turnLeft();
            move();
            turnLeft();

        }
        if (leftIsBlocked()) {
            turnAround();
            while (frontIsClear()) {
                move();
            }
        }
        doCleaning();
    }

    private void movingEast() {
        while (facingEast() && frontIsClear()) {
            doCleaning();
            move();
        }
    }

    private void doCleaning() {
        while (beepersPresent()) {
            pickBeeper();
        }
    }

    private void check() {
        if (frontIsBlocked()) {
            turnLeft();
        }
    }

}
