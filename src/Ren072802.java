import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ren072802 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] test = {"国語","数学","英語"};
		int tensu [];
		tensu = new int[3];
		int goukei = 0;
		for ( int i = 0; i < 3 ; i++) {
			System.out.print(test[i] + "：");
			tensu[i] = Integer.parseInt(br.readLine());
			goukei += tensu[i];
		}
		System.out.println("合計:" + goukei);
		System.out.println("平均:" + (goukei / 3.0));

	}

}
