// s23006
// 引数から3つの奇数とリミットを受け取り、各数値がどの奇数の倍数であるかを判定して表示するプログラム。

public class d49Q5kadai {
    public static void main(String[] args) {
        // 入力引数から値を取得
        int limit = Integer.parseInt(args[0]);
        int base1 = Integer.parseInt(args[1]);
        int base2 = Integer.parseInt(args[2]);
        int base3 = Integer.parseInt(args[3]);

        // 共通の倍数を計算
        int common12 = base1 * base2;
        int common13 = base1 * base3;
        int common23 = base2 * base3;
        int common123 = base1 * base2 * base3;

        // limit までの数をループ
        for (int i = 1; i <= limit; i++) {
            // 各基数に対する条件をチェック
            if (i % common123 == 0) {
                System.out.println(i + ":base1,base2,base3");
                continue;
            }
            if (i % common12 == 0) {
                System.out.println(i + ":base1,base2");
                continue;
            }
            if (i % common13 == 0) {
                System.out.println(i + ":base1,base3");
                continue;
            }
            if (i % common23 == 0) {
                System.out.println(i + ":base2,base3");
                continue;
            }
            if (i % base1 == 0) {
                System.out.println(i + ":base1");
                continue;
            }
            if (i % base2 == 0) {
                System.out.println(i + ":base2");
                continue;
            }
            if (i % base3 == 0) {
                System.out.println(i + ":base3");
                continue;
            }
            System.out.println(i);
        }
    }
}

