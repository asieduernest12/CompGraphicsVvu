package com.GraphicClass;

import javax.swing.JApplet;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ConvolveOp;
import java.math.*;
import java.security.KeyException;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JSplitPane;

import Interfaces.HorizontalLine;
import Interfaces.VerticalLine;

public class DDALine extends JApplet {
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

	/**
	 * Create the applet.
	 */
	public DDALine() {
		getContentPane().setMaximumSize(new Dimension(0, 0));
		getContentPane().setBackground(Color.YELLOW);

		getContentPane().setLayout(
				new MigLayout("", "[332.00px][][][grow][][-75.00][310.00][]",
						"[176.00px,grow][][][119.00]"));
		getContentPane().add(getPanel(), "cell 0 0 8 1,grow");
		getContentPane().add(getLblPointF(), "flowx,cell 0 1,alignx left");
		getContentPane().add(getTxtFieldA(), "cell 0 1");
		getContentPane().add(getLblPointB(), "cell 0 1");
		getContentPane().add(getTxtFieldB(), "cell 0 1");
		getContentPane().add(getBtnClear(), "flowx,cell 0 2");
		getContentPane().add(getBtnGraph(), "cell 0 1");
		getContentPane().add(getLblMousePoint(), "cell 0 1");
		getContentPane().add(new VerticalLine(getPanel()),
				"flowx,cell 0 3,alignx left,aligny top");
		HorizontalLine horizontalLine = new HorizontalLine(getPanel());
		getContentPane().add(horizontalLine, "cell 0 3,alignx left,aligny top");

	}

	// public static void

	int round(final float a) {
		return (int) (a + 0.5);
	}

	void lineDDA(int x0, int y0, int xEnd, int yEnd) {
		int dx = xEnd - x0, dy = yEnd - y0, steps, k;
		float xIncrement, yIncrement, x = x0, y = y0;
		if (Math.abs(dx) > Math.abs(dy))
			steps = Math.abs(dx);
		else
			steps = Math.abs(dy);
		xIncrement = (float) dx / (float) steps;
		yIncrement = (float) dy / (float) steps;
		getPanel().getGraphics().drawString(".", round(x), round(y));
		for (k = 0; k < steps; k++) {
			x += xIncrement;
			y += yIncrement;
			try {
				Thread.sleep(01);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
				}
			});

			panel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (arg0.getButton() == MouseEvent.BUTTON3) {
						clearDisplay();
						return;
					}
					if (txtFieldA.getText().isEmpty()) {
						txtFieldA.setText(arg0.getX() + "," + arg0.getY());
						startPoint = arg0.getPoint();
					} else if (txtFieldB.getText().isEmpty()) {
						txtFieldB.setText(arg0.getX() + "," + arg0.getY());
						endPoint = arg0.getPoint();
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
			panel.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent arg0) {
					if (arg0.getKeyCode() == KeyEvent.VK_ESCAPE) {
						getBtnClear();
					} else if (arg0.getKeyCode() == KeyEvent.VK_ENTER)
						getBtnGraph();
				}
			});
			txtFieldA.setColumns(10);
		}
		return txtFieldA;
	}

	private JTextField getTxtFieldB() {
		if (txtFieldB == null) {
			txtFieldB = new JTextField();
			txtFieldB.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent arg0) {
				}
			});
			panel.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent arg0) {
					if (arg0.getKeyCode() == KeyEvent.VK_ESCAPE) {
						getBtnClear();
					} else if (arg0.getKeyCode() == KeyEvent.VK_ENTER)
						getBtnGraph();
				}
			});
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
					clearDisplay();
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
					lineDDA(xI, yI, xE, yE);
					// lineDDA(yI, xI, yE, xE);

					startPoint = null;
					endPoint = null;
				}
			});
		}
		return btnGraph;
	}

	private JLabel getLblMousePoint() {
		if (lblMousePoint == null) {
			lblMousePoint = new JLabel("");
			lblMousePoint.setBackground(Color.MAGENTA);
		}
		return lblMousePoint;
	}

	private void clearDisplay() {
		txtFieldA.setText("");
		txtFieldB.setText("");
		// panel = null;
		getPanel().repaint();
		// getPanel();
	}

	public Dimension getPanelDimension() {
		return getPanel().getSize();
	}
}
