import java.util.ArrayList;
import java.util.List;

/**
 * 간단한 논리연산
 * x1, x2, x3, x4
 * (x1 ∨ x2) ∧ (x3 ∨ x4)
 *
 */

public class Solution_36 {
    public static void main(String[] args) {
        boolean answer = solution2(false, true, true, true);
        System.out.println(answer);
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

        boolean val1 = (x1==true || x2==true ) ? true : false;
        boolean val2 = (x3==true || x4==true ) ? true : false;
        return val1 == true && val2 == true ? true : false;
    }

    public static boolean solution2(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean val1 = (x1||x2);
        boolean val2 = (x3||x4);
        return val1 && val2;
    }

}