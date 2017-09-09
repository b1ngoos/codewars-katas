package com.b1ngoos.two_to_one;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        SortedSet<Character> set = new TreeSet<Character>(new Comparator<Character>() {
            public int compare(Character character1, Character character2) {
                return character1 - character2;
            }
        });

        addCharArrayToSet(s1.toCharArray(), set);
        addCharArrayToSet(s2.toCharArray(), set);

        return convertSetToString(set);
    }

    private static void addCharArrayToSet(char[] chars, SortedSet set) {
        for (Character character: chars) {
            set.add(character);
        }
    }

    private static String convertSetToString(Set<Character> set) {
        StringBuilder result = new StringBuilder();

        for (Character character: set) {
            result.append(character);
        }

        return result.toString();
    }
}
