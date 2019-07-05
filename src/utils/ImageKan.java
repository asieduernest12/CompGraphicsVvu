package utils;

import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;

import javax.swing.JLabel;

import com.graphicsPrimitives.Util;

import net.miginfocom.swing.MigLayout;

import java.awt.Component;
import java.awt.Point;

public class ImageKan extends JApplet {
	String filename;
	File file;
	JFileChooser chooser;
	private JMenuBar menuBar;
	private JMenuItem mntmNewMenuItem;
	private JLabel lblPoint;
	private BufferedImage img;

	// java.net.URL imgURL = getClass().getResource("/images/image.jpg");
	// ImageIcon image = new ImageIcon(imgURL);

	public ImageKan() {
		getContentPane().addMouseListener(mouseListen);
		setJMenuBar(getMenuBar());
		getMenuBar().setLocation(0, getHeight() - 20);
		getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				lblPoint.setText(arg0.getPoint().x + "," + arg0.getPoint().y);
			}
		});
		getContentPane().setLayout(
				new MigLayout("", "[][grow][][]", "[][grow][]"));
		// Image img = new im
		// img.
	}

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		if (file != null) {

			try {
				img = ImageIO.read(file);
				// ImageIcon icon = new ImageIcon(img); // ADDED
				// getContentPane().getGraphics().drawi(icon); // ADDED
				getContentPane().getGraphics().drawImage(img, 0, 0, null);

			} catch (IOException e1) {
			}

		}
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setLocation(new Point(0, 1220));
			menuBar.add(getMntmNewMenuItem());
			menuBar.add(getLblPoint());
			menuBar.add(getLblSpac());
			menuBar.add(getLblNewLabel());
			menuBar.add(getLabel());
			menuBar.add(getLblPointUpDate());
			menuBar.add(getLabel_1());
			menuBar.add(getLblNewLabel_1());
			menuBar.add(getLabel_2());
			menuBar.add(getLblDiff());
			menuBar.add(getLabel_3());
		}
		return menuBar;
	}

	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Open New Image");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					chooser = new JFileChooser();
					chooser.setCurrentDirectory(new File(
							"C:\\Files\\vvu\\Años\\Tercera año\\primer semestre\\Graphic Computadores\\paint\\"));

					chooser.showOpenDialog(null);
					file = chooser.getSelectedFile();
					repaint();
				}
			});
		}
		return mntmNewMenuItem;
	}

	private JLabel getLblPoint() {
		if (lblPoint == null) {
			lblPoint = new JLabel("x,y");
			lblPoint.setFocusable(false);
			lblPoint.setAlignmentX(Component.CENTER_ALIGNMENT);
		}
		return lblPoint;
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
			if (arg0.getButton() == MouseEvent.BUTTON1) {

				pointOne = arg0.getPoint();
				String tempStr = String.format(" %d:%d", (int) pointOne.getX(),
						(int) pointOne.getY());
				lblPointUpDate.setText(tempStr);

				// JOptionPane.showMessageDialog(getContentPane(), tempStr);

			}
			if (arg0.getButton() == MouseEvent.BUTTON3) {

				pointTwo = arg0.getPoint();
				int dx = (int) (pointTwo.getX() - pointOne.getX());
				int dy = (int) (pointTwo.getY() - pointOne.getY());

				lblDiff.setText(dx + " : " + dy);

				String tempStr = String.format(
						"p1 %s:%s \np2 %s:%s\nDifference %s:%s",
						(int) pointOne.getX(), (int) pointOne.getY(),
						(int) pointTwo.getX(), (int) pointTwo.getY(), dx, dy);
				// JOptionPane.showMessageDialog(getContentPane(), tempStr);
				// BufferedImage imgg = Util.createImage(getContentPane());
				// imgg.flush();
				getContentPane().getGraphics().drawImage(img, 0, 0, null);
				new KinkanMsgBox(pointOne, new Point(dx, dy), img.getRGB(
						arg0.getX(), arg0.getY())).setVisible(true);

			}
		}
	};
	private JLabel lblNewLabel;
	private JLabel lblPointUpDate;
	private JLabel lblNewLabel_1;
	private JLabel lblDiff;
	private JLabel lblSpac;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Point");
		}
		return lblNewLabel;
	}

	private JLabel getLblPointUpDate() {
		if (lblPointUpDate == null) {
			lblPointUpDate = new JLabel("0,0");
		}
		return lblPointUpDate;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Diff");
		}
		return lblNewLabel_1;
	}

	private JLabel getLblDiff() {
		if (lblDiff == null) {
			lblDiff = new JLabel("0,0");
		}
		return lblDiff;
	}

	private JLabel getLblSpac() {
		if (lblSpac == null) {
			lblSpac = new JLabel("      ");
		}
		return lblSpac;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("      ");
		}
		return label;
	}

	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("      ");
		}
		return label_1;
	}

	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("      ");
		}
		return label_2;
	}

	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("      ");
		}
		return label_3;
	}
}
