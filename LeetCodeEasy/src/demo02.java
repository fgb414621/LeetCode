import javax.net.ssl.SSLServerSocket;

/**
 * ClassName: demo02
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author fgb
 * @Create 2023/12/12 12:43
 * @Version 1.0
 * <p>
 * 27. 移除元素
 */
public class demo02 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        lengthOfLastWord(s);
    }


    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        //用空格拆分字符串
        return words[words.length - 1].length();
        //返回最后一个单词的长度
    }
}