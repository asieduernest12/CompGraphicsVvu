package utils;

import java.io.ObjectInputStream.GetField;

import javax.swing.JFrame;

public class ImageRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageKan kan = new ImageKan();
		kan.setVisible(true);
		frame.getContentPane().add(kan);
		frame.setVisible(true);
		frame.setSize(1200, 740);
		frame.setTitle("Save Location is at :" + System.getProperty("user.dir"));

	}
}
