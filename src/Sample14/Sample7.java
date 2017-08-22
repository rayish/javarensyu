package Sample14;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Sample7 {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			pw.println("Hello!");
			pw.println("GoodBye!");
			pw.println("GoodBye!");
			System.out.println("ファイルに書き込みました。");
			pw.close();
		} catch(IOException e) {
			System.out.println("入出力エラーです。");
		} finally {
		}
	}
}
