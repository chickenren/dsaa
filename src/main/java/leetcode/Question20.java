package leetcode;

import java.util.Stack;

/**
 * Description：ascII (=40 )=41 {=123 }=125 [=91 ]=93
 *
 * @author 吴瑾
 * @version 1.0 2019-07-15 16:37 by 吴瑾  创建
 */
public class Question20 {
    public static void main(String[] args) {
        String s = "{}]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        char[] temp = new char[chars.length / 2 + 1];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 40 || chars[i] == 123 || chars[i] == 91) {
                temp[count] = chars[i];
                count++;
            } else {
                if (count == 0) return false;
                char stackTop = temp[count - 1];
                if ((chars[i] == 41 && stackTop != 40) ||
                        (chars[i] == 125 && stackTop != 123) ||
                            (chars[i] == 93 && stackTop != 91)) return false;
                count--;
            }

        }
        return count == 0;

    }
}
