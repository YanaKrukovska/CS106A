package ua.ukma.distedu.ykrukovska.unit6;

import acm.program.ConsoleProgram;

import java.awt.*;

public class Practice6_Equations extends ConsoleProgram {

    private static final int END = -999;

    public void run() {
        getConsole().setFont(new Font("Georgia", Font.TRUETYPE_FONT, 15));

        while (true) {
            double a = readDouble("Insert number a:");
            double b = readDouble("Insert number b:");
            double c = readDouble("Insert number c:");
            double y = readDouble("Insert number y:");
            if (a == END || b == END || c == END || y == END)
                break;

            println("First equation = " + Math.pow(y, 0.25));
            solveQuadraticEquation(a, b, c, y);
            println("Third equation = " + (double) ((y - c) / a));
        }
    }

    private void solveQuadraticEquation(double a, double b, double c, double y) {
        double discriminant = calculateDiscriminant(a, b, c, y);
        if (discriminant < 0) {
            println("No solutions");
        } else if (discriminant == 0) {
            double x0 = -b / 2 * a;
            println("One solution:" + x0);
        } else if (discriminant > 0) {
            double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            println("Two solutions:" + "  1) " + x1 + "  2) " + x2);
        }
    }

    private double calculateDiscriminant(double a, double b, double c, double y) {
        return Math.pow(b, 2) - 4 * a * (c - y);
    }

}