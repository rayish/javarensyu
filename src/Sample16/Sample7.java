package Sample16;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample7 extends Frame implements Runnable {
	int num;
	public static void main(String[] args) {
		Sample7 sm = new Sample7();
	}
	public Sample7() {
		super("サンプル");
		addWindowListener(new SampleWindowListener());
		Thread th = new Thread(this);
		th.start();
		
		setSize(250,200);
		setVisible(true);
	}
	public void run() {
		try {
			for(int i=0; i<10 ; i++) {
				num = i;
				repaint();
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			
		}
	}
	public void paint(Graphics g) {
		String str = num + "です。";
		g.drawString(str,  100, 100);
	}
	class SampleWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
