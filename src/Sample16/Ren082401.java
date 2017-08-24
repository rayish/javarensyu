package Sample16;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ren082401 extends Frame {
	private Button bt;
	private TextField tf;
	private Label lb;
	public static void main(String[] args) {
		Ren082401 rn = new Ren082401();
	}
	public Ren082401() {
		super("あいさつ");
		tf = new TextField(4);
		bt = new Button("挨拶");
		lb = new Label();
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		add(tf);
		add(bt);
		add(lb);
		setSize(200,100);
		setVisible(true);
		addWindowListener(new SampleWindowListener());
		bt.addActionListener(new BtAL());
				
	}
	class SampleWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	class BtAL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lb.setText("こんにちは" + tf.getText() + "さん");
			validate();
		}
	}
}