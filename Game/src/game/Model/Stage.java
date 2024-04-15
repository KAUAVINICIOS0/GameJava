package game.Model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Stage extends JPanel{
	
	private Image background;
	
	
	public Stage() {
		ImageIcon reference = new ImageIcon("res\\background.jpg");
		background = reference.getImage();
	}
	
	
	public void paint(Graphics g) {
		Graphics2D graphics = (Graphics2D) g;
		graphics.drawImage(background, 0, 0, null);
		g.dispose();
	}
}
