class Kamoku2 {
	int kok, su, ei;		//国語、数学、英語
	String namae;
	Kamoku2(String name, int ja, int math, int en) {
		namae = name;
		kok = ja;
		su = math;
		ei = en;
	}
	int gokei() {
		return kok + su + ei;
	}
	double heikin() {
		return this.gokei() / 3.0;
	}
}
public class Ren080702 {

	public static void main(String[] args) {
		System.out.println("名前\t\t国語\t数学\t英語\t合計\t平均");
		Kamoku2[] kamo = new Kamoku2[3];
		String[] name = {"田中", "中山", "山田","合計"};
		int tensu = 10;
		//点数のセット
		int i = 0;
		for (i = 0 ; i < 3 ; i++) {
			kamo[i] = new Kamoku2(name[i],tensu,tensu+10,tensu+20);
			tensu += 30;
		}
		//明細の出力＆合計加算
		Kamoku2 goukei = new Kamoku2(name[3],0,0,0);
		for(Kamoku2 ten : kamo) {
			goukei.kok += ten.kok;
			goukei.su += ten.su;
			goukei.ei += ten.ei;
			System.out.println(ten.namae + "\t\t" + ten.kok + "\t\t" + ten.su + "\t\t" + ten.ei
						+ "\t\t" + ten.gokei() + "\t\t" + ten.heikin());
		}
		//合計の出力＆セット
		System.out.println(goukei.namae + "\t\t" + goukei.kok + "\t\t" + goukei.su + "\t\t" + goukei.ei
				+ "\t\t" + goukei.gokei() + "\t\t" + goukei.heikin());
	}

}
