package Ren.menseki;

public class Sankaku extends Menseki {
	public void setTateyoko(int t, int y) {
		tate = t;
		yoko = y;
	}
	public double menseki() {
		return tate * yoko / 2.0;
	}

}