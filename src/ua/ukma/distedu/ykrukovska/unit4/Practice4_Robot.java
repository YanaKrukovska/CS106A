package ua.ukma.distedu.ykrukovska.unit4;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Practice4_Robot extends GraphicsProgram {

    public void run() {
        this.setSize(800, 800);

        GRect rect1 = new GRect(350, 100, 100, 100);
        rect1.setColor(Color.BLACK);
        add(rect1);

        GRect rect2 = new GRect(250, 210, 300, 300);
        rect2.setColor(Color.BLACK);
        add(rect2);

        GRect rect12 = new GRect(300, 260, 200, 200);
        rect12.setColor(Color.BLACK);
        add(rect12);

        GOval oval3 = new GOval(470, 340, 15, 15);
        oval3.setColor(Color.BLACK);
        add(oval3);

        GRect rect3 = new GRect(375, 200, 50, 10);
        rect3.setColor(Color.BLACK);
        add(rect3);

        GOval oval1 = new GOval(370, 125, 20, 20);
        oval1.setColor(Color.RED);
        add(oval1);

        GOval oval2 = new GOval(415, 125, 20, 20);
        oval2.setColor(Color.RED);
        add(oval2);

        GRect rect4 = new GRect(225, 260, 25, 80);
        rect4.setColor(Color.BLACK);
        add(rect4);

        GRect rect5 = new GRect(550, 260, 25, 80);
        rect5.setColor(Color.BLACK);
        add(rect5);

        GRect rect10 = new GRect(200, 120, 25, 200);
        rect10.setColor(Color.BLACK);
        add(rect10);

        GRect rect11 = new GRect(575, 280, 25, 200);
        rect11.setColor(Color.BLACK);
        add(rect11);

        GRect rect6 = new GRect(440, 510, 50, 100);
        rect6.setColor(Color.BLACK);
        add(rect6);

        GRect rect7 = new GRect(320, 510, 50, 100);
        rect7.setColor(Color.BLACK);
        add(rect7);

        GRect rect8 = new GRect(300, 610, 80, 50);
        rect8.setColor(Color.BLACK);
        add(rect8);

        GRect rect9 = new GRect(430, 610, 80, 50);
        rect9.setColor(Color.BLACK);
        add(rect9);

    }
}