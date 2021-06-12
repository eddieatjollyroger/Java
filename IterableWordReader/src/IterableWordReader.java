import java.io.*;
import java.util.Arrays;
import java.util.Iterator;

public class IterableWordReader implements Iterable {
    private String[] words;
    FileReader reader;
    BufferedReader bReader;
    private String line = "";

    public IterableWordReader(String filename) throws IOException {

        reader = new FileReader(filename);
        bReader = new BufferedReader(reader);
        if ((line = bReader.readLine()) != null){
            words = line.split(" ");
        }
    }

    @Override
    public Iterator iterator() {

        return new Iterator() {
            int x = -1;
            @Override
            public boolean hasNext() {
                x++;
                if ( x < words.length){
                    return true;
                }
                return false;
            }
            @Override
            public Object next() {
            return words[x];
            }

        };
    }
}
