package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
	protected int y;
	protected int width = 50;
	protected int height = 50;

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int newX) {
		this.x = newX;
	}

	public int getY() {
		return y;
	}

	public void setY(int newY) {
		this.y = newY;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int newWidth) {
		this.width = newWidth;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
	
	public void update() {
		
	}

	public abstract void draw(Graphics g);
}
