import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ren080104 {

	public static void main(String[] args) throws IOException {
		
		int[] ten = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			ten[i] = Integer.parseInt(str);
		}
		for ( int i : ten ) {
			sum += i;
		}
		System.out.println("合計点は" + sum + "点");
		System.out.println("平均点は" + sum / 5.0 + "点");
	}

}
