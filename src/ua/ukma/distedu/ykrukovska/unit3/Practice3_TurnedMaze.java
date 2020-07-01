package ua.ukma.distedu.ykrukovska.unit3;

import stanford.karel.SuperKarel;

public class Practice3_TurnedMaze extends SuperKarel {

    public void run() {
        if (beepersPresent()) {
            pickBeeper();
        }
        check();
        while (frontIsClear()) {
            goNorth();
            goSouth();
            if (facingEast() && frontIsBlocked()) {
                turnLeft();
                while (frontIsClear()) {
                    move();
                }
                turnRight();
            }
            if (facingNorth() && frontIsBlocked() && rightIsBlocked()) {
                turnRight();
            }
        }

    }

    private void goSouth() {
        movingSouth();
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

    private void movingSouth() {
        while (facingSouth() && frontIsClear()) {
            move();
            doCleaning();
        }
    }

    private void goNorth() {
        movingNorth();
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

    private void movingNorth() {
        while (facingNorth() && frontIsClear()) {
            move();
            doCleaning();
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
