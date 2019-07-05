package com.graphicsPrimitives;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.GraphicClass.BrensenHam;

import utils.Transformer;

public class Util {

    static int round(final float a) {
	return (int) (a + 0.5);
    }

    public static void cirlceLine(int r, int x0, int y0, Graphics g) {
	int x = 0, y = r, d = 3 - 2 * r;
	while (x <= y) {
	    g.drawString(",", (int) (x0 + x), (int) (y0 + y));
	    g.drawString(",", (int) (x0 + y), (int) (y0 + x));
	    g.drawString(",", (int) (x0 - y), (int) (y0 + x));
	    g.drawString(",", (int) (x0 - x), (int) (y0 + y));
	    g.drawString(",", (int) (x0 - x), (int) (y0 - y));
	    g.drawString(",", (int) (x0 - y), (int) (y0 - x));
	    g.drawString(",", (int) (x0 + y), (int) (y0 - x));
	    g.drawString(",", (int) (x0 + x), (int) (y0 - y));
	    if (d < 0)
		d = d + (4 * x) + 6;
	    else {
		d = d + 4 * (x - y) + 10;
		y--;
	    }
	    x++;

	}
    }

    public static void cirlceLine(int r, Point p, Graphics g) {
	cirlceLine(r, p.x, p.y, g);
    }

    public static void midPointCircle(int r, int x0, int y0, Graphics g) {
	int x = 0 + x0, y = r + y0, p = 1 - r;
	while (x <= y) {
	    g.drawString(",", (int) (x0 + x), (int) (y0 + y));
	    g.drawString(",", (int) (x0 + y), (int) (y0 + x));
	    g.drawString(",", (int) (x0 - y), (int) (y0 + x));
	    g.drawString(",", (int) (x0 - x), (int) (y0 + y));
	    g.drawString(",", (int) (x0 - x), (int) (y0 - y));
	    g.drawString(",", (int) (x0 - y), (int) (y0 - x));
	    g.drawString(",", (int) (x0 + y), (int) (y0 - x));
	    g.drawString(",", (int) (x0 + x), (int) (y0 - y));

	    if (p < 0)
		p = p + 2 * x + 3;
	    else {
		p = p + 2 * (x - y) + 5;
		y--;
	    }
	    x++;

	}
    }

    public static void midPointLine(int r, Point p, Graphics g) {
	midPointCircle(r, p.x, p.y, g);

    }

    //
    // public static void lineBres(int x0, int y0, int xEnd, int yEnd, Graphics
    // g) {
    // //
    // }

    public static void lineBres(Point a, Point b, Graphics g) {
	double dy, dx;
	dx = b.x - a.x;
	dy = b.y - a.y;

	if (dx == 0) {
	    lineVertical(a, b.y, g);
	    System.out.println("Vertical Line");
	    return;
	} else {
	    double grad = dy / dx;
	    System.out.println("Gradient From Util: " + grad);
	    if (grad >= 1) {
		lineGreatPos(a, b, g);
		System.out.println("Positive Line");
	    } else if (grad == 0) {
		lineHorizontal(a, b.x, g);
		System.out.println("Horizontal Line");
	    } else if (grad > 0) {
		linePos(a, b, g);
		System.out.println("Positive Line");
	    } else if (grad > -1) {
		lineNeg(a, b, g);
		System.out.println("Negative Line");
	    } else {
		lineGreatNeg(a, b, g);
		System.out.println("Negative Line");
	    }

	}

    }

    public static void lineNeg(int x0, int y0, int xEnd, int yEnd, Graphics g) {
	int dx = Math.abs(xEnd - x0), dy = Math.abs(yEnd - y0);
	int p = 2 * dy - dx;
	int twoDy = 2 * dy, twoDyMinusDx = 2 * (dy - dx);
	int x, y;

	if (x0 > xEnd) {
	    x = xEnd;
	    y = yEnd;
	    xEnd = x0;
	} else {
	    x = x0;
	    y = y0;
	}
	g.drawString(",", round(x), round(-y));
	while (x < xEnd) {
	    x++;
	    if (p < 0)
		p += twoDy;
	    else {
		y++;
		p += twoDyMinusDx;
	    }
	    g.drawString(",", round(x), round(-y));
	}
    }

