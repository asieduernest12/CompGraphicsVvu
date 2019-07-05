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
import javax.xml.bind.ParseConversionEvent;

import Interfaces.HorizontalLine;
import Interfaces.VerticalLine;

import com.graphicsPrimitives.Util;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JTextArea;

public class BrensenHam extends JApplet {
	private JPanel panel;
	private JLabel lblPointF;
	private JTextField txtFieldA;
	private JTextField txtFieldB;
	private JLabel lblPointB;
	private JButton btnClear;
	private JButton btnGraph;
	private Point startPoint;
	private Point endPoint;
	private JLabel lblMousePoint;
	private JTextArea textGrad;
	boolean isAset = false;
	private JTextField txtDx;
	private JTextField txtDy;

	/**
	 * Create the applet.
	 */
	public BrensenHam() {
		getContentPane().setBackground(Color.YELLOW);
		getContentPane().setLayout(
				new MigLayout("", "[450px,grow]", "[10px,grow][][][]"));
		getContentPane().add(getPanel(), "cell 0 0,grow");
		getContentPane().add(getLblPointF(), "flowx,cell 0 1,alignx left");
		getContentPane().add(getTxtFieldA(), "cell 0 1");
		getContentPane().add(getLblPointB(), "cell 0 1");
		getContentPane().add(getTxtFieldB(), "cell 0 1");
		getContentPane().add(getBtnClear(), "cell 0 2");
		getContentPane().add(getBtnGraph(), "cell 0 1");
		getContentPane().add(getLblMousePoint(), "cell 0 1");
		getContentPane().add(getTextGrad(), "cell 0 1");
		getContentPane().add(getTxtDx(), "cell 0 1");
		getContentPane().add(getTxtDy(), "cell 0 1,aligny top");
		VerticalLine verticalLine = new VerticalLine(getPanel());
		getContentPane().add(verticalLine, "flowx,cell 0 3,alignx left");
		HorizontalLine horizontalLine = new HorizontalLine(getPanel());
		getContentPane().add(horizontalLine, "cell 0 3,alignx leading");

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

	void lineBres(int x0, int y0, int xEnd, int yEnd) {
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
		getPanel().getGraphics().drawString(".", round(x), round(y));
		while (x < xEnd) {
			x++;
			if (p < 0)
				p += twoDy;
			else {
				y++;
				p += twoDyMinusDx;
			}
			getPanel().getGraphics().drawString(".", round(x), round(y));
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

					if (isAset) {
						double dy, dx;
						dx = arg0.getPoint().x - startPoint.x;
						dy = arg0.getPoint().y - startPoint.y;
						getTxtDx().setText(String.valueOf(dx));
						getTxtDy().setText(String.valueOf(dy));

						if (dx != 0) {
							getTextGrad().setText(String.valueOf(dy / dx));

							System.out.println("gradient from Screen: " + dy
									/ dx);
						}
					}
				}
			});
			getPanel().addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (txtFieldA.getText().isEmpty()) {
						txtFieldA.setText(arg0.getX() + "," + arg0.getY());
						startPoint = arg0.getPoint();
						isAset = true;
					} else if (txtFieldB.getText().isEmpty()) {
						txtFieldB.setText(arg0.getX() + "," + arg0.getY());
						endPoint = arg0.getPoint();
						isAset = false;
					} else {
						// JOptionPane.showMessageDialog(null,
						// "Input limit reached", "Exception",
						// JOptionPane.ERROR_MESSAGE);
						getTxtFieldA().setText(null);
						getTxtFieldB().setText(null);
					}
				}
			});
		}
		return panel;
	}

	private JLabel getLblPointF() {
		if (lblPointF == null) {
			lblPointF = new JLabel("Point A");
		}
		return lblPointF;
	}

	private JTextField getTxtFieldA() {
		if (txtFieldA == null) {
			txtFieldA = new JTextField();
			txtFieldA.setColumns(10);
		}
		return txtFieldA;
	}

	private JTextField getTxtFieldB() {
		if (txtFieldB == null) {
			txtFieldB = new JTextField();
			txtFieldB.setColumns(10);
		}
		return txtFieldB;
	}

	private JLabel getLblPointB() {
		if (lblPointB == null) {
			lblPointB = new JLabel("Point B");
		}
		return lblPointB;
	}

	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					txtFieldA.setText("");
					txtFieldB.setText("");
					isAset = false;
					// panel = null;
					getPanel().repaint();
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
					int xI, yI, xE, yE, pos;

					xI = Integer.parseInt(txtFieldA.getText().substring(0,
							getTxtFieldA().getText().indexOf(",")));
					yI = Integer.parseInt(txtFieldA.getText().substring(
							getTxtFieldA().getText().indexOf(",") + 1,
							getTxtFieldA().getText().length()));

					xE = Integer.parseInt(txtFieldB.getText().substring(0,
							getTxtFieldB().getText().indexOf(",")));
					yE = Integer.parseInt(txtFieldB.getText().substring(
							getTxtFieldB().getText().indexOf(",") + 1,
							getTxtFieldB().getText().length()));

					// lineBres((int) startPoint.getX(), (int)
					// startPoint.getY(),
					// (int) endPoint.getX(), (int) endPoint.getY());
					new Util().lineBres(new Point(xI, yI), new Point(xE, yE),
							getPanel().getGraphics());

					startPoint = null;
					endPoint = null;

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

	private JTextArea getTextGrad() {
		if (textGrad == null) {
			textGrad = new JTextArea();
			textGrad.setEditable(false);
			textGrad.setColumns(10);
		}
		return textGrad;
	}

	private JTextField getTxtDx() {
		if (txtDx == null) {
			txtDx = new JTextField();
			txtDx.setColumns(10);
		}
		return txtDx;
	}

	private JTextField getTxtDy() {
		if (txtDy == null) {
			txtDy = new JTextField();
			txtDy.setColumns(10);
		}
		return txtDy;
	}
}
