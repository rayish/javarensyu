import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ren073103 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		if (res < 60) {
			System.out.println("不可");
		} else if (res < 70) {
			System.out.println("可");
		} else if (res < 80) {
			System.out.println("良");
		} else {
			System.out.println("優");
		}
	}

}
