import java.util.Arrays;

/**
 * 접미사배열
 * my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return
 * "banana"	["a", "ana", "anana", "banana", "na", "nana"]
 * "programmers"	["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
 */

public class Solution_45 {
    public static void main(String[] args) {
        String[] answer = solution("programmers");

        for ( String a : answer ) {
            System.out.println(a);
        }
    }
    public static String[] solution(String my_string) {

        String[] answer = new String[my_string.length()];

        for ( int i=1; i<my_string.length()+1; i++ ) {
            int start = my_string.length() - i;
            int end = my_string.length();
            answer[i-1] = my_string.substring(start, end);;
        }
        Arrays.sort(answer);
        return answer;
    }
}