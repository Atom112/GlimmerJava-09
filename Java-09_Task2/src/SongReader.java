import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SongReader {
    public static void main(String[] args) {


        try {
            BufferedReader br = new BufferedReader(new FileReader("Songs.txt"));
            String line;
            while((line= br.readLine()) != null){
                System.out.println(line);   //逐行打印读取到的歌曲信息
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
