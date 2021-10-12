package xiaoz.algorithm.learn.base;

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
