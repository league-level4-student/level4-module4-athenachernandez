package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {

	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		BufferedImage sunflower = null;
		try {
			sunflower = ImageIO.read(this.getClass().getResourceAsStream("sunflower.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(sunflower, 200, 200, 50, 50, null);
		// TODO Auto-generated method stub
		
	}

}
