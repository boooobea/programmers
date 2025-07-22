import java.util.ArrayList;

/**
 * 배열 만들기 2
 * l 이상 r 이하의 정수중에서 숫자 0과 5로만 이루어진 모든 정수를
 * 오름차순으로 저장한 배열을 return
 * 정수가 없다면 -1
 * 5	555	[5, 50, 55, 500, 505, 550, 555]
 * 10	20	[-1]
 */

public class Solution_32 {
    public static void main(String[] args) {
        int[] answer = solution(10, 20);
        for ( int i : answer ) {
            System.out.println(i);
        }
    }

    public static int[] solution(int l, int r) {

        int[] answer = {};
        ArrayList<Integer> array = new ArrayList<>();

        for ( int i=l; i<=r; i++ ) {
            if ( String.valueOf(i).matches("[05]+") ) {
                array.add(i);
            }
        }
        answer = array.stream().mapToInt(Integer::intValue).toArray();

        if ( answer.length == 0 ) {
            return new int[]{-1};
        }
        return answer;
    }
}