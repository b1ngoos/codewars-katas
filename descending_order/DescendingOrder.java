package com.b1ngoos.descending_order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        List<Integer> array = getListFromInt(num);
        array.sort(Collections.reverseOrder());

        return getIntFromList(array);
    }

    private static List<Integer> getListFromInt(int a) {
        List<Integer> array = new ArrayList<>();

        do{
            array.add(a % 10);
            a /= 10;
        } while  (a > 0);

        return array;
    }

    private static int getIntFromList(List<Integer> array) {
        int result = array.get(0);
        if(array.size() > 1) {
            for (int index = 1; index < array.size(); index++) {
                result = result * 10 + array.get(index);
            }
        }

        return result;
    }
}