    public static void lineNeg(Point a, Point b, Graphics g) {
	lineNeg(a.x, -a.y, b.x, -b.y, g);
    }

    public static void lineGreatNeg(int x0, int y0, int xEnd, int yEnd,
	    Graphics g) {
	int dx = Math.abs(xEnd - x0), dy = Math.abs(yEnd - y0);
	int p = 2 * dy - dx;
	int twoDy = 2 * dy, twoDyMinusDx = 2 * (dy - dx);
	int x, y;

	if (x0 > xEnd) {
	    x = xEnd;
	    y = yEnd;
	    xEnd = x0;
	} else {
	    x = x0;
	    y = y0;
	}
	g.drawString(",", round(y), round(-x));
	while (x < xEnd) {
	    x++;
	    if (p < 0)
		p += twoDy;
	    else {
		y++;
		p += twoDyMinusDx;
	    }
	    g.drawString(",", round(y), round(-x));
	}
    }

    public static void lineGreatNeg(Point a, Point b, Graphics g) {
	lineGreatNeg(-a.y, a.x, -b.y, b.x, g);
    }

    public static void linePos(int x0, int y0, int xEnd, int yEnd, Graphics g) {
	int dx = Math.abs(xEnd - x0), dy = Math.abs(yEnd - y0);
	int p = 2 * dy - dx;
	int twoDy = 2 * dy, twoDyMinusDx = 2 * (dy - dx);
	int x, y;

	if (x0 > xEnd) {
	    x = xEnd;
	    y = yEnd;
	    xEnd = x0;
	} else {
	    x = x0;
	    y = y0;
	}
	g.drawString(",", round(x), round(y));
	while (x < xEnd) {
	    x++;
	    if (p < 0)
		p += twoDy;
	    else {
		y++;
		p += twoDyMinusDx;
	    }
	    g.drawString(",", round(x), round(y));
	}
    }

    public static void linePos(Point a, Point b, Graphics g) {
	linePos(a.x, a.y, b.x, b.y, g);
    }

    public static void lineGreatPos(int x0, int y0, int xEnd, int yEnd,
	    Graphics g) {
	int dx = Math.abs(xEnd - x0), dy = Math.abs(yEnd - y0);
	int p = 2 * dy - dx;
	int twoDy = 2 * dy, twoDyMinusDx = 2 * (dy - dx);
	int x, y;

	if (x0 > xEnd) {
	    x = xEnd;
	    y = yEnd;
	    xEnd = x0;
	} else {
	    x = x0;
	    y = y0;
	}
	g.drawString(",", round(y), round(x));
	while (x < xEnd) {
	    x++;
	    if (p < 0)
		p += twoDy;
	    else {
		y++;
		p += twoDyMinusDx;
	    }
	    g.drawString(",", round(y), round(x));
	}
    }

    public static void lineGreatPos(Point a, Point b, Graphics g) {
	lineGreatPos(a.y, a.x, b.y, b.x, g);
    }

    // public static void lineGreat(int x0, int y0, int xEnd, int yEnd, Graphics
    // g) {
    // int dx = Math.abs(xEnd - x0), dy = Math.abs(yEnd - y0);
    // int p = 2 * dy - dx;
    // int twoDy = 2 * dy, twoDyMinusDx = 2 * (dy - dx);
    // int x, y;
    //
    //
    // if (x0 > xEnd) {
    // x = xEnd;
    // y = yEnd;
    // xEnd = x0;
    // } else {
    // x = x0;
    // y = y0;
    // }
    // g.drawString(",", round(-y), round(x));
    // while (x < xEnd) {
    // x++;
    // if (p < 0)
    // p += twoDy;
    // else {
    // y++;
    // p += twoDyMinusDx;
    // }
    // g.drawString(",", round(-y), round(x));
    // }
    // }

