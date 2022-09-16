package hashmap;
import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
    	// intではなくIntegerで指定する必要がある    	
        HashMap<String, Integer> skills = new HashMap<String, Integer>();
        skills.put("攻撃力", 150);
        System.out.println(skills.get("攻撃力"));
        skills.put("防御力", 100);
        System.out.println(skills.get("防御力"));
        skills.put("魔法力", 200);
        System.out.println(skills.get("魔法力"));
        skills.put("移動力", 380);
        System.out.println(skills.get("移動力"));

    }
}
