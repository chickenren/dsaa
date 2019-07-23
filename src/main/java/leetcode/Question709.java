package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Description：
 *
 * @author 吴瑾 ( )
 * @version 1.0 2019-07-05 15:39 by 吴瑾 ( ) 创建
 */
public class Question709 {
    public static void main(String[] args) {
        System.out.println(toLowerCase("DjofwDlkjDKLSi"));
    }

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 'A' && chars[i] < 'Z') {
                char c = (char) (chars[i] + 32);
                sb.append(c);
            }else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
