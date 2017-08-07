class En {
	int r;
	En() {
		r = 0;
	}
	double ensyu() {
		return Math.rint(2.0 * Math.PI * r * 100) / 100;
	}
	double menseki() {
		return Math.rint(Math.PI * r * r * 100) / 100;
	}
}
public class Ren080403 {

	public static void main(String[] args) {
		
		En en = new En();
		en.r = 10;
		System.out.println("円周 " + en.ensyu());
		System.out.println("面積 " + en.menseki());

	}

}
