// s23006
// 信号機の状態を判定して表示するプログラム

enum Signal {
    RED, YELLOW, GREEN;
}

public class d52Q27kadai {
    public static void main(String[] args) {
        Signal sig = Signal.YELLOW; // Signal 型のインスタンスを正しく初期化
        if (sig == Signal.GREEN) {
            System.out.println("緑");
        } else if (sig == Signal.YELLOW) {
            System.out.println("黄");
        } else {
            System.out.println("赤");
        }
    }
}

