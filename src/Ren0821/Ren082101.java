package Ren0821;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Jikyu {
	protected int tanka;
	protected int jikan;
	public int kyuyo() {
		return tanka * jikan;
	}
	public int zei() {
		return (int)Math.floor(kyuyo() * 0.1);
	}
	public  int jyukyu() {
		return kyuyo() - zei();
	}
}
public class Ren082101 {

	public static void main(String[] args) {
		try {
			Jikyu jikyu = new Jikyu();
			System.out.print("時給:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			jikyu.tanka = Integer.parseInt(br.readLine());
			System.out.print("時間:");
			jikyu.jikan = Integer.parseInt(br.readLine());
			System.out.println("給与\t:" + jikyu.kyuyo());
			System.out.println("所得税\t:" + jikyu.zei());
			System.out.println("支給額\t:" + jikyu.jyukyu());
		}
		catch(IOException e) {
			System.out.println("入出力エラーです。");
		}
	}

}
