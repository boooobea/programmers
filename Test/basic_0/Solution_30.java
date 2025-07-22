
/**
 * 수열과 구간 쿼리 2
 * arr, queries의 원소는 query를 나타내며 [s, e, k]이다.
 * query마다 순서대로 s <= i <= e 인 모든 i에 대해 k보다 크면서 작은 arr[i]를 찾는다.
 * 답이 존재하지 않으면 -1
 * arr [0,1,2,4,3]
 * queries [[0, 4, 2],[0, 3, 2],[0, 2, 2]]
 * return [3, 4, -1]
 */

public class Solution_30 {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{0,1,2,4,3}, new int[][]{{0,4,2},{0,3,2},{0,2,2}});
        for ( int i : answer ) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr, int[][] queries){
        int [] answer = new int [queries.length];

        for (int i=0; i< queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;
            for ( int j=s; j<=e; j++ ) {
                if ( arr[j] < min && k < arr[j] ) {
                    min = arr[j];
                }
            }

            answer[i] = min != Integer.MAX_VALUE ? min :  -1;
        }
        return answer;


    }
}