/**
 * ClassName: Demo05
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author fgb
 * @Create 2023/12/15 13:00
 * @Version 1.0
 */
public class Demo05 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Abc:Cba"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        //删除字符串 s 中的所有非字母和非数字字符
        StringBuilder sb = new StringBuilder(s);

        String sbReverse = sb.reverse().toString();
        //反转数组
        System.out.println(s);
        return s.equals(sbReverse);
    }

}
