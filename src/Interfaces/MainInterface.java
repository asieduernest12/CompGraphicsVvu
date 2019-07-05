package Interfaces;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpinnerListModel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.MatteBorder;
import javax.swing.JSpinner;

import net.miginfocom.swing.MigLayout;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import com.GraphicClass.BrensenHam;
import com.GraphicClass.CircleAlg;
import com.GraphicClass.DDALine;
import com.GraphicClass.Ellipse;
import com.graphicsPrimitives.Primitives;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;

public class MainInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7341358261708015713L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem mntmQueue;
	private JMenuItem mntmDoubleLinkedList;
	private JMenuItem mntmSingleLinkedList;
	private JMenuItem mntmStack;
	private JPanel displayPanel;
	private JSpinner spinner;
	private SpinnerListModel spinModel;
	private JPanel choosePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface frame = new MainInterface();
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
	public MainInterface() {
		setTitle("Interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 402);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[608px,grow]",
				"[263px,grow][30px]"));
		contentPane.add(getPanel_2(), "cell 0 0,grow");
		contentPane.add(getChoosePanel(), "cell 0 1,grow");

	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setEnabled(false);
			menuBar.setVisible(false);
			menuBar.setBackground(new Color(51, 102, 51));
			menuBar.setOpaque(false);
			menuBar.add(getMntmDoubleLinkedList());
			menuBar.add(getMntmSingleLinkedList());
			menuBar.add(getMntmStack());
			menuBar.add(getMntmQueue());
		}
		return menuBar;
	}

	private JMenuItem getMntmQueue() {
		if (mntmQueue == null) {
			mntmQueue = new JMenuItem("lINES");
			mntmQueue.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					getContentPane().removeAll();
					getContentPane().add(new BrensenHam());
					getContentPane().revalidate();
				}
			});
			mntmQueue.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(
					0, 0, 0)));
		}
		return mntmQueue;
	}

	private JMenuItem getMntmDoubleLinkedList() {
		if (mntmDoubleLinkedList == null) {
			mntmDoubleLinkedList = new JMenuItem("Circle");
			mntmDoubleLinkedList.setVisible(false);
			mntmDoubleLinkedList.setEnabled(false);
			mntmDoubleLinkedList.setBorder(new MatteBorder(1, 1, 1, 1,
					(Color) new Color(0, 0, 0)));
			mntmDoubleLinkedList.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					getContentPane().removeAll();
					getContentPane().add(new CircleAlg());
					getContentPane().revalidate();
				}
			});
		}
		return mntmDoubleLinkedList;
	}

	private JMenuItem getMntmSingleLinkedList() {
		if (mntmSingleLinkedList == null) {
			mntmSingleLinkedList = new JMenuItem("Ellipse");
			mntmSingleLinkedList.setBorder(new MatteBorder(1, 1, 1, 1,
					(Color) new Color(0, 0, 0)));
			mntmSingleLinkedList.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					getContentPane().removeAll();
					getContentPane().add(new Ellipse());
					getContentPane().revalidate();
				}
			});
		}
		return mntmSingleLinkedList;
	}

	private JMenuItem getMntmStack() {
		if (mntmStack == null) {
			mntmStack = new JMenuItem("Stack");
			mntmStack.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(
					0, 0, 0)));
			mntmStack.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					// getContentPane().removeAll();
					// getContentPane().add(new StackInterface());
					// getContentPane().revalidate();
				}
			});
		}
		return mntmStack;
	}

	private JPanel getPanel_2() {
		if (displayPanel == null) {
			displayPanel = new JPanel();
			displayPanel.setBackground(Color.ORANGE);
			displayPanel.setLayout(new BorderLayout(0, 0));
		}
		return displayPanel;
	}

	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setPreferredSize(new Dimension(160, 25));
			spinner.setSize(new Dimension(24, 0));
			spinner.getEditor().setPreferredSize(
					spinner.getEditor().getPreferredSize());

			spinner.setModel(new SpinnerListModel(new String[] {
					"Select a display", "Line", "Circle", "Ellipse", "DDA" }));

			spinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					switch (((JSpinner) e.getSource()).getValue().toString()) {
					case "Line":
						displayPanel.removeAll();
						displayPanel.add(new BrensenHam());
						displayPanel.revalidate();
						revalidate();
						break;
					case "Circle":
						displayPanel.removeAll();
						displayPanel.add(new CircleAlg());
						displayPanel.revalidate();
						revalidate();
						break;
					case "Ellipse":
						displayPanel.removeAll();
						displayPanel.add(new Ellipse());
						displayPanel.revalidate(); // refresh the screen
						revalidate();
						break;
					case "DDA":
						displayPanel.removeAll();
						displayPanel.add(new DDALine());
						displayPanel.revalidate(); // refresh the screen
						revalidate();
						break;
					default:
						displayPanel.removeAll();
						displayPanel.add(new JPanel());
						revalidate();
						break;
					}

				}
			});

		}
		return spinner;
	}

	private JPanel getChoosePanel() {
		if (choosePanel == null) {
			choosePanel = new JPanel();
			choosePanel.setBackground(Color.GREEN);
			choosePanel.add(getSpinner());
		}
		return choosePanel;
	}

	// private enum DisplayEnum { LINKEDLIST , STACK , QUEUE };
}
