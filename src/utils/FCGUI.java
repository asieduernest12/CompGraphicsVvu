//package utils;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
//public class FCGUI {
//	public static void main(String[] args) {
//		power p = new power();
//		p.setVisible(true);
//	}
//}
//
//class power extends JFrame {
//	JFileChooser chooser;
//	BufferedImage img;
//	JButton button, button2;
//	JFrame comp;
//	String filename;
//	File file;
//	JLabel label; // ADDED
//
//	public power() {
//  
//            public void actionPerformed(ActionEvent e) {
////                if (e.getSource()==button) {
////                    chooser.showOpenDialog(null);
////                    file = chooser.getSelectedFile();
////
////                    try {
////                        img=ImageIO.read(file);
////                        ImageIcon icon=new ImageIcon(img); // ADDED
////                        label.setIcon(icon); // ADDED
////
////                        Dimension imageSize = new Dimension(icon.getIconWidth(),icon.getIconHeight()); // ADDED
////                        label.setPreferredSize(imageSize); // ADDED
////
////                        label.revalidate(); // ADDED
////                        label.repaint(); // ADDED
////                    }
////                    catch(IOException e1) {}
////                }
////
////                if (e.getSource()==button2){
////                    comp.setVisible(true);
////                }
////            }
//        };
//
//        //ImageIcon icon=new ImageIcon(img); // REMOVED
//        //JLabel label=new JLabel(icon); // REMOVED
//        label = new JLabel(); // ADDED
//
//        JPanel secpanel=new JPanel();
//
//        comp=new JFrame();
//        comp.setSize(650,500);
//        comp.setLayout(new BorderLayout());
//        comp.setTitle("View Report");
//
//        JRootPane compPane=comp.getRootPane();
//        Container contePane=compPane.getContentPane();
//        contePane.add(secpanel);
//
//        secpanel.add(label,BorderLayout.CENTER);
//
//        button2=new JButton("access");
//        button2.addActionListener(action);
//        button.addActionListener(action);
//
//        panel.add(button2,BorderLayout.SOUTH);
//    }
// }