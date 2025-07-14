/**
 * n의 배수
 * 정수 num와 n이 주어질때, num이 n의 배수이면 1 아니면 0을 return
 * 98 2 1
 * 34 3 0
 */

public class Solution_16 {
    public static void main(String[] args) {
        int result = solution(34,3);
        System.out.println(result);
    }

    public static int solution(int num, int n){
        return num % n == 0 ? 1 : 0;
    }
}