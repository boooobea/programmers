
/**
 * 접미사인지 확인하기
 * is_suffix가 my_string의 접미사라면 1 아니면 0 을 return
 * "banana"	"ana"	1
 * "banana"	"nan"	0
 * "banana"	"wxyz"	0
 * "banana"	"abanana"	0
 */

public class Solution_46 {
    public static void main(String[] args) {
        int answer = solution2("banana", "nan");
        System.out.println(answer);
    }
    public static int solution(String my_string, String is_suffix) {

        int answer = 0;
        for ( int i = 1; i < my_string.length()+1; i++ ) {
            String suffix = my_string.substring(my_string.length()-i, my_string.length());
            if ( suffix.equals(is_suffix) ) {
                answer = 1;
            }
        }
        return answer;
    }

    public static int solution2(String my_string, String is_suffix) {

        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}