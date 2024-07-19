enum Condition {
    ROAD, MUD, SNOW
}

class d50Q26kadai {
    public static void main(String[] args) {
        // Conditionの全ての要素を出力する
        for (int i = 0; i < Condition.values().length; i++) {
            System.out.println("Condition is " + Condition.values()[i]);
        }
    }
}

