import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ren072702 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("姓：");
		String sei = br.readLine();
		System.out.print("名：");
		String mei = br.readLine();
		System.out.println("こんにちは\"" + sei + mei + "\"さん");
	}

}
