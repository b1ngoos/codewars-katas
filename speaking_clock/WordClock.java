package com.b1ngoos.speaking_clock;

public class WordClock {

    public static String getTimeText(int h, int m) {

        while(m % 5 != 0)
            m++;

        if(m == 60) {
            h++;
            m -= 60;
        }

        if(h > 12 && h != 24) {
            h -= 12;
        }

        StringBuilder result = new StringBuilder();

        if (m > 0) {

            if( m <= 30 ){
                result.append(getMinutesName(m) + " past ");
            } else {
                m = 60 - m;
                result.append(getMinutesName(m) + " to ");

                if (h == 12) {
                    h = 1;
                } else {
                    ++h;
                }
            }
        }

        result.append(getHoursName(h));

        return result.toString();
    }

    private static String getMinutesName(int m) {

        String name = "";
        switch (m) {
            case 5: name = "five"; break;
            case 10: name = "ten"; break;
            case 15: name = "quarter"; break;
            case 20: name = "twenty"; break;
            case 25: name = "twenty-five"; break;
            case 30: name = "half"; break;
        }

        return name;
    }

    private static String getHoursName(int m) {

        String name = "";
        switch (m) {
            case 1: name = "one"; break;
            case 2: name = "two"; break;
            case 3: name = "three"; break;
            case 4: name = "four"; break;
            case 5: name = "five"; break;
            case 6: name = "six"; break;
            case 7: name = "seven"; break;
            case 8: name = "eight"; break;
            case 9: name = "nine"; break;
            case 10: name = "ten"; break;
            case 11: name = "eleven"; break;
            case 12: name = "noon"; break;
            case 0:
            case 24: name = "midnight"; break;
        }

        return name;
    }
}
