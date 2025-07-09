/**
 * 문자열 섞기
 * 길이가 같은 두 문자열 str1, str2가 주어졌을 때
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한번씩 등장하는 문자열을 만들어 return
 * aaaaa
 * bbbbb
 * abababababab
 */

public class Solution_11 {
    public static void main(String[] args) {
        String result  = solution("aaaaa", "bbbbb");
        System.out.println(result);
    }

    public static String solution(String str1, String str2) {
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();
        String answer = "";

        for (int i = 0; i < arrStr1.length; i++) {
            answer += String.valueOf(arrStr1[i]);
            answer += String.valueOf(arrStr2[i]);
        }
        return answer;
    }
}