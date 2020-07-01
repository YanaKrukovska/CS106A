package ua.ukma.distedu.ykrukovska.unit2;

import stanford.karel.Karel;

public class Practice2_FixColumns extends Karel {

    public void run() {
        repairColumn();

        while (frontIsClear()) {
            for (int i = 1; i <= 4; i++) {
                if (frontIsClear()) {
                    move();
                }
            }
            repairColumn();
        }
    }

    private void repairColumn() {
        turnLeft();
        do {
            if (noBeepersPresent()) {
                putBeeper();
            }
            if (frontIsClear()) {
                move();
            }
        } while (noBeepersPresent() || frontIsClear());

        turnLeft();
        turnLeft();

        while (frontIsClear()) {
            move();
        }
        turnLeft();

    }
}
