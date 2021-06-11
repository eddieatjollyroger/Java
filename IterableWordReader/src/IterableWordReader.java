import java.util.Arrays;
import java.util.Iterator;

public class IterableWordReader implements Iterable {
    private String[] words;


    public IterableWordReader(String[] words) {
       this.words = words;

    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int i = -1;
            @Override
            public boolean hasNext() {
                i++;
                if ( i < words.length){

                return true;
            }
                return false;
            }
            @Override
            public Object next() {

                return words[i];
            }
        };
    }
}
