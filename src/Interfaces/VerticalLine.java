package Interfaces;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.graphicsPrimitives.Util;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.InvalidParameterException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerticalLine extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblY;
	private JTextField txtX1;
	private JTextField txtY1;
	private JLabel lblLineHeight;
	private JTextField txtHeigth;
	private JButton btnGraphVertical;
	JPanel gPanel;

	/**
	 * Create the panel.
	 */
	public VerticalLine(JPanel pPanel) {
		setLayout(new MigLayout("", "[][][grow][][]", "[][][][]"));
		add(getLblNewLabel(), "cell 0 0");
		add(getTxtX1(), "cell 2 0,growx,aligny top");
		add(getLblY(), "cell 0 1");
		add(getTxtY1(), "cell 2 1,growx");
		add(getLblLineHeight(), "cell 0 2");
		add(getTxtHeigth(), "cell 2 2,growx");
		add(getBtnGraphVertical(), "cell 2 3,aligny bottom");
		gPanel = pPanel;

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
			txtY1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					if (!Character.isDigit(arg0.getKeyChar()))
						arg0.consume();
				}
			});
			txtY1.setColumns(10);
		}
		return txtY1;
	}

	private JLabel getLblLineHeight() {
		if (lblLineHeight == null) {
			lblLineHeight = new JLabel("Line Heighth");
		}
		return lblLineHeight;
	}

	private JTextField getTxtHeigth() {
		if (txtHeigth == null) {
			txtHeigth = new JTextField();
			txtHeigth.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent arg0) {
					if (!Character.isDigit(arg0.getKeyChar()))
						arg0.consume();
					else {
						// int x1, y1, h;
						// try {
						// x1 = Integer.valueOf(getTxtX1().getText());
						// y1 = Integer.valueOf(getTxtY1().getText());
						// h = Integer.valueOf(getTxtHeigth().getText());
						// // if ((y1 - h < 0) || (y1 + h > 0)) {
						// // // throw new InvalidParameterException();
						// // }
						// } catch (Exception e) {
						// // TODO: handle exception
						// arg0.consume();
						// JOptionPane.showMessageDialog(null,
						// "Hieght exceding parent boundary",
						// "Bound Exception", JOptionPane.OK_OPTION);
						// e.printStackTrace();
						// }
					}
				}
			});
			txtHeigth.setColumns(10);
		}
		return txtHeigth;
	}

	private JButton getBtnGraphVertical() {
		if (btnGraphVertical == null) {
			btnGraphVertical = new JButton("Graph Vertical Line");
			btnGraphVertical.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Point p1 = new Point(Integer.valueOf(getTxtX1().getText()),
							Integer.valueOf(getTxtY1().getText()));
					Point p2 = new Point(Integer.valueOf(getTxtX1().getText()),
							Integer.valueOf(getTxtY1().getText())
									+ Integer.valueOf(getTxtHeigth().getText()));
					Util.lineDDA(p1, p2, gPanel.getGraphics());
				}
			});
		}
		return btnGraphVertical;
	}
}
