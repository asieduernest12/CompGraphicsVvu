package utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.xml.crypto.dsig.Transform;

import com.graphicsPrimitives.*;
import com.graphicsPrimitives.Util.Scale;

public class drawObjects {

    public static void drawChair(Point point, Graphics g) {

	Point p1, p2, p3, p4, p5, p6, p7, p8, p9;
	// Point 347, 464 //chair p1
	// Point 100, 9
	// Difference 61 , 0 //p2 line p1, p2
	// Point 100, 9
	// Difference 62 , 71 //p3 p2, p3
	// Point 100, 9
	// Difference 122, 103 //p4 p3-4
	// Point 100, 9
	// Difference 61 , 104 //p5 p4, p5
	// Point 100, 9
	// Difference 3 , 73 //p6 p5, p6
	// Point 100, 9
	// Difference 1 , 133 //p7 p6, p7
	// Point 100, 9
	// Difference 61 , 132 //p8 p5, p8
	// Point 100, 9
	// Difference 121, 137 //p9 p4, p9

	p1 = point;
	p2 = new Point(p1.x + 61, p1.y + 0);
	p3 = new Point(p1.x + 61, p1.y + 71);
	p4 = new Point(p1.x + 122, p1.y + 103);
	p5 = new Point(p1.x + 61, p1.y + 104);
	p6 = new Point(p1.x + 3, p1.y + 73);
	p7 = new Point(p1.x + 1, p1.y + 133);
	p8 = new Point(p1.x + 61, p1.y + 132);
	p9 = new Point(p1.x + 121, p1.y + 137);

	Point[] ps = new Point[] { p3, p1, p2, p4, p5, p6, p7, p8, p9 };

	// Transformer.ShearXY(ps, 0.2, 0.2);
	// Transformer.ScaleFromPoint(ps, 1, 1.3);
	// Transformer.Translate(ps, -560, -450);
	// Transformer.RotateFromPoint(ps, 60);

	Util.lineBres(p1, p2, g);
	Util.lineBres(p2, p3, g);
	Util.lineBres(p3, p4, g);
	Util.lineBres(p4, p5, g);
	Util.lineBres(p5, p6, g);
	Util.lineBres(p6, p7, g);
	Util.lineBres(p5, p8, g);
	Util.lineBres(p4, p9, g);
	Util.lineBres(p1, p6, g);
	Util.lineBres(p3, p6, g);
    }

