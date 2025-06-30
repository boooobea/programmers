import java.util.Scanner;

// 문자열 반복해서 출력하기
// 문자열 str과 정수 n이 주어집니다.
// str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

public class Solution_2 {
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