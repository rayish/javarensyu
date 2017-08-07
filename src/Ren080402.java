import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ren080402 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if (str.toUpperCase().equals("ABC")) {
			System.out.println("abcです");
		} else {
			System.out.println("違います");
		}
	}
}
