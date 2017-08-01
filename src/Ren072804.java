import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ren072804 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = Integer.parseInt(br.readLine());
		if (res % 2 == 0) {
			System.out.println("偶数です。");
		} else {
			System.out.println("奇数です。");
		}
	}

}
