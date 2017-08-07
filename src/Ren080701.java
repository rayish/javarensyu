class Hajiki {
	double sokudo;
	double jikan;
	double kyori;
	Hajiki() {
		sokudo = 0.0;
		jikan = 0.0;
		kyori = 0.0;
	}
	double speed() {
		return Math.rint(kyori / jikan * 100) / 100;
	}
	double hour() {
		return Math.rint(kyori / sokudo * 100) / 100;
	}
	double length() {
		return Math.rint(jikan * sokudo * 100) / 100;
	}
}
public class Ren080701 {

	public static void main(String[] args) {
		Hajiki haji = new Hajiki();
		Hajiki haji2;
		haji2 = haji;
		haji2.kyori = 30;
		haji2.jikan = 5;
		System.out.println("スピード:" + haji.speed() + "km/s");
		haji.sokudo = 10;
		haji.kyori = 30;
		System.out.println("時間：" + haji2.hour() + "時間");
		haji2.jikan = 4;
		haji2.sokudo = 15;
		System.out.println("距離：" + haji.length() + "Km");
	}

}
