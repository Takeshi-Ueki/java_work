// メソッドのオーバーロード

public class OverLoad {
    public static void main(String[] args) {
        attack();
        attack("スライム");
        attack(3);
        attack("スライム", 3);
    }
    
    public static void attack() {
        System.out.println("勇者は、敵を攻撃した。");
    }
    
    public static void attack(String target) {
        System.out.println("勇者は、" + target + "を攻撃した。");
    }
    
    public static void attack(int number) {
        System.out.println("勇者は、" + number + "匹の敵を攻撃した。");
    }
    
    public static void attack(String target, int number) {
        System.out.println("勇者は、" + number + "匹の" + target + "を攻撃した。");
    }
}
