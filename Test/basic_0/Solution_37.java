import java.util.Arrays;

/**
 * 주사위 게임 3
 * 1부터 6까지 숫자가 적힌 주사위가 네 개가 있을 때
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻는다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 * a	b	c	d	result
 * 2	2	2	2	2222
 * 4	1	4	4	1681
 * 6	3	3	6	27
 * 2	5	2	6	30
 * 6	4	2	5	2
 */

public class Solution_37 {
    public static void main(String[] args) {
        int answer = solution(6,4,2,5);
        System.out.println(answer);
    }

    public static int solution(int a, int b, int c, int d) {

        int[] arr = new int[]{a, b, c, d};
        Arrays.sort(arr);

        if ( arr[0] == arr[3] ) return 1111 * arr[0];

        // (10 × p + q)2
        if ( arr[0] == arr[2] ) {
            return (int)Math.pow(10 * arr[0] + arr[3],2);
        }
        if ( arr[1] == arr[3] ) {
            return (int)Math.pow(10 * arr[1] + arr[0],2);
        }

        if ( arr[0] == arr[1] && arr[2] == arr[3] ) {
            return (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
        }

        if (arr[0] == arr[1]) return arr[2] * arr[3];
        if (arr[1] == arr[2]) return arr[0] * arr[3];
        if (arr[2] == arr[3]) return arr[0] * arr[1];

        return arr[0];
    }
}