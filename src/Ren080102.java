
public class Ren080102 {

	public static void main(String[] args) {

		int tyokin = 0,kin = 1, i = 0;
		while (tyokin < 100000) {
			tyokin += kin;
			i++;
			System.out.println(i + "日" + kin + "円貯金   合計" + tyokin);
			kin *= 2;
		}
		
	}

}
