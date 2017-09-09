package com.b1ngoos.create_phone_number;

import java.util.Arrays;

public class Kata {

    public static String createPhoneNumber(int[] numbers) {

        StringBuilder phone = new StringBuilder();

        for (int num: numbers) {
            phone.append(num);
        }

        // (123) 456-7890
        phone.insert(0, '(');
        phone.insert(4, ')');
        phone.insert(5, " ");
        phone.insert(9, "-");

        return phone.toString();
    }

}
