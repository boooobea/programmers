/**
 * 문자열 여러번 뒤집기
 * queries의 원소는 [s, e] 형태로 my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미이다.
 * "rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"
 */

public class Solution_41 {
    public static void main(String[] args) {
        String answer = solution("rermgorpsam", new int[][] {{2,3}, {0,7}, {5,9}, {6,10}});
        System.out.println(answer);
    }

    public static String solution(String my_string, int[][] queries) {

        StringBuilder sb = new StringBuilder(my_string);
        for (int[] r : queries) {
            int s = r[0];
            int e = r[1];

            String rev = new StringBuilder(sb.substring(s, e + 1))
                    .reverse()
                    .toString();
            sb.replace(s, e + 1, rev);
        };
        return sb.toString();
    }
}