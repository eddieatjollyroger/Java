import java.awt.font.NumericShaper;
import java.util.Iterator;

public class RangeTest {
    public static void main(String[] args) {
        Range r = new Range(-5, 5);
        Iterator<Integer> it = r.iterator();

    while (it.hasNext()){
        System.out.println("While iteration: " + it.next());

    }
    for (Integer i : r){
        System.out.println("Iterated: " + i);

    }
    }
}
