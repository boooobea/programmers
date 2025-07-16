import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 주사위 게임2
 * 1부터 6까지 적힌 주사위 3개가 있다. 각각의 숫자를 a, b, c라고 할 때
 * 세 숫자가 모두 다르다면 a + b + c
 * 수 숫자가 같고 다른 숫자가 다르다면 a + b + c * (a2 + b2 + c2)
 * 세 숫자가 모두 같다면 (a + b + c) * (a*2 + b*2 + c*2 ) * (a*3 + b*3 + c*3);
 * 2 6 1 - 9
 * 5 3 3 - 473
 * 4 4 4 - 110592
 */

public class Solution_23 {
    public static void main(String[] args) {
        int answer = solution(4,4,4);
        System.out.println(answer);
    }

    // Math.pow() -> 제곱의 값 구하는 메소드
    // stream() -> collect set으로 변경
    public static int solution(int a, int b, int c){

        int val1 = a + b + c;
        int val2 = (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        int val3 = (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));

        int answer = 0;

        Set<Integer> intSet = Arrays.stream(new int[]{a, b, c}).boxed().collect(Collectors.toSet());

        answer = (intSet.size() == 1) ? val1 * val2 * val3 : (intSet.size() == 2) ? val1 * val2 : val1;

        return answer;
    }
}