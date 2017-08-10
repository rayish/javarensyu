abstract class Mensekis {
	protected int tate;
	protected int yoko;
	abstract public double menseki();
}
class Shikaku1 extends Mensekis {
	public Shikaku1 (int y, int t) {
		tate = t;
		yoko = y;
	}
	public double menseki() {
		return tate * yoko;
	}
}
class Sankaku1 extends Mensekis {
	public Sankaku1 (int y, int t) {
		tate = t;
		yoko = y;
	}
	public double menseki() {
		return tate * yoko / 2;
	}
}
public class Ren081001 {
	
	public static void main(String[] args) {
		Mensekis[] men = new Mensekis[2];
		men[0] = new Shikaku1(10, 20);
		men[1] = new Sankaku1(10, 20);
		System.out.println("横" + men[0].yoko + "縦" + men[0].tate + "の四角形の面積は" + men[0].menseki() + "です。");
		System.out.println("横" + men[1].yoko + "縦" + men[1].tate + "の四角形の面積は" + men[1].menseki() + "です。");
	}

}
