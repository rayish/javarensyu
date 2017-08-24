package Sample16;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample3 extends Frame {
	private Button bt;
	public static void main(String[] args) {
		Sample3 sm = new Sample3();
	}
	public Sample3() {
		super("サンプル");
		bt = new Button("ようこそ。");
		add(bt);
		addWindowListener(new SampleWindowListener());
		bt.addActionListener(new SampleActionListener());
		
		setSize(250, 200);
		setVisible(true);
	}
	class SampleWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	class SampleActionListener implements ActionListener {
		private int i = 0;
		public void actionPerformed(ActionEvent e) {
			if (i%2 == 0) {
				bt.setLabel("こんにちは");
			} else {
				bt.setLabel("ようこそ");
			}
			i++;
		}
	}

}
