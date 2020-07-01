package ua.ukma.distedu.ykrukovska.unit4;

import stanford.karel.SuperKarel;

public class Practice4_MidpointFinding extends SuperKarel {

    public void run() {
        if (frontIsBlocked()) {
            putBeeper();
        }
        if (frontIsClear()) {
            fillTheRow();
            removeBeepers();
            putLastBeeper();
        }
    }

    private void putLastBeeper() {
        turnAround();
        move();
        putBeeper();
    }

    private void removeBeepers() {
        if (beepersPresent()) {
            while (beepersPresent()) {
                move();
            }
            if (noBeepersPresent()) {
                turnAround();
                move();
                pickBeeper();
                move();
                removeBeepers();
            }
        }
    }

    private void fillTheRow() {
        while (frontIsClear()) {
            move();
            putBeeper();
        }
        turnAround();
        pickBeeper();
        move();
    }

}