
/**
 * ClassName: Demo03
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author fgb
 * @Create 2023/12/13 10:48
 * @Version 1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        String[] strs = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // 初始化最长公共前缀为数组的第一个字符串
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // 如果当前字符串不包含前缀，则缩短前缀
                prefix = prefix.substring(0, prefix.length() - 1);
                //  返回一个新的字符串,从0开始,截取到prefix.length() - 1的字符串
                if (prefix.isEmpty()) {
                    //如果prefix为空是true,返回""
                    return "";
                }
            }
        }
        return prefix;
    }
}


