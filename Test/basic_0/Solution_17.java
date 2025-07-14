/**
 * 공배수
 * 정수 number와 n, m이 주어질 때,
 * number가 n의 배수이면서 m의 배수이면 1 아니면 0을 return
 * 60 2 3 1
 * 55 10 5 0
 */

public class Solution_17 {
    public static void main(String[] args) {
        int result = solution(55, 10, 5);
        System.out.println(result);
    }

    public static int solution(int number, int n, int m){

        return (number % n == 0 && number % m == 0)? 1 : 0;
    }
}