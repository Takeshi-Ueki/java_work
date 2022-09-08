import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("西暦を入力");
        int seireki = sc.nextInt();
        System.out.println("何年検索するかを入力");
        int count = sc.nextInt();
        for (int i = 0; i < count; i ++) {
            int shouwa = seireki - 1925;
            System.out.print("西暦" + seireki + "年は");
            System.out.println("昭和" + shouwa + "年です");  
            seireki++;
        } 
    }
}