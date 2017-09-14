package com.b1ngoos.equal_sides_of_an_array;


public class Kata {

    public static void main(String[] args) {
        findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1});
    }

    public static int findEvenIndex(int[] arr) {

        int index = -1;

        int sumRight = 0, sumLeft = 0;

        for (int repeat = 0; repeat < arr.length - 1; repeat++) {

            ++index;

            for(int rIndex = 0; rIndex < index; rIndex++) {
                sumRight += arr[rIndex];
            }

            for (int lIndex = index + 1; lIndex < arr.length; lIndex++) {
                sumLeft += arr[lIndex];
            }

            if (sumRight == sumLeft)
                return index;

            sumLeft = sumRight = 0;
        }

        index = -1;

        return index;
    }

}
