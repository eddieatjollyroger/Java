public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {40, 60, 10, 20, 30, 50, 4, 17};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        };
        int[] sortedArray = InsertionSort(array);


        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(sortedArray[i] + "\t");
        };
    }


    public static int[] InsertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int valueHolder = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > valueHolder){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = valueHolder;
        };
        return array;
    };
};
