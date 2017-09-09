package com.b1ngoos.vasya_clerk;

public class Line {

    public static String Tickets(int[] peopleInLine) {
        // count of banknotes
        int countOf25 = 0, countOf50 = 0;

        for (int index = 0; index < peopleInLine.length; index++) {

            switch (peopleInLine[index]) {
                case 25: {
                    countOf25++;
                    break;
                }
                case 50: {
                    //-25
                    if (countOf25 > 0) {
                        countOf25--;
                    } else {
                        return "NO";
                    }
                    countOf50++;
                    break;
                }
                case 100: {
                    //-50 -25
                    if (countOf50 > 0) {
                        countOf50--;

                        if (countOf25 > 0) {
                            countOf25--;
                        } else return "NO";

                    } else
                        //-25 -25 -25
                        if (countOf25 > 2)
                            countOf25 -= 3;
                        else
                            return "NO";
                    break;
                }
            }
        }
        return "YES";
    }
}