package ua.ukma.distedu.ykrukovska.unit5;

import acm.program.ConsoleProgram;

public class Practice5_SumCalculator extends ConsoleProgram {

    private static final int SENTINEL = 0; //number to stop inserting

    public void run() {

        int total = 0;
        int val = readInt("Insert number:");

        while (val != SENTINEL) {
            total += val;
            val = readInt("Insert number:");
        }
        println("Sum = " + total);
    }

}