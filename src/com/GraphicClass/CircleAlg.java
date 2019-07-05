package com.GraphicClass;
import javax.swing.JApplet;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ConvolveOp;
import java.math.*;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Point;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;

public class CircleAlg extends JApplet {
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
	private JLabel lblNewLabel_1;
	private JTextField txtRadius;

	/**
	 * Create the applet.
	 */
	public CircleAlg() {
		getContentPane().setBackground(Color.YELLOW);
		getPanel().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				getTxtX().setText(String.valueOf(arg0.getX()));
				txtY.setText(String.valueOf(arg0.getY()));
			}
		});
		getContentPane().setLayout(
				new MigLayout("", "[450px,grow]", "[10px,grow][][][]"));
		getContentPane().add(getPanel(), "cell 0 0,grow");
		getContentPane().add(getLblNewLabel(), "flowx,cell 0 1");
		getContentPane().add(getTxtX(), "cell 0 1,aligny top");
		getContentPane().add(getLblY(), "cell 0 1");
		getContentPane().add(getTxtY(), "cell 0 1");
		getContentPane().add(getBtnGraph(), "cell 0 1");
		getContentPane().add(getLblMousePoint(), "cell 0 1");
		getContentPane().add(getLblNewLabel_1(), "flowx,cell 0 2,alignx left");
		getContentPane().add(getBtnClear(), "cell 0 3");
		getContentPane().add(getTxtRadius(), "cell 0 2");

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

	// void lineBres(int x0, int y0, int xEnd, int yEnd) {
	// int dx = Math.abs(xEnd - x0), dy = Math.abs(yEnd - y0);
	// int p = 2 * dy - dx;
	// int twoDy = 2 * dy, twoDyMinusDx = 2 * (dy - dx);
	// int x, y;
	//
	// if (x0 > xEnd) {
	// x = xEnd;
	// y = yEnd;
	// xEnd = x0;
	// } else {
	// x = x0;
	// y = y0;
	// }
	// getPanel().getGraphics().drawString(".", round(x), round(y));
	// while (x < xEnd) {
	// x++;
	// if (p < 0)
	// p += twoDy;
	// else {
	// y++;
	// p += twoDyMinusDx;
	// }
	// getPanel().getGraphics().drawString(".", round(x), round(y));
	// }
	// }

	void lineBres(int x0, int y0, int xEnd, int yEnd) {
		int dx = Math.abs(xEnd - x0), dy = Math.abs(yEnd - y0);
		int p = 2 * dy - dx;
		int twoDy = 2 * dy, twoDyMinusDx = 2 * (dy - dx);
		int x, y;
		/* Determine whichendpointto use asstart position. */
		if (x0 > xEnd) {
			x = xEnd;
			y = yEnd;
			xEnd = x0;
		}

		else {
			x = x0;
			y = y0;
		}
	}

	void cirlceLine(int r, int x0, int y0) {
		int x = 0, y = r, d = 3 - 2 * r;
		while (x <= y) {
			getPanel().getGraphics().drawString(".", round(x0 + x),
					round(y0 + y));
			getPanel().getGraphics().drawString(".", round(x0 + y),
					round(y0 + x));
			getPanel().getGraphics().drawString(".", round(x0 - y),
					round(y0 + x));
			getPanel().getGraphics().drawString(".", round(x0 - x),
					round(y0 + y));
			getPanel().getGraphics().drawString(".", round(x0 - x),
					round(y0 - y));
			getPanel().getGraphics().drawString(".", round(x0 - y),
					round(y0 - x));
			getPanel().getGraphics().drawString(".", round(x0 + y),
					round(y0 - x));
			getPanel().getGraphics().drawString(".", round(x0 + x),
					round(y0 - y));
			if (d < 0)
				d = d + (4 * x) + 6;
			else {
				d = d + 4 * (x - y) + 10;
				y--;
			}
			x++;

		}
	}

	void midPointLine(int r, int x0, int y0) {
		int x = 0 + x0, y = r + y0, p = 1 - r;
		while (x <= y) {
			getPanel().getGraphics().drawString(".", round(x0 + x),
					round(y0 + y));
			getPanel().getGraphics().drawString(".", round(x0 + y),
					round(y0 + x));
			getPanel().getGraphics().drawString(".", round(x0 - y),
					round(y0 + x));
			getPanel().getGraphics().drawString(".", round(x0 - x),
					round(y0 + y));
			getPanel().getGraphics().drawString(".", round(x0 - x),
					round(y0 - y));
			getPanel().getGraphics().drawString(".", round(x0 - y),
					round(y0 - x));
			getPanel().getGraphics().drawString(".", round(x0 + y),
					round(y0 - x));
			getPanel().getGraphics().drawString(".", round(x0 + x),
					round(y0 - y));

			// g.drawString(".", xcenter + x0, ycenter + y0);
			// g.drawString(".", xcenter + y0, ycenter + x0);
			// g.drawString(".", xcenter - y0, ycenter + x0);
			// g.drawString(".", xcenter - x0, ycenter + y0);
			//
			// g.drawString(".", xcenter - x0, ycenter - y0);
			// g.drawString(".", xcenter - y0, ycenter - x0);
			// g.drawString(".", xcenter + y0, ycenter - x0);
			// g.drawString(".", xcenter + x0, ycenter - y0);

			if (p < 0)
				p = p + 2 * x + 3;
			else {
				p = p + 2 * (x - y) + 5;
				y--;
			}
			x++;

		}
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
					getTxtRadius().setText("");
					getTxtY().setText("");
					getTxtX().setText("");
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
						cirlceLine(Integer.parseInt(txtRadius.getText()),
								Integer.parseInt(txtX.getText()),
								Integer.parseInt(txtY.getText()));
					} catch (Exception e) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(getPanel(),
								"Input may be invalid", "Invalid Input",
								JOptionPane.OK_OPTION);
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

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Radius");
		}
		return lblNewLabel_1;
	}

	private JTextField getTxtRadius() {
		if (txtRadius == null) {
			txtRadius = new JTextField();
			txtRadius.setColumns(10);
		}
		return txtRadius;
	}
}
