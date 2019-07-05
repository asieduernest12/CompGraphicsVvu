package utils;

/** FloodFill.java
 * Benedict Brown
 *
 * Takes an image file as a command-line argument,
 * and flood fills all black regions red.
 *
 * This program is intended primarily to demonstrate an
 * an application of depth-first search.
 *
 * NOTE: You will likely get a StackOverFlowException if you
 *       run this on large images, because Java's default stack
 *       size is quite limited.  The usual workaround for this
 *       is to maintain a stack of pixels that need to be filled.
 *       Instead of recursively calling flood(), you just push
 *       new pixels onto the stack.  flood() runs until the stack is
 *       empty.  Recursion is much more elegant though.
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.soap.Node;

public class FloodFill {
    // getting your java program to pause properly requires
    // some absurd mumbo-jumbo
    private static void sleep(int msec) {
	try {
	    Thread.currentThread().sleep(msec);
	} catch (InterruptedException e) {
	}
    }

    private static void flood(BufferedImage img, boolean[][] mark, int row,
	    int col, Color srcColor, Color tgtColor) {
	// make sure row and col are inside the image
	if (row < 0)
	    return;
	if (col < 0)
	    return;
	if (row >= img.getHeight())
	    return;
	if (col >= img.getWidth())
	    return;

	// make sure this pixel hasn't been visited yet
	if (mark[row][col])
	    return;

	// make sure this pixel is the right color to fill
	if (String.valueOf(img.getRGB(col, row)).equals(srcColor.getRGB()))
	    return;

	// fill pixel with target color and mark it as visited
	img.setRGB(col, row, tgtColor.getRGB());
	mark[row][col] = true;

	// animate
	// img.flush();
	// sleep(25);

	// recursively fill surrounding pixels
	// (this is equivalent to depth-first search)
	flood(img, mark, row - 1, col, srcColor, tgtColor);
	flood(img, mark, row + 1, col, srcColor, tgtColor);
	flood(img, mark, row, col - 1, srcColor, tgtColor);
	flood(img, mark, row, col + 1, srcColor, tgtColor);
    }

    public static void flood(BufferedImage img, int row, int col, Color srcCol,
	    Color trgCol) {
	boolean[][] mark = new boolean[img.getHeight()][img.getWidth()];

	flood(img, mark, row, col, Color.BLACK, Color.RED);

    }

    public static void bucketFill(BufferedImage img, int x, int y,
	    Color targetColor, Color replacementColor) {
	LinkedList<Point> stack = new LinkedList<Point>();
	stack.add(new Point(x, y)); // adding the point where the mouse was
	// clicked.
	Point temp;
	int Sy = img.getHeight(), Sx = img.getWidth();
	while (!stack.isEmpty()) {
	    temp = stack.pop();
	    int pixelColorRGB = 0;
	    try {
		pixelColorRGB = img
			.getRGB((int) temp.getX(), (int) temp.getY());
	    } catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	    }
	    Color pixelColor = new Color(pixelColorRGB, true);
	    if (pixelColorRGB == targetColor.getRGB()) {
		// img.getGraphics().setColor(replacementColor);
		// img.getGraphics().fillRect((int) temp.getX(),
		// (int) temp.getY(), 1, 1);
		img.setRGB(temp.x, temp.y, replacementColor.getRGB());
		// st.add(temp);
		System.out.println(stack.size());

		if (isPointValid(Sx, Sy, getLeft(temp).x, getLeft(temp).y)
			&& isPointRGBEqual(img, getLeft(temp).x,
				getLeft(temp).y, targetColor, replacementColor)

			&& !contains(stack, new Point((int) temp.getX() - 1,
				(int) temp.getY())))
		    stack.add(getLeft(temp));
		if (isPointValid(Sx, Sy, getRight(temp).x, getRight(temp).y)
			&& isPointRGBEqual(img, getRight(temp).x,
				getRight(temp).y, targetColor, replacementColor)
			&& !contains(stack, new Point((int) temp.getX() + 1,
				(int) temp.getY())))
		    stack.add(getRight(temp));
		if (isPointValid(Sx, Sy, getUp(temp).x, getUp(temp).y)
			&& isPointRGBEqual(img, getUp(temp).x, getUp(temp).y,
				targetColor, replacementColor)
			&& !contains(stack, new Point((int) temp.getX(),
				(int) temp.getY() - 1)))
		    stack.add(getUp(temp));
		if (isPointValid(Sx, Sy, getDown(temp).x, getDown(temp).y)
			&& isPointRGBEqual(img, getDown(temp).x,
				getDown(temp).y, targetColor, replacementColor)
			&& !contains(stack, new Point((int) temp.getX(),
				(int) temp.getY() + 1)))
		    stack.add(getDown(temp));

	    }

	}
    }

    public static boolean contains(LinkedList<Point> points, Point p) {
	boolean result = false;
	int pos = 0;

	while (pos < points.size() && !result) {
	    if (points.get(pos).getX() == p.getX()
		    && points.get(pos).getY() == p.getY())
		result = true;
	    pos++;
	}
	return result;
    }

    public static boolean isPointValid(int mxX, int mxY, int x, int y) {
	boolean result = true;
	if ((x < 2 || x > mxX - 2) || (y < 2 || y > mxY - 2))
	    result = false;
	return result;
    }

    public static Point getUp(Point p) {
	Point res = new Point(p.x, p.y - 1);
	return res;
    }

    public static Point getDown(Point p) {
	return new Point(p.x, p.y + 1);
    }

    public static Point getLeft(Point p) {
	return new Point(p.x - 1, p.y);
    }

    public static Point getRight(Point p) {
	return new Point(p.x + 1, p.y);
    }

    public static boolean isPointRGBEqual(BufferedImage img, int x, int y,
	    Color targetColor, Color replacementColor) {
	try {
	    return (img.getRGB(x, y) == targetColor.getRGB()) ? true : false;

	} catch (Exception e) {
	    // TODO: handle exception
	    e.printStackTrace();
	    return false;
	}

    }
}