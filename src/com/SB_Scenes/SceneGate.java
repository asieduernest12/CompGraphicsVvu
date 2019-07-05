package com.SB_Scenes;

import java.applet.AudioClip;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.prefs.BackingStoreException;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.crypto.dsig.Transform;

import com.graphicsPrimitives.*;
import com.graphicsPrimitives.Util.*;

import utils.FloodFill;
import utils.Transformer;
import utils.drawObjects;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SceneGate extends JApplet {

    /**
     * Create the applet.
     */

    static BufferedImage img = null;
    static Color backColor;
    static boolean colorPaint = false;

    public SceneGate() {
    	setSize(400, 500);
	getContentPane().addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		LinkedList<Point> ps = new LinkedList<>();
		FloodFill.bucketFill(img, arg0.getX(), arg0.getY(), new Color(
			img.getRGB(2, 2)), Color.blue);
		getGraphics().setColor(Color.blue);
		// for (Point point : ps) {
		//
		// getGraphics().drawString(".", point.x, point.y);
		// }
		// getContentPane().getGraphics().drawImage(img, 0, 0,
		// null);
		// img = Util.createImage(getContentPane());
		getContentPane().getGraphics().drawImage(img, 0, 0, null);

		Color cl = new Color(img.getRGB(arg0.getX(), arg0.getY()));
		JOptionPane.showMessageDialog(null,
			cl.getRed() + " " + cl.getGreen() + " " + cl.getBlue());

		// System.out.println(ge));

	    }
	});
	// drawEntrance(new Point(557, 70));
	repaint();
	// URL ur = null;
	// File file = new File(System.getProperty("user.dir"));
	// try {
	// ur = new URL(file.toURL(), "slow.wav");
	// } catch (MalformedURLException e) {
	//
	// e.printStackTrace();
	// }
	// play(ur);
    }

    @Override
    public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	// getContentPane().setBackground(Color.orange);
	img = Util.createImage(getContentPane());
	backColor = new Color(img.getRGB(3, 3));
	// img.getGraphics().setColor(Color.blue);
	// img.getGraphics().fillRect(0, 0, img.getWidth(), img.getHeight());
	drawEntrance(new Point(557, 70), 0, img.getGraphics());
	getContentPane().getGraphics().drawImage(img, 0, 0, null);
	animate(g);
	// img = Util.createImage(getContentPane());

    }

    public static void drawEntrance(Point point, double angle, Graphics g) {
	Point p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, pGt, plG, plG2, plGTop, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61, p62, p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73, p74, p75, gl1, gl2, gl3, gl4;
	Point mgC, mgR, mgTop;
	// pa, pb, pc, pd, pe, pf, pg, ph;
	Point tp1, tp2, mtP, mtP2;
	Point sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10, sp11, sp12, sp13, sp14, sp15;
	Point c1, c2;
	Point b1, b2, b3;
	Point pc1, pc2, pc3, pc4, pc5, pc6, pc7, pc8, pc9, pc10, pc11, pc12;
	int[] cc = { -6906858, -2496285, -2496285, -13080649, -2496285,
		-2496285, -7636378, -1511702, -7571640, -1511702, -2167820,
		-12629812 };

	// Graphics g = getContentPane().getGraphics();
	g.setColor(Color.black);
	p1 = point;
	p2 = Util.addPoint(p1, -336, 95);
	p3 = Util.addPoint(p1, -337, 114);
	p4 = Util.addPoint(p1, -2, 10);
	p5 = Util.addPoint(p1, 362, 119);
	p6 = Util.addPoint(p1, 372, 115);
	p7 = Util.addPoint(p1, 325, 130);
	p8 = Util.addPoint(p1, 279, 187);
	p9 = Util.addPoint(p1, 242, 187);
	p10 = Util.addPoint(p1, 242, 316);
	p11 = Util.addPoint(p1, 204, 314);
	p12 = Util.addPoint(p1, 204, 189);
	p13 = Util.addPoint(p1, 114, 190);
	pGt = Util.addPoint(p1, 153, 141);
	p14 = Util.addPoint(p1, 25, 187);
	p15 = Util.addPoint(p1, 25, 312);
	p16 = Util.addPoint(p1, -10, 309);
	p17 = Util.addPoint(p1, -10, 192);
	p18 = Util.addPoint(p1, -180, 191);
	p19 = Util.addPoint(p1, -180, 268);
	p20 = Util.addPoint(p1, -210, 197);
	p21 = Util.addPoint(p1, -249, 197);
	p22 = Util.addPoint(p1, -287, 128);
	p22 = Util.addPoint(p1, -338, 112);

	p23 = Util.addPoint(p1, 490, 121);
	p24 = Util.addPoint(p1, 384, 180);
	p25 = Util.addPoint(p1, 388, 188);
	p26 = Util.addPoint(p1, 491, 130);
	p27 = Util.addPoint(p1, 596, 186);
	p28 = Util.addPoint(p1, 596, 174);
	p29 = Util.addPoint(p1, 394, 183);
	p30 = Util.addPoint(p1, 394, 321);
	p31 = Util.addPoint(p1, 569, 322);
	p32 = Util.addPoint(p1, 569, 170);

	p33 = Util.addPoint(p1, 429, 177);
	p34 = Util.addPoint(p1, 429, 182);
	p35 = Util.addPoint(p1, 535, 182);
	p36 = Util.addPoint(p1, 535, 177);
	p37 = Util.addPoint(p1, 450, 209);
	p38 = Util.addPoint(p1, 450, 287);
	p39 = Util.addPoint(p1, 509, 287);
	p40 = Util.addPoint(p1, 509, 209);

	p41 = Util.addPoint(p1, -180, 272);
	p42 = Util.addPoint(p1, -482, 272);

	p43 = Util.addPoint(p1, -211, 268);
	p44 = Util.addPoint(p1, -259, 198);
	p45 = Util.addPoint(p1, -260, 268);
	p46 = Util.addPoint(p1, -294, 268);
	p47 = Util.addPoint(p1, -293, 296);
	p48 = Util.addPoint(p1, -277, 372);
	p49 = Util.addPoint(p1, -260, 368);
	p50 = Util.addPoint(p1, -261, 290);
	p51 = Util.addPoint(p1, -274, 290);
	p52 = Util.addPoint(p1, -273, 271);
	p53 = Util.addPoint(p1, -194, 268);
	p54 = Util.addPoint(p1, -193, 291);
	p55 = Util.addPoint(p1, -211, 291);
	p56 = Util.addPoint(p1, -211, 371);
	p57 = Util.addPoint(p1, -192, 368);
	p58 = Util.addPoint(p1, -179, 287);
	p59 = Util.addPoint(p1, -180, 269);
	p60 = Util.addPoint(p1, -211, 306);
	p61 = Util.addPoint(p1, -260, 307);
	p62 = Util.addPoint(p1, -260, 215);
	p63 = Util.addPoint(p1, -259, 224);
	p64 = Util.addPoint(p1, -211, 225);
	p65 = Util.addPoint(p1, -211, 215);

	gl1 = Util.addPoint(p1, 569, 323);
	gl2 = Util.addPoint(p1, 805, 323);

	gl3 = Util.addPoint(p1, -9, 308);
	gl4 = Util.addPoint(p1, -182, 303);
	// left gate lawn walling

	p66 = Util.addPoint(p1, -55, 385);
	p67 = Util.addPoint(p1, -109, 392);
	p68 = Util.addPoint(p1, -197, 406);
	p69 = Util.addPoint(p1, -274, 421);
	p70 = Util.addPoint(p1, -326, 438);
	p71 = Util.addPoint(p1, -415, 469);

	// right walk path boundary
	p72 = Util.addPoint(p1, 195, 343);
	p73 = Util.addPoint(p1, 184, 375);
	p74 = Util.addPoint(p1, 142, 421);
	p75 = Util.addPoint(p1, 133, 470);

	tp1 = Util.addPoint(p1, -344, 107);
	tp2 = Util.addPoint(p1, 389, 140);

	sp1 = Util.addPoint(p1, -59, 330);
	sp2 = Util.addPoint(p1, -165, 374);
	sp3 = Util.addPoint(p1, -207, 379);
	sp4 = Util.addPoint(p1, -302, 400);
	sp5 = Util.addPoint(p1, -327, 345);
	sp6 = Util.addPoint(p1, -383, 373);
	sp7 = Util.addPoint(p1, -423, 437);
	sp8 = Util.addPoint(p1, -491, 425);

	// walk way shrubs

	sp9 = Util.addPoint(p1, 444, 356);
	sp10 = Util.addPoint(p1, 512, 352);
	sp11 = Util.addPoint(p1, 587, 357);
	sp12 = Util.addPoint(p1, 477, 404);
	sp13 = Util.addPoint(p1, 555, 405);
	sp14 = Util.addPoint(p1, 501, 438);
	sp15 = Util.addPoint(p1, 588, 447);

	b1 = Util.addPoint(p1, 267, 238);
	b2 = Util.addPoint(p1, 313, 220);
	b3 = Util.addPoint(p1, 356, 243);

	pc1 = Util.addPoint(p1, -388, 450);
	pc2 = Util.addPoint(p1, -275, 254);
	pc3 = Util.addPoint(p1, -272, 332);
	pc4 = Util.addPoint(p1, -234, 288);
	pc5 = Util.addPoint(p1, -202, 252);
	pc6 = Util.addPoint(p1, -193, 301);
	pc7 = Util.addPoint(p1, -135, 446);
	pc8 = Util.addPoint(p1, 0, 35);
	pc9 = Util.addPoint(p1, 229, 373);
	pc10 = Util.addPoint(p1, 415, 241);
	pc11 = Util.addPoint(p1, 200, -59);
	pc12 = Util.addPoint(p1, 566, 165);

	Point[] pcs = { pc1, pc2, pc3, pc4, pc5, pc6, pc7, pc8, pc9, pc10,
		pc11, pc12 };

	mtP = Util.addPoint(p1, -106, 261);
	mtP2 = Util.addPoint(p1, -387, 199);

	// shift trees up
	Transformer.Translate(new Point[] { tp1, tp2 }, 0, -90);

	// shift shrubs up
	Point sPS[] = new Point[] { sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8 };
	Transformer.Translate(sPS, 0, -30);

	plG = Util.addPoint(p1, -95, 193);
	plG2 = Util.addPoint(plG, 0, 55);
	plGTop = Util.addPoint(p1, -64, 139);

	mgC = Util.addPoint(p1, 318, 261);
	mgR = Util.addPoint(p1, 394, 262);
	mgTop = Util.addPoint(p1, 319, 204);

	// cloud points
	c1 = Util.addPoint(p1, 126, -10);
	c2 = Util.addPoint(p1, -376, -10);

	Point[] ps = new Point[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
		p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22,
		pGt, plG, plG2, plGTop, p23, p24, p25, p26, p27, p28, p29, p30,
		p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42,
		p43, p44, p45, p46, p47, p48, p49, p50, p51, p52, p53, p54,
		p55, p56, p57, p58, p59, p60, p61, p62, p63, p64, p65, p66,
		p67, p68, p69, p70, p71, p72, p73, p74, p75, gl1, gl2, gl3,
		gl4, mgC, mgR, mgTop, tp1, tp2, mtP, mtP2, sp1, sp2, sp3, sp4,
		sp5, sp6, sp7, sp8, sp9, sp10, sp11, sp12, sp13, sp14, sp15,
		c1, c2, b1, b2, b3, pc1, pc2, pc3, pc4, pc5, pc6, pc7, pc8,
		pc9, pc10, pc11, pc12 };

	Transformer.ScaleFromPoint(ps, 1.2, 1.3);
	// Transformer.ShearXY(ps, 0.6, 0);
	// Transformer.Translate(ps, 0, 500);
	// Transformer.RotateFromPoint(ps, angle);

	int rgArchHieght = p13.y - pGt.y;
	int rgArchWidht = p12.x - p13.x;

	int lgArchHieght = plG.y - plGTop.y;
	int lgArchWidht = plG.x - p17.x;

	int mgArchHieght = mgC.y - mgTop.y;
	int mgArchWidht = mgC.x - mgR.x;

	Transformer.RotateFromPoint(ps, angle);

	Util.lineBres(p1, p2, g);
	Util.lineBres(p2, p3, g);
	Util.lineBres(p4, p3, g);
	Util.lineBres(p4, p5, g);
	Util.lineBres(p5, p6, g);
	Util.lineBres(p7, p5, g);
	Util.lineBres(p7, p8, g);
	Util.lineBres(p6, p1, g);
	Util.lineBres(p8, p9, g);
	Util.lineBres(p9, p10, g);
	Util.lineBres(p10, p11, g);
	Util.lineBres(p11, p12, g);
	Util.lineBres(p11, p15, g);
	Util.lineBres(p14, p15, g);
	Util.lineBres(p15, p16, g);
	Util.lineBres(p16, p17, g);
	Util.lineBres(p18, p19, g);
	Util.lineBres(p19, p20, g);
	Util.lineBres(p20, p21, g);
	Util.lineBres(p21, p22, g);
	Util.lineBres(p22, p3, g);
	Util.lineBres(gl1, gl2, g);
	Util.lineBres(gl3, gl4, g);
	Util.hEllipseMidpoint(p13.x, p13.y, rgArchWidht, rgArchHieght, 0,
		angle, g);
	Util.hEllipseMidpoint(plG.x, plG.y, lgArchWidht, lgArchHieght, 0,
		angle, g);
	Util.hEllipseMidpoint(plG2.x, plG2.y, lgArchWidht, lgArchHieght, 0,
		angle, g);

	Util.hEllipseMidpoint(mgC.x, mgC.y, mgArchWidht, mgArchHieght, 0,
		angle, g);
	// paint entrance white
	// FloodFill.bucketFill(img, p1.x, p1.y + 20, backColor,
	// Color.WHITE);
	// paint entrance top blue
	FloodFill.bucketFill(img, p1.x, p1.y + 3, backColor, Color.blue);

	Util.lineBres(p10, p30, g);
	Util.lineBres(p23, p24, g);
	Util.lineBres(p24, p25, g);
	Util.lineBres(p25, p26, g);
	Util.lineBres(p26, p27, g);
	Util.lineBres(p27, p28, g);
	Util.lineBres(p28, p23, g);
	Util.lineBres(p29, p30, g);
	Util.lineBres(p30, p31, g);
	Util.lineBres(p31, p32, g);

	Util.lineBres(p33, p34, g);
	Util.lineBres(p34, p35, g);
	Util.lineBres(p35, p36, g);
	Util.lineBres(p36, p33, g);
	Util.lineBres(p37, p38, g);
	Util.lineBres(p38, p39, g);
	Util.lineBres(p39, p40, g);
	Util.lineBres(p40, p37, g);
	Util.lineBres(p41, p42, g);

	Util.lineBres(p19, p43, g);
	Util.lineBres(p20, p43, g);
	Util.lineBres(p44, p45, g);
	Util.lineBres(p44, p46, g);
	Util.lineBres(p45, p46, g);
	Util.lineBres(p46, p47, g);
	Util.lineBres(p47, p48, g);
	Util.lineBres(p48, p49, g);
	Util.lineBres(p49, p50, g);
	Util.lineBres(p50, p51, g);
	Util.lineBres(p51, p52, g);
	Util.lineBres(p53, p54, g);
	Util.lineBres(p54, p55, g);
	Util.lineBres(p55, p56, g);
	Util.lineBres(p56, p57, g);
	Util.lineBres(p57, p58, g);
	Util.lineBres(p58, p59, g);
	Util.lineBres(p60, p61, g);
	Util.lineBres(p62, p63, g);
	Util.lineBres(p63, p64, g);
	Util.lineBres(p64, p65, g);
	Util.lineBres(p65, p62, g);

	drawQuadrilateral(b1, new Scale(1, 1), new Scale(0, 0), angle, g);
	drawQuadrilateral(b2, new Scale(1, 1.3), new Scale(0, 0), angle, g);
	drawQuadrilateral(b3, new Scale(1, 1), new Scale(0, 0), angle, g);

	// left gate lawns
	Util.lineBres(p15, p66, g);
	Util.lineBres(p66, p67, g);
	Util.lineBres(p67, p68, g);
	Util.lineBres(p68, p69, g);
	Util.lineBres(p69, p70, g);
	Util.lineBres(p70, p71, g);

	// drawing shrubs

	drawTree(mtP, 1, new Scale(1.45, 1.5), angle, g);
	drawTree(mtP2, 1, new Scale(2.65, 2.3), angle, g);
	drawTree(sp1, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp2, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp3, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp4, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp5, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp6, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp7, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp8, 2, new Scale(0.6, 0.6), angle, g);

	// right walk path boundary
	Util.lineBres(p11, p72, g);
	Util.lineBres(p72, p73, g);
	Util.lineBres(p73, p74, g);
	Util.lineBres(p74, p75, g);

	drawTree(sp9, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp10, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp11, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp12, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp13, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp14, 2, new Scale(0.6, 0.6), angle, g);
	drawTree(sp15, 2, new Scale(0.6, 0.6), angle, g);

	// Draw clouds
	drawCloud(c1, new Scale(1, 1), angle, g);
	drawCloud(c2, new Scale(1, 1), angle, g);

	// paint colors
	if (colorPaint)
	    for (int i = 0; i < cc.length; i++)
		FloodFill.bucketFill(img, pcs[i].x, pcs[i].y, backColor,
			new Color(cc[i]));
	colorPaint = true;

	// Trees
	drawTree(tp1, 3, new Scale(3.3, 3.7), angle, g);
	drawTree(tp2, 3, new Scale(2.8, 3), angle, g);
    }

    public static void drawTree(Point point, int n, Scale scale, double angle,
	    Graphics g) {

	if (n == 0)
	    return;

	Point p1, p2, p3, p4, p5, p6;
	p1 = point;
	p2 = Util.addPoint(p1, 0, 89);
	p3 = Util.addPoint(p1, 24, 25);
	p4 = Util.addPoint(p1, 0, 45);
	p5 = Util.addPoint(p1, -24, 25);
	p6 = Util.addPoint(p1, 0, 25);

	// mini branches

	Point[] ps = new Point[] { p1, p2, p3, p4, p5, p6 };
	Transformer.ScaleFromPoint(ps, scale.x, scale.y);

	double r = p3.x - p1.x;
	r *= 0.8;
	Transformer.RotateFromPoint(ps, angle);

	Util.lineBres(p1, p2, g);
	Util.lineBres(p3, p4, g);
	Util.lineBres(p4, p5, g);

	// Util.cirlceLine(r, p1, g);
	Util.fillEllipseDraw(p1, r, r, angle, g, Color.green, 4);
	// FloodFill.bucketFill(img, p1.x + 2, p1.y - 2, getContentPane()
	// .getBackground(), Color.blue);
	// Util.cirlceLine(r, p3, g);
	// FloodFill.bucketFill(img, p3.x + 2, p3.y - 2, getContentPane()
	// .getBackground(), Color.green);
	Util.fillEllipseDraw(p3, r, r, angle, g, Color.green, 4);

	// Util.cirlceLine(r, p5, g);
	// FloodFill.bucketFill(img, p5.x + 2, p5.y - 2, getContentPane()
	// .getBackground(), Color.orange);
	Util.fillEllipseDraw(p5, r, r, angle, g, Color.green, 4);
	Util.fillEllipseDraw(p6, r, r, angle, g, Color.green, 4);

	// scale.x *= 0.5;
	// scale.y *= 0.5;

	Scale sc = new Scale(scale.x * 0.3, scale.y * 0.18);

	// drawTree(p3, n - 1, sc, angle, g);
	// drawTree(p5, n - 1, sc, angle, g);
	// drawTree(p1, n - 1, sc, angle, g);

    }

    public static void drawCloud(Point point, Scale sc, double angle, Graphics g) {
	Point p1, p2, p3, p4;
	p1 = point;
	p2 = Util.addPoint(p1, -47, 0);
	p3 = Util.addPoint(p1, 53, -10);
	p4 = Util.addPoint(p1, 84, 0);

	Point[] ps = new Point[] { p2, p1, p2, p3, p4 };
	Transformer.ScaleFromPoint(ps, sc.x, sc.y);

	int rx = Math.abs(p2.x - p1.x);
	int ry = (int) (rx * 0.6);

	Transformer.RotateFromPoint(ps, angle);

	int col = Integer.valueOf("C0D9D9", 16);
	Color cColor = new Color(col);

	Util.fillEllipseDraw(p1, rx, ry, angle, g, cColor, 0);
	Util.fillEllipseDraw(p3, rx, ry + 9, angle, g, cColor, 0);
	Util.fillEllipseDraw(p4, rx, ry, angle, g, cColor, 0);

    }

    public JPanel getJPanel() {
	return (JPanel) getContentPane();
    }

    public static void drawQuadrilateral(Point point, Scale scSc, Scale shSc,
	    double angle, Graphics g) {
	Point p1, p2, p3, p4;
	Point[] ps;

	p1 = point;
	p2 = Util.addPoint(p1, 0, 90);
	p3 = Util.addPoint(p1, 9, 90);
	p4 = Util.addPoint(p1, 9, 0);

	ps = new Point[] { p1, p2, p3, p4 };

	Transformer.ScaleFromPoint(ps, scSc.x, scSc.y);
	Transformer.ShearXY(ps, shSc.x, shSc.y);
	Transformer.RotateFromPoint(ps, angle);

	Util.drawPolygon(ps, g);

    }

    public static void animate(Graphics g) {
	Point mps[] = { new Point(237, 500), new Point(280, 450),
		new Point(340, 420), new Point(390, 400), new Point(470, 370),
		new Point(510, 350), new Point(560, 310), new Point(590, 300),
		new Point(620, 270), new Point(670, 260), };
	for (Point point : mps) {
	    g.clearRect(0, 0, img.getWidth(), img.getHeight());
	    g.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), null);
	    g.drawImage(drawObjects.getBoyImage(), point.x, point.y, null);
	    try {
		Thread.sleep(1500);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }

	}

    }
}
