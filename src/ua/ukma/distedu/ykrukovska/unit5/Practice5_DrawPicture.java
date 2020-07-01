package ua.ukma.distedu.ykrukovska.unit5;

import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Practice5_DrawPicture extends GraphicsProgram {

    public void run() {
        this.setSize(800, 1000);

        drawSky();
        drawGrass();
        drawClouds();
        drawRaindrops();
        drawTree();
        drawHouse();
        drawDoors();
        drawWindow();
        drawRoof();
        drawChimney();
        drawSmoke();

    }

    private void drawSmoke() {
        GOval smoke1 = new GOval(250, 70, 20, 20);
        smoke1.setColor(Color.white);
        smoke1.setFillColor(Color.white);
        smoke1.setFilled(true);
        add(smoke1);

        GOval smoke2 = new GOval(270, 50, 30, 30);
        smoke2.setColor(Color.white);
        smoke2.setFillColor(Color.white);
        smoke2.setFilled(true);
        add(smoke2);

        GOval smoke3 = new GOval(300, 30, 40, 40);
        smoke3.setColor(Color.white);
        smoke3.setFillColor(Color.white);
        smoke3.setFilled(true);
        add(smoke3);
    }

    private void drawChimney() {
        GRect mainPartChimney = new GRect(200, 100, 50, 100);
        mainPartChimney.setColor(Color.black);
        mainPartChimney.setFillColor(Color.darkGray);
        mainPartChimney.setFilled(true);
        add(mainPartChimney);

        GRect smallPartChimney = new GRect(180, 80, 90, 20);
        smallPartChimney.setFillColor(Color.black);
        smallPartChimney.setFilled(true);
        add(smallPartChimney);
    }

    private void drawRoof() {
        GRect mainroof = new GRect(150, 70, 400, 180);
        mainroof.setColor(Color.orange);
        mainroof.setFilled(true);
        add(mainroof);
        makeRoofSide1();
        makeRoofSide2();
    }

    private void drawWindow() {
        GRect window = new GRect(215, 325, 100, 100);
        window.setColor(Color.black);
        window.setFillColor(Color.yellow);
        window.setFilled(true);
        add(window);

        GLine line1 = new GLine(215, 375, 315, 375);
        line1.setColor(Color.black);
        add(line1);

        GLine line2 = new GLine(265, 325, 265, 425);
        line2.setColor(Color.black);
        add(line2);
    }

    private void drawDoors() {
        GRect doors = new GRect(370, 300, 100, 200);
        doors.setColor(Color.darkGray);
        doors.setFillColor(Color.darkGray);
        doors.setFilled(true);
        add(doors);

        GOval oval1 = new GOval(445, 410, 10, 10);
        oval1.setColor(Color.black);
        oval1.setFilled(true);
        add(oval1);
    }

    private void drawHouse() {
        GRect house = new GRect(150, 200, 400, 300);
        house.setColor(Color.lightGray);
        house.setFillColor(Color.lightGray);
        house.setFilled(true);
        add(house);
    }

    private void drawTree() {
        GOval leaves1 = new GOval(750, 200, 130, 130);
        leaves1.setColor(Color.black);
        leaves1.setFillColor(Color.green);
        leaves1.setFilled(true);
        add(leaves1);

        GOval leaves2 = new GOval(730, 260, 200, 200);
        leaves2.setColor(Color.black);
        leaves2.setFillColor(Color.green);
        leaves2.setFilled(true);
        add(leaves2);

        GRect tree = new GRect(800, 360, 50, 250);
        tree.setColor(Color.orange);
        tree.setFillColor(Color.orange);
        tree.setFilled(true);
        add(tree);
    }

    private void drawRaindrops() {
        GLine raindrop1 = new GLine(750, 200, 745, 210);
        raindrop1.setColor(Color.cyan);
        add(raindrop1);

        GLine raindrop2 = new GLine(710, 200, 705, 210);
        raindrop2.setColor(Color.cyan);
        add(raindrop2);

        GLine raindrop3 = new GLine(690, 150, 685, 160);
        raindrop3.setColor(Color.cyan);
        add(raindrop3);

        GLine raindrop4 = new GLine(780, 200, 775, 210);
        raindrop4.setColor(Color.cyan);
        add(raindrop4);

        GLine raindrop5 = new GLine(650, 200, 645, 210);
        raindrop5.setColor(Color.cyan);
        add(raindrop5);
    }

    private void drawClouds() {
        GOval cloud1 = new GOval(800, 50, 120, 110);
        cloud1.setColor(Color.lightGray);
        cloud1.setFillColor(Color.lightGray);
        cloud1.setFilled(true);
        add(cloud1);

        GOval cloud2 = new GOval(750, 40, 130, 120);
        cloud2.setColor(Color.lightGray);
        cloud2.setFillColor(Color.lightGray);
        cloud2.setFilled(true);
        add(cloud2);

        GOval cloud3 = new GOval(700, 50, 120, 110);
        cloud3.setColor(Color.lightGray);
        cloud3.setFillColor(Color.lightGray);
        cloud3.setFilled(true);
        add(cloud3);
    }

    private void drawGrass() {
        GRect grass = new GRect(0, 300, 1000, 500);
        grass.setFillColor(Color.green);
        grass.setFilled(true);
        add(grass);
    }

    private void drawSky() {
        GRect sky = new GRect(0, 0, 1000, 300);
        sky.setFillColor(Color.blue);
        sky.setFilled(true);
        add(sky);
    }

    private void makeRoofSide2() {

        for (int i = 550; i < 561; i++) {
            GLine roofSide21 = new GLine(550, 70, i, 250);
            roofSide21.setColor(Color.orange);
            add(roofSide21);
        }

    }

    private void makeRoofSide1() {
        for (int i = 140; i < 151; i++) {
            GLine roofSide1 = new GLine(150, 70, i, 250);
            roofSide1.setColor(Color.orange);
            add(roofSide1);
        }
    }
}
