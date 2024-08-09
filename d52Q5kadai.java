// s23006
// コマンドラインで指定された一つ以上の整数(1以上400未満)を基に、棒グラフを表示するプログラム。

public class d52Q5kadai {
        public static void main(String[] args) {
                String majors = "+----";  // 目盛り文字列
                int LIMIT = 499;
                if (args.length == 0) return;
                int max = 0, i = 0;
                int[] data = new int[args.length];
                for (String s : args) {
                        data[i] = Integer.parseInt(s);
                        if (data[i] <= 0 || data[i] >= LIMIT) return;
                        if (max < data[i]) {
                                max = data[i];
                        }
                        i++;
                }

                // 目盛り表示
                int majormax = (max - 1) / 10 + 1;  // 10単位の目盛りの最大値を計算
                System.out.print("     ");
                for (i = 0; i < majormax; i++) {
                        System.out.print(majors.charAt(i % 5));  // 目盛り文字列の出力
                }
                System.out.println("");

                // グラフ表示
                for (i = 0; i < data.length; i++) {
                        System.out.printf("%4d : ", data[i]);
                        int n = (data[i] - 1) / 10 + 1;  // 10単位でのグラフの長さを計算
                        for (int j = 0; j < n; j++) {
                                System.out.print('*');
                        }
                        System.out.println("");
                }
        }
}

