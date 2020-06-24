package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph moving;
	Polymorph follow;
	Polymorph image;
	Polymorph message;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.addMouseListener(this);
		window.addMouseMotionListener(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		bluePoly = new BluePolymorph(50, 50);
		redPoly = new RedMorph(50, 50);
		moving = new MovingMorph(100, 100);
		follow = new FollowMouseMorph(100, 100);
		image = new ImageMorph(200, 200);
		message = new MessageMorph(300, 300);
		polymorphs.add(bluePoly);
		polymorphs.add(redPoly);
		polymorphs.add(moving);
		polymorphs.add(follow);
		polymorphs.add(image);
		polymorphs.add(message);
		
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		for (Polymorph p : polymorphs) {
			p.draw(g);
			p.update();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		// bluePoly.update();
		// redPoly.update();
		// moving.update();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		for (int i = 0; i < polymorphs.size(); i++) {
			if (polymorphs.get(i) instanceof FollowMouseMorph) {
				polymorphs.get(i).setX(e.getX());
				polymorphs.get(i).setY(e.getY());
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		for (int i = 0; i < polymorphs.size(); i++) {
			if (polymorphs.get(i) instanceof MessageMorph) {
				JOptionPane.showMessageDialog(null, "ayo");
			}
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
