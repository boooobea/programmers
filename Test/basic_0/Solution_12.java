import java.util.Arrays;

/**
 * 문자 리스트를 문자열로 반환하기
 * 문자들이 담겨있는 배열 arr의 원소들을 순서대로 이어 붙인 문자열을 return
 * ["a","b","c"]
 * "abc"
 */

public class Solution_12 {
    public static void main(String[] args) {
        String result  = solution(new String[] {"a","b","c"});
        System.out.println(result);
    }

    public static String solution(String[] arr) {
        String answer = "";

        for(String a : arr) {
            answer += a;
        }

        return answer;
    }
}