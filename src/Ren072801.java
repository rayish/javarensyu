import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ren072801 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("縦：");
		int tate = Integer.parseInt(br.readLine());
		System.out.print("横：");
		int yoko = Integer.parseInt(br.readLine());
		System.out.print("四角形の面積は" + (tate * yoko) + "です" ); 
	}

}
