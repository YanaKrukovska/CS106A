package ua.ukma.distedu.ykrukovska.unit4;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Practice4_DrawHelloWorld extends GraphicsProgram {

    public void run() {
        this.setSize(500, 300);
        GLabel label1 = new GLabel("Hello, world", 50, 75);
        label1.setFont(Font.getFont("SansSerif-36"));
        label1.setColor(Color.RED);
        add(label1);

        GLabel label2 = new GLabel("Hello, world", 90, 95);
        label2.setFont(Font.getFont("Impact-30"));
        label2.setColor(Color.GREEN);
        add(label2);

        GLabel label3 = new GLabel("Hello, world", 100, 150);
        label3.setFont(Font.getFont("System-70"));
        label3.setColor(Color.BLACK);
        add(label3);

        GLabel label4 = new GLabel("Hello, world", 155, 175);
        label4.setFont(Font.getFont("Onyx-14"));
        label4.setColor(Color.YELLOW);
        add(label4);

        GLabel label5 = new GLabel("Hello, world", 170, 250);
        label5.setFont(Font.getFont("Forte-66"));
        label5.setColor(Color.PINK);
        add(label5);

    }

}
