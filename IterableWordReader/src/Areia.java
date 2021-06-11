import java.util.Iterator;

public class Areia {
    private static final String STRING = "beuas neuas teuas feuas";
    public static void main(String[] args) {

       String[] words = STRING.split(" ");

        IterableWordReader wordReader = new IterableWordReader(words);
        Iterator<Integer> it = wordReader.iterator();

        while (it.hasNext()){
            System.out.println("word is " + it.next());
        }

        for (Object w : wordReader){
            System.out.println("word is " + w);
        }
    }
}
