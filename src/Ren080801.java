class Shikaku {
	protected int tate;
	protected int yoko;
	Shikaku(int t, int y) {
		tate = t;
		yoko = y;
	}
	void setTateYoko(int t, int y) {
		tate = t;
		yoko = y;
	}
	int menseki() {
		return tate * yoko;
	}
}
class Shikakuchu extends Shikaku {
	int takasa;
	Shikakuchu(int t,int y,int tak) {
		super(t, y);
		takasa = tak;
	}
	void setTakasa(int taka) {
		takasa = taka;
	}
	int taiseki() {
		return menseki() * takasa;
	}
	int hyomenseki() {
		return (menseki() * 2) + (tate * takasa * 2) + (yoko * takasa * 2);
	}
}
public class Ren080801 {

	public static void main(String[] args) {
		int tate = 10, yoko = 20, takasa = 30;
		Shikakuchu sitchu = new Shikakuchu(tate, yoko, takasa);
		sitchu.setTateYoko(tate, yoko);
		sitchu.setTakasa(takasa);
		System.out.println("縦 " + tate + " 横 " + yoko + " 高さ " + takasa + 
				" の体積は" + sitchu.taiseki() + " 表面積は" + sitchu.hyomenseki());
	}

}
