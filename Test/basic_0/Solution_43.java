
/**
 * 부분 문자열 이어붙어 문자열 만들기
 * 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts
 * parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미
 * 각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return
 * ["progressive", "hamburger", "hammer", "ahocorasick"]
 * [[0, 4], [1, 2], [3, 5], [7, 7]]
 * "programmers"
 */

public class Solution_43 {
    public static void main(String[] args) {
        String answer = solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"},
                new int[][] { {0,4}, {1,2}, {3,5}, {7,7} });

        System.out.println(answer);

    }
    public static String solution(String[] my_strings, int[][] parts) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        return sb.toString();
    }
}