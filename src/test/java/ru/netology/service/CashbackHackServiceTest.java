package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void ifAmount900() {
        assertEquals(service.remain(900), 100);
    }

    @org.junit.Test
    public void ifAmount0() {
        assertEquals(service.remain(1), 999);
    }

    @org.junit.Test
    public void ifAmount5000() {
        assertEquals(service.remain(10000), 1000);
    }

    @org.junit.Test
    public void ifAmount1000() {
        assertEquals(service.remain(1000), 0);
    }
}