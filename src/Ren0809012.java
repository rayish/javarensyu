interface iVehicle {
	void vShow();
}
interface iMaterial {
	void mShow();
}
class Car6 implements iVehicle, iMaterial {
	private int num;
	private double gas;
	public Car6(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	public void vShow() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + num + "です。");
	}
	public void mShow() {
		System.out.println("車の材質は鉄です。");
	}
}
public class Ren0809012 {

	public static void main(String[] args) {
		Car6 car1 = new Car6(1234, 20.5);
		car1.vShow();
		car1.mShow();
	}

}
