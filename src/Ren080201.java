class Kamoku {
	int kok,su,ei;
	int sum() {
		return kok + su + ei;
	}
	double avg() {
		return sum() / 3;
	}
}
public class Ren080201 {

	public static void main(String[] args) {
		Kamoku kam = new Kamoku();
		kam.kok = 50;
		kam.su = 60;
		kam.ei = 70;
		System.out.println("国語\t数学\t英語\t合計\t平均");
		System.out.println(kam.kok +"\t\t"+kam.su +"\t\t"+kam.ei +"\t\t"+ kam.sum() + "\t\t" + kam.avg());
	}

}
