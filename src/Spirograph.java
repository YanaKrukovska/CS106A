import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Spirograph extends GraphicsProgram {

	private static final int RADIUS_BIG = 200;
	private static final int RADIUS_SMALL = 90;
	private static final int DISTANCE_FROM_CENTER = 89;
	private static final int Y_SHIFT = 300;
	private static final int X_SHIFT = 200;

	public void run() {

		for (double i = 0; i <= 7200; i++) {
			double x = calculateX(i);
			double y = calculateY(i);
			GOval dot = new GOval(x, y, 5, 5);
			dot.setColor(Color.black);
			dot.setFilled(true);
			add(dot);

		}
	}

	private double calculateY(double i) {
		double y = Y_SHIFT + (RADIUS_BIG - RADIUS_SMALL) * Math.sin(i)
				- DISTANCE_FROM_CENTER * Math.sin((RADIUS_BIG - RADIUS_SMALL) * i / RADIUS_SMALL);
		return y;
	}

	private double calculateX(double i) {
		double x = X_SHIFT + (RADIUS_BIG - RADIUS_SMALL) * Math.cos(i)
				+ DISTANCE_FROM_CENTER * Math.cos((RADIUS_BIG - RADIUS_SMALL) * i / RADIUS_SMALL);
		return x;
	}
}
