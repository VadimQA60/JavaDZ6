package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class  StatsServiceTest {

    @Test
    void resultMinMonthTest() {
        StatsService service = new  StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultTotalOFallSalesTest() {
        StatsService service = new  StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.TotalOFallSales(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultAllAmountTest() {
        StatsService service = new  StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.AllMount(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultYearAverageTest() {
        StatsService servise = new  StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = servise.YearAverage(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultAverageAboveTest() {
        StatsService service = new  StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.AverageAbove(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void resultAverageBelowTest() {
        StatsService service = new  StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.AverageBellow(sales);
        Assertions.assertEquals(expected, actual);


    }

}

