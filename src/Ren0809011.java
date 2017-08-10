//車クラス
class Car5 {
	protected int num;
	protected double gas;
	
	public Car5() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
}
//レーシングカークラス
class RacingCar1 extends Car5 {
	private int course;
	public RacingCar1() {
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
}
public class Ren0809011 {

	public static void main(String[] args) {
		Car5[] cars = new Car5[2];
		cars[0] = new Car5();
		cars[1] = new RacingCar1();
		
		for(int i=0;i < cars.length;i++) {
			Class c1 = cars[i].getClass();
			System.out.println((i+1) + "番目のオブジェクトのクラスは" + c1 + "です。");
		}
	}

}
