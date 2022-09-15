// 学生メソッドを呼び出す

public class Class3 {
    public static void main(String[] args) {
        // この下に、インスタンスを実体化し、メソッド呼び出しを記述する
        Gakusei a = new Gakusei(70, 43);
        System.out.println("合計は" + a.sum() + "点です");
    }
}

class Gakusei {
    private int myKokugo;
    private int mySansu;

    public Gakusei(int kokugo, int sansu) {
        myKokugo = kokugo;
        mySansu = sansu;
    }

    public int sum() {
        return myKokugo + mySansu;
    }
}
