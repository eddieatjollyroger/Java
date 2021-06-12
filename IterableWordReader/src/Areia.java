import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Areia {
    public static void main(String[] args) throws IOException {

        IterableWordReader wordReader = new IterableWordReader("boas.txt");
        Iterator<Integer> it = wordReader.iterator();

        while (it.hasNext()){
            System.out.println(it.next() + " is the word");
        }
        System.out.println();
        for (Object w : wordReader){
            System.out.println(w + " is the word");
        }
    }
}
