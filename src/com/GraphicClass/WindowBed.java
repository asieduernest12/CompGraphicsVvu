package com.GraphicClass;
import java.awt.Graphics;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JApplet;

public class WindowBed extends JApplet {

	/**
	 * Create the applet.
	 */

	int option = 0;
	Scanner scanner = new Scanner(System.in);
	PrintStream pen = System.out;
	Graphics g = getGraphics();

	public WindowBed() {
		initializeDisplay();

		do {
			clrScreen();
			pen.println(String
					.format("\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n",
							"1 Horizontal Line", "2 Vertical line",
							"3 Positive line", "4 Negative line",
							"5 Horizontal Ellipse",
							"6 Half Horizontal Ellipse", "7 Vertical Ellipse",
							"8 Half Vertical Ellipse", "9 Circle",
							"10 Half Circle", " -1 Teminate"));
			option = scanner.nextInt();

		} while ((option == 0));
		stop();
	}

	public void initializeDisplay() {
		do {
			clrScreen();
			System.out.println("\n\nENTER to begin and  -1 TO TERMINATE");
			System.out.printf("\n\nSELECTIONS\n%-10s:%3d%3s%-10s:%3d\n",
					"Continue", 1, " ", "TERMINATE", -1);
			option = scanner.nextInt();
		} while (option != -1 && option != 1);
	}

	public void clrScreen() {
		for (int i = 0; i < 10; i++)
			System.out.println(" ");
		System.out.println(String.format("%10s\n", "WindowBed"));
	}

	public void pickPrimitive(int a) {

		switch (a) {
		case 1:
			// g.

			break;

		default:
			break;
		}
	}

	public void stop() {
		System.exit(0);
	}

}
