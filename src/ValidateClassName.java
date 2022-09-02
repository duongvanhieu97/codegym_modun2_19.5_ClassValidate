import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^[A,C,P]\\d{4}[GHIMLK]$" ;
    public ValidateClassName() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate (String string) {
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
