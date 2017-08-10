package Ren.mondai;
import Ren.menseki.Menseki;
import Ren.menseki.Sankaku;
import Ren.menseki.Shikaku;

public class Ren081002 {

	public static void main(String[] args) {
		Menseki[] men = new Menseki[2];
		men[0] = new Sankaku();
		men[1] = new Shikaku();
		for (Menseki m : men) {
			m.setTateyoko(20, 10);
		}
		System.out.println("縦:20,横10の四角形の面積は" + men[0].menseki());
		System.out.println("縦:20,横10の三角形の面積は" + men[1].menseki());
	}

}
