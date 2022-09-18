package hashmap;

// 画像を順番に出力する
import java.util.HashMap;
import java.util.Scanner;

public class HashMap7 {
    public static void main(String[] args) {
        // 画像用ハッシュ
        HashMap<String, String> itemImages  = new HashMap<String, String>();
        itemImages.put("剣", "http://paiza.jp/learning/images/sword.png");
        itemImages.put("盾", "http://paiza.jp/learning/images/shield.png");
        itemImages.put("回復薬", "http://paiza.jp/learning/images/potion.png");
        itemImages.put("クリスタル", "http://paiza.jp/learning/images/crystal.png");

        Scanner sc = new Scanner(System.in);
        int itemCount = sc.nextInt();
        
        String[] items = new String[itemCount];
        
        // ArrayList<String> items = new ArrayList<String>();
        // ここから下を書く
        for (int i = 0; i < itemCount; i++) {
            items[i] = sc.next();
        }
        
        for (String item : items) {
            System.out.println("<img src='" + itemImages.get(item) + "'><br>");
        }
        
        sc.close();
    }
}
