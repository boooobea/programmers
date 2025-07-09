/**
 * 더 크게 합치기
 * 연산 + 는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환
 * 12 + 3 = 123
 * 3 + 12 = 312
 * 양의정수 a, b가 주어졌을 때 더 큰값을 return
 * 9 91 991
 * 89 8 898
 */

public class Solution_14 {
    public static void main(String[] args) {
        int result = solution(89, 8);
        System.out.println(result);
    }

    public static int solution(int a, int b){
        String val1 = String.valueOf(a) + String.valueOf(b);
        String val2 = String.valueOf(b) + String.valueOf(a);

        int answer = Math.max(Integer.parseInt(val1), Integer.parseInt(val2));
        return answer;
    }
}