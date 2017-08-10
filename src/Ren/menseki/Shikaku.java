package Ren.menseki;

public class Shikaku extends Menseki {
	public void setTateyoko(int t, int y) {
		tate = t;
		yoko = y;
	}
	public double menseki(){
		return tate * yoko;
	}
}
