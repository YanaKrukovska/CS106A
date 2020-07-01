package ua.ukma.distedu.ykrukovska.unit3;

import stanford.karel.SuperKarel;

public class Homework3_Checkerboard extends SuperKarel {

    public void run() {
        putBeeper();
        check();

        while (frontIsClear()) {
            fillRowEast();
            fillRowWest();
        }
        finish();
    }

    private void finish() {
        if (facingNorth() && rightIsBlocked()) {
            turnRight();
        }
        if (facingNorth() && leftIsBlocked()) {
            turnRight();
        }

    }

    private void fillRowWest() {
        while (facingWest()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
            goUpWest();
        }
    }

    private void goUpWest() {
        if (frontIsBlocked()) {
            if (noBeepersPresent()) {
                turnRight();
                if (frontIsClear()) {
                    move();
                    turnRight();
                    putBeeper();
                }
            } else {
                turnRight();
                if (frontIsClear()) {
                    move();
                    turnRight();
                    move();
                    putBeeper();
                }
            }
        }
    }

    private void fillRowEast() {
        while (facingEast()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
            goUpEast();
        }
    }

    private void goUpEast() {
        if (frontIsBlocked()) {
            if (noBeepersPresent()) {
                turnLeft();
                if (frontIsClear()) {
                    move();
                    turnLeft();
                    putBeeper();
                }
            } else {
                turnLeft();
                if (frontIsClear()) {
                    move();
                    turnLeft();
                    move();
                    putBeeper();
                }
            }
        }
    }

    private void check() {
        if (frontIsBlocked()) {
            turnLeft();
            while (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
                    putBeeper();
                }
            }
        }
    }
}
