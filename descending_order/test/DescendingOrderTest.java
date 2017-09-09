package com.b1ngoos.descending_order.test;

import com.b1ngoos.descending_order.DescendingOrder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingOrderTest {

    @Test
    public void test_01() {
        Assert.assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

}