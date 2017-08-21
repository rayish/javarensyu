package Ren0821;

class Denki {
	int kihon, tanka, shiyo;
	public Denki(int kih, int tan, int shi) {
		kihon = kih;
		tanka = tan;
		shiyo = shi;
	}
	public int ryokin() {
		return (shiyo - 1000) * tanka + kihon;
	}
}
public class Ren082102 {

	public static void main(String[] args) {
		Denki denki = new Denki(2000, 8, 1300);
		System.out.println("電気代:" + denki.ryokin() + "円");
	}

}
