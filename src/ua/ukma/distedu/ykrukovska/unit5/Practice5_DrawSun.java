package ua.ukma.distedu.ykrukovska.unit5;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Practice5_DrawSun extends GraphicsProgram {

    public static double X0 = 200;
    public static double Y0 = 200;
    public static double RADIUS = 100;
    public static double SUN_RADIUS = 50;
    public static double RAY_AMOUNT = 360.;

    public void run() {
        for (int i = 0; i < RAY_AMOUNT; i++) {
            double angleRad = 2 / RAY_AMOUNT * i * Math.PI;
            double x1 = X0 + RADIUS * Math.cos(angleRad);
            double y1 = Y0 + RADIUS * Math.sin(angleRad);
            GLine ray = new GLine(X0, Y0, x1, y1);
            ray.setColor(Color.yellow);
            add(ray);
        }
        drawSunBody();
    }

    private void drawSunBody() {
        GOval sun = new GOval(X0 - RADIUS / 4, Y0 - RADIUS / 4, SUN_RADIUS, SUN_RADIUS);
        sun.setColor(Color.red);
        sun.setFillColor(Color.red);
        sun.setFilled(true);
        add(sun);
    }
}