    public static void drawTable(Point point, Graphics g) {
	// Point 950, 429 //table p1
	// Point 100, 9
	// Difference 163, -2 //p2 p1, p2
	// Point 100, 9
	// Difference 231, 93 //p3 p2, p3
	// Point 100, 9
	// Difference 87 , 93 //p4 p3, p4
	// Point 100, 9
	// Difference -15, 87 //p5 p1, p5
	// Point 100, 9
	// Difference -2 , 89 //p6 p5, p6
	// Point 100, 9
	// Difference 70 , 131 //p7 p4, p7
	// //p4, p1
	// Point 100, 9
	// Difference 96 , 132 //p8 p7, p8 p8, p4
	// Point 100, 9
	// Difference 164, 95 //p9
	// Point 100, 9
	// Difference 157, 117 //p10 p9, p10
	// Point 100, 9
	// Difference 176, 115 //p11 p10, p11
	// Point 100, 9
	// Difference 170, 95 //p12 p11, p12
	// Point 950, 429 //p13
	// Point 100, 9
	// Difference 220, 95 //p13
	// Point 100, 9
	// Difference 216, 146 //p14 p13, p14
	// Point 100, 9
	// Difference 227, 147 //p15 1514, p15 p15, p3
	Point p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15;
	p1 = point;
	p2 = new Point(p1.x + 163, p1.y - 2);
	p3 = new Point(p1.x + 231, p1.y + 93);
	p4 = new Point(p1.x + 87, p1.y + 93);
	p5 = new Point(p1.x - 15, p1.y + 87);
	p6 = new Point(p1.x - 2, p1.y + 89);
	p7 = new Point(p1.x + 70, p1.y + 131);
	p8 = new Point(p1.x + 96, p1.y + 132);
	p9 = new Point(p1.x + 164, p1.y + 95);
	p10 = new Point(p1.x + 157, p1.y + 117);
	p11 = new Point(p1.x + 176, p1.y + 117);
	p12 = new Point(p1.x + 170, p1.y + 95);
	p13 = new Point(p1.x + 220, p1.y + 95);
	p14 = new Point(p1.x + 216, p1.y + 146);
	p15 = new Point(p1.x + 227, p1.y + 147);
	// p17=new Point(p1.x, p1.y);

	Point ps[] = new Point[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
		p11, p12, p13, p14, p15 };
	// Transformer.Translate(ps, -800, -220);

	Util.lineBres(p1, p2, g);
	Util.lineBres(p2, p3, g);
	Util.lineBres(p3, p4, g);
	Util.lineBres(p1, p4, g);
	Util.lineBres(p1, p5, g);
	Util.lineBres(p5, p6, g);
	Util.lineBres(p6, p1, g);
	Util.lineBres(p4, p7, g);
	Util.lineBres(p7, p8, g);
	Util.lineBres(p8, p4, g);
	Util.lineBres(p9, p10, g);
	Util.lineBres(p10, p11, g);
	Util.lineBres(p11, p12, g);
	Util.lineBres(p13, p14, g);
	Util.lineBres(p14, p15, g);
	Util.lineBres(p15, p3, g);
	// Util.lineBres(p2, p3, g);
	// Util.lineBres(p2, p3, g);
	// Util.lineBres(p2, p3, g);

    }

