package Typing01;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Typing01 extends Frame {

	char[] dc = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
					'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	char ch1;
	
	public static void main(String[] args) {
		new Typing01();
	}
	public Typing01() {
		//タイトルの設定
		super("簡易タイピング練習プログラム");
		
		//リスナーの設定
		addWindowListener(new TypingWindowListener());
		addKeyListener(new TypingKeyListener());
		
		//フレームの設定
		setSize(600, 400);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		//文字の表示位置
		int pointX = 250;
		int pointY = 275;
		
		g.clearRect(0, 0, 600, 400);
		
		//ランダム値の取得（０～２４の整数値）
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
	class TypingWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
