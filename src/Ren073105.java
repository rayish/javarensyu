
public class Ren073105 {

	public static void main(String[] args) {
		for (int i = 0;i < 5; i++) {
			for (int j = 0; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-------------------------------");
		for (int i = 5;i > 0; i--) {
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-------------------------------");
		for (int i=0;i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-------------------------------");
		for (int i=1;i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
