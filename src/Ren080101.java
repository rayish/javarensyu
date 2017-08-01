
public class Ren080101 {

	public static void main(String[] args) {
		int kuku;
		for(int i = 1; i < 10; i++ ) {
			for (int j = 1; j < 10; j++ ) {
				kuku = i * j;
				if (kuku < 10) {
					System.out.print(" ");
				}
				System.out.print(" ");
				System.out.print(kuku);
			}
			System.out.print("\n");
		}
	}

}
