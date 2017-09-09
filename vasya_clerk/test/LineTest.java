package com.b1ngoos.vasya_clerk.test;

import com.b1ngoos.vasya_clerk.Line;
import org.junit.Assert;
import org.junit.Test;

public class LineTest {
    @Test
    public void test1() {
        Assert.assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        Assert.assertEquals("NO", Line.Tickets(new int []{25, 100}));
    }
}