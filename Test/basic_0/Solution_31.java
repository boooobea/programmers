import java.util.Arrays;

/**
 * 수열과 구간 쿼리 4
 * arr, queries의 원소는 query를 나타내며 [s, e, k]이다.
 * query마다 순서대로 s <= i <= e 인 모든 i에 대해 i가 k의 배수면 arr[i]에 + 1
 * 답이 존재하지 않으면 -1
 * arr [0, 1, 2, 4, 3]
 * queries 	[[0, 4, 1],[0, 3, 2],[0, 3, 3]]
 * return [3, 2, 4, 6, 4]
 */

public class Solution_31 {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{0,1,2,4,3}, new int[][]{{0,4,1},{0,3,2},{0,3,3}});
        for ( int i : answer ) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr, int[][] queries){
        int [] answer = Arrays.copyOf(arr, arr.length);

        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            int k = q[2];

            for ( int i=s; i<=e; i++ ) {
                if ( i%k == 0 ) answer[i] += 1;
            }
        }
        return answer;
    }
}