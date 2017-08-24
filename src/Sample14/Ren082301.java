package Sample14;
class Aisatsu  extends Thread{
	int jikan;				//待ち時間（ミリ秒）
	String aisatsu;			//あいさつ
	public void run() {
		try {
			for (int i = 0; i < 5 ; i++) {
				System.out.println(aisatsu);
				sleep(jikan);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Ren082301 {

	public static void main(String[] args) {
		Aisatsu aisatsu1 = new Aisatsu();
		Aisatsu aisatsu2 = new Aisatsu();

		aisatsu1.aisatsu = "おはよう";
		aisatsu1.jikan = 500;
		aisatsu2.aisatsu = "こんにちは";
		aisatsu2.jikan = 1000;

		aisatsu1.start();
		aisatsu2.start();
	}

}
