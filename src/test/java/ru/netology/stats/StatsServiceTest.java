package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void resultMinMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultTotalOFallSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.totalOFallSales(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultallMountTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.allMount(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultyearAverageTest() {
        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = servise.yearAverage(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultaverageAboveTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.averageAbove(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultaverageBelowTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.averageBellow(sales);
        Assertions.assertEquals(expected, actual);


    }

}

