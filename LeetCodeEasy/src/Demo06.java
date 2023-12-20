import java.util.Arrays;

/**
 * ClassName: Demo06
 * Package: PACKAGE_NAME
 * Description:
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * <p>
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * @Author fgb
 * @Create 2023/12/20 8:52
 * @Version 1.0
 */
public class Demo06 {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        //如果s的长度大于t的长度返回false
        //挂掉了,测试用例s字符串为空,添加一个字符串s长度为0的条件
        //如果s长度为0就代表字符串s是字符串t的子序列
        if (s.length() == 0){
            return true;
        }
        int i = 0;
        for (int j = 0; j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                //如果字符串s上的角标i的字符等于字符串t上的角标j的字符,i++
                i++;
            }
            if (i == s.length()) {
                //如果i等于s的长度说明s是字符串t的子序列
                return true;
            }
        }
        return false;

    }
}
