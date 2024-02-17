package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void ifAmount900() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void ifAmount0() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void ifAmount5000() {
        assertEquals(service.remain(10000), 1000);
    }

    @Test
    public void ifAmount1000() {
        assertEquals(service.remain(1000), 0);
    }
}