    public static void drawHouse(Point point, Scale scSc, Scale shSc,
	    Scale trSc, double angle, Graphics g) {

	Point p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, pa, pb, pc, pd, pe, pf, pg, ph;

	// Point 100, 9
	// Difference 377, 1 //p1
	// Point 100, 9
	// Difference 377, 1 //p2 p1, p2
	// Point 100, 9
	// Difference 441, 85 //p3 p2, p3
	// Point 100, 9
	// Difference -64, 86 //p4 p3, p4 p4, p1
	// Point 100, 9
	// Difference 12 , 84 //p5
	// Point 100, 9
	// Difference 42 , 2 //p6 p5, p6
	// Point 100, 9
	// Difference 82 , 84 //p7
	// Point 100, 9
	// Difference 108, 1 //p8 p7, p8
	// Point 100, 9
	// Difference 268, 83 //p9
	// Point 100, 9
	// Difference 243, 2 //p10 p9, p10
	// Point 100, 9
	// Difference 353, 85 //p11
	// Point 100, 9
	// Difference 317, 3 //p12 p11, p12
	// Point 100, 9
	// Difference -3 , 86 //p13
	// Point 100, 9
	// Difference -2 , 266 //p14 p13, p14
	// Point 100, 9
	// Difference 386, 266 //p15 p14, p15
	// Point 100, 9
	// Difference 386, 86 //p16 p15, p16
	// Point 100, 9
	// Difference 11 , 100 //p17 window1
	// Point 100, 9
	// Difference 10 , 172 //p18 p17, p18
	// Point 100, 9
	// Difference 127, 173 //p19 p18, p19
	// Point 100, 9
	// Difference 127, 101 //p20 p19, p20 p20, p17
	// Point 100, 9
	// Difference 62 , 100 //p21
	// Point 100, 9
	// Difference 62 , 172 //p22 p21, p22
	// Point 100, 9
	// Difference 12 , 135 //p23
	// Point 100, 9
	// Difference 128, 136 //p24 p23, p24
	// Point 100, 9
	// Difference 249, 105 //other windows pos
	// Point 100, 9
	// Difference 149, 266 //p26 dor
	// Point 100, 9
	// Difference 150, 184 //p27 p26, p27
	// Point 100, 9
	// Difference 230, 183 //p28 p27, p28
	// Point 100, 9
	// Difference 230, 265 //p29 p28, p29
	// Point 100, 9
	// Difference 158, 227 //p30 door nob r=4
	// Point 100, 9
	// Difference -136, 185 //p31 compound point one
	// Point 100, 9
	// Difference -2 , 185 //p32 p31, p32
	// Point 100, 9
	// Difference 388, 187 //p33
	// Point 100, 9
	// Difference 555, 186 //p34 p33, p34
	// Point 100, 9
	// Difference 143, 275 //p35 drive way
	// Point 100, 9
	// Difference 74 , 433 //p36 p35, p36
	// Point 100, 9
	// Difference 234, 282 //p37
	// Point 100, 9
	// Difference 302, 420 //p38 p37, p38

	p1 = point;
	p2 = new Point(p1.x + 377, p1.y);
	p3 = new Point(p1.x + 441, p1.y + 85);
	p4 = new Point(p1.x - 64, p1.y + 86);
	p5 = new Point(p1.x + 12, p1.y + 84);
	p6 = new Point(p1.x + 42, p1.y + 2);
	p7 = new Point(p1.x + 82, p1.y + 84);
	p8 = new Point(p1.x + 108, p1.y);
	p9 = new Point(p1.x + 268, p1.y + 83);
	p10 = new Point(p1.x + 243, p1.y + 2);
	p11 = new Point(p1.x + 353, p1.y + 85);
	p12 = new Point(p1.x + 317, p1.y + 3);
	p13 = new Point(p1.x - 3, p1.y + 86);
	p14 = new Point(p1.x - 2, p1.y + 266);
	p15 = addPoint(p1, 386, 266);
	p16 = addPoint(p1, 386, 86);
	p17 = addPoint(p1, 11, 100);// window
	p18 = addPoint(p1, 10, 172);
	p19 = addPoint(p1, 127, 173);
	p20 = addPoint(p1, 127, 101);
	p21 = addPoint(p1, 62, 100);
	p22 = addPoint(p1, 62, 172);
	p23 = addPoint(p1, 12, 135);
	p24 = addPoint(p1, 128, 136);
	pa = addPoint(p1, 250, 105);// window
	pb = addPoint(p1, 250, 171);
	pc = addPoint(p1, 372, 172);
	pd = addPoint(p1, 370, 106);
	pe = addPoint(p1, 310, 106);
	pf = addPoint(p1, 311, 171);
	pg = addPoint(p1, 251, 140);
	ph = addPoint(p1, 371, 140);
	p26 = addPoint(p1, 149, 266);
	p27 = addPoint(p1, 150, 184);
	p28 = addPoint(p1, 230, 183);
	p29 = addPoint(p1, 230, 265);
	p30 = addPoint(p1, 158, 227);
	p31 = addPoint(p1, -136, 185);
	p32 = addPoint(p1, -2, 185);
	p33 = addPoint(p1, 388, 187);
	p34 = addPoint(p1, 555, 186);
	p35 = addPoint(p1, 143, 275);
	p36 = addPoint(p1, 74, 433);
	p37 = addPoint(p1, 234, 282);
	p38 = addPoint(p1, 302, 420);

	Point[] ps = new Point[] { p30, p1, p2, p3, p4, p5, p6, p7, p8, p9,
		p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21,
		p22, p23, p24, p26, p27, p28, p29, p31, p32, p33, p34, p35,
		p36, p37, p38, pa, pb, pc, pd, pe, pf, pg, ph };

	// new Transformer().ScaleFromOrigin(ps, .5, .5);

	Transformer.RotateFromPoint(ps, angle);
	Transformer.Translate(ps, (int) trSc.x, (int) trSc.y);
	Transformer.ScaleFromPoint(ps, scSc.x, scSc.y);
	Transformer.ShearXY(ps, shSc.x, shSc.y);

	Util.lineBres(p1, p2, g);
	Util.lineBres(p2, p3, g);
	Util.lineBres(p3, p4, g);
	Util.lineBres(p4, p1, g);
	Util.lineBres(p5, p6, g);
	Util.lineBres(p7, p8, g);
	Util.lineBres(p9, p10, g);
	Util.lineBres(p11, p12, g);
	Util.lineBres(p13, p14, g);
	Util.lineBres(p14, p15, g);
	Util.lineBres(p15, p16, g);
	Util.lineBres(p17, p18, g);
	Util.lineBres(p18, p19, g);
	Util.lineBres(p19, p20, g);
	Util.lineBres(p20, p17, g);
	Util.lineBres(p21, p22, g);
	Util.lineBres(p23, p24, g);
	Util.lineBres(p26, p27, g);
	Util.lineBres(p27, p28, g);
	Util.lineBres(p28, p29, g);
	Util.cirlceLine(4, p30, g);
	Util.lineBres(p31, p32, g);
	Util.lineBres(p33, p34, g);
	Util.lineBres(p35, p36, g);
	Util.lineBres(p37, p38, g);
	Util.lineBres(pa, pb, g);
	Util.lineBres(pb, pc, g);
	Util.lineBres(pc, pd, g);
	Util.lineBres(pd, pa, g);
	Util.lineBres(pe, pf, g);
	Util.lineBres(pg, ph, g);

    }

