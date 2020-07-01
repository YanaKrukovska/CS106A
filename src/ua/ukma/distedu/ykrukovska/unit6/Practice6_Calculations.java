package ua.ukma.distedu.ykrukovska.unit6;

import acm.program.ConsoleProgram;

import java.awt.*;

public class Practice6_Calculations extends ConsoleProgram {

    private static final double END = -999;

    public void run() {
        getConsole().setFont(new Font("Comic Sans MS", Font.TRUETYPE_FONT, 15));

        while (true) {
            double a = readDouble("Insert number a:");
            double b = readDouble("Insert number b:");
            double c = readDouble("Insert number c:");
            double d = readDouble("Insert number d:");
            double x = readDouble("Insert number x:");
            if (a == END || b == END || c == END || d == END || x == END)
                break;

            println("Biggest number = " + max(a, b, c, d));
            println("x^4 =" + fourthDegree(x));
            println("y =" + quadraticEquation(a, b, c, x));
        }
    }

    double fourthDegree(double x) {
        return Math.pow(x, 4);
    }

    double quadraticEquation(double a, double b, double c, double x) {
        return a * Math.pow(x, 2) + b * x + c;

    }

    double max(double a, double b, double c, double d) {
        if (a > b && a > c && a > d)
            return a;
        else if (b > a && b > c && b > d)
            return b;
        else if (c > a && c > b && c > d)
            return c;
        else
            return d;
    }

}