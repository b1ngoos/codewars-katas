package com.b1ngoos.money_money_money.test;

import com.b1ngoos.money_money_money.Money;
import org.junit.Assert;

import static org.junit.Assert.*;

public class MoneyTest {

    @org.junit.Test
    public void test() {
        System.out.println("Fixed Tests calculateYears");
        Assert.assertEquals(3, Money.calculateYears(1000,0.05,0.18,1100));
        assertEquals(14 , Money.calculateYears(1000,0.01625,0.18,1200));
        assertEquals(0, Money.calculateYears(1000,0.05,0.18,1000));
    }

}