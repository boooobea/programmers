import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 원소들의 곱과 합
 * num_list가 주어질 때, 모든 원소들의 곱이 원소의 제곱 보다 작으면 1 크면 0
 * 3,4,5,2,1 - 1
 * 5,7,8,3 - 0
 */

public class Solution_24 {
    public static void main(String[] args) {
        int answer = solution(new int[]{5,7,8,3});
        System.out.println(answer);
    }

    public static int solution(int[] num_list){

        //원소의 곱
        int multiply = Arrays.stream(num_list).reduce((a,b)-> a * b).getAsInt();
        System.out.println(multiply);
        //원소의 합의 제곱
        int sum = (int)Math.pow(Arrays.stream(num_list).sum(), 2);
        System.out.println(sum);

        return multiply < sum ? 1 : 0;
    }
}