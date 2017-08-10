class En1 {
	private int r;
	void setR(int r) {
		this.r = r;
	}
	double ensyu() {
		return Math.PI * (r * 2);
	}
	double menseki() {
		return Math.PI * (r * r);
	}
}
class Ensui extends En1 {
	protected int takasa;
	void setTakasa(int takasa) {
		this.takasa = takasa;
	}
	double taiseki() {
		return (menseki() * takasa ) / 3.0;
	}
}
class Enchu extends Ensui {
	double taiseki() {
		return menseki() * takasa;
	}
}
public class Ren080802 {

	public static void main(String[] args) {
		int r = 10;
		int takasa = 20;
		Ensui[] ens;
		ens = new Ensui[2];
		ens[0] = new Ensui();
		ens[1] = new Enchu();
		for ( Ensui e : ens ) {
			e.setR(r);
			e.setTakasa(takasa);
		}
		System.out.println("円周=" + ens[0].ensyu() );
		System.out.println("円の面積=" + ens[0].menseki() );
		for ( Ensui e : ens ) {
			System.out.println("体積=" + e.taiseki() );
		}
	}

}