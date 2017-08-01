import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ren072805 {

	public static void main(String[] args) throws IOException {
		String[] str = {"値１：","値２：","値３："};
		System.out.println("3つの値を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		long min = 999999999;
		for (int i = 0; i < 3; i++) {
			System.out.print(str[i]);
			int atai = Integer.parseInt(br.readLine());
			if (max < atai) {
				max = atai;
			}
			if (min > atai) {
				min = atai;
			}
		}
		System.out.println("最大は" + max);
		System.out.println("最少は" + min);
	}

}
