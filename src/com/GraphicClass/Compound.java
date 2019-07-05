package com.GraphicClass;
import java.awt.Graphics;

import javax.swing.JApplet;

import com.graphicsPrimitives.Util;

public class Compound extends JApplet {

	Util pen = new Util();

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		drawBoy(g);
	}

	public void drawBoy(Graphics g) {
		pen.cirlceLine(32, 106, 83, g);
		pen.lineDDA(108, 113, 108, 196, g);
		pen.lineDDA(68, 157, 108, 138, g);
		pen.lineDDA(108, 138, 152, 157, g);
		pen.lineDDA(69, 234, 108, 197, g);
		pen.lineDDA(108, 197, 127, 230, g);

	}

	public void drawGirl(Graphics g) {

	}

}
