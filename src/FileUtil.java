import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileUtil {

    public static void print(String file,RowProcessor rp) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String s;
            int i = 0;
            while ((s = in.readLine()) != null) {

                rp.execute(s,i);
                i++;
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
