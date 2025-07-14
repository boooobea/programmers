/**
 * 두 수의 연산값 비교하기
 * 연산 + 는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환
 * a + b와 2 * a * b 중 더 큰 값을 return
 * 2 91 364
 * 91 2 912
 */

public class Solution_15 {
    public static void main(String[] args) {
        int result = solution(91, 2);
        System.out.println(result);
    }

    public static int solution(int a, int b){
        int answer = 0;
        //1. a + b
        int value1 = Integer.valueOf(a + "" + b);
        //2 2 * a * b
        int value2 = 2 * a * b;
        answer = Math.max(value1, value2);
        return answer;
    }
}