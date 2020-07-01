package ua.ukma.distedu.ykrukovska.unit4;

import stanford.karel.SuperKarel;

public class Homework4_CleanRooms extends SuperKarel {

    public void run() {
        check();
        while (frontIsClear()) {
            doJob();
        }
    }

    private void check() {
        if (frontIsClear()) {
            move();
        }
    }

    private void doJob() {
        if (noBeepersPresent()) {
            clearTheCell();
        }
        if (beepersPresent()) {
            fillTheCell();
        }
    }

    private void clearTheCell() {
        if (noBeepersPresent()) {
            turnRight();
            move();
            turnAround();
            clean();

            while (frontIsClear()) {
                move();
                clean();

            }
            turnAround();
            move();
            turnLeft();
            check();
            check();
        }

    }

    private void fillTheCell() {
        if (beepersPresent()) {
            turnRight();
            move();
            turnAround();
            clean();
            while (frontIsClear()) {
                move();
                clean();
            }
            turnAround();
            while (frontIsClear()) {
                putBeeper();
                move();
            }
            putBeeper();
            turnAround();
            move();
            turnRight();
            check();
            check();
        }
    }

    private void clean() {
        while (beepersPresent()) {
            pickBeeper();
        }
    }

}