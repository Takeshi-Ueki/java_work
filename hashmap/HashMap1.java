package hashmap;

// Hashmapを作る
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        // HashMapの具体例
        HashMap<String, String> enemyMap = new HashMap<String, String>();
        enemyMap.put("ザコ", "スライム");
        enemyMap.put("中ボス", "ドラゴン");
        
        System.out.println(enemyMap.get("ザコ"));
        System.out.println(enemyMap.get("中ボス"));
        
        enemyMap.put("ザコ", "モンスター");
        System.out.println(enemyMap.get("ザコ"));
    }
}
