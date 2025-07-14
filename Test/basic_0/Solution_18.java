/**
 * 홀짝에 따라 다른 값 반환하기
 * n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return
 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 값을 return
 * 7 16
 * 10 220
 */

public class Solution_18 {
    public static void main(String[] args) {
        int result = solution(10);
        System.out.println(result);
    }

    public static int solution(int n){

        boolean flag = n%2==0;
        int answer = 0;
        for ( int i=0; i<n+1; i++ ){
            if ( !flag ) {
                if (i%2==1) {
                    answer += i;
                }
            }
            else {
                if (i%2==0) {
                    answer += i*i;
                }
            }
        }

        return answer;
    }
}