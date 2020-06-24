package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RedMorph extends Polymorph {

	RedMorph(int x, int y) {
		super(x, y);

	}

	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}
	
	public void update() {
		Random random = new Random();
		x = random.nextInt(width);
		y = random.nextInt(height);
	}
}
