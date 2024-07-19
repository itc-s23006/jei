// s23006
// コマンドラインから与えられた整数を指定できるように改造。

class d50Q27kadai {
    public static void main(String[] args) {
        // コマンドライン引数を整数に変換
        int control = Integer.parseInt(args[0]);
        String mode;

        switch (control) {
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            case 3:
            default:
                mode = "Wind";
                break;
        }
        System.out.println(mode);
    }
}

