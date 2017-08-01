
public class Ren080103 {

	public static void main(String[] args) {
		long atusa = 1,count = 0;
		double	tani = 0.0;
		String tanistr;
		while(atusa <= 100*100*10) {
			atusa *= 2;
			count +=1;
			if (atusa > 10*100) {
				tani = (double)atusa / (10.0*100.0);
				tanistr = "m";
			} else 	if (atusa > 10) {
				tani = (double)atusa / 10.0;
				tanistr = "cm";
			} else {
				tani = (double)atusa;
				tanistr = "mm";
			}
			System.out.println(count + "度折り　:　厚さ " + tani + tanistr);
		}
	}

}
