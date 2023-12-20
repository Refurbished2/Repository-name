import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Image;
import java.awt.image.BufferedImage;





public class Pixel extends JPanel {
	//make tab that duplicates when you press a button. the button will say (dupe) closable just do Alt F4 also no x button because funni
	public Pixel(){
			SwingUtilities.invokeLater(() -> {
				this.setBackground(Color.RED);
				var frame = new JFrame("ransomenotware");
				frame.setUndecorated(true);
				frame.setSize(750, 600);
				frame.getContentPane().add(this, BorderLayout.CENTER);
				frame.setVisible(true);
			}
			);
	



	}
public static Font font;
public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(new Color(0,0,255));
	g.fillOval(200, 200, 200, 250);
	g.setColor(Color.BLACK);
	g.drawString("add thyme", 200,200);


	

}




















}
