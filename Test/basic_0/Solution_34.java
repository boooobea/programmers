import java.util.ArrayList;
import java.util.List;

/**
 * 콜라츠수열 만들기
 * x에 대해서 현재 값이 x이면 x가 짝수일때 2로 나누고
 * x가 홀수일때 3*x+1로 계산을 반복
 * 언젠가 반드시 x가 1이 되는 문제
 * 10 [10,5,16,8,4,2,1]
 */

public class Solution_34 {
    public static void main(String[] args) {
        int[] answer = solution(10);
        for ( int i : answer ) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while ( n != 1 ) {
            if ( n % 2 == 0 ) {
                n/= 2;
            }
            else {
                n = 3 * n + 1;
            }
            list.add(n);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}