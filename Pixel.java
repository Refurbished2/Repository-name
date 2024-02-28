import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Image;
import java.awt.image.BufferedImage;





public class Pixel extends JPanel implements MouseListener {
	//make tab that duplicates when you press a button. the button will say (dupe) closable just do Alt F4 also no x button because funni
	public Pixel(){
			SwingUtilities.invokeLater(() -> {
				this.setBackground(Color.BLACK);
				var frame = new JFrame("ransomenotware");
				frame.setUndecorated(true);
				frame.setSize(1920, 1080);
				frame.getContentPane().add(this, BorderLayout.CENTER);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.addMouseListener(this);
			});
	}


public static Font font;
public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(new Color(255,0,255));
	g.fillOval(200, 500, 200, 250);
	g.setColor(Color.BLACK);
	g.drawString("add thyme", 200,200);


	

}

@Override
public void mouseClicked(MouseEvent e) {
	System.exit(0);
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
}
















}
