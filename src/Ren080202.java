class Sankaku {
	int tate;
	int yoko;
	double men() {
		return tate * yoko / 2;
	}
	
}
public class Ren080202 {

	public static void main(String[] args) {
		Sankaku san = new Sankaku();
		san.tate = 3;
		san.yoko = 6;
		System.out.print("三角形の面積は" + san.men());
	}
}
