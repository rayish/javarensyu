//車クラス
class Car2 {
	int num;
	private double gas;
	String name;
	public  Car2() {
		num = 0;
		gas = 0.0;
		name = "名無し";
		System.out.println("車を作成しました。");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num  + "にガソリン量を" + gas + "にしました。");
	}
	public void setName(String nm) {
		name = nm;
		System.out.println("名前を" + name + "にしました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("名前は" + name + "です。");
	}
}
public class Ren0807011 {
	static void setNameNum(Car2 car,int number) {
		car.name = "abc";
		car.num = 9876;
		number = 9876;
	}

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		car1.show();
		int number = 1234;
		double gasoline = 20.5;
		String str = "1号車";
		car1.setCar(number,  gasoline);
		car1.setName(str);
		car1.show();
		
		setNameNum(car1, number);
		System.out.println(car1.num + "です。");
		System.out.println(number + "です。");
	}

}
