import java.util.ArrayList;
import java.util.List;

/**
 * 배열 만들기 4
 * 변수 i의 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 실행
 * stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i+1
 * stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i + 1
 * stk에 원소가 있고 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막원소를 stk에서 제거
 * [1,4,2,5,3] [1,2,3]
 */

public class Solution_35 {
    public static void main(String[] args) {
        int[] answer = solution(new int[] {1,4,2,5,3});
        for ( int i : answer ) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr) {

        List <Integer> list = new ArrayList<>();

        for ( int i=0; i<arr.length; i++) {
            if ( list.isEmpty() ) {
                list.add(arr[i]);
            }
            else if ( list.get(list.size()-1) < arr[i] ) {
                list.add(arr[i]);
            }
            else {
                list.remove( list.get(list.size()-1) );
                i--;
            }

        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}