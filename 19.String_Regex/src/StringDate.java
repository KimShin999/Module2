import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String a = "Hello java regex 2-12-2018, hello world 12/12/2018";
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()){
            System.out.println(a.substring(matcher.start(),matcher.end()));
        }
    }
}
