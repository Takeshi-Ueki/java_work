// メンバー変数とコンストラクタを追加

public class Class2 {
    public static void main(String[] args) {
        Greeting paiza = new Greeting("java");
        paiza.sayHello();
    }
}

class Greeting {
    private String myName;
    
    public Greeting(String name) {
        myName = name;   
    }

    public void sayHello() {
        System.out.println("hello " + myName);
    }
}