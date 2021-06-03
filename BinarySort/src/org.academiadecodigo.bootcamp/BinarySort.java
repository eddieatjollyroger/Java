package org.academiadecodigo.bootcamp;

public class BinarySort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        BinarySort(array);
    }


    public static void BinarySort(int[] array) {
        int target = 7;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            double floorStart = Math.floor(start);
            double floorEnd = Math.floor(end);
            double mid = (floorStart + floorEnd) / 2;
            int midint = (int)mid;
            if (array[midint] == target) {
                System.out.println("found target at position " + midint);
                return;
            }
            else if (array[midint] < target) {
                start = midint + 1;
            }

            else if (array[midint] > target) {
                end = midint - 1;
            };

        };
    };
};
