//車クラス
class Car4 {
	private int num;
	private double gas;
	public Car4() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public Car4(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
//レーシングカークラス
class RacingCar extends Car4 {
	private int course;
	public RacingCar() {
		course =0;
		System.out.println("レーシングカーを作成しました。");
	}
	public RacingCar(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
}
public class Ren0808011 {

	public static void main(String[] args) {
		RacingCar rccar1;
		rccar1 = new RacingCar();
		rccar1.setCar(1234,  20.5);
		rccar1.setCourse(5);
		System.out.println("---------------------------------------");
		RacingCar rccar2 = new RacingCar(1234, 20.5, 5);

	}

}
