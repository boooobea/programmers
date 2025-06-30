import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr [] = sc.nextLine().toCharArray();
        String str = "";
        for ( char a : arr ) {
            if (Character.isUpperCase(a)) {
                str += String.valueOf(a).toLowerCase();
            } else {
                str += String.valueOf(a).toUpperCase();
            }
        }
        System.out.println(str);
    }
}