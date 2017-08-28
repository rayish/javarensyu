package Typing02;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Typing02 extends Applet {
	char[] dc = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
			'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	char ch1;

	public void init() {
		addKeyListener(new TypingKeyListener());
		setFocusable(true);
	}

	public void paint(Graphics g) {
	int pointX = 250;
	int pointY = 275;

	g.clearRect(0, 0, 600, 400);

	int i = (int)(Math.random()*25);
	ch1 = (char)(i + 0x0041);

	g.setColor(Color.blue);
	g.setFont(new Font("Serif",Font.BOLD,200));
	g.drawChars(dc, i, 1, pointX, pointY);
	}

	class TypingKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int kc = e.getKeyCode();
			if(ch1 == (char)kc) {
				repaint();
			}
		}
	}

}
