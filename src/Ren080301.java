class Kaimono {
	String name;
	int	tanka;
	int	suryo;
	int kingaku() {
		return tanka * suryo;
	}
	double tax() {
		return kingaku() * 0.08;
	}
	double gokei() {
		return kingaku() + tax();
	}
}
public class Ren080301 {

	public static void main(String[] args) {
		Kaimono kai = new Kaimono();
		kai.tanka = 80;
		kai.suryo = 3;
		kai.name = "ペン";
		System.out.println("商品名\t単価\t数量\t金額\t税\t合計金額");
		System.out.println(kai.name + "\t" + kai.tanka + "\t" + kai.suryo + "\t" + kai.kingaku() + "\t" + kai.tax() + "\t" + kai.gokei());
	}

}
