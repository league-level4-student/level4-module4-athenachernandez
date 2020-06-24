package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class FollowMouseMorph extends Polymorph {

	FollowMouseMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
		// TODO Auto-generated method stub
		
	}
	
	public void update() {
		
	}

}