    public static void drawGirl(Point point, Graphics g) {

	Point p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
	p1 = point;
	p2 = addPoint(p1, 2, 33);
	p3 = addPoint(p1, 2, 100);
	p4 = addPoint(p1, -31, 131);
	p5 = addPoint(p1, 36, 133);
	p6 = addPoint(p1, -22, 132);
	p7 = addPoint(p1, -22, 167);
	p8 = addPoint(p1, 25, 133);
	p9 = addPoint(p1, 25, 168);
	p10 = addPoint(p1, 1, 65);
	p11 = addPoint(p1, -42, 77);
	p12 = addPoint(p1, 53, 80);

	Point ps[] = new Point[] { p11, p1, p2, p3, p4, p5, p6, p7, p8, p9,
		p10, p12 };
	Transformer.RotateFromPoint(ps, 90);
	Transformer.Translate(ps, 0, -20);

	Util.ellipseDraw(p1, 28, 32, 0, g, Color.black);
	Util.lineBres(p2, p3, g);
	Util.lineBres(p3, p4, g);
	Util.lineBres(p4, p5, g);
	Util.lineBres(p5, p3, g);
	Util.lineBres(p6, p7, g);
	Util.lineBres(p8, p9, g);
	Util.lineBres(p10, p11, g);
	Util.lineBres(p10, p12, g);

    }

