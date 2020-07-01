package ua.ukma.distedu.ykrukovska.exam;

import stanford.karel.SuperKarel;

public class ExamTask extends SuperKarel {

    public int beeperAmount = 0;

    public void run() {
        collectBeepersInFirstWorld();
        getToTheSecondWorld();
    }

    private void putBeepersInSecondWorld() {
        int stepCounter = 0;
        for (int i = 0; i < beeperAmount; i++) {
            putBeeper();
            if (frontIsClear()) {
                stepCounter++;
                move();
            }
            if (frontIsBlocked() && rightIsClear()) {
                putBeeper();
                goBackToStartOfRow(stepCounter);
                stepCounter = 0;
            }
        }
    }

    private void goBackToStartOfRow(int stepCounter) {
        turnAround();
        for (int i = 1; i <= stepCounter; i++) {
            move();
        }
        turnLeft();
        move();
        turnLeft();
    }

    private void getToTheSecondWorld() {
        if (facingNorth() && frontIsBlocked() && rightIsBlocked() && leftIsClear()) {
            turnAround();
            while (frontIsClear() && leftIsBlocked()) {
                move();
            }
            if (leftIsClear()) {
                turnLeft();
                move();
                turnLeft();
                while (frontIsClear()) {
                    move();
                }
                turnRight();
            }
        } else if (facingSouth() && frontIsBlocked() && leftIsBlocked() && rightIsClear()) {
            turnAround();
            while (frontIsClear() && rightIsBlocked()) {
                move();
            }
            if (rightIsClear()) {
                turnRight();
                move();
                turnLeft();
                while (frontIsClear()) {
                    move();
                }
                turnRight();
            }
        } else {
            turnRight();
        }

        putBeepersInSecondWorld();
    }

    private void collectBeepersInFirstWorld() {
        turnLeft();
        if (frontIsBlocked() && rightIsBlocked()) {
            checkIfBeepersPresent();
            turnRight();

        }

        while (frontIsClear()) {
            checkIfBeepersPresent();
            move();

            if (facingNorth() && frontIsBlocked() && rightIsClear()) {
                checkIfBeepersPresent();
                turnRight();
                move();
                checkIfBeepersPresent();
                turnRight();
            } else if (facingSouth() && frontIsBlocked() && leftIsClear()) {

                checkIfBeepersPresent();
                turnLeft();
                move();
                checkIfBeepersPresent();
                turnLeft();
            }
        }
    }

    private void checkIfBeepersPresent() {
        while (beepersPresent()) {
            pickBeeper();
            beeperAmount++;
        }
    }

}
