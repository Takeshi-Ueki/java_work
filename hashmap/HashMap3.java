package hashmap;

// HashMapの基本操作
import java.util.HashMap;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<String, String> enemyMap = new HashMap<String, String>();
        enemyMap.put("ザコ", "スライム");
        enemyMap.put("中ボス", "ドラゴン");
        enemyMap.put("ラスボス", "魔王");
        
        String level = "中ボス";
        
        System.out.println(enemyMap.get(level));
        System.out.println(enemyMap.size());
        
        enemyMap.remove("中ボス");
        System.out.println(enemyMap.get(level));
        System.out.println(enemyMap.size());
    }
}
