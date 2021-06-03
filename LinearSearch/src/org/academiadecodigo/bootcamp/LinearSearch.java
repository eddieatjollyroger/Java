package org.academiadecodigo.bootcamp;

public class LinearSearch {
    public static void main(String[] args) {
        int[] myArray = {4, 2, 7, 1, 8};
        LinearSearching(myArray, 1);
    }
    public static void LinearSearching (int[] array, int target){
for (int i = 0; i < array.length; i++) {
if (array[i] == target) {
    System.out.println("Your value is in position number " + i);
}

}

    }
}
