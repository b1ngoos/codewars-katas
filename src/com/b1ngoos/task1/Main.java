package com.b1ngoos.task1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";

        longest(a, b);
    }

    public static String longest(String a, String b) {

        SortedSet<Character> set = new TreeSet<Character>(new Comparator<Character>() {
            public int compare(Character character1, Character character2) {
                return character1 - character2;
            }
        });

        addCharArrayToSet(a.toCharArray(), set);
        addCharArrayToSet(b.toCharArray(), set);

        System.out.println(set);

        return "";
    }

    private static void addCharArrayToSet(char[] chars, SortedSet set) {
        for (Character character: chars) {
            set.add(character);
        }
    }


}
