import java.util.Arrays;

/**
 * 수열과 구간 쿼리 3
 * arr, queries의 원소는 query를 나타내며 [i, j]이다.
 * arr[i]의 값과 arr[j]의 값을 서로 바꾼다.
 * arr [0,1,2,3,4]
 * queries [ [0,3], [1,2], [1,4] ]
 * return [3,4,1,0,2]
 */

public class Solution_29 {
    public static void main(String[] args) {
        int[] answer = solution(new int[] {0,1,2,3,4}, new int[][]{{0,3},{1,2},{1,4}});
        for ( int i : answer ) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr, int[][] queries){
        int [] answer = Arrays.copyOf(arr, arr.length);

        for (int i=0; i< queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];

            int temp = 0;

            temp = answer[b];
            answer[b] = answer[a];
            answer[a] = temp;
        }

        return answer;
    }
}