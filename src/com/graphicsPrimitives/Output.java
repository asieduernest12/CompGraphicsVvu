package com.graphicsPrimitives;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import net.miginfocom.swing.MigLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Created by POPSY on 10/27/2014.
 */
public class Output extends Applet {

	public Output() {
		setLayout(new MigLayout("", "[][]", "[][]"));
		add(getLblMousePosition(), "cell 0 0");

	}

	Primitives gp = new Primitives();
	Util pen = new Util();

	public void paint(Graphics g) {
		// gp.horizontalLine(400, 150, 801, 150, g);
		pen.lineBres(new Point(400, 150), new Point(801, 150), g);
		// gp.verticalLine(660, 150, 660, 430, g);
		pen.lineBres(new Point(660, 150), new Point(660, 430), g);
		// gp.positiveLine(801, 150, 1100, 430, g);
		pen.lineBres(new Point(801, 150), new Point(1100, 430), g);
		// gp.negativeLine(400, 150, 100, 430, g);
		pen.lineBres(new Point(400, 150), new Point(100, 430), g);
		// gp.horizontalLine(100, 430, 1100, 430, g);
		pen.lineBres(new Point(100, 430), new Point(1100, 430), g);
		gp.circle(530, 290, 90, g);
		gp.semicircle(530, 290, 110, g);
		pen.midPointCircle(110, 530, 290, g);
		gp.vertEllipse(760, 150, 50, g);
		gp.halfvertEllipse(760, 150, 70, g);
		gp.hEllipse(160, 370, 40, g);
		gp.halfhEllipse(160, 370, 60, g);

	}

	private JLabel lblMousePosition;

	private JLabel getLblMousePosition() {
		if (lblMousePosition == null) {
			lblMousePosition = new JLabel("New label");
			lblMousePosition.setBackground(Color.GREEN);
		}
		return lblMousePosition;
	}

}
