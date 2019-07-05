package Interfaces;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.graphicsPrimitives.Util;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HorizontalLine extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblY;
	private JTextField txtX1;
	private JTextField txtY1;
	private JLabel lblLineHeight;
	private JTextField txtHeigth;
	private JButton btnGraphHorizontal;
	private JPanel gCanvas;

	/**
	 * Create the panel.
	 */
	public HorizontalLine(JPanel pCanvas) {
		setLayout(new MigLayout("", "[][][grow][][]", "[][][][]"));
		add(getLblNewLabel(), "cell 0 0");
		add(getTxtX1(), "cell 2 0,growx,aligny top");
		add(getLblY(), "cell 0 1");
		add(getTxtY1(), "cell 2 1,growx");
		add(getLblLineHeight(), "cell 0 2");
		add(getTxtHeigth(), "cell 2 2,growx");
		add(getBtnGraphHorizontal(), "cell 2 3,aligny bottom");
		gCanvas = pCanvas;

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("X1");
		}
		return lblNewLabel;
	}

	private JLabel getLblY() {
		if (lblY == null) {
			lblY = new JLabel("Y1");
		}
		return lblY;
	}

	private JTextField getTxtX1() {
		if (txtX1 == null) {
			txtX1 = new JTextField();

			txtX1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					if (!Character.isDigit(arg0.getKeyChar()))
						arg0.consume();
				}

			});
			txtX1.setColumns(10);
		}
		return txtX1;
	}

	private JTextField getTxtY1() {
		if (txtY1 == null) {
			txtY1 = new JTextField();
			txtY1.setColumns(10);
		}
		return txtY1;
	}

	private JLabel getLblLineHeight() {
		if (lblLineHeight == null) {
			lblLineHeight = new JLabel("Line Width");
		}
		return lblLineHeight;
	}

	private JTextField getTxtHeigth() {
		if (txtHeigth == null) {
			txtHeigth = new JTextField();
			txtHeigth.setEnabled(true);
			txtHeigth.setColumns(10);
		}
		return txtHeigth;
	}

	private JButton getBtnGraphHorizontal() {
		if (btnGraphHorizontal == null) {
			btnGraphHorizontal = new JButton("Graph HorizontalLine");
			btnGraphHorizontal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Point p1 = new Point(Integer.valueOf(getTxtX1().getText()),
							Integer.valueOf(getTxtY1().getText()));
					Point p2 = new Point(Integer.valueOf(getTxtX1().getText())
							+ Integer.valueOf(getTxtHeigth().getText()),
							Integer.valueOf(getTxtY1().getText()));
					Util.lineDDA(p1, p2, gCanvas.getGraphics());
				}
			});
		}
		return btnGraphHorizontal;
	}

	private Boolean isInteger(String pVar) {
		int pos = -1;
		int lenght = -1;
		boolean result = false;

		if (pVar == null)
			return false;
		else {
			pos = 0;
			lenght = pVar.length();
			while (pos < lenght && Character.isDigit(pVar.charAt(pos))) {
				pos++;
			}
			if (pos < lenght)
				result = false;
			else
				result = true;
		}
		return result;
	}
}
