import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs[] = sc.nextLine().split(" ");
        String str = strs[0];
        int num = Integer.parseInt(strs[1]);
        String result = "";
        for ( int i = 0; i < num; i++ ) {
            result += str;
        }
        System.out.println(result);
    }
}