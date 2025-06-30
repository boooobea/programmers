// 문자열 겹쳐쓰기
// 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
// "He11oWor1d"	"lloWorl"	2	"HelloWorld"
// "Program29b8UYP"	"merS123"	7	"ProgrammerS123"

public class Solution_9 {
    public static void main(String[] args) {
        String str = solution("Program29b8UYP", "merS123", 7);
        System.out.println(str);
    }

    public static String solution(String my_string, String overwrite_string, int s) {

        String start = my_string.substring(0, s);
        String end = my_string.substring(s+overwrite_string.length(), my_string.length());
        return start + overwrite_string + end;
    }
}