
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ren072803 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] test = {"値１","値２"};
		int tensu [];
		tensu = new int[3];
		int goukei = 0;
		int seki = 1;
		for ( int i = 0; i < 2 ; i++) {
			System.out.print(test[i] + "：");
			tensu[i] = Integer.parseInt(br.readLine());
			goukei += tensu[i];
			seki *= tensu[i];
		}
		System.out.println("値１と値2の和は" + goukei);
		System.out.println("値１と値2の積は" + seki);

	}

}
