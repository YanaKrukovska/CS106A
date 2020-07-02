package ua.ukma.distedu.ykrukovska.exam;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

public class ExamTask3 extends GraphicsProgram {

    private GObject objectBeingDragged;
    private GPoint lastClicked;

    /* Stopped working
    public void init() {
        this.setSize(600, 600);
        drawFigures();
        addMouseListeners();
    }*/

    private void drawFigures() {
        GRect rect = new GRect(100, 100, 200, 100);
        rect.setFilled(true);
        rect.setColor(Color.black);
        rect.setFillColor(Color.black);
        add(rect);

        GOval circle = new GOval(400, 300, 100, 100);
        circle.setFilled(true);
        circle.setColor(Color.red);
        circle.setFillColor(Color.red);
        add(circle);

        GRect square = new GRect(200, 400, 100, 100);
        square.setFilled(true);
        square.setColor(Color.blue);
        square.setFillColor(Color.blue);
        add(square);
    }

    public void mousePressed(MouseEvent e) {
        lastClicked = new GPoint(e.getPoint());
        //Stopped working
        // objectBeingDragged = getElementAt(lastClicked);
    }

    public void mouseDragged(MouseEvent e) {
        if (objectBeingDragged != null) {
            objectBeingDragged.move(e.getX() - lastClicked.getX(), e.getY() - lastClicked.getY());
            lastClicked = new GPoint(e.getPoint());
        }
    }

}


