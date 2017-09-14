package com.b1ngoos.speaking_clock.test;

import com.b1ngoos.speaking_clock.WordClock;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordClockTest {

    @Test
    public void test_getTimeText_fullHour() {
        assertThat("05:00", WordClock.getTimeText(5, 0), is("five"));
    }

    @Test
    public void test_getTimeText_someTime() {
        assertThat("09:30", WordClock.getTimeText(9, 30), is("half past nine"));
    }

    @Test
    public void test_getTimeText_secondHourHalve() {
        assertThat("15:46", WordClock.getTimeText(15, 46), is("ten to four"));
    }

}