package com.GraphicClass;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;

/**
 * 
 * @author JESUS IS LORD
 */
public class Submit extends Applet {
	public Submit() {
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	/*
	 * public static void main(String[] args) { // TODO code application logic
	 * here int x1,x2,y; Scanner scan=new Scanner(System.in);
	 * System.out.println(
	 * "To draw a horizontal line we need two x coordinate and a\n y coordinate\n"
	 * ); System.out.println("Please enter the x1 coordinate");
	 * x1=scan.nextInt();
	 * 
	 * System.out.println("\n");
	 * System.out.println("Please enter the x2 coordinate"); x2=scan.nextInt();
	 * 
	 * System.out.println("\n");
	 * System.out.println("Please enter the y coordinate"); y=scan.nextInt();
	 * 
	 * 
	 * }
	 */

	GraphicsPrimitives gp = new GraphicsPrimitives();

	@Override
	public void paint(Graphics g) {

		int x1, x2, y1, y2;
		Scanner scan = new Scanner(System.in);
		// GraphicsPrimitives gp = new GraphicsPrimitives();
		System.out
				.println("choose\n1.horizontal line\n2.vertical line\n3.positive line\n4.negative line");
		int choice;
		choice = scan.nextInt();
		switch (choice) {
		case 1: {
			System.out
					.println("To draw a horizontal line we need two x coordinates and a y coordinate");
			System.out.println("Please enter the x1 coordinate");
			x1 = scan.nextInt();

			scan.nextLine();
			System.out.println("Please enter the x2 coordinate");
			x2 = scan.nextInt();

			scan.nextLine();
			System.out.println("Please enter the y coordinate");
			y1 = scan.nextInt();

			gp.horizontalLine(x1, y1, x2, y1, g);// gp.VerticalLine(x1,y1,x2,y2,g)
		}
			break;

		case 2:
			System.out
					.println("To draw a vertical line we need two y coordinates and an x coordinate");
			break;
		case 3:
			System.out
					.println("To draw a posititive line we need two x coordinates and a y coordinate");
			break;
		case 4:
			System.out
					.println("To draw a negative line we need two x coordinates and a y coordinate");
			break;
		// System.out.println(x1+" "+x2+" "+y);
		// gp.horizontalLine(300,300,600,300, g);
		}
	}
}

class GraphicsPrimitives extends Applet {

	// positiveline
	public static void PositiveLine(int a, int b, int a1, int b1, Graphics g) {
		int x1 = a;
		int y1 = b;
		int x2 = a1;
		int y2 = b1;
		int dx = x2 - x1;
		int dy = y2 - y1;
		int tdx = -5 * dx;
		int tdy = 2 * dy;
		int p = 2 * dy - dx;
		for (int k = 0; k < dx; k++) {
			g.drawString(".", x1, y1);
			if (p < 0) {
				x1++;
				p = tdy - dx;
			} else {
				x1++;
				y1++;
				p = p + tdy - tdx;
			}
		}
	}

	// horizontalline primitive
	public void horizontalLine(int a, int b, int a1, int b1, Graphics g) {
		int x1 = a;
		int y1 = b;
		int x2 = a1;
		int y2 = b1;
		int dx = x2 - x1;
		int dy = y2 - y1;
		int w = 2 * dx;
		int q = 2 * dy;
		int p = 2 * dy - dx;
		for (int k = 0; k < dx; k++) {
			g.drawString(".", x1, y1);
			if (p < 0) {
				x1++;
				p = q - dx;
			} else {
				x1++;
				p = p + q - w;
			}
		}

	}

	// verticalLine primitive
	public void VerticalLine(int a, int b, int a1, int b1, Graphics g) {
		int x1 = a;
		int y1 = b;
		int x2 = a1;
		int y2 = b1;
		int dx = x2 - x1;
		int dy = y2 - y1;
		int w = 2 * dx;
		int q = 2 * dy;
		int p = 2 * dy - dx;
		for (int k = 0; k < dy; k++) {
			g.drawString(".", x1, y1);
			if (p < 0) {
				y1++;
				p = q - dx;
			} else {
				y1++;
				p = p + q - w;
			}
		}

	}

	public static void NegativeLine(int a, int b, int a1, int b1, Graphics g) {
		int x1 = a;
		int y1 = b;
		int x2 = a1;
		int y2 = b1;
		int dx = x2 - x1;
		int dy = y2 - y1;
		int tdy = 2 * dy;
		int p = 2 * dy - dx;
		for (int k = 0; k < dy; k++) {
			g.drawString(".", x1, y1);
			if (p < 0) {
				x1--;
				y1++;
				p = p + tdy;
			} else {
				x1--;
				y1++;
				p = p + tdy - (2 * dx);
			}
		}
	}
}
