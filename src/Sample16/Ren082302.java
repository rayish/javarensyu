package Sample16;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ren082302 extends Frame {
	private Button bt;
	private TextField tf;
	
	public Ren082302() {
		super("テスト画面");
		setSize(300,200);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		tf = new TextField("sample");
		add(tf);
		bt = new Button("ボタン");
		add(bt);
		
		addWindowListener(new RenWindowListener());
		
	}
	class RenWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Ren082302 rn = new Ren082302();
	}

}
