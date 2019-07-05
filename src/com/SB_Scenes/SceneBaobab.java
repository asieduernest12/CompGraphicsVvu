package com.SB_Scenes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JApplet;

import utils.Transformer;
import utils.drawObjects;

import com.graphicsPrimitives.Util;
import com.graphicsPrimitives.Util.Scale;

public class SceneBaobab extends JApplet {

    /**
     * Create the applet.
     */

    BufferedImage img;
    Color backColor;

    public SceneBaobab() {

    }

    @Override
    public void paint(Graphics g) {
	super.paint(g);
	ArrayList<Point> motionP = new ArrayList<Point>();
	img = Util.createImage(getContentPane());
	backColor = new Color(img.getRGB(3, 3));

	drawBaobab(new Point(419, 45), new Scale(1.43, 1.25), motionP, 0,
		img.getGraphics());
	getContentPane().getGraphics().drawImage(img, 0, 0, null);
	animate(g, img, motionP);

    }

    static void drawBaobab(Point point, Scale scSc, ArrayList<Point> mps,
	    double angle, Graphics g) {
	Point p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50;
	Point p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61, p62, p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73, p74, p75, p76, p77, p78, p79, p80, p81, p82, p83;
	Point mp1, mp2, mp3, mp4, mp5, mp6, mp7, mp8;

	g.setColor(Color.black);
	p1 = point;
	p2 = Util.addPoint(p1, 153, 28);
	p3 = Util.addPoint(p1, 397, 115);
	p4 = Util.addPoint(p1, 196, 97);
	p5 = Util.addPoint(p1, 192, 115);
	p6 = Util.addPoint(p1, 396, 128);
	p7 = Util.addPoint(p1, -128, 126);
	p8 = Util.addPoint(p1, -127, 144);
	p9 = Util.addPoint(p1, 7, 16);
	p10 = Util.addPoint(p1, -82, 81);
	p11 = Util.addPoint(p1, -218, 86);
	p12 = Util.addPoint(p1, -396, 155);
	p13 = Util.addPoint(p1, -130, 126);
	p14 = Util.addPoint(p1, -304, 145);
	p15 = Util.addPoint(p1, -397, 170);
	p16 = Util.addPoint(p1, -325, 184);
	p17 = Util.addPoint(p1, -326, 344);
	p18 = Util.addPoint(p1, 183, 371);
	p19 = Util.addPoint(p1, 183, 112);
	p20 = Util.addPoint(p1, 554, 220);
	p21 = Util.addPoint(p1, 365, 221);
	p22 = Util.addPoint(p1, 237, 301);
	p23 = Util.addPoint(p1, 240, 311);
	p24 = Util.addPoint(p1, 554, 314);
	p25 = Util.addPoint(p1, 388, 125);
	p26 = Util.addPoint(p1, 388, 222);
	p27 = Util.addPoint(p1, 245, 119);
	p28 = Util.addPoint(p1, 244, 296);
	p29 = Util.addPoint(p1, 245, 311);
	p30 = Util.addPoint(p1, 243, 368);
	p31 = Util.addPoint(p1, 255, 370);
	p32 = Util.addPoint(p1, 255, 312);
	p33 = Util.addPoint(p1, -172, 352);
	p34 = Util.addPoint(p1, -351, 434);
	p35 = Util.addPoint(p1, -419, 406);
	p36 = Util.addPoint(p1, -419, 465);
	p37 = Util.addPoint(p1, -336, 500);
	p38 = Util.addPoint(p1, -54, 498);
	p39 = Util.addPoint(p1, 340, 389);
	p40 = Util.addPoint(p1, 259, 394);
	p41 = Util.addPoint(p1, -204, 479);
	p42 = Util.addPoint(p1, -306, 449);
	p43 = Util.addPoint(p1, -46, 359);
	p44 = Util.addPoint(p1, 551, 388);
	p45 = Util.addPoint(p1, -358, 179);
	p46 = Util.addPoint(p1, -358, 343);
	p47 = Util.addPoint(p1, -128, 168);
	p48 = Util.addPoint(p1, -127, 354);
	p49 = Util.addPoint(p1, -117, 356);
	p50 = Util.addPoint(p1, -117, 142);
	p51 = Util.addPoint(p1, -358, 230);
	p52 = Util.addPoint(p1, 186, 207);
	p53 = Util.addPoint(p1, 245, 202);
	p54 = Util.addPoint(p1, -358, 243);
	p55 = Util.addPoint(p1, 183, 218);
	p56 = Util.addPoint(p1, 246, 211);
	p57 = Util.addPoint(p1, -357, 290);
	p58 = Util.addPoint(p1, -357, 302);
	p59 = Util.addPoint(p1, 184, 296);
	p60 = Util.addPoint(p1, 244, 288);
	p61 = Util.addPoint(p1, 244, 276);
	p62 = Util.addPoint(p1, 184, 285);
	p63 = Util.addPoint(p1, -318, 228);
	p64 = Util.addPoint(p1, -318, 189);
	p65 = Util.addPoint(p1, -292, 187);
	p66 = Util.addPoint(p1, -292, 226);
	p67 = Util.addPoint(p1, -318, 198);
	p68 = Util.addPoint(p1, -293, 194);
	p69 = Util.addPoint(p1, -320, 290);
	p70 = Util.addPoint(p1, -320, 343);
	p71 = Util.addPoint(p1, -227, 223);
	p72 = Util.addPoint(p1, -220, 290);
	p73 = Util.addPoint(p1, -221, 349);
	p74 = Util.addPoint(p1, 184, 205);
	p75 = Util.addPoint(p1, 185, 286);
	p76 = Util.addPoint(p1, 184, 372);
	p77 = Util.addPoint(p1, -36, 211);
	p78 = Util.addPoint(p1, -38, 289);
	p79 = Util.addPoint(p1, -37, 359);
	p80 = Util.addPoint(p1, 266, 129);
	p81 = Util.addPoint(p1, 268, 210);
	p82 = Util.addPoint(p1, 362, 132);
	p83 = Util.addPoint(p1, 368, 197);
	mp1 = Util.addPoint(p1, -152, 350);
	mp2 = Util.addPoint(p1, -210, 367);
	mp3 = Util.addPoint(p1, -264, 351);
	mp4 = Util.addPoint(p1, -300, 341);
	mp5 = Util.addPoint(p1, -280, 280);
	mp6 = Util.addPoint(p1, -254, 250);
	mp7 = Util.addPoint(p1, -183, 226);
	mp8 = Util.addPoint(p1, -142, 234);

	Point ps[] = { p18, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12,
		p13, p14, p15, p16, p17, p19, p20, p21, p22, p23, p24, p25,
		p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37,
		p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49,
		p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61,
		p62, p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73,
		p74, p75, p76, p77, p78, p79, p80, p81, p82, p83, mp1, mp2,
		mp3, mp4, mp5, mp6, mp7, mp8 };

	Transformer.ScaleFromOrigin(ps, scSc.x, scSc.y);

	Util.drawPolygon(new Point[] { p1, p2, p3, p4 }, g);
	Util.drawPolygon(new Point[] { p3, p4, p5, p6 }, g);
	Util.drawPolygon(new Point[] { p1, p7, p8, p9, p5, p4 }, g);
	Util.lineBres(p8, p5, g);
	Util.drawPolygon(new Point[] { p10, p11, p12, p7 }, g);
	Util.lineBres(p11, p14, g);
	Util.lineBres(p12, p15, g);
	Util.drawPolygon(new Point[] { p15, p16, p17, p18, p19, p8 }, g);
	Util.drawPolygon(new Point[] { p20, p21, p22, p23, p24 }, g);
	Util.lineBres(p25, p26, g);
	Util.lineBres(p27, p28, g);
	Util.lineBres(p29, p30, g);
	Util.lineBres(p30, p31, g);
	Util.lineBres(p31, p32, g);
	Util.lineBres(p18, p30, g);
	Util.drawPolygon(new Point[] { p33, p34, p35, p46, p35, p36, p37, p38,
		p39, p31, p30, p18, p40, p41, p42, p43 }, g);
	Util.lineBres(p39, p44, g);
	Util.lineBres(p45, p46, g);
	Util.lineBres(p46, p17, g);
	Util.lineBres(p16, p47, g);
	Util.lineBres(p47, p8, g);
	Util.lineBres(p8, p48, g);
	Util.lineBres(p48, p49, g);
	Util.lineBres(p49, p50, g);

	// paint cp1,cp2

	Util.lineBres(p51, p52, g);
	Util.lineBres(p52, p53, g);

	Util.lineBres(p54, p55, g);
	Util.lineBres(p55, p56, g);
	Util.drawPolygon(new Point[] { p57, p58, p59, p60, p61, p62 }, g);
	Util.drawPolygon(new Point[] { p63, p64, p65, p66 }, g);
	Util.lineBres(p67, p68, g);

	// draw doorFrames
	drawDoorFram(p69, scSc, angle, g);
	drawDoorFram(p70, scSc, angle, g);
	drawDoorFram(p71, scSc, angle, g);
	drawDoorFram(p72, scSc, angle, g);
	drawDoorFram(p73, scSc, angle, g);
	drawDoorFram(p74, scSc, angle, g);
	drawDoorFram(p75, scSc, angle, g);
	drawDoorFram(p76, scSc, angle, g);
	drawDoorFram(p77, scSc, angle, g);
	drawDoorFram(p78, scSc, angle, g);
	drawDoorFram(p79, scSc, angle, g);

	// draw windows
	drawWindowFram(p80, scSc, angle, g);
	drawWindowFram(p81, scSc, angle, g);
	drawWindowFram(p82, scSc, angle, g);
	drawWindowFram(p83, scSc, angle, g);

	for (Point point2 : new Point[] { mp1, mp2, mp3, mp4, mp5, mp6, mp7,
		mp8 }) {
	    mps.add(point2);
	}

    }

