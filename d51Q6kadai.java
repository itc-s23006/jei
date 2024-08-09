// s23006
// コードを読み取って、登録している内容を出力するプログラム。

public class d51Q6kadai {
    public static void main(String[] args) {
        Item[] li = { new Item("AA", "魚類"), new Item("BB", "肉類") };
        Item[] si = { new Item("A1", "さば"), new Item("A2", "さんま"),
                      new Item("B1", "牛肉"), new Item("B2", "鶏肉"),
                      new Item("B3", "豚肉"), new Item("BB", "加工肉") }; // 小分類「加工肉」を追加

        ItemMaster im = new ItemMaster(li, si);
        String lcode = args[0].substring(0, 3); // 大分類コードを3文字から取得するように変更
        String scode = args[0].substring(3, 5); // 小分類コードを4-5文字目から取得
        String details = args[0].substring(5);  // 残りを詳細コードとして取得

        String lname = im.getItemName(im.MAJOR, lcode);
        String sname = im.getItemName(im.MINOR, scode);
        System.out.println("商品コード:" + args[0]);
        System.out.println("大分類名:" + lname);
        System.out.println("小分類名:" + sname);
        System.out.println("詳細コード:" + details);
    }
}

class Item {
    private String code;
    private String name;
    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
}

class ItemMaster {
    public int MAJOR = 0;
    public int MINOR = 1;
    private Item[][] items;
    ItemMaster(Item[] major, Item[] minor) {
        items = new Item[2][];
        items[MAJOR] = major;
        items[MINOR] = minor;
    }

    public String getItemName(int codeLevel, String code) {
        for (int i = 0; i < items[codeLevel].length; i++) {
            if (code.equals(items[codeLevel][i].getCode())) {
                return items[codeLevel][i].getName();
            }
        }
        return "(不明)";
    }
}

