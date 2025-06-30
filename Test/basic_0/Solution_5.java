import java.util.Scanner;

// 덧셈식 출력하기
// 두 수가 주어질때 a + b = c 출력하기
public class Solution_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr []  = sc.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}