package Ren;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;

public class Seikyu {
	
	public static int shokei(Meisai[] meisai) {
		int kei = 0;
		for (Meisai m: meisai) {
			kei += m.kin();
		}
		return kei;
	}
	
	public static int zei(int shokei) {
		return (int)Math.floor(shokei * 0.08);
	}
	
	public static void main(String[] args) throws IOException {
		Item it = new Item();
		System.out.print("客名：");
//		String name = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		Meisai[] mei = new Meisai[2];
		mei[0] = new Meisai();
		mei[1] = new Meisai();

		System.out.print("商品コード1：");
		mei[0].sho = it.getShohin(Integer.parseInt(br.readLine()));
		System.out.print("数量1：");
		mei[0].suryo = Integer.parseInt(br.readLine());
		System.out.print("商品コード2：");
		mei[1].sho = it.getShohin(Integer.parseInt(br.readLine()));
		System.out.print("数量2：");
		mei[1].suryo = Integer.parseInt(br.readLine());
		
		System.out.println("お客様名：" + name);
		System.out.println();
		System.out.println("商品名" + "\t" + "単価" + "\t" + "数量" + "\t" + "金額");
		for (Meisai i : mei) {
			System.out.println(i.sho.name + "\t" + i.sho.tanka + 
					"\t\t" + i.suryo + "\t\t" + i.kin());
		}
		int sho,tax;
		sho = shokei(mei);
		tax = zei(sho);
		System.out.println("\t\t\t\t小計\t" + sho);
		System.out.println("\t\t\t\t税\t\t" + tax);
		System.out.println("\t\t\t\t総計\t" + (sho + tax));
	}

}
