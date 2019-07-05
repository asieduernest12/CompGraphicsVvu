package com.GraphicClass;

import java.awt.Graphics;
import java.awt.Point;

import javax.print.attribute.standard.SheetCollate;
import javax.swing.JApplet;

import utils.drawObjects;

import com.graphicsPrimitives.Util.Scale;

import net.miginfocom.swing.MigLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HouseTransformer extends JApplet {

	/**
	 * Create the applet.
	 */

	Scale tranScale = new Scale(0, 0), shScale = new Scale(0, 0),
			scale = new Scale(1, 1);
	double angle = 0;
	private JPanel panel;
	private JLabel lblTranslate;
	private JTextField txtTransX;
	private JTextField txtTransY;
	private JTextField txtShearY;
	private JTextField txtShearX;
	private JLabel lbl2;
	private JLabel lblScale;
	private JTextField txtScaleX;
	private JTextField txtScaleY;
	private JTextField txtAngle;
	private JLabel lblAngle;
	private JButton btnReload;

	public HouseTransformer() {
		getContentPane().setLayout(
				new MigLayout("", "[grow]", "[grow][][][][]"));
		getContentPane().add(getPanel(), "cell 0 0,grow");
		getContentPane().add(getLblTranslate(), "flowx,cell 0 1");
		getContentPane().add(getTxtTransX(), "cell 0 1");
		getContentPane().add(getTxtTransY(), "cell 0 1");
		getContentPane().add(getLbl2(), "flowx,cell 0 2");
		getContentPane().add(getTxtShearX(), "cell 0 2");
		getContentPane().add(getTxtShearY(), "cell 0 2,aligny top");
		getContentPane().add(getLblScale(), "flowx,cell 0 3");
		getContentPane().add(getTxtScaleX(), "cell 0 3");
		getContentPane().add(getTxtScaleY(), "cell 0 3");
		getContentPane().add(getLblAngle(), "flowx,cell 0 4");
		getContentPane().add(getTxtAngle(), "cell 0 4");
		getContentPane().add(getBtnReload(), "cell 0 4");

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		drawObjects.drawHouse(new Point((int) (getWidth() * 0.25), 30), scale,
				shScale, tranScale, angle, g);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}

	private JLabel getLblTranslate() {
		if (lblTranslate == null) {
			lblTranslate = new JLabel("Translate");
		}
		return lblTranslate;
	}

	private JTextField getTxtTransX() {
		if (txtTransX == null) {
			txtTransX = new JTextField();
			txtTransX.setColumns(10);
		}
		return txtTransX;
	}

	private JTextField getTxtTransY() {
		if (txtTransY == null) {
			txtTransY = new JTextField();
			txtTransY.setColumns(10);
		}
		return txtTransY;
	}

	private JTextField getTxtShearY() {
		if (txtShearY == null) {
			txtShearY = new JTextField();
			txtShearY.setColumns(10);
		}
		return txtShearY;
	}

	private JTextField getTxtShearX() {
		if (txtShearX == null) {
			txtShearX = new JTextField();
			txtShearX.setColumns(10);
		}
		return txtShearX;
	}

	private JLabel getLbl2() {
		if (lbl2 == null) {
			lbl2 = new JLabel("Shear");
		}
		return lbl2;
	}

	private JLabel getLblScale() {
		if (lblScale == null) {
			lblScale = new JLabel("Scale");
		}
		return lblScale;
	}

	private JTextField getTxtScaleX() {
		if (txtScaleX == null) {
			txtScaleX = new JTextField();
			txtScaleX.setColumns(10);
		}
		return txtScaleX;
	}

	private JTextField getTxtScaleY() {
		if (txtScaleY == null) {
			txtScaleY = new JTextField();
			txtScaleY.setColumns(10);
		}
		return txtScaleY;
	}

	private JTextField getTxtAngle() {
		if (txtAngle == null) {
			txtAngle = new JTextField();
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

	private JButton getBtnReload() {
		if (btnReload == null) {
			btnReload = new JButton("Reload");
			btnReload.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					tranScale.x = Double.valueOf(txtTransX.getText());
					tranScale.y = Double.valueOf(txtTransY.getText());
					scale.x = Double.valueOf(txtScaleX.getText());
					scale.y = Double.valueOf(txtScaleY.getText());
					shScale.x = Double.valueOf(txtShearX.getText());
					shScale.y = Double.valueOf(txtShearY.getText());
					angle = Double.valueOf(txtAngle.getText());
					repaint();
				}
			});
		}
		return btnReload;
	}
}
