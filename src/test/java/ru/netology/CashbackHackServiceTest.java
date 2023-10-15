package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testIfAmountNegative() {
        Assert.assertEquals(service.remain(-1), 1001);
    }

    @Test
    public void testIfAmountZero() {
        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testIfAmountOne() {
        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void testIfAmountHalf() {
        Assert.assertEquals(service.remain(500), 500);
    }

    @Test
    public void testIfAmountLessBorderBoundary() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void testIfAmountEqualBoundary() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testIfAmountAboveBorderBoundary() {
        Assert.assertEquals(service.remain(1001), 999);
    }


}