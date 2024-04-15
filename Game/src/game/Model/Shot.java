package game.Model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Shot {
	
	private Image image;
	private int x, y;
	private int width, height;
	private boolean isVisible;
	
	
	private static final int WIDTH = 938;
	private static int SPEED = 2;
	
	
	public Shot(int x, int y) {
		this.x = x;
		this.y = y;
		isVisible = true;
	}
	
	public void load() {
		ImageIcon reference = new ImageIcon("res\\shot.png");
		image = reference.getImage();
		
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
	}
	
	public void update() {
		this.x += SPEED;
			if(this.x > WIDTH) {
				isVisible = false;
			}
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public static int getSPEED() {
		return SPEED;
	}

	public static void setSPEED(int sPEED) {
		SPEED = sPEED;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
}
