enum Singnal {
		RED, YELLOW, GREEN;
}
public class d52Q27kadai {
		public static void main(String[] args) {
				Signal sig = YELLOW;
				if (sig == Signal.GREEN) {
						System.out.println("緑");
				} else if (sig == Signal.YELLOW) {
						System.out.println("黃");
				} else {
						System.out.println("赤");
				}
		}
}