    public static void lineHorizontal(int x0, int y0, int xEnd, Graphics g) {
	int x = 0;

	if (x0 > xEnd) {
	    x = xEnd;
	    xEnd = x0;
	} else {
	    x = x0;
	}

	do {
	    g.drawString(",", x++, y0);

	} while (x <= xEnd);
    }

    public static void lineHorizontal(Point a, int xEnd, Graphics g) {

	lineHorizontal(a.x, a.y, xEnd, g);

    }

    public static void lineVertical(int x0, int y0, int yEnd, Graphics g) {
	int y = 0;

	if (y0 > yEnd) {
	    y = yEnd;
	    yEnd = y0;
	} else {
	    y = y0;
	}

	do {
	    g.drawString(",", x0, y++);

	} while (y <= yEnd);
    }

    public static void lineVertical(Point a, int yEnd, Graphics g) {
	lineVertical(a.x, a.y, yEnd, g);

    }

    public static void lineDDA(int x0, int y0, int xEnd, int yEnd, Graphics g) {
	int dx = xEnd - x0, dy = yEnd - y0, steps, k;
	float xIncrement, yIncrement, x = x0, y = y0;
	if (Math.abs(dx) > Math.abs(dy))
	    steps = Math.abs(dx);
	else
	    steps = Math.abs(dy);
	xIncrement = (float) dx / (float) steps;
	yIncrement = (float) dy / (float) steps;
	g.drawString(",", (int) (x), (int) (y));
	for (k = 0; k < steps; k++) {
	    x += xIncrement;
	    y += yIncrement;
	    try {
		Thread.sleep(01);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    g.drawString(",", (int) (x), (int) (y));
	}

    }

    public static void lineDDA(Point p1, Point p2, Graphics g) {
	lineDDA(p1.x, p1.y, p2.x, p2.y, g);
    }

    public static void ellipseDraw(int xcenter, int ycenter, int xradiu,
	    int yradius, double angle, Graphics g, Color color) {

	double ang = angle;
	int x, y;

	do {
	    x = (int) (xcenter + (xradiu * Math.cos(ang % 360)));
	    y = (int) (ycenter - (yradius * Math.sin(ang % 360)));
	    ang = ((ang + 0.5));
	    g.setColor(color);
	    g.drawString(",", x, y);
	    // System.out.println(angle);

	    if ((360 + angle) <= ang)
		return;
	    try {
		// Thread.sleep(10);
	    } catch (Exception e) {
		// TODO: handle exception
	    }
	} while (ang != angle);

	g.setColor(Color.black);
    }

    public static void ellipseDraw(Point p, int xradiu, int yradius, int angle,
	    Graphics g, Color color) {
	ellipseDraw(p.x, p.y, xradiu, yradius, angle, g, color);
    }

    public static void fillEllipseDraw(int xcenter, int ycenter, double xradiu,
	    double yradius, double angle, Graphics g, Color color, int orient) {
	g.setColor(color);
	while (xradiu > yradius && (xradiu > 0)) {
	    // ellipseDraw(xcenter, ycenter, xradiu--, yradius, angle, g,
	    // color);
	    hEllipseMidpoint(xcenter, ycenter, xradiu--, yradius, orient,
		    angle, g);

	}

	while (xradiu < yradius && (yradius > 0)) {
	    // ellipseDraw(xcenter, ycenter, xradiu, yradius--, angle, g,
	    // color);
	    hEllipseMidpoint(xcenter, ycenter, xradiu, yradius--, orient,
		    angle, g);
	}

	while (xradiu == yradius && (yradius > 0)) {
	    // ellipseDraw(xcenter, ycenter, xradiu--, yradius--, angle, g,
	    // color);
	    hEllipseMidpoint(xcenter, ycenter, xradiu--, yradius--, orient,
		    angle, g);

	}
	g.setColor(color.black);

    }

    public static void fillEllipseDraw(Point p, double xradiu, double yradius,
	    double angle, Graphics g, Color color, int orient) {

	fillEllipseDraw(p.x, p.y, xradiu, yradius, angle, g, color, orient);
    }

    public static void ellipseMidpoint(int xCenter, int yCenter, int Rx,
	    int Ry, Graphics g) {
	int Rx2 = Rx * Rx;
	int Ry2 = Ry * Ry;
	int twoRx2 = 2 * Rx2;
	int twoRy2 = 2 * Ry2;
	int p;
	int x = 0;
	int y = Ry;
	int px = 0;
	int py = twoRx2 * y;
	// void ellipsePlotPoints (int, int, int, int);
	/* Plotthe initial point in each quadrant. */

	ArrayList<Point> ps = new ArrayList<Point>();

	ps.add(new Point(xCenter, yCenter));

	ellipsePlotPoints(xCenter, yCenter, x, y, -1, ps);
	/* Region 1 */
	p = (int) ((float) (Ry2 - (Rx2 * Ry) + (0.25 * Rx2)));
	while (px < py) {
	    x++;
	    px += twoRy2;
	    if (p < 0)
		p += Ry2 + px;
	    else {
		y--;
		py -= twoRx2;
		p += Ry2 + px - py;
	    }
	    ellipsePlotPoints(xCenter, yCenter, x, y, -1, ps);
	}
	/* Region 2 */
	p = (int) ((float) (Ry2 * (x + 0.5) * (x + 0.5) + Rx2 * (y - 1)
		* (y - 1) - Rx2 * Ry2));
	while (y > 0) {
	    y--;
	    py -= twoRx2;
	    if (p > 0)
		p += Rx2 - py;
	    else {
		x++;
		px += twoRy2;
		p += Rx2 - py + px;
	    }
	    ellipsePlotPoints(xCenter, yCenter, x, y, -1, ps);
	}

	ellipsePlotPoints(ps, 0, g);
    }

    public static void ellipseMidpoint(Point p, int Rx, int Ry, Graphics g) {
	ellipseMidpoint(p.x, p.y, Rx, Ry, g);

    }

    static void ellipsePlotPoints(ArrayList<Point> pPs, double angle, Graphics g) {
	Point[] ps = new Point[pPs.size()];
	for (int pos = 0; pos < ps.length; pos++) {

	    ps[pos] = pPs.get(pos);
	}
	// pPs.toArray(ps);

	Transformer.RotateFromPoint(ps, angle);
	// Transformer.ScaleFromPoint(ps, 3.6, 3.6);
	// Transformer.ShearXY(ps, 0.9, 0);
	for (Point point : ps) {
	    g.drawString(",", point.x, point.y);
	}
    }

    public static void hEllipseMidpoint(int xCenter, int yCenter, double Rx,
	    double Ry, int side, double angle, Graphics g) {
	double Rx2 = Rx * Rx;
	double Ry2 = Ry * Ry;
	double twoRx2 = 2 * Rx2;
	double twoRy2 = 2 * Ry2;
	double p;
	int x = 0;
	int y = (int) Ry;
	double px = 0;
	double py = twoRx2 * y;

	ArrayList<Point> ps = new ArrayList<Point>();
	ps.add(new Point(xCenter, yCenter));

	// void ellipsePlotPoints (int, int, int, int);
	/* Plotthe initial point in each quadrant. */
	ellipsePlotPoints(xCenter, yCenter, x, y, side, ps);
	/* Region 1 */
	p = round((float) (Ry2 - (Rx2 * Ry) + (0.25 * Rx2)));
	while (px < py) {
	    x++;
	    px += twoRy2;
	    if (p < 0)
		p += Ry2 + px;
	    else {
		y--;
		py -= twoRx2;
		p += Ry2 + px - py;
	    }
	    ellipsePlotPoints(xCenter, yCenter, x, y, side, ps);
	}
	/* Region 2 */
	p = round((float) (Ry2 * (x + 0.5) * (x + 0.5) + Rx2 * (y - 1)
		* (y - 1) - Rx2 * Ry2));
	while (y > 0) {
	    y--;
	    py -= twoRx2;
	    if (p > 0)
		p += Rx2 - py;
	    else {
		x++;
		px += twoRy2;
		p += Rx2 - py + px;
	    }
	    ellipsePlotPoints(xCenter, yCenter, x, y, side, ps);
	}
	ellipsePlotPoints(ps, angle, g);
    }

    public static void ellipsePlotPoints(int xCenter, int yCenter, int x,
	    int y, int side, ArrayList<Point> pPs) {
	switch (side) {
	case 0:
	    pPs.add(new Point(xCenter + x, yCenter - y));
	    pPs.add(new Point(xCenter - x, yCenter - y));

	    break;
	case 1:
	    pPs.add(new Point(xCenter + x, yCenter + y));
	    pPs.add(new Point(xCenter + x, yCenter - y));
	    break;
	case 2:
	    pPs.add(new Point(xCenter + x, yCenter + y));
	    pPs.add(new Point(xCenter - x, yCenter + y));
	    break;
	case 3:
	    pPs.add(new Point(xCenter - x, yCenter + y));
	    pPs.add(new Point(xCenter - x, yCenter - y));
	default:
	    pPs.add(new Point(xCenter + x, yCenter + y));
	    pPs.add(new Point(xCenter - x, yCenter + y));
	    pPs.add(new Point(xCenter + x, yCenter - y));
	    pPs.add(new Point(xCenter - x, yCenter - y));
	    // g.drawString(",", );
	    // g.drawString(",",);
	    // g.drawString(",", );
	    // g.drawString(",", );
	    break;
	}

    }

    public static class Scale {
	public double x;
	public double y;

	public Scale(double x, double y) {
	    this.x = x;
	    this.y = y;
	}
    }

    public static BufferedImage createImage(Container panel) {

	int w = panel.getWidth();
	int h = panel.getHeight();
	BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	Graphics2D g = bi.createGraphics();
	panel.paint(g);
	return (bi);
    }

    public static void drawPolygon(Point[] points, Graphics g) {

	for (int i = 0; i < points.length; i++)
	    lineBres(points[i], points[(i + 1) % (points.length)], g);
    }

    public static Point addPoint(Point p, int dx, int dy) {
	return new Point(p.x + dx, p.y + dy);
    }

    // public static void halfhEllipse(int centerx, int centery, int r, Graphics
    // g) {
    // int xo = 0;
    // int yo = r;
    //
    // int rad = r * 2;
    // int d = rad / r;
    //
    // int Po = (5 / 4) - r;
    //
    // int xc = centerx;
    // int yc = centery;
    //
    // while (xo < yo) {
    //
    // // sectors
    //
    // g.drawString(",", (xc + xo), yc - yo);// 1st clockwise
    //
    // g.drawString(",", (xc + yo), yc - xo);// 2nd clockwise
    //
    // g.drawString(",", (xc + yo), yc + xo);// 3rd clockwise
    //
    // g.drawString(",", (xc + xo), yc + yo);// 4th clockwise
    //
    // // g.drawString(",",d*(xc-xo),yc+yo);//5th clockwise
    //
    // // g.drawString(",",d*(xc-yo),yc+xo);//6th clockwise
    //
    // // g.drawString(",", d * (xc - yo), yc - xo);// 7th clockwise
    //
    // // g.drawString(",", d * (xc - xo), yc - yo);// 8th clockwise
    //
    // if (Po < 0) {
    // xo++;
    // Po = Po + ((2 * xo) + 2) + 1;
    // } else {
    // xo++;
    // yo--;
    // Po = Po + ((2 * xo) + 2) + 1 - ((2 * yo) - 2);
    // }
    // }
    //
    // }
}
