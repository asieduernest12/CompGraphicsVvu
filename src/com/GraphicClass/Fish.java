package com.GraphicClass;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.graphicsPrimitives.Util;
import com.graphicsPrimitives.Util.Scale;

import javax.swing.JButton;

import utils.KinkanMsgBox;
import utils.drawObjects;

import java.awt.BorderLayout;

public class Fish extends JApplet {
    public Fish() {

    }

    Util pen = new Util();

    @Override
    public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	drawFish(g);
	getContentPane().addMouseListener(mouseListen);

    }

    private void drawFish(Graphics g) {
	// pen.ellipseMidpoint(303, 320, 163, 62, g);
	// pen.cirlceLine(6, 192, 311, g);
	// pen.lineDDA(170, 354, 221, 346, g);
	// pen.hHellipseMidpoint(226, 319, 14, 52, g);
	// pen.hHellipseMidpoint(286, 290, 42, 17, g);
	// pen.hHellipseMidpoint(289, 353, 42, 17, g);
	// pen.hHellipseMidpoint(289, 321, 42, 17, g);
	// pen.hHellipseMidpoint(294, 285, 42, 17, g);
	// pen.hHellipseMidpoint(298, 358, 42, 17, g);
	// pen.hHellipseMidpoint(327, 321, 42, 17, g);
	// pen.hHellipseMidpoint(359, 353, 42, 17, g);
	// pen.hHellipseMidpoint(354, 287, 42, 17, g);
	// pen.hHellipseMidpoint(392, 316, 42, 17, g);
	// pen.lineDDA(455, 299, 536, 236, g);
	// pen.lineDDA(536, 236, 536, 381, g);
	// pen.lineDDA(536, 381, 462, 332, g);
	drawObjects.drawSun(new Point(990, 92), g);
	drawObjects.drawChair(new Point(350, 456), g);
	drawObjects.drawChair(new Point(1027, 174), g);
	drawObjects.drawTable(new Point(950, 430), g);
	drawObjects.drawHouse(new Point(486, 177), new Scale(1, 1), new Scale(
		0, 0), new Scale(0, 0), 0, g);
	drawObjects.drawGirl(new Point(260, 70), g);
	drawObjects.drawBoy(new Point(100, 70), null, g);
	drawObjects.drawCar(new Point(120, 270), g);
    }

    public MouseListener mouseListen = new MouseListener() {
	Point pointOne = null;
	Point pointTwo = null;

	@Override
	public void mouseReleased(MouseEvent arg0) {
	    // TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	    // TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	    // TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	    // TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	    // TODO Auto-generated method stub
	    // if (arg0.getButton() == MouseEvent.BUTTON1)
	    // if ((pointOne == null) && (pointTwo == null)) {
	    // pointOne = arg0.getPoint();
	    // String tempStr = String.format("p1 %d:%d",
	    // (int) pointOne.getX(), (int) pointOne.getY());
	    // JOptionPane.showMessageDialog(getContentPane(), tempStr);
	    //
	    // } else if ((pointTwo == null) && (pointOne != null)) {
	    // pointTwo = arg0.getPoint();
	    // int dx = (int) (pointTwo.getX() - pointOne.getX());
	    // int dy = (int) (pointTwo.getY() - pointOne.getY());
	    //
	    // String tempStr = String.format(
	    // "p1 %s:%s \np2 %s:%s\nDifference %s:%s",
	    // (int) pointOne.getX(), (int) pointOne.getY(),
	    // (int) pointTwo.getX(), (int) pointTwo.getY(), dx, dy);
	    // // JOptionPane.showMessageDialog(getContentPane(), tempStr);
	    // new KinkanMsgBox(pointOne, new Point(dx, dy), Util.createImage(
	    // getContentPane()).getRGB(arg0.getY(), arg0.getY()))
	    // .setVisible(true);
	    //
	    // } else {
	    // pointOne = null;
	    // pointTwo = null;
	    // }
	    // drawObjects.animateBoy(getGraphics());

	}
    };
}
