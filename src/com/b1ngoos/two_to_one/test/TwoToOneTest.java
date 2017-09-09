package com.b1ngoos.two_to_one.test;

import com.b1ngoos.two_to_one.TwoToOne;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoToOneTest {

        @Test
        public void test() {
            System.out.println("longest Fixed Tests");
            assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
            assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
            assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
        }
}