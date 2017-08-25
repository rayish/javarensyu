package Ren;

public class Seikyu {

	public static void main(String[] args) {
		Item it = new Item();
		Meisai mei = new Meisai();
		mei.sho = it.getShohin(1);
		mei.suryo = 2;
		System.out.println(mei.sho.code + "\t" + mei.sho.name + "\t" + mei.sho.tanka + 
				"\t" + mei.suryo + "\t" + mei.kin());
	}

}
