public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {4, 2, 6, 1, 5, 3};
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            System.out.println(x + "\t");
        }
        SelectionSort(array);
    }


    public static void SelectionSort(int[] array) {

        int counter = 0;
        while (counter < array.length - 1){
            for (int i = 0; i < array.length - 1; i++){
                if (array[i+1] < array[i]){
                    int tempValue = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tempValue;

                }

            }
            counter++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println( "\t" + array[i]);
        };

    };
};