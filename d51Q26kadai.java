// s23006
// 「-> 」演算子を使ったプログラム。

public class d51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = switch (n) {
            case 1 -> "one";
            case 2 -> "two";
            default -> "?";
        };
        System.out.println(s);
    }
}

