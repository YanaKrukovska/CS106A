package ua.ukma.distedu.ykrukovska.unit4;

import stanford.karel.SuperKarel;

public class Homework4_BeeperPyramidBetter extends SuperKarel {

    public void run() {
        checkIfMovementIsPossible();
        fillFirstRow();
        goUp();
        putEndBeeperWest();
        fillRowWest();
        putEndBeeperEast();
        fillRowEast();
        turnLeft();
        putEndBeeperWest();
        fillRowWest();
    }

    private void checkIfMovementIsPossible() {
        if (frontIsBlocked()) {
            putBeeper();
        }
    }

    private void fillRowEast() {
        while (frontIsClear()) {
            beeper();
            move();
            if (beepersPresent() && facingEast()) {
                turnAround();
                move();
                if (rightIsClear()) {
                    turnRight();
                    move();
                    beeper();
                }
                break;
            }
        }
    }

    private void beeper() {
        if (noBeepersPresent()) {
            putBeeper();
        }

    }

    private void fillRowWest() {
        while (frontIsClear()) {
            beeper();
            move();
            if (beepersPresent() && facingWest()) {
                turnAround();
                move();
                if (leftIsClear()) {
                    turnLeft();
                    move();
                    beeper();
                }
                break;
            }
        }
        turnRight();
    }

    private void putEndBeeperWest() {
        if (rightIsClear()) {
            move();
            turnRight();
            move();
            putBeeper();
            turnAround();
            move();
            turnRight();
        }
    }

    private void putEndBeeperEast() {
        if (leftIsClear()) {
            move();
            turnLeft();
            move();
            putBeeper();
            turnAround();
            move();
            turnLeft();
        }
    }

    private void goUp() {
        if (leftIsClear()) {
            turnAround();
            move();
            turnRight();
            move();
            turnLeft();
            putBeeper();
        }
    }

    private void fillFirstRow() {
        if (frontIsClear()) {
            putBeeper();
            move();
            markUpperRow();
            while (frontIsClear()) {
                putBeeper();
                move();
            }
            putBeeper();
        }
    }

    private void markUpperRow() {
        if (leftIsClear()) {
            turnLeft();
            move();
            putBeeper();
            turnAround();
            move();
            turnLeft();
        }
    }
}