/**
 * ClassName: Demo04
 * Package: PACKAGE_NAME
 * Description:
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的
 * 下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。
 *
 * @Author fgb
 * @Create 2023/12/15 12:42
 * @Version 1.0
 */
public class Demo04 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        strStr(haystack,needle);
    }

    public static int strStr(String haystack, String needle) {
        haystack.indexOf(needle);
        //haystack包含needle,返回第一次出现的角标
        if (haystack.contains(needle) == false){
            return -1;
        }//如果haystack不包含needle则返回-1

        return haystack.indexOf(needle);
    }

}
