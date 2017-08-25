package Sample16;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample5 extends Frame {
	Image im;
	public static void main(String[] args) {
		Sample5 sm = new Sample5();
	}
	public Sample5() {
		super("サンプル");
		Toolkit tk = getToolkit();
		im = tk.getImage("Image.gif");
		
		addWindowListener(new SampleWindowListener());
		setSize(250, 200);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawImage(im, 100, 100, this);
	}
	class SampleWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
