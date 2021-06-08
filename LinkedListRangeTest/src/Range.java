import java.util.Iterator;
import java.util.LinkedList;

public class Range implements Iterable<Integer> {
    private int min;
    private int max;
    private int head;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
        this.head = min - 1;
    }

    public void iterate(int min, int max) {

    }

    @Override
    public Iterator iterator() {
        return new RangeIterator();
    }

    public class RangeIterator implements Iterator<Integer> {
        private int counter = min-1;
        @Override
        public boolean hasNext() {
            if (counter >= max) {
                System.out.println("troas");
                return false;
            }
            System.out.println("noas");
            return true;
        }

        @Override
        public Integer next() {

                counter++;

                return counter;



        }
    }
}
