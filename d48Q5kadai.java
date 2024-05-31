// s23006
// 配列を降順にして出力

import java.util.Arrays;
import java.util.Collections;

class d48Q5kadai {
    public static void main(String[] args) {
        // コマンドライン引数からの配列のソート
        int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // 選択ソートアルゴリズムで降順にソート
        for (int nextMinIndex = 0; nextMinIndex < numbers.length - 1; nextMinIndex++) {
            int minIndex = nextMinIndex;
            int minValue = numbers[nextMinIndex];
            for (int checkIndex = nextMinIndex + 1; checkIndex < numbers.length; checkIndex++) {
                if (numbers[checkIndex] < minValue) { // 降順にするために '>' を使用
                    minIndex = checkIndex;
                    minValue = numbers[minIndex];
                }
            }

            // スワップ操作
            int t = numbers[nextMinIndex];
            numbers[nextMinIndex] = numbers[minIndex];
            numbers[minIndex] = t;
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // {11, 22, 33, 44, 55} を降順にソートして出力
        Integer[] staticNumbers = {11, 22, 33, 44, 55};

        // 配列を降順に並べ替え
        Arrays.sort(staticNumbers, Collections.reverseOrder());

        // ソートされた配列を出力
        System.out.println("固定配列のソート結果:");
        for (int n : staticNumbers) {
            System.out.println(n + " ");
        }
    }
}