    static void drawDoorFram(Point p, Scale scSc, double angle, Graphics g) {
	Point p1, p2, p3, p4, p5, p6;

	p1 = p;
	p2 = Util.addPoint(p1, -1, -46);
	p3 = Util.addPoint(p1, 28, -46);
	p4 = Util.addPoint(p1, 27, -1);
	p5 = Util.addPoint(p1, 0, -37);
	p6 = Util.addPoint(p1, 28, -39);

	Point[] ps = { p1, p2, p3, p4, p5, p6 };

	Transformer.ScaleFromPoint(ps, scSc.x, scSc.y);
	Transformer.RotateFromPoint(ps, angle);

	Util.drawPolygon(new Point[] { p1, p2, p3, p4 }, g);
	Util.lineBres(p5, p6, g);

    }

    static void drawWindowFram(Point p, Scale scSc, double angle, Graphics g) {
	Point p1, p2, p3, p4, p5, p6, p7, p8, p9;

	p1 = p;
	p2 = Util.addPoint(p1, -3, 50);
	p3 = Util.addPoint(p1, -8, 57);
	p4 = Util.addPoint(p1, 27, 53);
	p5 = Util.addPoint(p1, 25, 45);
	p6 = Util.addPoint(p1, 20, 46);
	p7 = Util.addPoint(p1, 21, -1);
	p8 = Util.addPoint(p1, -2, 13);
	p9 = Util.addPoint(p1, 21, 11);

	Point[] ps = { p1, p2, p3, p4, p5, p6, p7, p8, p9 };

	Transformer.ScaleFromPoint(ps, scSc.x, scSc.y);
	Transformer.RotateFromPoint(ps, angle);

	Util.drawPolygon(new Point[] { p1, p2, p3, p4, p5, p6, p7 }, g);
	Util.lineBres(p2, p5, g);
	Util.lineBres(p8, p9, g);

    }

    public static void animate(Graphics g, BufferedImage img,
	    ArrayList<Point> mps) {

	for (Point point : mps) {
	    g.clearRect(0, 0, img.getWidth(), img.getHeight());
	    g.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), null);
	    g.drawImage(drawObjects.getBoyImage(), point.x, point.y, null);
	    try {
		Thread.sleep(500);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	}

    }
}
