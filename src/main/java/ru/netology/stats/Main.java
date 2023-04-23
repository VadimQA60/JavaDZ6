package ru.netology.stats;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int resultMin = service.minSales(sales);
        int TotalOFallSales = service.TotalOFallSales(sales);
        long AllMount = service.AllMount(sales);
        long YearAverage = service.YearAverage(sales);
        long AverageAbove = service.AverageAbove(sales);
        long AverageBellow = service.AverageBellow(sales);

        System.out.println(resultMin);
        System.out.println(TotalOFallSales);
        System.out.println(AllMount);
        System.out.println(YearAverage);
        System.out.println(AverageAbove);
        System.out.println(AverageBellow);
    }
}