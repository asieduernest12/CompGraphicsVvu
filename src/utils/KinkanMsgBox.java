package utils;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.swing.JMenuBar;
import javax.swing.JButton;

public class KinkanMsgBox extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblDifference;
	private JLabel lblNewLabel_1;
	private JTextArea txtComment;
	private JLabel lblpoint;
	private JLabel lblDif;
	private Button btnPrintPoint;
	private Button btnPrintDif;
	private Button btnExit;

	private Point pointPos = null;
	private Point difPoint = null;

	private String dirPath = System.getProperty("user.dir");
	private String fileName = "KinkanOutput.txt";
	private String filePath = dirPath + "\\" + fileName;
	private JMenuBar menuBar;
	private JLabel lblAddress;
	private JLabel lblColor;
	private JTextField txtColor;
	private JButton btnPrintColor;
	private Color colorRGB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KinkanMsgBox frame = new KinkanMsgBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KinkanMsgBox() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 457, 267);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[83.00][][][grow]",
				"[30.00][28.00][62.00,grow][grow]"));
		contentPane.add(getLblNewLabel(), "cell 0 0");
		contentPane.add(getLblpoint(), "flowx,cell 3 0");
		contentPane.add(getLblDifference(), "cell 0 1");
		contentPane.add(getLblDif(), "cell 3 1");
		contentPane.add(getLblNewLabel_1(), "cell 0 2,aligny top");
		contentPane.add(getTxtComment(), "cell 3 2,grow");
		contentPane.add(getBtnPrintPoint(), "flowx,cell 3 3");
		contentPane.add(getBtnPrintDif(), "cell 3 3");
		contentPane.add(getBtnPrintColor(), "cell 3 3");
		contentPane.add(getBtnExit(), "cell 3 3");
		contentPane.add(getLblColor(), "cell 3 0");
		contentPane.add(getTxtColor(), "cell 3 0");
	}

	public KinkanMsgBox(Point point, Point difPoint, int colorRGB) {
		this();
		setPointPos(point);
		setDifPoint(difPoint);
		setColorRGB(colorRGB);

	}

	public KinkanMsgBox(Point point) {
		this();
		setPointPos(pointPos);

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Point");
		}
		return lblNewLabel;
	}

	private JLabel getLblDifference() {
		if (lblDifference == null) {
			lblDifference = new JLabel("Difference");
		}
		return lblDifference;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Comment");
		}
		return lblNewLabel_1;
	}

	private JTextArea getTxtComment() {
		if (txtComment == null) {
			txtComment = new JTextArea();

		}
		return txtComment;
	}

	private JLabel getLblpoint() {
		if (lblpoint == null) {
			lblpoint = new JLabel("{x,y}");
			lblpoint.setBackground(new Color(240, 230, 140));
			lblpoint.setHorizontalTextPosition(SwingConstants.CENTER);
		}
		return lblpoint;
	}

	private JLabel getLblDif() {
		if (lblDif == null) {
			lblDif = new JLabel("{x,y}");
			lblDif.setHorizontalAlignment(SwingConstants.LEFT);
			lblDif.setBackground(new Color(240, 230, 140));
			lblDif.setHorizontalTextPosition(SwingConstants.CENTER);
		}
		return lblDif;
	}

	private Button getBtnPrintPoint() {
		if (btnPrintPoint == null) {
			btnPrintPoint = new Button("Print Point");
			btnPrintPoint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					BufferedWriter pen = null;
					FileWriter paper = null;
					// if (!new File(filePath).exists())
					// try {
					// new File(filePath).createNewFile();
					// } catch (IOException e1) {
					// // TODO Auto-generated catch block
					// e1.printStackTrace();
					// }
					try {

						// pointPos = new Point(100, 9);
						paper = new FileWriter(filePath, true);// Boolean
						// indicates to
						// append or
						// wipe text
						// file
						pen = new BufferedWriter(paper);
						paper.write(String.format("\nPoint %-3s, %-3s\t //%s",
								(int) pointPos.getX(), (int) pointPos.getY(),
								txtComment.getText()));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(getContentPane(),
								"File Does not exits", "File Not Found",
								JOptionPane.OK_OPTION);

						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(getContentPane(),
								"Could not write to file", "File IO Error",
								JOptionPane.OK_OPTION);
						e.printStackTrace();
					} finally {
						if (pen != null)
							try {
								pen.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						if (paper != null)
							try {
								paper.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

					}

				}
			});
		}
		return btnPrintPoint;
	}

	private Button getBtnPrintDif() {
		if (btnPrintDif == null) {
			btnPrintDif = new Button("Print Dif");
			btnPrintDif.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					BufferedWriter pen = null;
					FileWriter paper = null;
					// if (!new File(filePath).exists())
					// try {
					// new File(filePath).createNewFile();
					// } catch (IOException e1) {
					// // TODO Auto-generated catch block
					// e1.printStackTrace();
					// }
					try {
						// pointPos = new Point(100, 9);
						paper = new FileWriter(filePath, true);// Boolean
						// indicates to
						// append or
						// wipe text
						// file
						pen = new BufferedWriter(paper);
						String tempStr = String.format(
								"\n%-15s%-3s, %3s\n%-15s%-3s, %3s\t //%s ",
								"Point", pointPos.x, pointPos.y, "Difference",
								difPoint.x, difPoint.y, txtComment.getText());
						System.out.print(tempStr);
						pen.write(tempStr);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(getContentPane(),
								"File Does not exits", "File Not Found",
								JOptionPane.OK_OPTION);

						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(getContentPane(),
								"Could not write to file", "File IO Error",
								JOptionPane.OK_OPTION);
						e.printStackTrace();
					} finally {
						if (pen != null)
							try {
								pen.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						if (paper != null)
							try {
								paper.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

					}

				}
			});
		}
		return btnPrintDif;
	}

	private Button getBtnExit() {
		if (btnExit == null) {
			btnExit = new Button("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

				}
			});
		}
		return btnExit;
	}

	public void setPointPos(Point point) {
		this.pointPos = point;
		lblpoint.setText(String.format("%-3s: %3s", pointPos.x, pointPos.y));
	}

	public void setDifPoint(Point difPoint) {
		this.difPoint = difPoint;
		lblDif.setText(String.format("%-3s: %3s", difPoint.x, difPoint.y));
	}

	public void setColorRGB(int colorRGB) {
		// this.pointPos = point;
		// lblpoint.setText(String.format("%-3s: %3s", pointPos.x + pDif.x,
		// pointPos.y + pDif.y));
		txtColor.setText(String.valueOf(colorRGB));
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getLblAddress());
		}
		return menuBar;
	}

	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("lblAddress");
			lblAddress.setText(filePath);
		}
		return lblAddress;
	}

	private JLabel getLblColor() {
		if (lblColor == null) {
			lblColor = new JLabel("Color");
		}
		return lblColor;
	}

	private JTextField getTxtColor() {
		if (txtColor == null) {
			txtColor = new JTextField();
			txtColor.setEditable(false);
			txtColor.setText("color");
			txtColor.setColumns(10);
		}
		return txtColor;
	}

	private JButton getBtnPrintColor() {
		if (btnPrintColor == null) {
			btnPrintColor = new JButton("Print Color");
			btnPrintColor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					BufferedWriter pen = null;
					FileWriter paper = null;
					// if (!new File(filePath).exists())
					// try {
					// new File(filePath).createNewFile();
					// } catch (IOException e1) {
					// // TODO Auto-generated catch block
					// e1.printStackTrace();
					// }
					try {
						// pointPos = new Point(100, 9);
						paper = new FileWriter(filePath, true);// Boolean
						// indicates to
						// append or
						// wipe text
						// file
						pen = new BufferedWriter(paper);
						String tempStr = String
								.format("\n%-15s%-3s, %3s\n%-15s%-3s, %3s\t \n%-15s:\t%s\t//%s ",
										"Point", pointPos.x, pointPos.y,
										"Difference", difPoint.x, difPoint.y,
										"ColorRGB", txtColor.getText(),
										txtComment.getText());
						System.out.print(tempStr);
						pen.write(tempStr);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(getContentPane(),
								"File Does not exits", "File Not Found",
								JOptionPane.OK_OPTION);

						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(getContentPane(),
								"Could not write to file", "File IO Error",
								JOptionPane.OK_OPTION);
						e.printStackTrace();
					} finally {
						if (pen != null)
							try {
								pen.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						if (paper != null)
							try {
								paper.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

					}

				}
			});
		}
		return btnPrintColor;
	}
}
