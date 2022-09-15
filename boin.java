import java.util.Scanner;


public class boin {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] list = a.split("");
        String val = "";
        
        for (int i = 0; i < a.length(); i++) {
            String tmp = list[i].toLowerCase();
            if (tmp.equals("a") ||  tmp.equals("i") || tmp.equals("u") || tmp.equals("e") || tmp.equals("o")) {
            } else {
                val += list[i];
            }
        } 
        System.out.println(val);
        
        sc.close();
    }
}