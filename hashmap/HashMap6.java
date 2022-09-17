package hashmap;

// RPGのアイテム一覧を再現
import java.util.HashMap;

public class HashMap6 {
    public static void main(String[] args) {
        // 画像用ハッシュ
        HashMap<String, String> itemImages  = new HashMap<String, String>();
        itemImages.put("剣", "http://paiza.jp/learning/images/sword.png");
        itemImages.put("盾", "http://paiza.jp/learning/images/shield.png");
        itemImages.put("回復薬", "http://paiza.jp/learning/images/potion.png");
        itemImages.put("クリスタル", "http://paiza.jp/learning/images/crystal.png");

        // アイテムの並び順配列
        String[] itemOrders = {"クリスタル", "盾", "剣", "回復薬", "回復薬", "回復薬"};

        for (String item : itemOrders) {
            System.out.println("<img src=" + itemImages.get(item) + ">");
            System.out.println(item + "</br>");
        }
    }
}
