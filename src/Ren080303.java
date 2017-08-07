class Jikan {
	int hour;
	int min;
	int sec;
	Jikan () {
		hour = 0;
		min = 0;
		sec = 0;
	}
	Jikan (int h, int m, int s) {
		hour = h;
		min = m;
		sec = s;
	}
	Jikan (int h, int m) {
		hour = h;
		min = m;
		sec = 0;
	}
	Jikan (int h) {
		hour = h;
		min = 0;
		sec = 0;
	}
	long byo() {
		return hour * 60 * 60 + min * 60 + sec;
	}
	void time(int secd) {
		hour = secd / 3600;
		min = (secd % 3600) / 60;
		sec = (secd % (3600)) % 60; 
	}
}
public class Ren080303 {

	public static void main(String[] args) {
		Jikan jik = new Jikan();
		System.out.println(jik.byo() + "秒");
		Jikan jik1 = new Jikan(1,59,59);
		System.out.println(jik1.byo() + "秒");
		Jikan jik2 = new Jikan(1,59);
		System.out.println(jik2.byo() + "秒");
		Jikan jik3 = new Jikan(1);
		System.out.println(jik3.byo() + "秒");
		Jikan jik4 = new Jikan();
		jik4.time(7199);
		System.out.println(jik4.hour + ":" + jik4.min + ":" + jik4.sec);
	}

}
