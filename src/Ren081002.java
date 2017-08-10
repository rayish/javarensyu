interface  imensekis {
	double menseki();
}
class Shikaku2 implements imensekis {
	public int tate;
	public int yoko;
	public Shikaku2 (int y, int t) {
		tate = t;
		yoko = y;
	}
	public double menseki() {
		return tate * yoko;
	}
}
class Sankaku2 implements imensekis {

	public int tate;
	public int yoko;
	public Sankaku2 (int y, int t) {
		tate = t;
		yoko = y;
	}
	public double menseki() {
		return tate * yoko / 2.0;
	}
}
public class Ren081002 {
	
	public static void main(String[] args) {
		imensekis[] men = new imensekis[2];
		men[0]= new Shikaku2(10, 20);
		men[1]= new Sankaku2(10, 20);
		System.out.println("横" + men[0].yoko + "縦" + men[0].tate + "の四角形の面積は" + men[0].menseki() + "です。");
		System.out.println("横" + men[1].yoko + "縦" + men[1].tate + "の四角形の面積は" + men[1].menseki() + "です。");
	}

}