    public static void drawBoy(Point point, BufferedImage img, Graphics g) {

	Point p1, px, py, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, h1, h2, h3, h4, hc1, hc2, hc3, hcp1, hcp2, hcp3, hcp4, hcp5, h11, h12, h13, h14, hc11, hc12, hc13, hcp11, hcp12, hcp13, hcp14, hcp15, e1, e1x, e1y, e2, m1, mx, my;
	Point cp1, cp11, cp2, cp3, cp4, cp5, cp6;

	p1 = point;
	px = addPoint(p1, 47, -2);
	py = addPoint(p1, -2, -63);
	p2 = addPoint(p1, -15, 57);
	p3 = addPoint(p1, -16, 78);
	p4 = addPoint(p1, 14, 79);
	p5 = addPoint(p1, 12, 57);
	p6 = addPoint(p1, -38, 77);
	p7 = addPoint(p1, -39, 276);
	p8 = addPoint(p1, 36, 275);
	p9 = addPoint(p1, 36, 79);
	p10 = addPoint(p1, -36, 276);
	p11 = addPoint(p1, -38, 434);
	p12 = addPoint(p1, -11, 436);
	p13 = addPoint(p1, -11, 278);
	p14 = addPoint(p1, 4, 276);
	p15 = addPoint(p1, 5, 437);
	p16 = addPoint(p1, 33, 437);
	p17 = addPoint(p1, 33, 277);
	h11 = h1 = addPoint(p1, -268, 76);
	h12 = h2 = addPoint(p1, -268, 87);
	h13 = h3 = addPoint(p1, -196, 87);
	h14 = h4 = addPoint(p1, -195, 76);
	hc11 = hc1 = addPoint(p1, -187, 87);
	hc12 = hc2 = addPoint(p1, -179, 87);
	hc13 = hc3 = addPoint(p1, -186, 76);
	hcp11 = hcp1 = addPoint(p1, -182, 73);
	hcp12 = hcp2 = addPoint(p1, -169, 65);
	hcp13 = hcp3 = addPoint(p1, -167, 87);
	hcp14 = hcp4 = addPoint(p1, -182, 96);
	hcp15 = hcp5 = addPoint(p1, -173, 96);
	h11 = addPoint(p1, -268, 76);
	h12 = addPoint(p1, -268, 87);
	h13 = addPoint(p1, -196, 87);
	h14 = addPoint(p1, -195, 76);
	hc11 = addPoint(p1, -187, 87);
	hc12 = addPoint(p1, -179, 87);
	hc13 = addPoint(p1, -186, 76);
	hcp11 = addPoint(p1, -182, 73);
	hcp12 = addPoint(p1, -169, 65);
	hcp13 = addPoint(p1, -167, 87);
	hcp14 = addPoint(p1, -182, 96);
	hcp15 = addPoint(p1, -173, 96);
	cp11 = cp1 = addPoint(p17, -230, 80);
	cp2 = addPoint(p1, 10, 7);
	cp3 = addPoint(p1, -7, 63);
	cp4 = addPoint(p1, -20, 209);
	cp5 = addPoint(p1, -22, 311);
	cp6 = addPoint(p1, 24, 340);

	e1 = addPoint(p1, -17, -6);
	e1x = addPoint(p1, -10, -6);
	e1y = addPoint(p1, -18, -20);
	e2 = addPoint(p1, 18, -6);
	m1 = addPoint(p1, 0, 26);
	mx = addPoint(p1, 17, 27);
	my = addPoint(p1, 0, 45);

	Point[] hand1 = new Point[] { h1, h2, h3, h4, hc1, hc2, hc3, hcp1,
		hcp2, hcp3, hcp4, hcp5, cp1 };

	Point[] hand2 = new Point[] { h11, h12, h13, h14, hc11, hc12, hc13,
		hcp11, hcp12, hcp13, hcp14, hcp15, cp11 };

	Transformer.ScaleFromPoint(hand1, 2.4, 1);
	Transformer.Translate(hand1, 236, 4);
	Transformer.RotateFromPoint(hand1, 100);

	Transformer.ScaleFromPoint(hand2, 2.4, 1);
	Transformer.Translate(hand2, 305, 4);
	Transformer.RotateFromPoint(hand2, 80);

	Point ps[] = { p1, px, py, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11,
		p12, p13, p14, p15, p16, p17, h1, h2, h3, h4, hc1, hc2, hc3,
		hcp1, hcp2, hcp3, hcp4, hcp5, h11, h12, h13, h14, hc11, hc12,
		hc13, hcp11, hcp12, hcp13, hcp14, hcp15, e1, e1x, e1y, e2, m1,
		mx, my, cp1, cp2, cp3, cp4, cp5, cp6, cp11 };

	Transformer.ScaleFromPoint(ps, 0.42, 0.3);

	int eRx = Math.abs(e1x.x - e1.x);
	int eRy = Math.abs(e1y.y - e1.y);

	int mRx = Math.abs(mx.x - m1.x);
	int mRy = Math.abs(m1.y - my.y);

	int Rx = Math.abs(px.x - p1.x);
	int Ry = Math.abs(p1.y - py.y);

	Util.ellipseDraw(p1, Rx, Ry, 0, g, Color.black);
	Util.drawPolygon(new Point[] { p2, p3, p4, p5 }, g);
	Util.drawPolygon(new Point[] { p6, p7, p8, p9 }, g);
	Util.drawPolygon(new Point[] { p10, p11, p12, p13 }, g);
	Util.drawPolygon(new Point[] { p14, p15, p16, p17 }, g);

	Util.drawPolygon(new Point[] { h1, h2, h3, h4 }, g);
	Util.drawPolygon(new Point[] { h11, h12, h13, h14 }, g);
	Util.hEllipseMidpoint(e1.x, e1.y, eRx, eRy, 0, 0, g);
	Util.hEllipseMidpoint(e2.x, e2.y, eRx, eRy, 0, 0, g);
	Util.hEllipseMidpoint(m1.x, m1.y, mRx, mRy, 2, 0, g);

	// Point[] rps = new Point[] { cp1, cp11, cp2, cp3, cp4, cp5, cp6 };
	// for (Point point2 : rps) {
	// FloodFill.bucketFill(img, point2.x, point2.y,
	// new Color(img.getRGB(3, 3)), new Color(-1));
	// }

    }

