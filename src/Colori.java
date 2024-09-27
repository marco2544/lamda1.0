import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Colori {
    public static final Colori ANSI_Reset = new Colori("\u001B[0m");
    public static final Colori ANSI_BLACK = new Colori("\u001B[30m");
    public static final Colori ANSI_RED = new Colori("\u001B[31m");
    public static final Colori ANSI_GREEN = new Colori("\u001B[32m");
    public static final Colori ANSI_BLUE = new Colori("\u001B[34m");
    private final String ansi_code;
    public Colori(String ansi_code){
        this.ansi_code=ansi_code;
    }

    @Override
    public String toString() {
        return ansi_code;
    }

    public String colora(String s){
        return String.format("%s%s%s",ansi_code, s, ANSI_Reset);
    }

    public void print(String s){
        System.out.print(colora(s));
    }

    public String highligh(String str, String pattern) {
        StringBuilder result = new StringBuilder();
        Pattern regexPattern = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regexPattern.matcher(str);

        int lastIndex = 0;
        while(matcher.find()) {
            result.append(str.substring(lastIndex, matcher.start()));
            result.append(this.colora(matcher.group()));
            lastIndex = matcher.end();
        }

        result.append(str.substring(lastIndex));

        return result.toString();
    }


}
