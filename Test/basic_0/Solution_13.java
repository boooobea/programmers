/**
 * 문자열 곱하기
 * 문자열 my_string, 정수 k가 주어질 때 my_string을 k번 반복한 문자열을 return
 * string 3 stringstringstring
 * love 10 lovelovelovelovelovelovelovelovelovelove
 */

public class Solution_13 {
    public static void main(String[] args) {
        String result  = solution1("love", 10);
        System.out.println(result);
    }

    public static String solution1(String my_string, int k ) {
        return null; //my_string.repeat(k);
    }
    public static String solution(String my_string, int k) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}