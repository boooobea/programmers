/**
 * flag값에 따라 다른 값 반환하기
 * a, b, flag가 주어질 때, flag가 true면 a+b, false 면 a - b를 return
 * -4, 7, true, 3
 * -4, 7, false, -11
 */

public class Solution_20 {
    public static void main(String[] args) {
        int result = solution(-4, 7, false);
        System.out.println(result);
    }

    public static int solution(int a, int b, boolean flag){

        return flag ? a+b : a-b;
    }
}