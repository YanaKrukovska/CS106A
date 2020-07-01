package ua.ukma.distedu.ykrukovska.unit2;

import stanford.karel.Karel;

public class Practice2_FixColumnsBetter extends Karel {

    public void run() {
        repairColumn();
        goDown();
        while (frontIsClear()) {
            goToNextColumn();
            repairColumn();
            goDown();
        }
    }

    private void goToNextColumn() {
        for (int i = 1; i <= 4; i++) {
            move();
        }

    }

    private void goDown() {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }

    private void turnAround() {
        turnLeft();
        turnLeft();
    }

    private void repairColumn() {
        turnLeft();
        repair();
        while (frontIsClear()) {
            move();
            repair();
        }

    }

    private void repair() {
        if (noBeepersPresent()) {
            putBeeper();
        }
    }
}
