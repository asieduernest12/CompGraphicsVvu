package com.GraphicClass;


import javax.swing.JFrame;

public class SeeFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Fish f = new Fish();
		f.setVisible(true);
		frame.getContentPane().add(f);
		frame.setVisible(true);
		frame.setSize(1200, 740);
	}

}
