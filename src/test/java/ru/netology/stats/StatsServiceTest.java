package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void testSumOfSales() {
        StatsService ss = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        int actual = ss.sumOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSalesAmount() {
        StatsService ss = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        int actual = ss.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService ss = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        int actual = ss.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService ss = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        int actual = ss.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOfAboveAverageSales() {
        StatsService ss = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        int actual = ss.countOfAboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOfBelowAverageSales() {
        StatsService ss = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        int actual = ss.countOfBelowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
