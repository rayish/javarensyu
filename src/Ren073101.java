import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ren073101 {

	public static void main(String[] args) throws IOException {
		String[] jelly = {"グー","チョキ","パー"};
		System.out.println("1:グー　2:チョキ　3:パーを入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		System.out.println("あなた:" + jelly[res - 1]);
		int com = (int)(Math.random()*3) + 1;
		System.out.println("相手:" + jelly[com - 1]);
		int hantei = (res - com + 3) % 3;
		if (hantei == 1) {
			System.out.print("相手の勝ち");
		} else if (hantei == 2) {
			System.out.print("あなたの勝ち");
		} else {
			System.out.print("あいこ");
		}
	}

}
