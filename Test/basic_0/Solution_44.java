
/**
 * 문자열 뒤의 n 글자
 * my_string의 뒤에 n글자로 이루어진 문자열을 return
 * "ProgrammerS123"	11	"grammerS123"
 * "He110W0r1d"	5	"W0r1d"
 */

public class Solution_44 {
    public static void main(String[] args) {
        String answer = solution("He110W0r1d", 5);

        System.out.println(answer);

    }
    public static String solution(String my_string, int n) {

        return my_string.substring(my_string.length() - n, my_string.length());
    }
}