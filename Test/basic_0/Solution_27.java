/**
 * 수 조작하기 1
 * control 은 w a s d 4개의 문자
 * w - n이 1 커짐
 * s - n이 1 작아짐
 * d - n이 10 커짐
 * a - n이 10 작아짐
 * 0 wsdawsdassw -1
 */

public class Solution_27 {
    public static void main(String[] args) {
        int answer = solution(0, "wsdawsdassw");
        System.out.println(answer);
    }

    public static int solution(int n, String control){

        char[] arr = control.toCharArray();
        for (char a : arr) {
            if ( a == 'w') n++;
            else if ( a == 's') n--;
            else if ( a == 'd') n += 10;
            else n -= 10;
        }
        return n;
    }
}