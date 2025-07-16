import java.util.Arrays;

/**
 * 이어 붙인 수
 * num_list가 주어질 때
 * 홀수만 순서대로 이어붙인 수 + 짝수만 순서대로 이어붙은 수의 합
 * 3,4,5,2,1 - 393
 * 5,7,8,3 - 581
 */

public class Solution_25 {
    public static void main(String[] args) {
        int answer = solution(new int[]{5,7,8,3});
        System.out.println(answer);
    }

    public static int solution(int[] num_list){

        String odd = "";
        String even = "";
        for (int a : num_list) {
            if ( a % 2 == 1 ) {
                odd += String.valueOf(a);
            }
            else {
                even += String.valueOf(a);
            }
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}