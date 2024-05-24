// s23006
// d48Q23kadai  の実行結果をコンパイルエラーしないように修正
// 4 7 と表示

class d48Q23kadai {
		public static void main(String[] args) {
				int i = 1;
				for (;;) {
						i = i + 3;
						if (i < 10) {
								System.out.println(i);
								continue;
						} else {
								break;
						}
				}
		}
}
