/**
 * 코드 처리하기
 * code를 앞에서부터 읽으면서 문자가 1이면 mode를 변경, 시작할 때 mode는 0이며 return 하려는 ret가 빈 문자열이면 "EMPTY"반환
 * idx 0부터 code길이 -1 까지 1씩 키워가면서 code[idx]의 값에 따라 변경한다.
 * mode 0 > code[idx]가 1이 아니면 idx짝수일때 ret의 맨 뒤에 code[idx]를 추가
 *          code[idx]가 1이면 mode를 0에서 1로변경
 * mode 1 > code[idx]가 1이 아니면 idx 홀수일때 ret 맨 뒤에 code[idx]를 추가
 * mode에 따라 읽어가면서 문자열 ret을 만든다.
 * abc1abc1abc acbac
 */

public class Solution_21 {
    public static void main(String[] args) {
        String result = solution("abc1abc1abc");
        System.out.println(result);
    }

    public static String solution(String code){
        String ret = "";
        int mode = 0;
        char[] arr = code.toCharArray();

        for(int i=0; i<arr.length; i++){
                if (arr[i] == '1'){
                    mode = 1 - mode;
                }
                else {
                    if ( i%2 == mode ) ret += arr[i];
                }
        }

        if ( ret.equals("") ) return "EMPTY";
        return ret;
    }
}