    public static BufferedImage getBoyImage() {

	BufferedImage img = new BufferedImage(150, 350,
		BufferedImage.TRANSLUCENT);

	drawBoy(new Point(40, 35), img, img.createGraphics());

	return img;
    }

    public static void drawCar(Point point, Graphics g) {

	Point p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;

	p1 = point;
	p2 = addPoint(p1, 131, 0);
	p3 = addPoint(p1, 113, 35);
	p4 = addPoint(p1, -25, 34);
	p5 = addPoint(p1, -24, 77);
	p6 = addPoint(p1, 209, 77);
	p7 = addPoint(p1, 211, 51);
	p8 = addPoint(p1, 141, 52);
	p9 = addPoint(p1, 179, 50);
	p10 = addPoint(p1, 142, 78);
	p11 = addPoint(p1, 6, 105);
	p12 = addPoint(p1, 148, 105);

	Point[] ps = new Point[] { p8, p4, p1, p2, p3, p5, p6, p7, p9, p10,
		p11, p12 };

	Util.cirlceLine(10, ps[0], g);
	Transformer.RotateFromPoint(ps, 145);
	// Transformer.Translate(ps, 100, 0);
	// Transformer.ShearXY(ps, 0, 0);

	Util.lineBres(p1, p2, g);
	Util.lineBres(p2, p3, g);
	Util.lineBres(p3, p4, g);
	Util.lineBres(p4, p1, g);
	Util.lineBres(p4, p5, g);
	Util.lineBres(p5, p6, g);
	Util.lineBres(p6, p7, g);
	Util.lineBres(p7, p8, g);
	Util.lineBres(p2, p9, g);
	Util.lineBres(p2, p9, g);
	Util.lineBres(p3, p8, g);
	Util.lineBres(p8, p10, g);
	Util.cirlceLine(28, p11, g);
	Util.cirlceLine(28, p12, g);

    }

    public static void drawSun(Point point, Graphics g) {

	Point p1, p2, p3, p4, p5, p6, p7, p8, p9;

	p1 = point;
	p2 = addPoint(p1, -2, -46);
	p3 = addPoint(p1, -2, -77);
	p4 = addPoint(p1, -44, -1);
	p5 = addPoint(p1, -91, -1);
	p6 = addPoint(p1, -1, 38);
	p7 = addPoint(p1, -1, 77);
	p8 = addPoint(p1, 49, 1);
	p9 = addPoint(p1, 98, 1);

	Point ps[] = new Point[] { p1, p2, p3, p4, p5, p6, p7, p8, p9 };
	Transformer.RotateFromPoint(ps, 90);
	Util.cirlceLine(28, p1, g);
	Util.lineBres(p2, p3, g);
	Util.lineBres(p4, p5, g);
	Util.lineBres(p6, p7, g);
	Util.lineBres(p8, p9, g);

    }

    static Point addPoint(Point p, int dx, int dy) {
	return new Point(p.x + dx, p.y + dy);
    }
}
