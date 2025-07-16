import java.util.Arrays;

/**
 * 마지막 두 원소
 * num_list의 마지막 원소가 그 전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
 * 마지막 원소가 그 전 원소보다 크지 않다면 마지막 원소를 두배한 값을 추가하여 return
 * 2, 1, 6 -> 2, 1, 6, 5
 * 5,2,1,7,5 -> 5,2,1,7,5,10
 */

public class Solution_26 {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{5,2,1,7,5});
        for ( int i : answer ) System.out.print(i);
    }

    public static int[] solution(int[] num_list){

        int[] answer = new int[num_list.length+1];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        int last = num_list[num_list.length-1];
        int beforeLast = answer[num_list.length-2];

        int max = last > beforeLast ? last - beforeLast : last * 2;
        answer[num_list.length] = max;

        return answer;
    }
}