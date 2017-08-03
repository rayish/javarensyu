class Cars {
	private int num;
	private double gas;
	
	public Cars() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public Cars(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
public class Ren0803012 {

	public static void main(String[] args) {
		Cars car1 = new Cars();
		car1.show();
		
		Cars car2 = new Cars(1234, 20.5);
		car2.show();

	}

}
