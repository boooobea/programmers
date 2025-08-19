
/**
 * 글자 이어 붙여 문자열 만들기
 * 문자열, 정수 배열이 매개변수로 주어질 때
 * 문자열의 배열의 원소들에 해당하는 인덱스의 글자들을 이어붙인다.
 * "cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
 * "zpiaz"	[1, 2, 0, 0, 3]	"pizza"
 */

public class Solution_38 {
    public static void main(String[] args) {
        String answer = solution("zpiaz", new int[] {1, 2, 0, 0, 3});
        System.out.println(answer);
    }

    public static String solution(String my_string, int[] index_list) {
        StringBuilder builder = new StringBuilder();
        for ( int i : index_list ) {
            builder.append(my_string.charAt(i));
        }
        return builder.toString();
    }
}