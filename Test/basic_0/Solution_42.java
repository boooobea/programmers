import java.util.ArrayList;

/**
 * 배열 만들기
 * 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환
 * 변환한 정수값이 k보다 큰 값들을 담은 배열
 * ["0123456789","9876543210","9999999999999"]	50000	5	5	[56789, 99999]
 */

public class Solution_42 {
    public static void main(String[] args) {
        int[] answer = solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> intArr = new ArrayList<>();
        for ( String str : intStrs ) {
            //int start = Math.max(0, s);
            //int end = Math.min(str.length(), start + l);
            int value = Integer.parseInt(str.substring(s, s+l));
            if ( k <= value ) intArr.add(value);
        }
        int[] answer = intArr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}