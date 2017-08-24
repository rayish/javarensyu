package Sample16;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample1 extends Frame {
//	private Label lb;
	public Sample1() {		//コンストラクタ
		super("サンプル");
		Label lb = new Label("ようこそ。");
		add(lb);
		lb.setForeground(Color.blue);
		lb.setFont(new Font("Serif", Font.BOLD, 24));
		
		setSize(250, 200);
		setVisible(true);
		
		addWindowListener(new SampleWindowListener());
	}
	public static void main(String[] args) {
		Sample1 sm = new Sample1();
	}
	class SampleWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
