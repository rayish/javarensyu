package Sample16;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample4 extends Frame {
	private Button bt;
	public static void main(String[] args) {
		Sample4 sm = new Sample4();
	}
	public Sample4() {
		super("サンプル");
		bt = new Button("ようこそ。");
		add(bt);
		addWindowListener(new SampleWindowListener());
		bt.addMouseListener(new MouseAdapter() {	//無名クラス
			private int i = 0;
			public void mouseClicked(MouseEvent e) {
				if (i%2 == 0) {
					bt.setLabel("こんにちは");
				} else {
					bt.setLabel("ようこそ");
				}
				i++;
			}
			public void mouseEntered(MouseEvent e) {
				bt.setLabel("いらっしゃいませ。");
			}
			public void mouseExited(MouseEvent e) {
				bt.setLabel("ようこそ");
			}
		});
//		bt.addActionListener(new SampleActionListener());
//		bt.addMouseListener(new SampleMouseAdapter());
		
		setSize(250, 200);
		setVisible(true);
	}
	class SampleWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
//	class SampleActionListener implements ActionListener {
//	class SampleMouseAdapter extends MouseAdapter {
//		private int i = 0;
//		public void mouseClicked(MouseEvent e) {
//			if (i%2 == 0) {
//				bt.setLabel("こんにちは");
//			} else {
//				bt.setLabel("ようこそ");
//			}
//			i++;
//		}
//		public void mouseEntered(MouseEvent e) {
//			bt.setLabel("いらっしゃいませ。");
//		}
//		public void mouseExited(MouseEvent e) {
//			bt.setLabel("ようこそ");
//		}
//	}

}
