package ua.ukma.distedu.ykrukovska.unit2;

import stanford.karel.Karel;

public class Homework2_EmptyMaze extends Karel {

    public void run() {
        while (facingEast()) {
            goEast();
            while (facingWest()) {
                goWest();
            }
        }
    }

    private void goWest() {
        while (rightIsBlocked()) {
            if (frontIsBlocked() && rightIsBlocked() && leftIsBlocked()) {
                break;
            }
            move();
            if (rightIsClear()) {
                turnRight();
                goNorth();
                turnRight();
            }
        }
    }

    private void goEast() {
        while (leftIsBlocked()) {
            if (frontIsBlocked() && rightIsBlocked() && leftIsBlocked()) {
                break;
            }
            move();
            if (leftIsClear()) {
                turnLeft();
                goNorth();
                turnLeft();
            }
        }
    }

    private void goNorth() {
        while (frontIsClear()) {
            move();
        }
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
