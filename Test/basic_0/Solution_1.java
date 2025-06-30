import java.util.Scanner;
// a와 b 출력하기
// 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs[] = sc.nextLine().split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}