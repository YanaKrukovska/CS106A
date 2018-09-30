import stanford.karel.*;

public class Homework4_2 extends SuperKarel {

    public void run() {
        if (frontIsBlocked()) {
            putBeeper();

        } else {
            fillFirstRow();
            while (frontIsClear()) {
                goToStart();
                markWestBorder();
                fillNextRow();

                turnAround();
                if (rightIsClear()) {

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
                    goToStart();
                    fillNextRow();
                    break;
                }

                markEastBorder();
            }
        }
    }

    private void fillNextRow() {
        if (beepersPresent()) {
            move();
        }
        while (noBeepersPresent()) {
            putBeeper();
            move();

        }

    }

    private void goToStart() {

        do {
            move();

        } while (noBeepersPresent());
        turnAround();

    }

    private void fillFirstRow() {

        putBeeper();
        markWestBorder();
        while (frontIsClear()) {
            if (noBeepersPresent()) {
                putBeeper();
            }
            move();
        }
        putBeeper();
        if (leftIsClear()) {
            markEastBorder();
        }

    }

    private void markEastBorder() {

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
