/* 두 수의 연산값 비교하기
* 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
* 12 ⊕ 3 = 123
* 3 ⊕ 12 = 312
* 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
* 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
* 2	91	364
* */

public class Solution_10 {
    public static void main(String[] args) {
        int result  = solution(02 , 01);
        System.out.println(result);
    }

    public static int solution(int a, int b) {
        int num1 = Integer.parseInt( (String.valueOf(a) + String.valueOf(b)) );
        int num2 = 2 * a * b;
        int result = 0;
        if ( num1 == num2 ) {
            result = num1;
        } else {
            result = Integer.max(num1, num2);
        }
        return result;
    }
}