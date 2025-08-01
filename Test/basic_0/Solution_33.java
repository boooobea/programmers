import java.util.ArrayList;
import java.util.List;

/**
 * 카운트 업
 * start_num 부터 end_num까지의 숫자를 차례로 담은 리스트를 return
 * 3 10 [3,4,5,6,7,8,9,10]
 */

public class Solution_33 {
    public static void main(String[] args) {
        int[] answer = solution2(3, 10);
        for ( int i : answer ) {
            System.out.println(i);
        }
    }

    public static int[] solution(int start_num, int end_num) {

        List<Integer> list = new ArrayList<>();
        for (int i=start_num; i<=end_num; i++) {
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int start_num, int end_num) {

        int[] answer = new int[end_num - start_num + 1];
        for (int i=0; i<= end_num - start_num; i++) {
            answer[i] = start_num + i;
        }
        return answer;
    }
}