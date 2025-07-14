/**
 * 등차수열의 특정한 항만 더하기
 * a, b의 길이가 n인 boolean 배열 included가 주어진다.
 * 첫째항이 a, 공차가 b인 등차수열에서 included[i]가 i+1항을 의미할 때
 * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return
 * 3 4 [true, false, false, true, true] 37
 * 7 1 [false, false, false, true, false, false, false] 10
 */

public class Solution_22 {
    public static void main(String[] args) {
        int answer = solution(7, 1, new boolean[]{false, false, false, true, false, false, false});
        System.out.println(answer);
    }

    public static int solution(int a, int d, boolean[] included ){
        int answer = 0;
        int value = a;
        for (int i = 0; i<included.length; i++){
            if (included[i] == true){
                answer += value;
            }
            value += d;
        }

        return answer;
    }
}