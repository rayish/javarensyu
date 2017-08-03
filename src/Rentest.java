import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int cnt = Integer.parseInt(line);
        String[] basyo = new String[cnt];
        int[] sa = new int[cnt];
        //時間と場所の読み込み
        for(int i = 0;i < cnt;i++) {
            line = sc.nextLine();
            String[] array = line.split(" ");
            basyo[i] = array[0];
            sa[i] = Integer.parseInt(array[1]);
        }
        //現在地と現在時間の読み込み
        line = sc.nextLine();
        String[] arrays = line.split(" ");
        //場所の特定
        int iti;
        for(iti = 0 ; iti < cnt ; iti++) {
            if (basyo[iti].equals(arrays[0])) {
                break;
            }
        }
        String[] array2 = arrays[1].split(":",0);
        int zi = Integer.parseInt(array2[0]);   //基準時
        int fun = Integer.parseInt(array2[1]);  //基準分
        int zisa;
        int zikan = 0;
        for (int i = 0;i < cnt;i++) {
            zisa = sa[i] - sa[iti];     //時間差を求める
            zikan = zi + zisa;          //基準時に時間差を加える
            if (zikan < 0) {
                zikan = 24 + zikan;
            } else if (zikan >= 24) {
                zikan -= 24;
            }
            System.out.println(String.format("%02d",zikan) + ":" + fun);
        }
    }
}
