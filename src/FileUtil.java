import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUtil {

    public static void print(String file,String pattern) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String s;
            int i = 0;
            while ((s = in.readLine()) != null) {
                String row_id=String.format("%4d",i++);
                s=Colori.ANSI_GREEN.highligh(s,pattern);
                System.out.printf("%s...%s\n",Colori.ANSI_GREEN.colora(row_id),s);
            }
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dump() {

    }
}
