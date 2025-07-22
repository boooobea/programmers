/**
 * 수 조작하기 2
 * numLog 은 w a s d 4개의 문자
 * numLog[i]는 numLog[0]로부터 i번 조작 한 결과가 저장
 * w : 1을 더한다
 * s : 1을 뺀다
 * d : 10을 더한다
 * a : 10을 뺀다
 * [0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]	"wsdawsdassw"
 */

public class Solution_28 {
    public static void main(String[] args) {
        String answer = solution(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1});
        System.out.println(answer);
    }

    public static String solution(int[] numLog){
        String answer = "";

        for (int i = 0; i < numLog.length - 1; i++) {
            int j = numLog[i + 1] - numLog[i];

            if (j == 1) {
                answer += "w";
            } else if (j == -1) {
                answer += "s";
            } else if (j == 10) {
                answer += "d";
            } else if (j == -10) {
                answer += "a";
            }
        }
        return answer;
    }
}