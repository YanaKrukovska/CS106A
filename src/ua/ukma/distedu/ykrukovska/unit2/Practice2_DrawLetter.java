package ua.ukma.distedu.ykrukovska.unit2;

import stanford.karel.Karel;

public class Practice2_DrawLetter extends Karel {

    public void run() {
        while (frontIsClear()) {
            move();
        }
        turnLeft();
        putBeeper();
        while (frontIsClear()) {
            move();
            putBeeper();
        }
        turnLeft();
        for (int i = 0; i < 3; i++) {
            move();
            putBeeper();
        }
        turnLeft();
        for (int i = 0; i < 3; i++) {
            move();
            putBeeper();
        }
        turnLeft();
        for (int i = 0; i < 2; i++) {
            move();
            putBeeper();
        }
        turnRight();
        move();
        putBeeper();
        move();
        turnRight();
        move();
        putBeeper();
        move();
        turnLeft();
        move();
        putBeeper();
        turnRight();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
        turnLeft();
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}
