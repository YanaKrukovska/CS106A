package ua.ukma.distedu.ykrukovska.unit6;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Homework6_DrawCheckerboard extends GraphicsProgram {

    private static final int COLUMN_ROW_AMOUNT = 10;
    private static final int SQUARE_SIZE = 40;

    public void run() {

        for (int i = 0; i < COLUMN_ROW_AMOUNT; i++) {
            for (int j = 0; j < COLUMN_ROW_AMOUNT; j++) {
                GRect square = new GRect(SQUARE_SIZE * i, SQUARE_SIZE * j, SQUARE_SIZE, SQUARE_SIZE);
                square.setFilled(true);
                square.setFillColor(getBeeperColor(i, j));
                add(square);
            }
        }

    }

    private Color getBeeperColor(int column, int row) {
        if ((column + row) % 2 == 0) {
            return Color.black;
        } else {
            return Color.white;
        }
    }

}
