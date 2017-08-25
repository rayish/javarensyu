package Sample16;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ren082404 extends Frame {
	private Button bt;
	private TextField tf1;
	private TextField tf2;
	private Label lb1;
	private Label lb2;
	private Label lb3;
	public static void main(String[] args) {
		Ren082404 rn = new Ren082404();
	}
	public Ren082404() {
		super("足し算");
		tf1 = new TextField(4);
		lb1 = new Label("+");
		tf2 = new TextField(4);
		lb2 = new Label("=");
		lb3 = new Label();
		bt = new Button("計算");
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		add(tf1);
		add(lb1);
		add(tf2);
		add(lb2);
		add(lb3);
		add(bt);
		setSize(400,100);
		setVisible(true);
		addWindowListener(new SampleWindowListener());
		bt.addMouseListener(new MouseAdapter() {
			private boolean chkNum(String str) {
				try {
					Integer.parseInt(str);
					return true;
				}catch(Exception e) {
					return false;
				}
			}
			public void mouseClicked(MouseEvent e) {
				if (chkNum(tf1.getText()) && chkNum(tf2.getText())) {
					//lb3.setText(String.valueOf(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
					lb3.setText(Integer.toString(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
					validate();
				} else {
					lb3.setText("数値を入力してください。");
					validate();
				}
			}
		});
				
	}
	class SampleWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
//	class BtAL extends MouseAdapter {
//		
//		private boolean chkNum(String str) {
//			try {
//				Integer.parseInt(str);
//				return true;
//			}catch(Exception e) {
//				return false;
//			}
//		}
//		public void mouseClicked(MouseEvent e) {
//			if (chkNum(tf1.getText()) && chkNum(tf2.getText())) {
//				//lb3.setText(String.valueOf(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
//				lb3.setText(Integer.toString(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
//				validate();
//			} else {
//				lb3.setText("数値を入力してください。");
//				validate();
//			}
//		}
//	}
}