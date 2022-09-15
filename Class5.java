// RPGの攻撃シーン
public class Class5 {
    public static void main(String[] args) {
        Player3 hero = new Player3("勇者");
        Player3 wizard = new Player3("魔法使い");
        Warrior warrior = new Warrior("戦士");
        Player3[] party = {hero, wizard, warrior};

        for (Player3 member : party) {
            member.attack("スライム");
        }
    }
}

class Player3 {
    public String myName;

    public Player3(String name) {
        myName = name;
    }

    public void attack(String enemy) {
        System.out.println(myName + "は" + enemy + "を攻撃した");
    }
}

class Warrior extends Player3 {
    public Warrior(String name) {
        super(name);
    }

    public void attack(String enemy) {
        System.out.println(myName + "は" + enemy + "を猛攻撃した");
    }
}
