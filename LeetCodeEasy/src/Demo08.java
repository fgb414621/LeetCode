import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Demo08
 * Package: PACKAGE_NAME
 * Description:
 *给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次
 * @Author fgb
 * @Create 2023/12/22 16:59
 * @Version 1.0
 */
public class Demo08 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
//        初始化一个名为map的空HashMap，键类型为Character，值类型为Integer。
        for (char a : magazine.toCharArray()) {
            //遍历magazine中的每个字符
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (char b : ransomNote.toCharArray()) {
            if (map.getOrDefault(b, 0) > 0) {
                map.put(b, map.get(b) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
    }
