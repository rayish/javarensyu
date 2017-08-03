//車クラス
class Car {
	private int num;
	private double gas;
	//コンストラクタの定義
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public void setCar(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	public void setCar(double g) {
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
	
	public void setNumGas(int n, double g) {
		if(g > 0 && g < 1000) {
			num = n;
			gas = g;
			System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
		} else {
			System.out.println(g + "は正しいガソリン量ではありません。");
			System.out.println("ガソリン量を変更できませんでした。");
		}
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
public class Ren0803011 {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		System.out.println("車のナンバーだけ変更します。");
		car1.setCar(2345);
		car1.show();
		System.out.println("ガソリン量だけ変更します。");
		car1.setCar(30.5);
		car1.show();
		System.out.println("正しくないガソリン量（-10.0）を指定してみます・・・。");
		car1.setNumGas(1234, -10.0);
		car1.show();

	}

}
