import stanford.karel.*;

public class Homework4_2 extends SuperKarel {

    public void run() {
        if (frontIsBlocked()) {
            //Special case One cell world
            putBeeper();
        } else {
            // fill the firs row in
            putBeeper();
            markWestBorderOfRowAbove();
            while (frontIsClear()) {
                if (noBeepersPresent()) {
                    putBeeper();
                }
                move();
            }
            putBeeper();
            if (leftIsClear()) {
                turnAround();
                if (rightIsClear()) {
                    move();
                    turnRight();
                    move();
                    if (beepersPresent()) {
                        return;
                    }
                    putBeeper();
                    turnLeft();
                }
            } // end of fill the firs row in

            while (frontIsClear()) {
                goToStart();
                markWestBorderOfRowAbove();
                fillRow();
                turnAround();
                if (rightIsClear()) { //it means above
                    //There is one more row. Mark the east border
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
                    //There are not more rows to fill in. Just fill the current and stop working
                    goToStart();
                    fillRow();
                    break;
                }
                turnAround();
                if (rightIsClear()) {
                    move();
                    turnRight();
                    move();
                    if (beepersPresent()) {
                        break;
                    }
                    putBeeper();
                    turnLeft();
                }
            }
        }
    }

    private void fillRow() {
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

    private void markWestBorderOfRowAbove() {
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
