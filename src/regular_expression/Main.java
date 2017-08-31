package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Author: 10392
 * Date: 2017/8/30
 * Time: 9:50
 */
public class Main {
    public static void main(String[] args) {
        String str = "你好";
        String pattern = "^[\\u4e00-\\u9fa5]+$";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}
