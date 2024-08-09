// s23006
// テスト用のクラスとメインメソッドを統合し、温度を設定して表示するプログラム

public class d52Q2kadai {

    class Temper {
        private double temperature;

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }
    }

    public static void main(String[] args) {
        d52Q2kadai outer = new d52Q2kadai(); // 外部クラスのインスタンスを作成
        Temper t = outer.new Temper(); // 内部クラスのインスタンスを作成
        t.setTemperature(17.2);
        System.out.println(t.getTemperature());
    }
}

