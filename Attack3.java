// RPGの攻撃シーン
import java.util.ArrayList;

public class Attack3 {
    public static void main(String[] args) {
        ArrayList<Player2> team = new ArrayList<Player2>();
        team.add(new Player2("勇者"));
        team.add(new Player2("戦士"));
        team.add(new Player2("魔法使い"));

        for (Player2 person : team) {
            person.attack("スライム");
        }
    }
}

class Player2 {
	private String myName;
	
	public Player2(String name) {
		myName = name;
	}
	
	public void attack(String enemy) {
		System.out.println(myName + "は" + enemy + "を攻撃した");
	}
}
