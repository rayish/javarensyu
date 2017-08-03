class Menseki {
	public int menseki(int tate, int yoko) {
		return tate * yoko;
	}
	public int menseki(int r) {
		return (int)(r * r * Math.PI);
	}
}
public class Ren080302 {
	public static void main (String[] arg) {
		Menseki menseki = new Menseki();
		System.out.println("四角形の面積：" + menseki.menseki(10,5));
		System.out.println("円の面積：" + menseki.menseki(10));
	}
}
