class Item2 {
	String name;
	int tanka;
	int suryo;
	Item2(String n,int t,int s) {
		name = n;
		tanka = t;
		suryo = s;
	}
	int kingaku() {
		return tanka * suryo;
	}
}
public class Ren080703 {

	public static void main(String[] args) {
		Item2[] syohin = {new Item2("ペン",80,1),new Item2("鉛筆",100,2),new Item2("筆箱",600,1)};
		System.out.println("商品名\t単価\t数量\t金額");
		int sum = 0;
		int tax;
		for(Item2 s : syohin) {
			System.out.println(s.name + "\t"+ s.tanka + "\t\t" + s.suryo + "\t\t" + s.kingaku() + "\t\t");
			sum += s.kingaku();
		}
		System.out.println("\t\t\t\t小計\t" + sum);
		tax = (int)(Math.floor(sum * 0.08));
		System.out.println("\t\t\t\t税\t\t" + tax);
		System.out.println("\t\t\t\t合計\t" + (sum + tax));

	}

}
