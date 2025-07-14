/**
 * 조건 문자열
 * 두 수가 n와 m일 때 크기 비교
 * 조건에 맞으면 1 아니면 0
 * < , = , 20, 50, 1
 * > !, 41, 78, 0
 */

public class Solution_19 {
    public static void main(String[] args) {
        int result = solution(">", "!", 41, 78);
        System.out.println(result);
    }

    public static int solution(String ineq, String eq, int n, int m){

        int answer = 0;

        if ( ineq.equals("<") ) {
            answer = eq.equals("=") ? ( n <= m ? 1 : 0): (n < m ? 1 : 0);
        }
        else {
            answer = eq.equals("!") ? ( n >= m ? 1 : 0): (n > m ? 1 : 0);
        }
        return answer;
    }
}