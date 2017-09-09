package com.b1ngoos.task2;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[]{"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
    }

    public static String longestConsec(String[] strarr, int k) {

        if(strarr.length == 0 || k > strarr.length || k <= 0) return "";

        int startIndex = getStartIndex(strarr, k);

        return createResultString(strarr, startIndex, k);
    }

    private static int getStartIndex(String[] strarr, int k) {

        int maxLength = 0;
        int startIndex = -1;

        for (int index = 0; index <= strarr.length - k; index++) {
            int currentSum = calcSum(strarr, index, k);

            if(currentSum > maxLength) {
                maxLength = currentSum;
                startIndex = index;
            }
        }

        return startIndex;
    }

    private static String createResultString(String[] strarr, int startIndex, int count) {

        String res = new String();

        for(int index = startIndex; index < startIndex + count; index++) {
            res += strarr[index];
        }

        return res;
    }

    private static int calcSum(String[] strarr, int startIndex, int count) {

        int res = 0;

        for(int index = startIndex; index < startIndex + count; index++) {
            res += strarr[index].length();
        }

        return res;
    }
}
