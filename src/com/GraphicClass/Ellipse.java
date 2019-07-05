package com.GraphicClass;

import javax.swing.JApplet;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ConvolveOp;
import java.io.Console;
import java.math.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Point;

import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JRadioButton;

import utils.Transformer;

import java.awt.Dimension;

public class Ellipse extends JApplet {
	private JPanel panel;
	private JButton btnClear;
	private JButton btnGraph;
	private Point startPoint;
	private Point endPoint;
	private JLabel lblMousePoint;
	private JLabel lblNewLabel;
	private JTextField txtX;
	private JLabel lblY;
	private JTextField txtY;
	private JLabel lblNewLabel_2;
	private JTextField txtRx;
	private JTextField txtRy;
	private JLabel lblRy;
	private JTextField txtAngle;
	private JLabel lblAngle;
	private JRadioButton rdbtnVertical;
	private JRadioButton rdbtnHorizontal;
	private ButtonGroup buttonGroup;

	/**
	 * Create the applet.
	 */
	public Ellipse() {
		setSize(new Dimension(820, 930));
		getContentPane().setSize(new Dimension(800, 900));
		getContentPane().setBackground(Color.YELLOW);
		getPanel().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				getTxtX().setText(String.valueOf(arg0.getX()));
				txtY.setText(String.valueOf(arg0.getY()));
			}
		});
		getContentPane().setLayout(
				new MigLayout("", "[450px,grow]", "[10px,grow][][][][]"));
		getContentPane().add(getPanel(), "cell 0 0,grow");
		getContentPane().add(getLblNewLabel(), "flowx,cell 0 1");
		getContentPane().add(getTxtX(), "cell 0 1,aligny top");
		getContentPane().add(getLblY(), "cell 0 1");
		getContentPane().add(getTxtY(), "cell 0 1");
		getContentPane().add(getBtnGraph(), "cell 0 1");
		getContentPane().add(getLblMousePoint(), "cell 0 1");
		getContentPane().add(getLblNewLabel_2(), "flowx,cell 0 2");
		getContentPane().add(getLblAngle(), "flowx,cell 0 3");
		getContentPane().add(getTxtAngle(), "cell 0 3");
		getContentPane().add(getBtnClear(), "cell 0 4");
		getContentPane().add(getTxtRx(), "cell 0 2");
		getContentPane().add(getLblRy(), "cell 0 2");
		getContentPane().add(getTxtRy(), "cell 0 2");
		getContentPane().add(getRdbtnVertical(), "cell 0 3");
		getContentPane().add(getRdbtnHorizontal(), "cell 0 3,alignx left");
		getRdbtnVertical().setSelected(true);
		setSize(900, 900);

	}

	public static void main(String[] args0) {
		Ellipse ellipse = new Ellipse();
		ellipse.setVisible(true);
		ellipse.setSize(800, 900);
	}

	// public static void

	int round(final float a) {
		return (int) (a + 0.5);
	}

	// void lineDDA(int x0, int y0, int xEnd, int yEnd) {
	// int dx = xEnd - x0, dy = yEnd - y0, steps, k;
	// float xIncrement, yIncrement, x = x0, y = y0;
	// if (Math.abs(dx) > Math.abs(dy))
	// steps = Math.abs(dx);
	// else
	// steps = Math.abs(dy);
	// xIncrement = (float) dx / (float) steps;
	// yIncrement = (float) dy / (float) steps;
	// getPanel().getGraphics().drawString(".", round(x), round(y));
	// for (k = 0; k < steps; k++) {
	// x += xIncrement;
	// y += yIncrement;
	// getPanel().getGraphics().drawString(".", round(x), round(y));
	// }

	// }

	// void cirlceLine(int r, int x0, int y0) {
	// int x = 0, y = r, d = 3 - 2 * r;
	// while (x <= y) {
	// getPanel().getGraphics().drawString(".", round(x0 + x),
	// round(y0 + y));
	// getPanel().getGraphics().drawString(".", round(x0 + y),
	// round(y0 + x));
	// getPanel().getGraphics().drawString(".", round(x0 - y),
	// round(y0 + x));
	// getPanel().getGraphics().drawString(".", round(x0 - x),
	// round(y0 + y));
	// getPanel().getGraphics().drawString(".", round(x0 - x),
	// round(y0 - y));
	// getPanel().getGraphics().drawString(".", round(x0 - y),
	// round(y0 - x));
	// getPanel().getGraphics().drawString(".", round(x0 + y),
	// round(y0 - x));
	// getPanel().getGraphics().drawString(".", round(x0 + x),
	// round(y0 - y));
	// if (d < 0)
	// d = d + (4 * x) + 6;
	// else {
	// d = d + 4 * (x - y) + 10;
	// y--;
	// }
	// x++;
	//
	// }
	// }

	void ellipseDraw(int xcenter, int ycenter, int xradiu, int yradius,
			int angle) {

		double ang = angle;
		int x, y;

		do {
			x = (int) (xcenter + (xradiu * Math.cos(ang % 360)));
			y = (int) (ycenter - (yradius * Math.sin(ang % 360)));
			ang = ((ang + 0.5));
			getPanel().getGraphics().drawString(".", x, y);
			System.out.println(angle);

			if ((360 + angle) <= ang)
				return;
			try {
				// Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (ang != angle);

	}

	void fillEllipseDraw(int xcenter, int ycenter, int xradiu, int yradius,
			int angle) {

		while (xradiu > yradius && (xradiu > 0)) {
			ellipseDraw(xcenter, ycenter, xradiu--, yradius, angle);

		}

		while (xradiu < yradius && (yradius > 0)) {
			ellipseDraw(xcenter, ycenter, xradiu, yradius--, angle);

		}

		while (xradiu == yradius && (yradius > 0)) {
			ellipseDraw(xcenter, ycenter, xradiu--, yradius--, angle);

		}

	}

	void ellipseMidpoint(int xCenter, int yCenter, int Rx, int Ry, double angle) {
		int Rx2 = Rx * Rx;
		int Ry2 = Ry * Ry;
		int twoRx2 = 2 * Rx2;
		int twoRy2 = 2 * Ry2;
		int p;
		int x = 0;
		int y = Ry;
		int px = 0;
		int py = twoRx2 * y;
		ArrayList<Point> ps = new ArrayList<Point>();

		ps.add(new Point(xCenter, yCenter));

		// void ellipsePlotPoints (int, int, int, int);
		/* Plotthe initial point in each quadrant. */
		ellipsePlotPoints(xCenter, yCenter, x, y, ps);
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
			ellipsePlotPoints(xCenter, yCenter, x, y, ps);
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
			ellipsePlotPoints(xCenter, yCenter, x, y, ps);
		}
		ellipsePlotPoints(ps, angle);
	}

	void hHellipseMidpoint(int xCenter, int yCenter, int Rx, int Ry) {
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
		hHellipsePlotPoints(xCenter, yCenter, x, y);
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
			hHellipsePlotPoints(xCenter, yCenter, x, y);
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
			hHellipsePlotPoints(xCenter, yCenter, x, y);
		}
	}

	void ellipsePlotPoints(int xCenter, int yCenter, int x, int y) {

		getPanel().getGraphics().drawString("+", xCenter + x, yCenter + y);
		getPanel().getGraphics().drawString("+", xCenter - x, yCenter + y);
		getPanel().getGraphics().drawString("+", xCenter + x, yCenter - y);
		getPanel().getGraphics().drawString("+", xCenter - x, yCenter - y);
	}

	void ellipsePlotPoints(int xCenter, int yCenter, int x, int y,
			ArrayList<Point> pPs) {

		pPs.add(new Point(xCenter + x, yCenter + y));
		pPs.add(new Point(xCenter - x, yCenter + y));
		pPs.add(new Point(xCenter + x, yCenter - y));
		pPs.add(new Point(xCenter - x, yCenter - y));

		// getPanel().getGraphics().drawString("+", xCenter + x, yCenter + y);
		// getPanel().getGraphics().drawString("+", xCenter - x, yCenter + y);
		// getPanel().getGraphics().drawString("+", xCenter + x, yCenter - y);
		// getPanel().getGraphics().drawString("+", xCenter - x, yCenter - y);
	}

	void ellipsePlotPoints(ArrayList<Point> pPs, double angle) {
		Point[] ps = new Point[pPs.size()];
		for (int pos = 0; pos < ps.length; pos++) {

			ps[pos] = pPs.get(pos);
		}
		// pPs.toArray(ps);

		Transformer.RotateFromPoint(ps, angle);
		// Transformer.ScaleFromPoint(ps, 3.6, 3.6);
		// Transformer.ShearXY(ps, 0.9, 0);
		for (Point point : ps) {
			getPanel().getGraphics().drawString("+", point.x, point.y);
		}
	}

	void hHellipsePlotPoints(int xCenter, int yCenter, int x, int y) {

		getPanel().getGraphics().drawString("+", xCenter + x, yCenter + y);
		// getPanel().getGraphics().drawString("+", xCenter - x, yCenter + y);
		getPanel().getGraphics().drawString("+", xCenter + x, yCenter - y);
		// getPanel().getGraphics().drawString("+", xCenter - x, yCenter - y);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent arg0) {
					lblMousePoint.setText(arg0.getPoint().x + ","
							+ arg0.getPoint().y);
				}
			});
		}
		return panel;
	}

	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					getTxtY().setText("");
					getTxtX().setText("");
					getTxtRx().setText("");
					getTxtRy().setText("");
					// panel = null;
					// getPanel().repaint();
					// getPanel();
				}
			});
		}
		return btnClear;
	}

	private JButton getBtnGraph() {
		if (btnGraph == null) {
			btnGraph = new JButton("Graph");
			btnGraph.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// int xI, yI, xE, yE, pos;
					// xI = Integer.parseInt(txtFieldA.getText().substring(0,
					// getTxtFieldA().getText().indexOf(",")));
					// yI = Integer.parseInt(txtFieldA.getText().substring(
					// getTxtFieldA().getText().indexOf(",") + 1,
					// getTxtFieldA().getText().length()));

					// xE = Integer.parseInt(txtFieldB.getText().substring(0,
					// getTxtFieldB().getText().indexOf(",")));
					// yE = Integer.parseInt(txtFieldB.getText().substring(
					// getTxtFieldB().getText().indexOf(",") + 1,
					// getTxtFieldB().getText().length()));
					//
					// // lineBres((int) startPoint.getX(), (int)
					// // startPoint.getY(),
					// // (int) endPoint.getX(), (int) endPoint.getY());
					// lineBres(xI, yI, xE, yE);
					//
					// startPoint = null;
					// endPoint = null;

					// cirlceLine(80);
					try {

						if (getRdbtnHorizontal().isSelected()
								&& (Integer.parseInt(txtRx.getText()) < Integer
										.parseInt(txtRy.getText())))
							throw new IllegalArgumentException(
									"Please verify Rx is larger than Ry");
						else if (getRdbtnVertical().isSelected()
								&& (Integer.parseInt(txtRx.getText()) > Integer
										.parseInt(txtRy.getText())))
							throw new IllegalArgumentException(
									"Please verify Ry is larger than Rx");

						// ellipseDraw((Integer.parseInt(txtX.getText())),
						// Integer.parseInt(txtY.getText()),
						// Integer.parseInt(txtRx.getText()),
						// Integer.parseInt(txtRy.getText()),
						// Integer.parseInt(txtAngle.getText()));
						//
						ellipseMidpoint((Integer.parseInt(txtX.getText())),
								Integer.parseInt(txtY.getText()),
								Integer.parseInt(txtRx.getText()),
								Integer.parseInt(txtRy.getText()),
								Integer.parseInt(txtAngle.getText()));
					}

					catch (IllegalArgumentException e) {
						JOptionPane.showMessageDialog(getPanel(),
								e.getMessage(), "Invalid allignment arguments",
								JOptionPane.ERROR_MESSAGE);
						// TODO: handle exception
					}

					catch (Exception e) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(getPanel(),
								"Input may be invalid", "Invalid Input",
								JOptionPane.OK_OPTION);
						e.printStackTrace();
					}

				}
			});
		}
		return btnGraph;
	}

	private JLabel getLblMousePoint() {
		if (lblMousePoint == null) {
			lblMousePoint = new JLabel("New label");
			lblMousePoint.setBackground(Color.MAGENTA);
		}
		return lblMousePoint;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("X0");
		}
		return lblNewLabel;
	}

	private JTextField getTxtX() {
		if (txtX == null) {
			txtX = new JTextField();
			txtX.setColumns(10);
		}
		return txtX;
	}

	private JLabel getLblY() {
		if (lblY == null) {
			lblY = new JLabel("Y0");
		}
		return lblY;
	}

	private JTextField getTxtY() {
		if (txtY == null) {
			txtY = new JTextField();
			txtY.setColumns(10);
		}
		return txtY;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Rx");
		}
		return lblNewLabel_2;
	}

	private JTextField getTxtRx() {
		if (txtRx == null) {
			txtRx = new JTextField();
			txtRx.setText("30");
			txtRx.setColumns(10);
		}
		return txtRx;
	}

	private JTextField getTxtRy() {
		if (txtRy == null) {
			txtRy = new JTextField();
			txtRy.setText("60");
			txtRy.setColumns(10);
		}
		return txtRy;
	}

	private JLabel getLblRy() {
		if (lblRy == null) {
			lblRy = new JLabel("Ry");
		}
		return lblRy;
	}

	private JTextField getTxtAngle() {
		if (txtAngle == null) {
			txtAngle = new JTextField();
			txtAngle.setText("0");
			txtAngle.setColumns(10);
		}
		return txtAngle;
	}

	private JLabel getLblAngle() {
		if (lblAngle == null) {
			lblAngle = new JLabel("Angle");
		}
		return lblAngle;
	}

	private JRadioButton getRdbtnVertical() {
		if (rdbtnVertical == null) {
			rdbtnVertical = new JRadioButton("Vertical");
			getButtonGroup().add(getRdbtnVertical());
		}
		return rdbtnVertical;
	}

	private JRadioButton getRdbtnHorizontal() {
		if (rdbtnHorizontal == null) {
			rdbtnHorizontal = new JRadioButton("Horizontal");
			getButtonGroup().add(getRdbtnHorizontal());
		}
		return rdbtnHorizontal;
	}

	private ButtonGroup getButtonGroup() {
		if (buttonGroup == null) {
			buttonGroup = new ButtonGroup();
		}
		return buttonGroup;
	}
}
