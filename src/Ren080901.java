class Jisoku {
	double byo;
	double kyori;	//メートル
	Jisoku(double b, double k) {
		byo = b;
		kyori = k;
	}
	double jisoku() {
		double byosoku;
		double jik;
		byosoku = kyori / byo;
		jik = byosoku * 3600.0;
		return jik / 1000.0;
//		return (kyori / 1000.0) / (byo / 3600.0);
	}
}
public class Ren080901 {

	public static void main(String[] args) {
		double s = 9.58;
		double m = 100.0;
		Jisoku jiso = new Jisoku(s, m);
		System.out.println(jiso.byo + "秒で" + jiso.kyori +"mを走ると時速" + jiso.jisoku() + "km/h");		
	}

}
