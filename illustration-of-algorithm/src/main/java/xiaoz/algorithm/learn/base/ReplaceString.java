package xiaoz.algorithm.learn.base;

/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 
 */
public class ReplaceString {
    public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }

    public String replaceSpaceMethod2(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                builder.append("%20");
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
