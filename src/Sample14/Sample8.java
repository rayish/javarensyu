package Sample14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Sample8 {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("test1.txt"));
			String str1 = br.readLine();
			String str2 = br.readLine();
			System.out.println("ファイルに書き込まれている２つの文字列は");
			System.out.println(str1 + "です。");
			System.out.println(str2 + "です。");
			br.close();
		} catch(IOException e) {
			System.out.println("入出力エラーです。");
		} finally {
		}
	}
}
